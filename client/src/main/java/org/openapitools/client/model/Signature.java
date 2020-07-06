/*
 * Rosetta
 * Build Once. Integrate Your Blockchain Everywhere.
 *
 * The version of the OpenAPI document: 1.4.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.client.model.PublicKey;
import org.openapitools.client.model.SignatureType;
import org.openapitools.client.model.SigningPayload;

/**
 * Signature contains the payload that was signed, the public keys of the keypairs used to produce the signature, the signature (encoded in hex), and the SignatureType. PublicKey is often times not known during construction of the signing payloads but may be needed to combine signatures properly.
 */
@ApiModel(description = "Signature contains the payload that was signed, the public keys of the keypairs used to produce the signature, the signature (encoded in hex), and the SignatureType. PublicKey is often times not known during construction of the signing payloads but may be needed to combine signatures properly.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-01T16:34:45.305718+08:00[Asia/Shanghai]")
public class Signature {
  public static final String SERIALIZED_NAME_SIGNING_PAYLOAD = "signing_payload";
  @SerializedName(SERIALIZED_NAME_SIGNING_PAYLOAD)
  private SigningPayload signingPayload;

  public static final String SERIALIZED_NAME_PUBLIC_KEY = "public_key";
  @SerializedName(SERIALIZED_NAME_PUBLIC_KEY)
  private PublicKey publicKey;

  public static final String SERIALIZED_NAME_SIGNATURE_TYPE = "signature_type";
  @SerializedName(SERIALIZED_NAME_SIGNATURE_TYPE)
  private SignatureType signatureType;

  public static final String SERIALIZED_NAME_HEX_BYTES = "hex_bytes";
  @SerializedName(SERIALIZED_NAME_HEX_BYTES)
  private String hexBytes;


  public Signature signingPayload(SigningPayload signingPayload) {
    
    this.signingPayload = signingPayload;
    return this;
  }

   /**
   * Get signingPayload
   * @return signingPayload
  **/
  @ApiModelProperty(required = true, value = "")

  public SigningPayload getSigningPayload() {
    return signingPayload;
  }


  public void setSigningPayload(SigningPayload signingPayload) {
    this.signingPayload = signingPayload;
  }


  public Signature publicKey(PublicKey publicKey) {
    
    this.publicKey = publicKey;
    return this;
  }

   /**
   * Get publicKey
   * @return publicKey
  **/
  @ApiModelProperty(required = true, value = "")

  public PublicKey getPublicKey() {
    return publicKey;
  }


  public void setPublicKey(PublicKey publicKey) {
    this.publicKey = publicKey;
  }


  public Signature signatureType(SignatureType signatureType) {
    
    this.signatureType = signatureType;
    return this;
  }

   /**
   * Get signatureType
   * @return signatureType
  **/
  @ApiModelProperty(required = true, value = "")

  public SignatureType getSignatureType() {
    return signatureType;
  }


  public void setSignatureType(SignatureType signatureType) {
    this.signatureType = signatureType;
  }


  public Signature hexBytes(String hexBytes) {
    
    this.hexBytes = hexBytes;
    return this;
  }

   /**
   * Get hexBytes
   * @return hexBytes
  **/
  @ApiModelProperty(required = true, value = "")

  public String getHexBytes() {
    return hexBytes;
  }


  public void setHexBytes(String hexBytes) {
    this.hexBytes = hexBytes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Signature signature = (Signature) o;
    return Objects.equals(this.signingPayload, signature.signingPayload) &&
        Objects.equals(this.publicKey, signature.publicKey) &&
        Objects.equals(this.signatureType, signature.signatureType) &&
        Objects.equals(this.hexBytes, signature.hexBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signingPayload, publicKey, signatureType, hexBytes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Signature {\n");
    sb.append("    signingPayload: ").append(toIndentedString(signingPayload)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
    sb.append("    signatureType: ").append(toIndentedString(signatureType)).append("\n");
    sb.append("    hexBytes: ").append(toIndentedString(hexBytes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
