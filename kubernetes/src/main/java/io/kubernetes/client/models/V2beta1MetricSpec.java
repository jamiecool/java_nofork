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
import io.kubernetes.client.models.V2beta1ExternalMetricSource;
import io.kubernetes.client.models.V2beta1ObjectMetricSource;
import io.kubernetes.client.models.V2beta1PodsMetricSource;
import io.kubernetes.client.models.V2beta1ResourceMetricSource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * MetricSpec specifies how to scale based on a single metric (only &#x60;type&#x60; and one other matching field should be set at once).
 */
@ApiModel(description = "MetricSpec specifies how to scale based on a single metric (only `type` and one other matching field should be set at once).")

public class V2beta1MetricSpec {
  @SerializedName("external")
  private V2beta1ExternalMetricSource external = null;

  @SerializedName("object")
  private V2beta1ObjectMetricSource object = null;

  @SerializedName("pods")
  private V2beta1PodsMetricSource pods = null;

  @SerializedName("resource")
  private V2beta1ResourceMetricSource resource = null;

  @SerializedName("type")
  private String type = null;

  public V2beta1MetricSpec external(V2beta1ExternalMetricSource external) {
    this.external = external;
    return this;
  }

   /**
   * external refers to a global metric that is not associated with any Kubernetes object. It allows autoscaling based on information coming from components running outside of cluster (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster).
   * @return external
  **/
  @ApiModelProperty(value = "external refers to a global metric that is not associated with any Kubernetes object. It allows autoscaling based on information coming from components running outside of cluster (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster).")
  public V2beta1ExternalMetricSource getExternal() {
    return external;
  }

  public void setExternal(V2beta1ExternalMetricSource external) {
    this.external = external;
  }

  public V2beta1MetricSpec object(V2beta1ObjectMetricSource object) {
    this.object = object;
    return this;
  }

   /**
   * object refers to a metric describing a single kubernetes object (for example, hits-per-second on an Ingress object).
   * @return object
  **/
  @ApiModelProperty(value = "object refers to a metric describing a single kubernetes object (for example, hits-per-second on an Ingress object).")
  public V2beta1ObjectMetricSource getObject() {
    return object;
  }

  public void setObject(V2beta1ObjectMetricSource object) {
    this.object = object;
  }

  public V2beta1MetricSpec pods(V2beta1PodsMetricSource pods) {
    this.pods = pods;
    return this;
  }

   /**
   * pods refers to a metric describing each pod in the current scale target (for example, transactions-processed-per-second).  The values will be averaged together before being compared to the target value.
   * @return pods
  **/
  @ApiModelProperty(value = "pods refers to a metric describing each pod in the current scale target (for example, transactions-processed-per-second).  The values will be averaged together before being compared to the target value.")
  public V2beta1PodsMetricSource getPods() {
    return pods;
  }

  public void setPods(V2beta1PodsMetricSource pods) {
    this.pods = pods;
  }

  public V2beta1MetricSpec resource(V2beta1ResourceMetricSource resource) {
    this.resource = resource;
    return this;
  }

   /**
   * resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the \&quot;pods\&quot; source.
   * @return resource
  **/
  @ApiModelProperty(value = "resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the \"pods\" source.")
  public V2beta1ResourceMetricSource getResource() {
    return resource;
  }

  public void setResource(V2beta1ResourceMetricSource resource) {
    this.resource = resource;
  }

  public V2beta1MetricSpec type(String type) {
    this.type = type;
    return this;
  }

   /**
   * type is the type of metric source.  It should be one of \&quot;Object\&quot;, \&quot;Pods\&quot; or \&quot;Resource\&quot;, each mapping to a matching field in the object.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "type is the type of metric source.  It should be one of \"Object\", \"Pods\" or \"Resource\", each mapping to a matching field in the object.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2beta1MetricSpec v2beta1MetricSpec = (V2beta1MetricSpec) o;
    return Objects.equals(this.external, v2beta1MetricSpec.external) &&
        Objects.equals(this.object, v2beta1MetricSpec.object) &&
        Objects.equals(this.pods, v2beta1MetricSpec.pods) &&
        Objects.equals(this.resource, v2beta1MetricSpec.resource) &&
        Objects.equals(this.type, v2beta1MetricSpec.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(external, object, pods, resource, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2beta1MetricSpec {\n");
    
    sb.append("    external: ").append(toIndentedString(external)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    pods: ").append(toIndentedString(pods)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

