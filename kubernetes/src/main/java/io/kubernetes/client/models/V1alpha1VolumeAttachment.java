/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.13.5
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.models.V1ObjectMeta;
import io.kubernetes.client.models.V1alpha1VolumeAttachmentSpec;
import io.kubernetes.client.models.V1alpha1VolumeAttachmentStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VolumeAttachment captures the intent to attach or detach the specified volume to/from the specified node.  VolumeAttachment objects are non-namespaced.
 */
@ApiModel(description = "VolumeAttachment captures the intent to attach or detach the specified volume to/from the specified node.  VolumeAttachment objects are non-namespaced.")

public class V1alpha1VolumeAttachment {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private V1ObjectMeta metadata = null;

  @SerializedName("spec")
  private V1alpha1VolumeAttachmentSpec spec = null;

  @SerializedName("status")
  private V1alpha1VolumeAttachmentStatus status = null;

  public V1alpha1VolumeAttachment apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
   * @return apiVersion
  **/
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public V1alpha1VolumeAttachment kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
   * @return kind
  **/
  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1alpha1VolumeAttachment metadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Standard object metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "Standard object metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata")
  public V1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public V1alpha1VolumeAttachment spec(V1alpha1VolumeAttachmentSpec spec) {
    this.spec = spec;
    return this;
  }

   /**
   * Specification of the desired attach/detach volume behavior. Populated by the Kubernetes system.
   * @return spec
  **/
  @ApiModelProperty(required = true, value = "Specification of the desired attach/detach volume behavior. Populated by the Kubernetes system.")
  public V1alpha1VolumeAttachmentSpec getSpec() {
    return spec;
  }

  public void setSpec(V1alpha1VolumeAttachmentSpec spec) {
    this.spec = spec;
  }

  public V1alpha1VolumeAttachment status(V1alpha1VolumeAttachmentStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the VolumeAttachment request. Populated by the entity completing the attach or detach operation, i.e. the external-attacher.
   * @return status
  **/
  @ApiModelProperty(value = "Status of the VolumeAttachment request. Populated by the entity completing the attach or detach operation, i.e. the external-attacher.")
  public V1alpha1VolumeAttachmentStatus getStatus() {
    return status;
  }

  public void setStatus(V1alpha1VolumeAttachmentStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1VolumeAttachment v1alpha1VolumeAttachment = (V1alpha1VolumeAttachment) o;
    return Objects.equals(this.apiVersion, v1alpha1VolumeAttachment.apiVersion) &&
        Objects.equals(this.kind, v1alpha1VolumeAttachment.kind) &&
        Objects.equals(this.metadata, v1alpha1VolumeAttachment.metadata) &&
        Objects.equals(this.spec, v1alpha1VolumeAttachment.spec) &&
        Objects.equals(this.status, v1alpha1VolumeAttachment.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, spec, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1VolumeAttachment {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

