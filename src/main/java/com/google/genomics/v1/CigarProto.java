// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/cigar.proto

package com.google.genomics.v1;

public final class CigarProto {
  private CigarProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_genomics_v1_CigarUnit_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_genomics_v1_CigarUnit_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036google/genomics/v1/cigar.proto\022\022google" +
      ".genomics.v1\"\257\002\n\tCigarUnit\022:\n\toperation\030" +
      "\001 \001(\0162\'.google.genomics.v1.CigarUnit.Ope" +
      "ration\022\030\n\020operation_length\030\002 \001(\003\022\032\n\022refe" +
      "rence_sequence\030\003 \001(\t\"\257\001\n\tOperation\022\031\n\025OP" +
      "ERATION_UNSPECIFIED\020\000\022\023\n\017ALIGNMENT_MATCH" +
      "\020\001\022\n\n\006INSERT\020\002\022\n\n\006DELETE\020\003\022\010\n\004SKIP\020\004\022\r\n\t" +
      "CLIP_SOFT\020\005\022\r\n\tCLIP_HARD\020\006\022\007\n\003PAD\020\007\022\022\n\016S" +
      "EQUENCE_MATCH\020\010\022\025\n\021SEQUENCE_MISMATCH\020\tB&" +
      "\n\026com.google.genomics.v1B\nCigarProtoP\001b\006",
      "proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_google_genomics_v1_CigarUnit_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_genomics_v1_CigarUnit_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_genomics_v1_CigarUnit_descriptor,
        new java.lang.String[] { "Operation", "OperationLength", "ReferenceSequence", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
