// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/variants.proto

package com.google.genomics.v1;

/**
 * Protobuf type {@code google.genomics.v1.SearchVariantsResponse}
 *
 * <pre>
 * The variant search response.
 * </pre>
 */
public  final class SearchVariantsResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.genomics.v1.SearchVariantsResponse)
    SearchVariantsResponseOrBuilder {
  // Use SearchVariantsResponse.newBuilder() to construct.
  private SearchVariantsResponse(com.google.protobuf.GeneratedMessage.Builder builder) {
    super(builder);
  }
  private SearchVariantsResponse() {
    variants_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private SearchVariantsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              variants_ = new java.util.ArrayList<com.google.genomics.v1.Variant>();
              mutable_bitField0_ |= 0x00000001;
            }
            variants_.add(input.readMessage(com.google.genomics.v1.Variant.PARSER, extensionRegistry));
            break;
          }
          case 18: {
            com.google.protobuf.ByteString bs = input.readBytes();

            nextPageToken_ = bs;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e.getMessage()).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        variants_ = java.util.Collections.unmodifiableList(variants_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.genomics.v1.VariantsProto.internal_static_google_genomics_v1_SearchVariantsResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.genomics.v1.VariantsProto.internal_static_google_genomics_v1_SearchVariantsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.genomics.v1.SearchVariantsResponse.class, com.google.genomics.v1.SearchVariantsResponse.Builder.class);
  }

  public static final com.google.protobuf.Parser<SearchVariantsResponse> PARSER =
      new com.google.protobuf.AbstractParser<SearchVariantsResponse>() {
    public SearchVariantsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SearchVariantsResponse(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<SearchVariantsResponse> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int VARIANTS_FIELD_NUMBER = 1;
  private java.util.List<com.google.genomics.v1.Variant> variants_;
  /**
   * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
   *
   * <pre>
   * The list of matching Variants.
   * </pre>
   */
  public java.util.List<com.google.genomics.v1.Variant> getVariantsList() {
    return variants_;
  }
  /**
   * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
   *
   * <pre>
   * The list of matching Variants.
   * </pre>
   */
  public java.util.List<? extends com.google.genomics.v1.VariantOrBuilder> 
      getVariantsOrBuilderList() {
    return variants_;
  }
  /**
   * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
   *
   * <pre>
   * The list of matching Variants.
   * </pre>
   */
  public int getVariantsCount() {
    return variants_.size();
  }
  /**
   * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
   *
   * <pre>
   * The list of matching Variants.
   * </pre>
   */
  public com.google.genomics.v1.Variant getVariants(int index) {
    return variants_.get(index);
  }
  /**
   * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
   *
   * <pre>
   * The list of matching Variants.
   * </pre>
   */
  public com.google.genomics.v1.VariantOrBuilder getVariantsOrBuilder(
      int index) {
    return variants_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private java.lang.Object nextPageToken_;
  /**
   * <code>optional string next_page_token = 2;</code>
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
   * <code>optional string next_page_token = 2;</code>
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
    getSerializedSize();
    for (int i = 0; i < variants_.size(); i++) {
      output.writeMessage(1, variants_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      output.writeBytes(2, getNextPageTokenBytes());
    }
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < variants_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, variants_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, getNextPageTokenBytes());
    }
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.google.genomics.v1.SearchVariantsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.SearchVariantsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.SearchVariantsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.SearchVariantsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.SearchVariantsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.genomics.v1.SearchVariantsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.google.genomics.v1.SearchVariantsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.google.genomics.v1.SearchVariantsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.google.genomics.v1.SearchVariantsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.genomics.v1.SearchVariantsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return new Builder(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.google.genomics.v1.SearchVariantsResponse prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code google.genomics.v1.SearchVariantsResponse}
   *
   * <pre>
   * The variant search response.
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.genomics.v1.SearchVariantsResponse)
      com.google.genomics.v1.SearchVariantsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.genomics.v1.VariantsProto.internal_static_google_genomics_v1_SearchVariantsResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.genomics.v1.VariantsProto.internal_static_google_genomics_v1_SearchVariantsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.genomics.v1.SearchVariantsResponse.class, com.google.genomics.v1.SearchVariantsResponse.Builder.class);
    }

    // Construct using com.google.genomics.v1.SearchVariantsResponse.newBuilder()
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
        getVariantsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (variantsBuilder_ == null) {
        variants_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        variantsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.genomics.v1.VariantsProto.internal_static_google_genomics_v1_SearchVariantsResponse_descriptor;
    }

    public com.google.genomics.v1.SearchVariantsResponse getDefaultInstanceForType() {
      return com.google.genomics.v1.SearchVariantsResponse.getDefaultInstance();
    }

    public com.google.genomics.v1.SearchVariantsResponse build() {
      com.google.genomics.v1.SearchVariantsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.genomics.v1.SearchVariantsResponse buildPartial() {
      com.google.genomics.v1.SearchVariantsResponse result = new com.google.genomics.v1.SearchVariantsResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (variantsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          variants_ = java.util.Collections.unmodifiableList(variants_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.variants_ = variants_;
      } else {
        result.variants_ = variantsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.genomics.v1.SearchVariantsResponse) {
        return mergeFrom((com.google.genomics.v1.SearchVariantsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.genomics.v1.SearchVariantsResponse other) {
      if (other == com.google.genomics.v1.SearchVariantsResponse.getDefaultInstance()) return this;
      if (variantsBuilder_ == null) {
        if (!other.variants_.isEmpty()) {
          if (variants_.isEmpty()) {
            variants_ = other.variants_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureVariantsIsMutable();
            variants_.addAll(other.variants_);
          }
          onChanged();
        }
      } else {
        if (!other.variants_.isEmpty()) {
          if (variantsBuilder_.isEmpty()) {
            variantsBuilder_.dispose();
            variantsBuilder_ = null;
            variants_ = other.variants_;
            bitField0_ = (bitField0_ & ~0x00000001);
            variantsBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getVariantsFieldBuilder() : null;
          } else {
            variantsBuilder_.addAllMessages(other.variants_);
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
      com.google.genomics.v1.SearchVariantsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.genomics.v1.SearchVariantsResponse) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.genomics.v1.Variant> variants_ =
      java.util.Collections.emptyList();
    private void ensureVariantsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        variants_ = new java.util.ArrayList<com.google.genomics.v1.Variant>(variants_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.google.genomics.v1.Variant, com.google.genomics.v1.Variant.Builder, com.google.genomics.v1.VariantOrBuilder> variantsBuilder_;

    /**
     * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
     *
     * <pre>
     * The list of matching Variants.
     * </pre>
     */
    public java.util.List<com.google.genomics.v1.Variant> getVariantsList() {
      if (variantsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(variants_);
      } else {
        return variantsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
     *
     * <pre>
     * The list of matching Variants.
     * </pre>
     */
    public int getVariantsCount() {
      if (variantsBuilder_ == null) {
        return variants_.size();
      } else {
        return variantsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
     *
     * <pre>
     * The list of matching Variants.
     * </pre>
     */
    public com.google.genomics.v1.Variant getVariants(int index) {
      if (variantsBuilder_ == null) {
        return variants_.get(index);
      } else {
        return variantsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
     *
     * <pre>
     * The list of matching Variants.
     * </pre>
     */
    public Builder setVariants(
        int index, com.google.genomics.v1.Variant value) {
      if (variantsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVariantsIsMutable();
        variants_.set(index, value);
        onChanged();
      } else {
        variantsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
     *
     * <pre>
     * The list of matching Variants.
     * </pre>
     */
    public Builder setVariants(
        int index, com.google.genomics.v1.Variant.Builder builderForValue) {
      if (variantsBuilder_ == null) {
        ensureVariantsIsMutable();
        variants_.set(index, builderForValue.build());
        onChanged();
      } else {
        variantsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
     *
     * <pre>
     * The list of matching Variants.
     * </pre>
     */
    public Builder addVariants(com.google.genomics.v1.Variant value) {
      if (variantsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVariantsIsMutable();
        variants_.add(value);
        onChanged();
      } else {
        variantsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
     *
     * <pre>
     * The list of matching Variants.
     * </pre>
     */
    public Builder addVariants(
        int index, com.google.genomics.v1.Variant value) {
      if (variantsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVariantsIsMutable();
        variants_.add(index, value);
        onChanged();
      } else {
        variantsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
     *
     * <pre>
     * The list of matching Variants.
     * </pre>
     */
    public Builder addVariants(
        com.google.genomics.v1.Variant.Builder builderForValue) {
      if (variantsBuilder_ == null) {
        ensureVariantsIsMutable();
        variants_.add(builderForValue.build());
        onChanged();
      } else {
        variantsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
     *
     * <pre>
     * The list of matching Variants.
     * </pre>
     */
    public Builder addVariants(
        int index, com.google.genomics.v1.Variant.Builder builderForValue) {
      if (variantsBuilder_ == null) {
        ensureVariantsIsMutable();
        variants_.add(index, builderForValue.build());
        onChanged();
      } else {
        variantsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
     *
     * <pre>
     * The list of matching Variants.
     * </pre>
     */
    public Builder addAllVariants(
        java.lang.Iterable<? extends com.google.genomics.v1.Variant> values) {
      if (variantsBuilder_ == null) {
        ensureVariantsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, variants_);
        onChanged();
      } else {
        variantsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
     *
     * <pre>
     * The list of matching Variants.
     * </pre>
     */
    public Builder clearVariants() {
      if (variantsBuilder_ == null) {
        variants_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        variantsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
     *
     * <pre>
     * The list of matching Variants.
     * </pre>
     */
    public Builder removeVariants(int index) {
      if (variantsBuilder_ == null) {
        ensureVariantsIsMutable();
        variants_.remove(index);
        onChanged();
      } else {
        variantsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
     *
     * <pre>
     * The list of matching Variants.
     * </pre>
     */
    public com.google.genomics.v1.Variant.Builder getVariantsBuilder(
        int index) {
      return getVariantsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
     *
     * <pre>
     * The list of matching Variants.
     * </pre>
     */
    public com.google.genomics.v1.VariantOrBuilder getVariantsOrBuilder(
        int index) {
      if (variantsBuilder_ == null) {
        return variants_.get(index);  } else {
        return variantsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
     *
     * <pre>
     * The list of matching Variants.
     * </pre>
     */
    public java.util.List<? extends com.google.genomics.v1.VariantOrBuilder> 
         getVariantsOrBuilderList() {
      if (variantsBuilder_ != null) {
        return variantsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(variants_);
      }
    }
    /**
     * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
     *
     * <pre>
     * The list of matching Variants.
     * </pre>
     */
    public com.google.genomics.v1.Variant.Builder addVariantsBuilder() {
      return getVariantsFieldBuilder().addBuilder(
          com.google.genomics.v1.Variant.getDefaultInstance());
    }
    /**
     * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
     *
     * <pre>
     * The list of matching Variants.
     * </pre>
     */
    public com.google.genomics.v1.Variant.Builder addVariantsBuilder(
        int index) {
      return getVariantsFieldBuilder().addBuilder(
          index, com.google.genomics.v1.Variant.getDefaultInstance());
    }
    /**
     * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
     *
     * <pre>
     * The list of matching Variants.
     * </pre>
     */
    public java.util.List<com.google.genomics.v1.Variant.Builder> 
         getVariantsBuilderList() {
      return getVariantsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.google.genomics.v1.Variant, com.google.genomics.v1.Variant.Builder, com.google.genomics.v1.VariantOrBuilder> 
        getVariantsFieldBuilder() {
      if (variantsBuilder_ == null) {
        variantsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.google.genomics.v1.Variant, com.google.genomics.v1.Variant.Builder, com.google.genomics.v1.VariantOrBuilder>(
                variants_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        variants_ = null;
      }
      return variantsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <code>optional string next_page_token = 2;</code>
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
     * <code>optional string next_page_token = 2;</code>
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
     * <code>optional string next_page_token = 2;</code>
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
     * <code>optional string next_page_token = 2;</code>
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
     * <code>optional string next_page_token = 2;</code>
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


    // @@protoc_insertion_point(builder_scope:google.genomics.v1.SearchVariantsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.genomics.v1.SearchVariantsResponse)
  private static final com.google.genomics.v1.SearchVariantsResponse defaultInstance;static {
    defaultInstance = new com.google.genomics.v1.SearchVariantsResponse();
  }

  public static com.google.genomics.v1.SearchVariantsResponse getDefaultInstance() {
    return defaultInstance;
  }

  public com.google.genomics.v1.SearchVariantsResponse getDefaultInstanceForType() {
    return defaultInstance;
  }

}

