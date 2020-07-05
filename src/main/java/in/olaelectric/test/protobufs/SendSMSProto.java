// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sendsms.proto

package in.olaelectric.test.protobufs;

public final class SendSMSProto {
  private SendSMSProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SendSMSOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SendSMS)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string tenant = 1;</code>
     * @return The tenant.
     */
    java.lang.String getTenant();
    /**
     * <code>string tenant = 1;</code>
     * @return The bytes for tenant.
     */
    com.google.protobuf.ByteString
        getTenantBytes();

    /**
     * <code>string uuid = 2;</code>
     * @return The uuid.
     */
    java.lang.String getUuid();
    /**
     * <code>string uuid = 2;</code>
     * @return The bytes for uuid.
     */
    com.google.protobuf.ByteString
        getUuidBytes();

    /**
     * <code>string message = 3;</code>
     * @return The message.
     */
    java.lang.String getMessage();
    /**
     * <code>string message = 3;</code>
     * @return The bytes for message.
     */
    com.google.protobuf.ByteString
        getMessageBytes();

    /**
     * <code>string recipients = 4;</code>
     * @return The recipients.
     */
    java.lang.String getRecipients();
    /**
     * <code>string recipients = 4;</code>
     * @return The bytes for recipients.
     */
    com.google.protobuf.ByteString
        getRecipientsBytes();
  }
  /**
   * Protobuf type {@code SendSMS}
   */
  public  static final class SendSMS extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SendSMS)
      SendSMSOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SendSMS.newBuilder() to construct.
    private SendSMS(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SendSMS() {
      tenant_ = "";
      uuid_ = "";
      message_ = "";
      recipients_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SendSMS();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SendSMS(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              tenant_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              uuid_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              message_ = s;
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              recipients_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return in.olaelectric.test.protobufs.SendSMSProto.internal_static_SendSMS_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return in.olaelectric.test.protobufs.SendSMSProto.internal_static_SendSMS_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              in.olaelectric.test.protobufs.SendSMSProto.SendSMS.class, in.olaelectric.test.protobufs.SendSMSProto.SendSMS.Builder.class);
    }

    public static final int TENANT_FIELD_NUMBER = 1;
    private volatile java.lang.Object tenant_;
    /**
     * <code>string tenant = 1;</code>
     * @return The tenant.
     */
    public java.lang.String getTenant() {
      java.lang.Object ref = tenant_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tenant_ = s;
        return s;
      }
    }
    /**
     * <code>string tenant = 1;</code>
     * @return The bytes for tenant.
     */
    public com.google.protobuf.ByteString
        getTenantBytes() {
      java.lang.Object ref = tenant_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tenant_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int UUID_FIELD_NUMBER = 2;
    private volatile java.lang.Object uuid_;
    /**
     * <code>string uuid = 2;</code>
     * @return The uuid.
     */
    public java.lang.String getUuid() {
      java.lang.Object ref = uuid_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uuid_ = s;
        return s;
      }
    }
    /**
     * <code>string uuid = 2;</code>
     * @return The bytes for uuid.
     */
    public com.google.protobuf.ByteString
        getUuidBytes() {
      java.lang.Object ref = uuid_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        uuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MESSAGE_FIELD_NUMBER = 3;
    private volatile java.lang.Object message_;
    /**
     * <code>string message = 3;</code>
     * @return The message.
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      }
    }
    /**
     * <code>string message = 3;</code>
     * @return The bytes for message.
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int RECIPIENTS_FIELD_NUMBER = 4;
    private volatile java.lang.Object recipients_;
    /**
     * <code>string recipients = 4;</code>
     * @return The recipients.
     */
    public java.lang.String getRecipients() {
      java.lang.Object ref = recipients_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        recipients_ = s;
        return s;
      }
    }
    /**
     * <code>string recipients = 4;</code>
     * @return The bytes for recipients.
     */
    public com.google.protobuf.ByteString
        getRecipientsBytes() {
      java.lang.Object ref = recipients_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        recipients_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getTenantBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, tenant_);
      }
      if (!getUuidBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, uuid_);
      }
      if (!getMessageBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, message_);
      }
      if (!getRecipientsBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, recipients_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getTenantBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, tenant_);
      }
      if (!getUuidBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, uuid_);
      }
      if (!getMessageBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, message_);
      }
      if (!getRecipientsBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, recipients_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof in.olaelectric.test.protobufs.SendSMSProto.SendSMS)) {
        return super.equals(obj);
      }
      in.olaelectric.test.protobufs.SendSMSProto.SendSMS other = (in.olaelectric.test.protobufs.SendSMSProto.SendSMS) obj;

      if (!getTenant()
          .equals(other.getTenant())) return false;
      if (!getUuid()
          .equals(other.getUuid())) return false;
      if (!getMessage()
          .equals(other.getMessage())) return false;
      if (!getRecipients()
          .equals(other.getRecipients())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TENANT_FIELD_NUMBER;
      hash = (53 * hash) + getTenant().hashCode();
      hash = (37 * hash) + UUID_FIELD_NUMBER;
      hash = (53 * hash) + getUuid().hashCode();
      hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getMessage().hashCode();
      hash = (37 * hash) + RECIPIENTS_FIELD_NUMBER;
      hash = (53 * hash) + getRecipients().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static in.olaelectric.test.protobufs.SendSMSProto.SendSMS parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static in.olaelectric.test.protobufs.SendSMSProto.SendSMS parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static in.olaelectric.test.protobufs.SendSMSProto.SendSMS parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static in.olaelectric.test.protobufs.SendSMSProto.SendSMS parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static in.olaelectric.test.protobufs.SendSMSProto.SendSMS parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static in.olaelectric.test.protobufs.SendSMSProto.SendSMS parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static in.olaelectric.test.protobufs.SendSMSProto.SendSMS parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static in.olaelectric.test.protobufs.SendSMSProto.SendSMS parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static in.olaelectric.test.protobufs.SendSMSProto.SendSMS parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static in.olaelectric.test.protobufs.SendSMSProto.SendSMS parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static in.olaelectric.test.protobufs.SendSMSProto.SendSMS parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static in.olaelectric.test.protobufs.SendSMSProto.SendSMS parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(in.olaelectric.test.protobufs.SendSMSProto.SendSMS prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code SendSMS}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SendSMS)
        in.olaelectric.test.protobufs.SendSMSProto.SendSMSOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return in.olaelectric.test.protobufs.SendSMSProto.internal_static_SendSMS_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return in.olaelectric.test.protobufs.SendSMSProto.internal_static_SendSMS_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                in.olaelectric.test.protobufs.SendSMSProto.SendSMS.class, in.olaelectric.test.protobufs.SendSMSProto.SendSMS.Builder.class);
      }

      // Construct using in.olaelectric.test.protobufs.SendSMSProto.SendSMS.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        tenant_ = "";

        uuid_ = "";

        message_ = "";

        recipients_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return in.olaelectric.test.protobufs.SendSMSProto.internal_static_SendSMS_descriptor;
      }

      @java.lang.Override
      public in.olaelectric.test.protobufs.SendSMSProto.SendSMS getDefaultInstanceForType() {
        return in.olaelectric.test.protobufs.SendSMSProto.SendSMS.getDefaultInstance();
      }

      @java.lang.Override
      public in.olaelectric.test.protobufs.SendSMSProto.SendSMS build() {
        in.olaelectric.test.protobufs.SendSMSProto.SendSMS result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public in.olaelectric.test.protobufs.SendSMSProto.SendSMS buildPartial() {
        in.olaelectric.test.protobufs.SendSMSProto.SendSMS result = new in.olaelectric.test.protobufs.SendSMSProto.SendSMS(this);
        result.tenant_ = tenant_;
        result.uuid_ = uuid_;
        result.message_ = message_;
        result.recipients_ = recipients_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof in.olaelectric.test.protobufs.SendSMSProto.SendSMS) {
          return mergeFrom((in.olaelectric.test.protobufs.SendSMSProto.SendSMS)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(in.olaelectric.test.protobufs.SendSMSProto.SendSMS other) {
        if (other == in.olaelectric.test.protobufs.SendSMSProto.SendSMS.getDefaultInstance()) return this;
        if (!other.getTenant().isEmpty()) {
          tenant_ = other.tenant_;
          onChanged();
        }
        if (!other.getUuid().isEmpty()) {
          uuid_ = other.uuid_;
          onChanged();
        }
        if (!other.getMessage().isEmpty()) {
          message_ = other.message_;
          onChanged();
        }
        if (!other.getRecipients().isEmpty()) {
          recipients_ = other.recipients_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        in.olaelectric.test.protobufs.SendSMSProto.SendSMS parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (in.olaelectric.test.protobufs.SendSMSProto.SendSMS) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object tenant_ = "";
      /**
       * <code>string tenant = 1;</code>
       * @return The tenant.
       */
      public java.lang.String getTenant() {
        java.lang.Object ref = tenant_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          tenant_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string tenant = 1;</code>
       * @return The bytes for tenant.
       */
      public com.google.protobuf.ByteString
          getTenantBytes() {
        java.lang.Object ref = tenant_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          tenant_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string tenant = 1;</code>
       * @param value The tenant to set.
       * @return This builder for chaining.
       */
      public Builder setTenant(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        tenant_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string tenant = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearTenant() {
        
        tenant_ = getDefaultInstance().getTenant();
        onChanged();
        return this;
      }
      /**
       * <code>string tenant = 1;</code>
       * @param value The bytes for tenant to set.
       * @return This builder for chaining.
       */
      public Builder setTenantBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        tenant_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object uuid_ = "";
      /**
       * <code>string uuid = 2;</code>
       * @return The uuid.
       */
      public java.lang.String getUuid() {
        java.lang.Object ref = uuid_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          uuid_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string uuid = 2;</code>
       * @return The bytes for uuid.
       */
      public com.google.protobuf.ByteString
          getUuidBytes() {
        java.lang.Object ref = uuid_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          uuid_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string uuid = 2;</code>
       * @param value The uuid to set.
       * @return This builder for chaining.
       */
      public Builder setUuid(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        uuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string uuid = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUuid() {
        
        uuid_ = getDefaultInstance().getUuid();
        onChanged();
        return this;
      }
      /**
       * <code>string uuid = 2;</code>
       * @param value The bytes for uuid to set.
       * @return This builder for chaining.
       */
      public Builder setUuidBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        uuid_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object message_ = "";
      /**
       * <code>string message = 3;</code>
       * @return The message.
       */
      public java.lang.String getMessage() {
        java.lang.Object ref = message_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          message_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string message = 3;</code>
       * @return The bytes for message.
       */
      public com.google.protobuf.ByteString
          getMessageBytes() {
        java.lang.Object ref = message_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          message_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string message = 3;</code>
       * @param value The message to set.
       * @return This builder for chaining.
       */
      public Builder setMessage(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        message_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string message = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearMessage() {
        
        message_ = getDefaultInstance().getMessage();
        onChanged();
        return this;
      }
      /**
       * <code>string message = 3;</code>
       * @param value The bytes for message to set.
       * @return This builder for chaining.
       */
      public Builder setMessageBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        message_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object recipients_ = "";
      /**
       * <code>string recipients = 4;</code>
       * @return The recipients.
       */
      public java.lang.String getRecipients() {
        java.lang.Object ref = recipients_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          recipients_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string recipients = 4;</code>
       * @return The bytes for recipients.
       */
      public com.google.protobuf.ByteString
          getRecipientsBytes() {
        java.lang.Object ref = recipients_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          recipients_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string recipients = 4;</code>
       * @param value The recipients to set.
       * @return This builder for chaining.
       */
      public Builder setRecipients(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        recipients_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string recipients = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearRecipients() {
        
        recipients_ = getDefaultInstance().getRecipients();
        onChanged();
        return this;
      }
      /**
       * <code>string recipients = 4;</code>
       * @param value The bytes for recipients to set.
       * @return This builder for chaining.
       */
      public Builder setRecipientsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        recipients_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:SendSMS)
    }

    // @@protoc_insertion_point(class_scope:SendSMS)
    private static final in.olaelectric.test.protobufs.SendSMSProto.SendSMS DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new in.olaelectric.test.protobufs.SendSMSProto.SendSMS();
    }

    public static in.olaelectric.test.protobufs.SendSMSProto.SendSMS getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SendSMS>
        PARSER = new com.google.protobuf.AbstractParser<SendSMS>() {
      @java.lang.Override
      public SendSMS parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SendSMS(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SendSMS> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SendSMS> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public in.olaelectric.test.protobufs.SendSMSProto.SendSMS getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SendSMS_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SendSMS_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rsendsms.proto\"L\n\007SendSMS\022\016\n\006tenant\030\001 \001" +
      "(\t\022\014\n\004uuid\030\002 \001(\t\022\017\n\007message\030\003 \001(\t\022\022\n\nrec" +
      "ipients\030\004 \001(\tB-\n\035in.olaelectric.test.pro" +
      "tobufsB\014SendSMSProtob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SendSMS_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SendSMS_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SendSMS_descriptor,
        new java.lang.String[] { "Tenant", "Uuid", "Message", "Recipients", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
