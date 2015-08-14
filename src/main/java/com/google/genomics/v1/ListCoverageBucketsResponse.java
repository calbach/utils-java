// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/reads.proto

package com.google.genomics.v1;

/**
 * Protobuf type {@code google.genomics.v1.ListCoverageBucketsResponse}
 */
public  final class ListCoverageBucketsResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.genomics.v1.ListCoverageBucketsResponse)
    ListCoverageBucketsResponseOrBuilder {
  // Use ListCoverageBucketsResponse.newBuilder() to construct.
  private ListCoverageBucketsResponse(com.google.protobuf.GeneratedMessage.Builder builder) {
    super(builder);
  }
  private ListCoverageBucketsResponse() {
    bucketWidth_ = 0L;
    coverageBuckets_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ListCoverageBucketsResponse(
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
          case 8: {

            bucketWidth_ = input.readInt64();
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              coverageBuckets_ = new java.util.ArrayList<com.google.genomics.v1.CoverageBucket>();
              mutable_bitField0_ |= 0x00000002;
            }
            coverageBuckets_.add(input.readMessage(com.google.genomics.v1.CoverageBucket.PARSER, extensionRegistry));
            break;
          }
          case 26: {
            com.google.protobuf.ByteString bs = input.readBytes();

            nextPageToken_ = bs;
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        coverageBuckets_ = java.util.Collections.unmodifiableList(coverageBuckets_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.genomics.v1.ReadsProto.internal_static_google_genomics_v1_ListCoverageBucketsResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.genomics.v1.ReadsProto.internal_static_google_genomics_v1_ListCoverageBucketsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.genomics.v1.ListCoverageBucketsResponse.class, com.google.genomics.v1.ListCoverageBucketsResponse.Builder.class);
  }

  private int bitField0_;
  public static final int BUCKET_WIDTH_FIELD_NUMBER = 1;
  private long bucketWidth_;
  /**
   * <code>optional int64 bucket_width = 1;</code>
   *
   * <pre>
   * The length of each coverage bucket in base pairs. Note that buckets at the
   * end of a reference sequence may be shorter. This value is omitted if the
   * bucket width is infinity (the default behaviour, with no range or
   * `targetBucketWidth`).
   * </pre>
   */
  public long getBucketWidth() {
    return bucketWidth_;
  }

  public static final int COVERAGE_BUCKETS_FIELD_NUMBER = 2;
  private java.util.List<com.google.genomics.v1.CoverageBucket> coverageBuckets_;
  /**
   * <code>repeated .google.genomics.v1.CoverageBucket coverage_buckets = 2;</code>
   *
   * <pre>
   * The coverage buckets. The list of buckets is sparse; a bucket with 0
   * overlapping reads is not returned. A bucket never crosses more than one
   * reference sequence. Each bucket has width `bucketWidth`, unless
   * its end is the end of the reference sequence.
   * </pre>
   */
  public java.util.List<com.google.genomics.v1.CoverageBucket> getCoverageBucketsList() {
    return coverageBuckets_;
  }
  /**
   * <code>repeated .google.genomics.v1.CoverageBucket coverage_buckets = 2;</code>
   *
   * <pre>
   * The coverage buckets. The list of buckets is sparse; a bucket with 0
   * overlapping reads is not returned. A bucket never crosses more than one
   * reference sequence. Each bucket has width `bucketWidth`, unless
   * its end is the end of the reference sequence.
   * </pre>
   */
  public java.util.List<? extends com.google.genomics.v1.CoverageBucketOrBuilder> 
      getCoverageBucketsOrBuilderList() {
    return coverageBuckets_;
  }
  /**
   * <code>repeated .google.genomics.v1.CoverageBucket coverage_buckets = 2;</code>
   *
   * <pre>
   * The coverage buckets. The list of buckets is sparse; a bucket with 0
   * overlapping reads is not returned. A bucket never crosses more than one
   * reference sequence. Each bucket has width `bucketWidth`, unless
   * its end is the end of the reference sequence.
   * </pre>
   */
  public int getCoverageBucketsCount() {
    return coverageBuckets_.size();
  }
  /**
   * <code>repeated .google.genomics.v1.CoverageBucket coverage_buckets = 2;</code>
   *
   * <pre>
   * The coverage buckets. The list of buckets is sparse; a bucket with 0
   * overlapping reads is not returned. A bucket never crosses more than one
   * reference sequence. Each bucket has width `bucketWidth`, unless
   * its end is the end of the reference sequence.
   * </pre>
   */
  public com.google.genomics.v1.CoverageBucket getCoverageBuckets(int index) {
    return coverageBuckets_.get(index);
  }
  /**
   * <code>repeated .google.genomics.v1.CoverageBucket coverage_buckets = 2;</code>
   *
   * <pre>
   * The coverage buckets. The list of buckets is sparse; a bucket with 0
   * overlapping reads is not returned. A bucket never crosses more than one
   * reference sequence. Each bucket has width `bucketWidth`, unless
   * its end is the end of the reference sequence.
   * </pre>
   */
  public com.google.genomics.v1.CoverageBucketOrBuilder getCoverageBucketsOrBuilder(
      int index) {
    return coverageBuckets_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 3;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <code>optional string next_page_token = 3;</code>
   *
   * <pre>
   * The continuation token, which is used to page through large result sets.
   * Provide this value in a subsequent request to return the next page of
   * results. This field will be empty if there aren't any additional results.
   * </pre>
   */
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        nextPageToken_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string next_page_token = 3;</code>
   *
   * <pre>
   * The continuation token, which is used to page through large result sets.
   * Provide this value in a subsequent request to return the next page of
   * results. This field will be empty if there aren't any additional results.
   * </pre>
   */
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (bucketWidth_ != 0L) {
      output.writeInt64(1, bucketWidth_);
    }
    for (int i = 0; i < coverageBuckets_.size(); i++) {
      output.writeMessage(2, coverageBuckets_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      output.writeBytes(3, getNextPageTokenBytes());
    }
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (bucketWidth_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, bucketWidth_);
    }
    for (int i = 0; i < coverageBuckets_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, coverageBuckets_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, getNextPageTokenBytes());
    }
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.google.genomics.v1.ListCoverageBucketsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.ListCoverageBucketsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.ListCoverageBucketsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.ListCoverageBucketsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.ListCoverageBucketsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.genomics.v1.ListCoverageBucketsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.google.genomics.v1.ListCoverageBucketsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.google.genomics.v1.ListCoverageBucketsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.google.genomics.v1.ListCoverageBucketsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.genomics.v1.ListCoverageBucketsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.genomics.v1.ListCoverageBucketsResponse prototype) {
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
   * Protobuf type {@code google.genomics.v1.ListCoverageBucketsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.genomics.v1.ListCoverageBucketsResponse)
      com.google.genomics.v1.ListCoverageBucketsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.genomics.v1.ReadsProto.internal_static_google_genomics_v1_ListCoverageBucketsResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.genomics.v1.ReadsProto.internal_static_google_genomics_v1_ListCoverageBucketsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.genomics.v1.ListCoverageBucketsResponse.class, com.google.genomics.v1.ListCoverageBucketsResponse.Builder.class);
    }

    // Construct using com.google.genomics.v1.ListCoverageBucketsResponse.newBuilder()
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
        getCoverageBucketsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      bucketWidth_ = 0L;

      if (coverageBucketsBuilder_ == null) {
        coverageBuckets_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        coverageBucketsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.genomics.v1.ReadsProto.internal_static_google_genomics_v1_ListCoverageBucketsResponse_descriptor;
    }

    public com.google.genomics.v1.ListCoverageBucketsResponse getDefaultInstanceForType() {
      return com.google.genomics.v1.ListCoverageBucketsResponse.getDefaultInstance();
    }

    public com.google.genomics.v1.ListCoverageBucketsResponse build() {
      com.google.genomics.v1.ListCoverageBucketsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.genomics.v1.ListCoverageBucketsResponse buildPartial() {
      com.google.genomics.v1.ListCoverageBucketsResponse result = new com.google.genomics.v1.ListCoverageBucketsResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.bucketWidth_ = bucketWidth_;
      if (coverageBucketsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          coverageBuckets_ = java.util.Collections.unmodifiableList(coverageBuckets_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.coverageBuckets_ = coverageBuckets_;
      } else {
        result.coverageBuckets_ = coverageBucketsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.genomics.v1.ListCoverageBucketsResponse) {
        return mergeFrom((com.google.genomics.v1.ListCoverageBucketsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.genomics.v1.ListCoverageBucketsResponse other) {
      if (other == com.google.genomics.v1.ListCoverageBucketsResponse.getDefaultInstance()) return this;
      if (other.getBucketWidth() != 0L) {
        setBucketWidth(other.getBucketWidth());
      }
      if (coverageBucketsBuilder_ == null) {
        if (!other.coverageBuckets_.isEmpty()) {
          if (coverageBuckets_.isEmpty()) {
            coverageBuckets_ = other.coverageBuckets_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureCoverageBucketsIsMutable();
            coverageBuckets_.addAll(other.coverageBuckets_);
          }
          onChanged();
        }
      } else {
        if (!other.coverageBuckets_.isEmpty()) {
          if (coverageBucketsBuilder_.isEmpty()) {
            coverageBucketsBuilder_.dispose();
            coverageBucketsBuilder_ = null;
            coverageBuckets_ = other.coverageBuckets_;
            bitField0_ = (bitField0_ & ~0x00000002);
            coverageBucketsBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getCoverageBucketsFieldBuilder() : null;
          } else {
            coverageBucketsBuilder_.addAllMessages(other.coverageBuckets_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
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
      com.google.genomics.v1.ListCoverageBucketsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.genomics.v1.ListCoverageBucketsResponse) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long bucketWidth_ ;
    /**
     * <code>optional int64 bucket_width = 1;</code>
     *
     * <pre>
     * The length of each coverage bucket in base pairs. Note that buckets at the
     * end of a reference sequence may be shorter. This value is omitted if the
     * bucket width is infinity (the default behaviour, with no range or
     * `targetBucketWidth`).
     * </pre>
     */
    public long getBucketWidth() {
      return bucketWidth_;
    }
    /**
     * <code>optional int64 bucket_width = 1;</code>
     *
     * <pre>
     * The length of each coverage bucket in base pairs. Note that buckets at the
     * end of a reference sequence may be shorter. This value is omitted if the
     * bucket width is infinity (the default behaviour, with no range or
     * `targetBucketWidth`).
     * </pre>
     */
    public Builder setBucketWidth(long value) {
      
      bucketWidth_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 bucket_width = 1;</code>
     *
     * <pre>
     * The length of each coverage bucket in base pairs. Note that buckets at the
     * end of a reference sequence may be shorter. This value is omitted if the
     * bucket width is infinity (the default behaviour, with no range or
     * `targetBucketWidth`).
     * </pre>
     */
    public Builder clearBucketWidth() {
      
      bucketWidth_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<com.google.genomics.v1.CoverageBucket> coverageBuckets_ =
      java.util.Collections.emptyList();
    private void ensureCoverageBucketsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        coverageBuckets_ = new java.util.ArrayList<com.google.genomics.v1.CoverageBucket>(coverageBuckets_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.google.genomics.v1.CoverageBucket, com.google.genomics.v1.CoverageBucket.Builder, com.google.genomics.v1.CoverageBucketOrBuilder> coverageBucketsBuilder_;

    /**
     * <code>repeated .google.genomics.v1.CoverageBucket coverage_buckets = 2;</code>
     *
     * <pre>
     * The coverage buckets. The list of buckets is sparse; a bucket with 0
     * overlapping reads is not returned. A bucket never crosses more than one
     * reference sequence. Each bucket has width `bucketWidth`, unless
     * its end is the end of the reference sequence.
     * </pre>
     */
    public java.util.List<com.google.genomics.v1.CoverageBucket> getCoverageBucketsList() {
      if (coverageBucketsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(coverageBuckets_);
      } else {
        return coverageBucketsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .google.genomics.v1.CoverageBucket coverage_buckets = 2;</code>
     *
     * <pre>
     * The coverage buckets. The list of buckets is sparse; a bucket with 0
     * overlapping reads is not returned. A bucket never crosses more than one
     * reference sequence. Each bucket has width `bucketWidth`, unless
     * its end is the end of the reference sequence.
     * </pre>
     */
    public int getCoverageBucketsCount() {
      if (coverageBucketsBuilder_ == null) {
        return coverageBuckets_.size();
      } else {
        return coverageBucketsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .google.genomics.v1.CoverageBucket coverage_buckets = 2;</code>
     *
     * <pre>
     * The coverage buckets. The list of buckets is sparse; a bucket with 0
     * overlapping reads is not returned. A bucket never crosses more than one
     * reference sequence. Each bucket has width `bucketWidth`, unless
     * its end is the end of the reference sequence.
     * </pre>
     */
    public com.google.genomics.v1.CoverageBucket getCoverageBuckets(int index) {
      if (coverageBucketsBuilder_ == null) {
        return coverageBuckets_.get(index);
      } else {
        return coverageBucketsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .google.genomics.v1.CoverageBucket coverage_buckets = 2;</code>
     *
     * <pre>
     * The coverage buckets. The list of buckets is sparse; a bucket with 0
     * overlapping reads is not returned. A bucket never crosses more than one
     * reference sequence. Each bucket has width `bucketWidth`, unless
     * its end is the end of the reference sequence.
     * </pre>
     */
    public Builder setCoverageBuckets(
        int index, com.google.genomics.v1.CoverageBucket value) {
      if (coverageBucketsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCoverageBucketsIsMutable();
        coverageBuckets_.set(index, value);
        onChanged();
      } else {
        coverageBucketsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .google.genomics.v1.CoverageBucket coverage_buckets = 2;</code>
     *
     * <pre>
     * The coverage buckets. The list of buckets is sparse; a bucket with 0
     * overlapping reads is not returned. A bucket never crosses more than one
     * reference sequence. Each bucket has width `bucketWidth`, unless
     * its end is the end of the reference sequence.
     * </pre>
     */
    public Builder setCoverageBuckets(
        int index, com.google.genomics.v1.CoverageBucket.Builder builderForValue) {
      if (coverageBucketsBuilder_ == null) {
        ensureCoverageBucketsIsMutable();
        coverageBuckets_.set(index, builderForValue.build());
        onChanged();
      } else {
        coverageBucketsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.genomics.v1.CoverageBucket coverage_buckets = 2;</code>
     *
     * <pre>
     * The coverage buckets. The list of buckets is sparse; a bucket with 0
     * overlapping reads is not returned. A bucket never crosses more than one
     * reference sequence. Each bucket has width `bucketWidth`, unless
     * its end is the end of the reference sequence.
     * </pre>
     */
    public Builder addCoverageBuckets(com.google.genomics.v1.CoverageBucket value) {
      if (coverageBucketsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCoverageBucketsIsMutable();
        coverageBuckets_.add(value);
        onChanged();
      } else {
        coverageBucketsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .google.genomics.v1.CoverageBucket coverage_buckets = 2;</code>
     *
     * <pre>
     * The coverage buckets. The list of buckets is sparse; a bucket with 0
     * overlapping reads is not returned. A bucket never crosses more than one
     * reference sequence. Each bucket has width `bucketWidth`, unless
     * its end is the end of the reference sequence.
     * </pre>
     */
    public Builder addCoverageBuckets(
        int index, com.google.genomics.v1.CoverageBucket value) {
      if (coverageBucketsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCoverageBucketsIsMutable();
        coverageBuckets_.add(index, value);
        onChanged();
      } else {
        coverageBucketsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .google.genomics.v1.CoverageBucket coverage_buckets = 2;</code>
     *
     * <pre>
     * The coverage buckets. The list of buckets is sparse; a bucket with 0
     * overlapping reads is not returned. A bucket never crosses more than one
     * reference sequence. Each bucket has width `bucketWidth`, unless
     * its end is the end of the reference sequence.
     * </pre>
     */
    public Builder addCoverageBuckets(
        com.google.genomics.v1.CoverageBucket.Builder builderForValue) {
      if (coverageBucketsBuilder_ == null) {
        ensureCoverageBucketsIsMutable();
        coverageBuckets_.add(builderForValue.build());
        onChanged();
      } else {
        coverageBucketsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.genomics.v1.CoverageBucket coverage_buckets = 2;</code>
     *
     * <pre>
     * The coverage buckets. The list of buckets is sparse; a bucket with 0
     * overlapping reads is not returned. A bucket never crosses more than one
     * reference sequence. Each bucket has width `bucketWidth`, unless
     * its end is the end of the reference sequence.
     * </pre>
     */
    public Builder addCoverageBuckets(
        int index, com.google.genomics.v1.CoverageBucket.Builder builderForValue) {
      if (coverageBucketsBuilder_ == null) {
        ensureCoverageBucketsIsMutable();
        coverageBuckets_.add(index, builderForValue.build());
        onChanged();
      } else {
        coverageBucketsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.genomics.v1.CoverageBucket coverage_buckets = 2;</code>
     *
     * <pre>
     * The coverage buckets. The list of buckets is sparse; a bucket with 0
     * overlapping reads is not returned. A bucket never crosses more than one
     * reference sequence. Each bucket has width `bucketWidth`, unless
     * its end is the end of the reference sequence.
     * </pre>
     */
    public Builder addAllCoverageBuckets(
        java.lang.Iterable<? extends com.google.genomics.v1.CoverageBucket> values) {
      if (coverageBucketsBuilder_ == null) {
        ensureCoverageBucketsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, coverageBuckets_);
        onChanged();
      } else {
        coverageBucketsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .google.genomics.v1.CoverageBucket coverage_buckets = 2;</code>
     *
     * <pre>
     * The coverage buckets. The list of buckets is sparse; a bucket with 0
     * overlapping reads is not returned. A bucket never crosses more than one
     * reference sequence. Each bucket has width `bucketWidth`, unless
     * its end is the end of the reference sequence.
     * </pre>
     */
    public Builder clearCoverageBuckets() {
      if (coverageBucketsBuilder_ == null) {
        coverageBuckets_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        coverageBucketsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .google.genomics.v1.CoverageBucket coverage_buckets = 2;</code>
     *
     * <pre>
     * The coverage buckets. The list of buckets is sparse; a bucket with 0
     * overlapping reads is not returned. A bucket never crosses more than one
     * reference sequence. Each bucket has width `bucketWidth`, unless
     * its end is the end of the reference sequence.
     * </pre>
     */
    public Builder removeCoverageBuckets(int index) {
      if (coverageBucketsBuilder_ == null) {
        ensureCoverageBucketsIsMutable();
        coverageBuckets_.remove(index);
        onChanged();
      } else {
        coverageBucketsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .google.genomics.v1.CoverageBucket coverage_buckets = 2;</code>
     *
     * <pre>
     * The coverage buckets. The list of buckets is sparse; a bucket with 0
     * overlapping reads is not returned. A bucket never crosses more than one
     * reference sequence. Each bucket has width `bucketWidth`, unless
     * its end is the end of the reference sequence.
     * </pre>
     */
    public com.google.genomics.v1.CoverageBucket.Builder getCoverageBucketsBuilder(
        int index) {
      return getCoverageBucketsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .google.genomics.v1.CoverageBucket coverage_buckets = 2;</code>
     *
     * <pre>
     * The coverage buckets. The list of buckets is sparse; a bucket with 0
     * overlapping reads is not returned. A bucket never crosses more than one
     * reference sequence. Each bucket has width `bucketWidth`, unless
     * its end is the end of the reference sequence.
     * </pre>
     */
    public com.google.genomics.v1.CoverageBucketOrBuilder getCoverageBucketsOrBuilder(
        int index) {
      if (coverageBucketsBuilder_ == null) {
        return coverageBuckets_.get(index);  } else {
        return coverageBucketsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .google.genomics.v1.CoverageBucket coverage_buckets = 2;</code>
     *
     * <pre>
     * The coverage buckets. The list of buckets is sparse; a bucket with 0
     * overlapping reads is not returned. A bucket never crosses more than one
     * reference sequence. Each bucket has width `bucketWidth`, unless
     * its end is the end of the reference sequence.
     * </pre>
     */
    public java.util.List<? extends com.google.genomics.v1.CoverageBucketOrBuilder> 
         getCoverageBucketsOrBuilderList() {
      if (coverageBucketsBuilder_ != null) {
        return coverageBucketsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(coverageBuckets_);
      }
    }
    /**
     * <code>repeated .google.genomics.v1.CoverageBucket coverage_buckets = 2;</code>
     *
     * <pre>
     * The coverage buckets. The list of buckets is sparse; a bucket with 0
     * overlapping reads is not returned. A bucket never crosses more than one
     * reference sequence. Each bucket has width `bucketWidth`, unless
     * its end is the end of the reference sequence.
     * </pre>
     */
    public com.google.genomics.v1.CoverageBucket.Builder addCoverageBucketsBuilder() {
      return getCoverageBucketsFieldBuilder().addBuilder(
          com.google.genomics.v1.CoverageBucket.getDefaultInstance());
    }
    /**
     * <code>repeated .google.genomics.v1.CoverageBucket coverage_buckets = 2;</code>
     *
     * <pre>
     * The coverage buckets. The list of buckets is sparse; a bucket with 0
     * overlapping reads is not returned. A bucket never crosses more than one
     * reference sequence. Each bucket has width `bucketWidth`, unless
     * its end is the end of the reference sequence.
     * </pre>
     */
    public com.google.genomics.v1.CoverageBucket.Builder addCoverageBucketsBuilder(
        int index) {
      return getCoverageBucketsFieldBuilder().addBuilder(
          index, com.google.genomics.v1.CoverageBucket.getDefaultInstance());
    }
    /**
     * <code>repeated .google.genomics.v1.CoverageBucket coverage_buckets = 2;</code>
     *
     * <pre>
     * The coverage buckets. The list of buckets is sparse; a bucket with 0
     * overlapping reads is not returned. A bucket never crosses more than one
     * reference sequence. Each bucket has width `bucketWidth`, unless
     * its end is the end of the reference sequence.
     * </pre>
     */
    public java.util.List<com.google.genomics.v1.CoverageBucket.Builder> 
         getCoverageBucketsBuilderList() {
      return getCoverageBucketsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.google.genomics.v1.CoverageBucket, com.google.genomics.v1.CoverageBucket.Builder, com.google.genomics.v1.CoverageBucketOrBuilder> 
        getCoverageBucketsFieldBuilder() {
      if (coverageBucketsBuilder_ == null) {
        coverageBucketsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.google.genomics.v1.CoverageBucket, com.google.genomics.v1.CoverageBucket.Builder, com.google.genomics.v1.CoverageBucketOrBuilder>(
                coverageBuckets_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        coverageBuckets_ = null;
      }
      return coverageBucketsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <code>optional string next_page_token = 3;</code>
     *
     * <pre>
     * The continuation token, which is used to page through large result sets.
     * Provide this value in a subsequent request to return the next page of
     * results. This field will be empty if there aren't any additional results.
     * </pre>
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          nextPageToken_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string next_page_token = 3;</code>
     *
     * <pre>
     * The continuation token, which is used to page through large result sets.
     * Provide this value in a subsequent request to return the next page of
     * results. This field will be empty if there aren't any additional results.
     * </pre>
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string next_page_token = 3;</code>
     *
     * <pre>
     * The continuation token, which is used to page through large result sets.
     * Provide this value in a subsequent request to return the next page of
     * results. This field will be empty if there aren't any additional results.
     * </pre>
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string next_page_token = 3;</code>
     *
     * <pre>
     * The continuation token, which is used to page through large result sets.
     * Provide this value in a subsequent request to return the next page of
     * results. This field will be empty if there aren't any additional results.
     * </pre>
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <code>optional string next_page_token = 3;</code>
     *
     * <pre>
     * The continuation token, which is used to page through large result sets.
     * Provide this value in a subsequent request to return the next page of
     * results. This field will be empty if there aren't any additional results.
     * </pre>
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.genomics.v1.ListCoverageBucketsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.genomics.v1.ListCoverageBucketsResponse)
  private static final com.google.genomics.v1.ListCoverageBucketsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.genomics.v1.ListCoverageBucketsResponse();
  }

  public static com.google.genomics.v1.ListCoverageBucketsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  public static final com.google.protobuf.Parser<ListCoverageBucketsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListCoverageBucketsResponse>() {
    public ListCoverageBucketsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new ListCoverageBucketsResponse(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<ListCoverageBucketsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListCoverageBucketsResponse> getParserForType() {
    return PARSER;
  }

  public com.google.genomics.v1.ListCoverageBucketsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

