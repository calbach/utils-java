// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/variants.proto

package com.google.genomics.v1;

public interface SearchCallSetsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.genomics.v1.SearchCallSetsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .google.genomics.v1.CallSet call_sets = 1;</code>
   *
   * <pre>
   * The list of matching call sets.
   * </pre>
   */
  java.util.List<com.google.genomics.v1.CallSet> 
      getCallSetsList();
  /**
   * <code>repeated .google.genomics.v1.CallSet call_sets = 1;</code>
   *
   * <pre>
   * The list of matching call sets.
   * </pre>
   */
  com.google.genomics.v1.CallSet getCallSets(int index);
  /**
   * <code>repeated .google.genomics.v1.CallSet call_sets = 1;</code>
   *
   * <pre>
   * The list of matching call sets.
   * </pre>
   */
  int getCallSetsCount();
  /**
   * <code>repeated .google.genomics.v1.CallSet call_sets = 1;</code>
   *
   * <pre>
   * The list of matching call sets.
   * </pre>
   */
  java.util.List<? extends com.google.genomics.v1.CallSetOrBuilder> 
      getCallSetsOrBuilderList();
  /**
   * <code>repeated .google.genomics.v1.CallSet call_sets = 1;</code>
   *
   * <pre>
   * The list of matching call sets.
   * </pre>
   */
  com.google.genomics.v1.CallSetOrBuilder getCallSetsOrBuilder(
      int index);

  /**
   * <code>optional string next_page_token = 2;</code>
   *
   * <pre>
   * The continuation token, which is used to page through large result sets.
   * Provide this value in a subsequent request to return the next page of
   * results. This field will be empty if there aren't any additional results.
   * </pre>
   */
  java.lang.String getNextPageToken();
  /**
   * <code>optional string next_page_token = 2;</code>
   *
   * <pre>
   * The continuation token, which is used to page through large result sets.
   * Provide this value in a subsequent request to return the next page of
   * results. This field will be empty if there aren't any additional results.
   * </pre>
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
