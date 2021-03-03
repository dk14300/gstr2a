
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
    "gstin",
    "fp",
    "b2b"
})
public class GSTR237AGZPK5154E1ZYMarch201920 {

    @JsonProperty("gstin")
    private String gstin;
    @JsonProperty("fp")
    private String fp;
    @JsonProperty("b2b")
    private List<B2b> b2b = new ArrayList<B2b>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("gstin")
    public String getGstin() {
        return gstin;
    }

    @JsonProperty("gstin")
    public void setGstin(String gstin) {
        this.gstin = gstin;
    }

    @JsonProperty("fp")
    public String getFp() {
        return fp;
    }

    @JsonProperty("fp")
    public void setFp(String fp) {
        this.fp = fp;
    }

    @JsonProperty("b2b")
    public List<B2b> getB2b() {
        return b2b;
    }

    @JsonProperty("b2b")
    public void setB2b(List<B2b> b2b) {
        this.b2b = b2b;
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
        sb.append(GSTR237AGZPK5154E1ZYMarch201920 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("gstin");
        sb.append('=');
        sb.append(((this.gstin == null)?"<null>":this.gstin));
        sb.append(',');
        sb.append("fp");
        sb.append('=');
        sb.append(((this.fp == null)?"<null>":this.fp));
        sb.append(',');
        sb.append("b2b");
        sb.append('=');
        sb.append(((this.b2b == null)?"<null>":this.b2b));
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
        result = ((result* 31)+((this.fp == null)? 0 :this.fp.hashCode()));
        result = ((result* 31)+((this.b2b == null)? 0 :this.b2b.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.gstin == null)? 0 :this.gstin.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GSTR237AGZPK5154E1ZYMarch201920) == false) {
            return false;
        }
        GSTR237AGZPK5154E1ZYMarch201920 rhs = ((GSTR237AGZPK5154E1ZYMarch201920) other);
        return (((((this.fp == rhs.fp)||((this.fp!= null)&&this.fp.equals(rhs.fp)))&&((this.b2b == rhs.b2b)||((this.b2b!= null)&&this.b2b.equals(rhs.b2b))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.gstin == rhs.gstin)||((this.gstin!= null)&&this.gstin.equals(rhs.gstin))));
    }

}
