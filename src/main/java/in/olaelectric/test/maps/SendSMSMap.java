package in.olaelectric.test.maps;

import in.olaelectric.test.protobufs.SendSMSProto;
import org.apache.flink.api.common.functions.RichMapFunction;
import org.apache.flink.api.java.tuple.Tuple7;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SendSMSMap extends RichMapFunction<SendSMSProto.SendSMS, Tuple7<String,String,String,String,String,Integer, Date>> {

    @Override
    public Tuple7<String,String,String,String,String,Integer, Date> map(SendSMSProto.SendSMS value) throws Exception {
        Tuple7<String,String,String,String,String,Integer, Date> resultantMap = new Tuple7();
        resultantMap.f0 = value.getTenant();
        resultantMap.f1 = "SMS";
        resultantMap.f2 = value.getUuid();
        resultantMap.f3 = value.getRecipients();
        resultantMap.f4 = "SUCCESS";
        resultantMap.f5 = 1;
        resultantMap.f6 = getCurrentTimestamp();
        return resultantMap;
    }

    private Date getCurrentTimestamp() {
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS Z");
        try {
            return sdf.parse(sdf.format(new Date()));
        } catch (ParseException e) {
            e.printStackTrace();
            return new Date();
        }
    }
}
