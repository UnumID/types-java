// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: presentation.proto

package presentation.v1;

public interface UnsignedPresentationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:presentation.v1.UnsignedPresentation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string context = 1;</code>
   */
  java.util.List<java.lang.String>
      getContextList();
  /**
   * <code>repeated string context = 1;</code>
   */
  int getContextCount();
  /**
   * <code>repeated string context = 1;</code>
   */
  java.lang.String getContext(int index);
  /**
   * <code>repeated string context = 1;</code>
   */
  com.google.protobuf.ByteString
      getContextBytes(int index);

  /**
   * <code>repeated string type = 2;</code>
   */
  java.util.List<java.lang.String>
      getTypeList();
  /**
   * <code>repeated string type = 2;</code>
   */
  int getTypeCount();
  /**
   * <code>repeated string type = 2;</code>
   */
  java.lang.String getType(int index);
  /**
   * <code>repeated string type = 2;</code>
   */
  com.google.protobuf.ByteString
      getTypeBytes(int index);

  /**
   * <code>string presentation_request_id = 3;</code>
   */
  java.lang.String getPresentationRequestId();
  /**
   * <code>string presentation_request_id = 3;</code>
   */
  com.google.protobuf.ByteString
      getPresentationRequestIdBytes();

  /**
   * <code>string verifierDid = 4;</code>
   */
  java.lang.String getVerifierDid();
  /**
   * <code>string verifierDid = 4;</code>
   */
  com.google.protobuf.ByteString
      getVerifierDidBytes();

  /**
   * <code>repeated .credential.v1.Credential verifiable_credential = 5;</code>
   */
  java.util.List<credential.v1.Credential> 
      getVerifiableCredentialList();
  /**
   * <code>repeated .credential.v1.Credential verifiable_credential = 5;</code>
   */
  credential.v1.Credential getVerifiableCredential(int index);
  /**
   * <code>repeated .credential.v1.Credential verifiable_credential = 5;</code>
   */
  int getVerifiableCredentialCount();
  /**
   * <code>repeated .credential.v1.Credential verifiable_credential = 5;</code>
   */
  java.util.List<? extends credential.v1.CredentialOrBuilder> 
      getVerifiableCredentialOrBuilderList();
  /**
   * <code>repeated .credential.v1.Credential verifiable_credential = 5;</code>
   */
  credential.v1.CredentialOrBuilder getVerifiableCredentialOrBuilder(
      int index);
}
