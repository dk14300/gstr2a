
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
    "num",
    "itm_det",
    "itc"
})
public class Itm {

    @JsonProperty("num")
    private Integer num;
    @JsonProperty("itm_det")
    private ItmDet itmDet;
    @JsonProperty("itc")
    private Itc itc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("num")
    public Integer getNum() {
        return num;
    }

    @JsonProperty("num")
    public void setNum(Integer num) {
        this.num = num;
    }

    @JsonProperty("itm_det")
    public ItmDet getItmDet() {
        return itmDet;
    }

    @JsonProperty("itm_det")
    public void setItmDet(ItmDet itmDet) {
        this.itmDet = itmDet;
    }

    @JsonProperty("itc")
    public Itc getItc() {
        return itc;
    }

    @JsonProperty("itc")
    public void setItc(Itc itc) {
        this.itc = itc;
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
        sb.append(Itm.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("num");
        sb.append('=');
        sb.append(((this.num == null)?"<null>":this.num));
        sb.append(',');
        sb.append("itmDet");
        sb.append('=');
        sb.append(((this.itmDet == null)?"<null>":this.itmDet));
        sb.append(',');
        sb.append("itc");
        sb.append('=');
        sb.append(((this.itc == null)?"<null>":this.itc));
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
        result = ((result* 31)+((this.itc == null)? 0 :this.itc.hashCode()));
        result = ((result* 31)+((this.itmDet == null)? 0 :this.itmDet.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.num == null)? 0 :this.num.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Itm) == false) {
            return false;
        }
        Itm rhs = ((Itm) other);
        return (((((this.itc == rhs.itc)||((this.itc!= null)&&this.itc.equals(rhs.itc)))&&((this.itmDet == rhs.itmDet)||((this.itmDet!= null)&&this.itmDet.equals(rhs.itmDet))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.num == rhs.num)||((this.num!= null)&&this.num.equals(rhs.num))));
    }

}
