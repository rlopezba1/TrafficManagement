// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service4.proto

package grpc.service4;

public final class Service4Impl {
  private Service4Impl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_infoString_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_infoString_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016service4.proto\"%\n\ninfoString\022\027\n\017firstI" +
      "nfoString\030\001 \001(\t2H\n\010Service4\022<\n\032SendClien" +
      "t_ServerStreaming\022\013.infoString\032\013.infoStr" +
      "ing\"\000(\0010\001B\037\n\rgrpc.service4B\014Service4Impl" +
      "P\001b\006proto3"
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
    internal_static_infoString_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_infoString_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_infoString_descriptor,
        new java.lang.String[] { "FirstInfoString", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
