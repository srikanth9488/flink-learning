/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package in.flink.test;

import in.flink.test.protobufs.MessageProto;
import org.apache.flink.api.common.restartstrategy.RestartStrategies;
import org.apache.flink.api.common.typeinfo.TypeInformation;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.api.java.typeutils.TupleTypeInfo;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer;
import org.apache.flink.streaming.connectors.kafka.KafkaDeserializationSchema;
import org.apache.kafka.clients.consumer.ConsumerRecord;

import java.io.IOException;
import java.util.Properties;

public class StreamingJob {

    public static void main(String[] args) {
        executionEnv1();
        executionEnv2();
    }

    private static void executionEnv1() {
        final StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
//		final ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();
        System.out.println("###########Inside execution environment 1");
        DataStreamSource<String> lines = env.fromElements(
                "Apache Flink is a community-driven open source framework for distributed big data analytics,",
                "like Hadoop and Spark. The core of Apache Flink is a distributed streaming dataflow engine written",
                " in Java and Scala.[1][2] It aims to bridge the gap between MapReduce-like systems and shared-nothing",
                "parallel database systems. Therefore, Flink executes arbitrary dataflow programs in a data-parallel and",
                "pipelined manner.[3] Flink's pipelined runtime system enables the execution of bulk/batch and stream",
                "processing programs.[4][5] Furthermore, Flink's runtime supports the execution of iterative algorithms natively.[6]"
        );

        try {
            lines.flatMap((line, out) -> {
                String[] words = line.split("\\W+");
                for (String word : words) {
                    out.collect(new Tuple2<>(word, 1));
                }
            })
                    .returns(new TupleTypeInfo(TypeInformation.of(String.class), TypeInformation.of(Integer.class)))
                    .print();
            env.execute("Flink Word Count job");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void executionEnv2() {
        // set up the streaming execution environment
        String stateBackendDir = "/Users/srikanths/workspace/flink";
        final StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.enableCheckpointing(1000);
        env.setRestartStrategy(RestartStrategies.fixedDelayRestart(1, 1000));
        DataStream<MessageProto.Message> smsDataStream = env.addSource(getFlinkKafkaConsumer());
        smsDataStream.print();
//		DataStream<Tuple7<String,String,String,String,String,Integer, Date>> resultantTuple = smsDataStream.map(new SendSMSMap());
//		resultantTuple.print();
        // execute program
        try {
            env.execute("Flink Streaming SendSMS job");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static FlinkKafkaConsumer<MessageProto.Message> getFlinkKafkaConsumer() {
        System.out.println("************** Inside Flink Kafka Consumer ***************");
//        FlinkKafkaConsumer flinkKafkaConsumer = new FlinkKafkaConsumer("testSimpleTopic",new SimpleStringSchema(),kafkaDataSource());
        FlinkKafkaConsumer<MessageProto.Message> flinkKafkaConsumer = new FlinkKafkaConsumer<>("message_proto_kafka", new MessageProtoKafkaDeserializationSchema(), kafkaDataSource());
        flinkKafkaConsumer.setStartFromEarliest();
        return flinkKafkaConsumer;
    }

    private static Properties kafkaDataSource() {
        Properties properties = new Properties();
        properties.setProperty("bootstrap.servers", "localhost:9092");
        properties.setProperty("group.id", "cyclops_sms_protobuf");
        return properties;
    }

    private static class MessageProtoKafkaDeserializationSchema implements KafkaDeserializationSchema<MessageProto.Message> {

        private final TypeInformation<MessageProto.Message> type;

        public MessageProtoKafkaDeserializationSchema() {
            this.type = TypeInformation.of(MessageProto.Message.class);
        }

        @Override
        public boolean isEndOfStream(MessageProto.Message nextElement) {
            return false;
        }

        @Override
        public MessageProto.Message deserialize(ConsumerRecord<byte[], byte[]> record) throws IOException {
            return MessageProto.Message.parseFrom(record.value());
        }

        @Override
        public TypeInformation<MessageProto.Message> getProducedType() {
            return type;
        }
    }

}
