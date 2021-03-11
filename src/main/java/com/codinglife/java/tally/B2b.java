package com.codinglife.java.tally;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;



@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ctin",
    "inv"
})
public class B2b {

    @JsonProperty("ctin")
    private String ctin;
    @JsonProperty("inv")
    private List<Inv> inv = new ArrayList<Inv>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ctin")
    public String getCtin() {
        return ctin;
    }

    @JsonProperty("ctin")
    public void setCtin(String ctin) {
        this.ctin = ctin;
    }

    @JsonProperty("inv")
    public List<Inv> getInv() {
        return inv;
    }

    @JsonProperty("inv")
    public void setInv(List<Inv> inv) {
        this.inv = inv;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(B2b.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ctin");
        sb.append('=');
        sb.append(((this.ctin == null)?"<null>":this.ctin));
        sb.append(',');
        sb.append("inv");
        sb.append('=');
        sb.append(((this.inv == null)?"<null>":this.inv));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.ctin == null)? 0 :this.ctin.hashCode()));
        result = ((result* 31)+((this.inv == null)? 0 :this.inv.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof B2b) == false) {
            return false;
        }
        B2b rhs = ((B2b) other);
        return ((((this.ctin == rhs.ctin)||((this.ctin!= null)&&this.ctin.equals(rhs.ctin)))&&((this.inv == rhs.inv)||((this.inv!= null)&&this.inv.equals(rhs.inv))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
