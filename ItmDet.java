
package com.codinglife.java.tally;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "txval",
    "rt",
    "iamt",
    "camt",
    "samt",
    "csamt"
})
public class ItmDet {

    @JsonProperty("txval")
    private Double txval;
    @JsonProperty("rt")
    private Integer rt;
    @JsonProperty("iamt")
    private Double iamt;
    @JsonProperty("camt")
    private Double camt;
    @JsonProperty("samt")
    private Double samt;
    @JsonProperty("csamt")
    private Double csamt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("txval")
    public Double getTxval() {
        return txval;
    }

    @JsonProperty("txval")
    public void setTxval(Double txval) {
        this.txval = txval;
    }

    @JsonProperty("rt")
    public Integer getRt() {
        return rt;
    }

    @JsonProperty("rt")
    public void setRt(Integer rt) {
        this.rt = rt;
    }

    @JsonProperty("iamt")
    public Double getIamt() {
        return iamt;
    }

    @JsonProperty("iamt")
    public void setIamt(Double iamt) {
        this.iamt = iamt;
    }

    @JsonProperty("camt")
    public Double getCamt() {
        return camt;
    }

    @JsonProperty("camt")
    public void setCamt(Double camt) {
        this.camt = camt;
    }

    @JsonProperty("samt")
    public Double getSamt() {
        return samt;
    }

    @JsonProperty("samt")
    public void setSamt(Double samt) {
        this.samt = samt;
    }

    @JsonProperty("csamt")
    public Double getCsamt() {
        return csamt;
    }

    @JsonProperty("csamt")
    public void setCsamt(Double csamt) {
        this.csamt = csamt;
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
        sb.append(ItmDet.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("txval");
        sb.append('=');
        sb.append(((this.txval == null)?"<null>":this.txval));
        sb.append(',');
        sb.append("rt");
        sb.append('=');
        sb.append(((this.rt == null)?"<null>":this.rt));
        sb.append(',');
        sb.append("iamt");
        sb.append('=');
        sb.append(((this.iamt == null)?"<null>":this.iamt));
        sb.append(',');
        sb.append("camt");
        sb.append('=');
        sb.append(((this.camt == null)?"<null>":this.camt));
        sb.append(',');
        sb.append("samt");
        sb.append('=');
        sb.append(((this.samt == null)?"<null>":this.samt));
        sb.append(',');
        sb.append("csamt");
        sb.append('=');
        sb.append(((this.csamt == null)?"<null>":this.csamt));
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
        result = ((result* 31)+((this.samt == null)? 0 :this.samt.hashCode()));
        result = ((result* 31)+((this.csamt == null)? 0 :this.csamt.hashCode()));
        result = ((result* 31)+((this.rt == null)? 0 :this.rt.hashCode()));
        result = ((result* 31)+((this.txval == null)? 0 :this.txval.hashCode()));
        result = ((result* 31)+((this.camt == null)? 0 :this.camt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.iamt == null)? 0 :this.iamt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ItmDet) == false) {
            return false;
        }
        ItmDet rhs = ((ItmDet) other);
        return ((((((((this.samt == rhs.samt)||((this.samt!= null)&&this.samt.equals(rhs.samt)))&&((this.csamt == rhs.csamt)||((this.csamt!= null)&&this.csamt.equals(rhs.csamt))))&&((this.rt == rhs.rt)||((this.rt!= null)&&this.rt.equals(rhs.rt))))&&((this.txval == rhs.txval)||((this.txval!= null)&&this.txval.equals(rhs.txval))))&&((this.camt == rhs.camt)||((this.camt!= null)&&this.camt.equals(rhs.camt))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.iamt == rhs.iamt)||((this.iamt!= null)&&this.iamt.equals(rhs.iamt))));
    }

}
