// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/datasets.proto

package com.google.genomics.v1;

/**
 * Protobuf type {@code google.genomics.v1.UpdateDatasetRequest}
 */
public  final class UpdateDatasetRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.genomics.v1.UpdateDatasetRequest)
    UpdateDatasetRequestOrBuilder {
  // Use UpdateDatasetRequest.newBuilder() to construct.
  private UpdateDatasetRequest(com.google.protobuf.GeneratedMessage.Builder builder) {
    super(builder);
  }
  private UpdateDatasetRequest() {
    datasetId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private UpdateDatasetRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.google.protobuf.ByteString bs = input.readBytes();

            datasetId_ = bs;
            break;
          }
          case 18: {
            com.google.genomics.v1.Dataset.Builder subBuilder = null;
            if (dataset_ != null) {
              subBuilder = dataset_.toBuilder();
            }
            dataset_ = input.readMessage(com.google.genomics.v1.Dataset.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(dataset_);
              dataset_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.genomics.v1.DatasetsProto.internal_static_google_genomics_v1_UpdateDatasetRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.genomics.v1.DatasetsProto.internal_static_google_genomics_v1_UpdateDatasetRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.genomics.v1.UpdateDatasetRequest.class, com.google.genomics.v1.UpdateDatasetRequest.Builder.class);
  }

  public static final int DATASET_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object datasetId_;
  /**
   * <code>optional string dataset_id = 1;</code>
   *
   * <pre>
   * The ID of the dataset to be updated.
   * </pre>
   */
  public java.lang.String getDatasetId() {
    java.lang.Object ref = datasetId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        datasetId_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string dataset_id = 1;</code>
   *
   * <pre>
   * The ID of the dataset to be updated.
   * </pre>
   */
  public com.google.protobuf.ByteString
      getDatasetIdBytes() {
    java.lang.Object ref = datasetId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      datasetId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATASET_FIELD_NUMBER = 2;
  private com.google.genomics.v1.Dataset dataset_;
  /**
   * <code>optional .google.genomics.v1.Dataset dataset = 2;</code>
   *
   * <pre>
   * The new dataset data.
   * </pre>
   */
  public boolean hasDataset() {
    return dataset_ != null;
  }
  /**
   * <code>optional .google.genomics.v1.Dataset dataset = 2;</code>
   *
   * <pre>
   * The new dataset data.
   * </pre>
   */
  public com.google.genomics.v1.Dataset getDataset() {
    return dataset_ == null ? com.google.genomics.v1.Dataset.getDefaultInstance() : dataset_;
  }
  /**
   * <code>optional .google.genomics.v1.Dataset dataset = 2;</code>
   *
   * <pre>
   * The new dataset data.
   * </pre>
   */
  public com.google.genomics.v1.DatasetOrBuilder getDatasetOrBuilder() {
    return getDataset();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getDatasetIdBytes().isEmpty()) {
      output.writeBytes(1, getDatasetIdBytes());
    }
    if (dataset_ != null) {
      output.writeMessage(2, getDataset());
    }
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDatasetIdBytes().isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, getDatasetIdBytes());
    }
    if (dataset_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDataset());
    }
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.google.genomics.v1.UpdateDatasetRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.UpdateDatasetRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.UpdateDatasetRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.UpdateDatasetRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.UpdateDatasetRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.genomics.v1.UpdateDatasetRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.google.genomics.v1.UpdateDatasetRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.google.genomics.v1.UpdateDatasetRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.google.genomics.v1.UpdateDatasetRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.genomics.v1.UpdateDatasetRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.genomics.v1.UpdateDatasetRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code google.genomics.v1.UpdateDatasetRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.genomics.v1.UpdateDatasetRequest)
      com.google.genomics.v1.UpdateDatasetRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.genomics.v1.DatasetsProto.internal_static_google_genomics_v1_UpdateDatasetRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.genomics.v1.DatasetsProto.internal_static_google_genomics_v1_UpdateDatasetRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.genomics.v1.UpdateDatasetRequest.class, com.google.genomics.v1.UpdateDatasetRequest.Builder.class);
    }

    // Construct using com.google.genomics.v1.UpdateDatasetRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      datasetId_ = "";

      if (datasetBuilder_ == null) {
        dataset_ = null;
      } else {
        dataset_ = null;
        datasetBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.genomics.v1.DatasetsProto.internal_static_google_genomics_v1_UpdateDatasetRequest_descriptor;
    }

    public com.google.genomics.v1.UpdateDatasetRequest getDefaultInstanceForType() {
      return com.google.genomics.v1.UpdateDatasetRequest.getDefaultInstance();
    }

    public com.google.genomics.v1.UpdateDatasetRequest build() {
      com.google.genomics.v1.UpdateDatasetRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.genomics.v1.UpdateDatasetRequest buildPartial() {
      com.google.genomics.v1.UpdateDatasetRequest result = new com.google.genomics.v1.UpdateDatasetRequest(this);
      result.datasetId_ = datasetId_;
      if (datasetBuilder_ == null) {
        result.dataset_ = dataset_;
      } else {
        result.dataset_ = datasetBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.genomics.v1.UpdateDatasetRequest) {
        return mergeFrom((com.google.genomics.v1.UpdateDatasetRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.genomics.v1.UpdateDatasetRequest other) {
      if (other == com.google.genomics.v1.UpdateDatasetRequest.getDefaultInstance()) return this;
      if (!other.getDatasetId().isEmpty()) {
        datasetId_ = other.datasetId_;
        onChanged();
      }
      if (other.hasDataset()) {
        mergeDataset(other.getDataset());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.genomics.v1.UpdateDatasetRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.genomics.v1.UpdateDatasetRequest) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object datasetId_ = "";
    /**
     * <code>optional string dataset_id = 1;</code>
     *
     * <pre>
     * The ID of the dataset to be updated.
     * </pre>
     */
    public java.lang.String getDatasetId() {
      java.lang.Object ref = datasetId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          datasetId_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string dataset_id = 1;</code>
     *
     * <pre>
     * The ID of the dataset to be updated.
     * </pre>
     */
    public com.google.protobuf.ByteString
        getDatasetIdBytes() {
      java.lang.Object ref = datasetId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        datasetId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string dataset_id = 1;</code>
     *
     * <pre>
     * The ID of the dataset to be updated.
     * </pre>
     */
    public Builder setDatasetId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      datasetId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string dataset_id = 1;</code>
     *
     * <pre>
     * The ID of the dataset to be updated.
     * </pre>
     */
    public Builder clearDatasetId() {
      
      datasetId_ = getDefaultInstance().getDatasetId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string dataset_id = 1;</code>
     *
     * <pre>
     * The ID of the dataset to be updated.
     * </pre>
     */
    public Builder setDatasetIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      datasetId_ = value;
      onChanged();
      return this;
    }

    private com.google.genomics.v1.Dataset dataset_ = null;
    private com.google.protobuf.SingleFieldBuilder<
        com.google.genomics.v1.Dataset, com.google.genomics.v1.Dataset.Builder, com.google.genomics.v1.DatasetOrBuilder> datasetBuilder_;
    /**
     * <code>optional .google.genomics.v1.Dataset dataset = 2;</code>
     *
     * <pre>
     * The new dataset data.
     * </pre>
     */
    public boolean hasDataset() {
      return datasetBuilder_ != null || dataset_ != null;
    }
    /**
     * <code>optional .google.genomics.v1.Dataset dataset = 2;</code>
     *
     * <pre>
     * The new dataset data.
     * </pre>
     */
    public com.google.genomics.v1.Dataset getDataset() {
      if (datasetBuilder_ == null) {
        return dataset_ == null ? com.google.genomics.v1.Dataset.getDefaultInstance() : dataset_;
      } else {
        return datasetBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .google.genomics.v1.Dataset dataset = 2;</code>
     *
     * <pre>
     * The new dataset data.
     * </pre>
     */
    public Builder setDataset(com.google.genomics.v1.Dataset value) {
      if (datasetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dataset_ = value;
        onChanged();
      } else {
        datasetBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .google.genomics.v1.Dataset dataset = 2;</code>
     *
     * <pre>
     * The new dataset data.
     * </pre>
     */
    public Builder setDataset(
        com.google.genomics.v1.Dataset.Builder builderForValue) {
      if (datasetBuilder_ == null) {
        dataset_ = builderForValue.build();
        onChanged();
      } else {
        datasetBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .google.genomics.v1.Dataset dataset = 2;</code>
     *
     * <pre>
     * The new dataset data.
     * </pre>
     */
    public Builder mergeDataset(com.google.genomics.v1.Dataset value) {
      if (datasetBuilder_ == null) {
        if (dataset_ != null) {
          dataset_ =
            com.google.genomics.v1.Dataset.newBuilder(dataset_).mergeFrom(value).buildPartial();
        } else {
          dataset_ = value;
        }
        onChanged();
      } else {
        datasetBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .google.genomics.v1.Dataset dataset = 2;</code>
     *
     * <pre>
     * The new dataset data.
     * </pre>
     */
    public Builder clearDataset() {
      if (datasetBuilder_ == null) {
        dataset_ = null;
        onChanged();
      } else {
        dataset_ = null;
        datasetBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .google.genomics.v1.Dataset dataset = 2;</code>
     *
     * <pre>
     * The new dataset data.
     * </pre>
     */
    public com.google.genomics.v1.Dataset.Builder getDatasetBuilder() {
      
      onChanged();
      return getDatasetFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .google.genomics.v1.Dataset dataset = 2;</code>
     *
     * <pre>
     * The new dataset data.
     * </pre>
     */
    public com.google.genomics.v1.DatasetOrBuilder getDatasetOrBuilder() {
      if (datasetBuilder_ != null) {
        return datasetBuilder_.getMessageOrBuilder();
      } else {
        return dataset_ == null ?
            com.google.genomics.v1.Dataset.getDefaultInstance() : dataset_;
      }
    }
    /**
     * <code>optional .google.genomics.v1.Dataset dataset = 2;</code>
     *
     * <pre>
     * The new dataset data.
     * </pre>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.genomics.v1.Dataset, com.google.genomics.v1.Dataset.Builder, com.google.genomics.v1.DatasetOrBuilder> 
        getDatasetFieldBuilder() {
      if (datasetBuilder_ == null) {
        datasetBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.genomics.v1.Dataset, com.google.genomics.v1.Dataset.Builder, com.google.genomics.v1.DatasetOrBuilder>(
                getDataset(),
                getParentForChildren(),
                isClean());
        dataset_ = null;
      }
      return datasetBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.genomics.v1.UpdateDatasetRequest)
  }

  // @@protoc_insertion_point(class_scope:google.genomics.v1.UpdateDatasetRequest)
  private static final com.google.genomics.v1.UpdateDatasetRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.genomics.v1.UpdateDatasetRequest();
  }

  public static com.google.genomics.v1.UpdateDatasetRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  public static final com.google.protobuf.Parser<UpdateDatasetRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateDatasetRequest>() {
    public UpdateDatasetRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new UpdateDatasetRequest(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  public static com.google.protobuf.Parser<UpdateDatasetRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateDatasetRequest> getParserForType() {
    return PARSER;
  }

  public com.google.genomics.v1.UpdateDatasetRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

