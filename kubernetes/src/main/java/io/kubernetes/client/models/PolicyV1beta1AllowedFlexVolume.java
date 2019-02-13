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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AllowedFlexVolume represents a single Flexvolume that is allowed to be used.
 */
@ApiModel(description = "AllowedFlexVolume represents a single Flexvolume that is allowed to be used.")

public class PolicyV1beta1AllowedFlexVolume {
  @SerializedName("driver")
  private String driver = null;

  public PolicyV1beta1AllowedFlexVolume driver(String driver) {
    this.driver = driver;
    return this;
  }

   /**
   * driver is the name of the Flexvolume driver.
   * @return driver
  **/
  @ApiModelProperty(required = true, value = "driver is the name of the Flexvolume driver.")
  public String getDriver() {
    return driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyV1beta1AllowedFlexVolume policyV1beta1AllowedFlexVolume = (PolicyV1beta1AllowedFlexVolume) o;
    return Objects.equals(this.driver, policyV1beta1AllowedFlexVolume.driver);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driver);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyV1beta1AllowedFlexVolume {\n");
    
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
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

