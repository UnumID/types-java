// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proof.proto

package crypto.v1;

public interface ProofOrBuilder extends
    // @@protoc_insertion_point(interface_extends:crypto.v1.Proof)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string signature_value = 1;</code>
   */
  java.lang.String getSignatureValue();
  /**
   * <code>string signature_value = 1;</code>
   */
  com.google.protobuf.ByteString
      getSignatureValueBytes();

  /**
   * <code>string type = 2;</code>
   */
  java.lang.String getType();
  /**
   * <code>string type = 2;</code>
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <code>string verification_method = 3;</code>
   */
  java.lang.String getVerificationMethod();
  /**
   * <code>string verification_method = 3;</code>
   */
  com.google.protobuf.ByteString
      getVerificationMethodBytes();

  /**
   * <code>.google.protobuf.Timestamp created = 4;</code>
   */
  boolean hasCreated();
  /**
   * <code>.google.protobuf.Timestamp created = 4;</code>
   */
  com.google.protobuf.Timestamp getCreated();
  /**
   * <code>.google.protobuf.Timestamp created = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedOrBuilder();

  /**
   * <code>string proof_purpose = 5;</code>
   */
  java.lang.String getProofPurpose();
  /**
   * <code>string proof_purpose = 5;</code>
   */
  com.google.protobuf.ByteString
      getProofPurposeBytes();
}
