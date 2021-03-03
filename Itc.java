
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
    "elg",
    "tx_i",
    "tx_c",
    "tx_s",
    "tx_cs"
})
public class Itc {

    @JsonProperty("elg")
    private String elg;
    @JsonProperty("tx_i")
    private Double txI;
    @JsonProperty("tx_c")
    private Double txC;
    @JsonProperty("tx_s")
    private Double txS;
    @JsonProperty("tx_cs")
    private Double txCs;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("elg")
    public String getElg() {
        return elg;
    }

    @JsonProperty("elg")
    public void setElg(String elg) {
        this.elg = elg;
    }

    @JsonProperty("tx_i")
    public Double getTxI() {
        return txI;
    }

    @JsonProperty("tx_i")
    public void setTxI(Double txI) {
        this.txI = txI;
    }

    @JsonProperty("tx_c")
    public Double getTxC() {
        return txC;
    }

    @JsonProperty("tx_c")
    public void setTxC(Double txC) {
        this.txC = txC;
    }

    @JsonProperty("tx_s")
    public Double getTxS() {
        return txS;
    }

    @JsonProperty("tx_s")
    public void setTxS(Double txS) {
        this.txS = txS;
    }

    @JsonProperty("tx_cs")
    public Double getTxCs() {
        return txCs;
    }

    @JsonProperty("tx_cs")
    public void setTxCs(Double txCs) {
        this.txCs = txCs;
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
        sb.append(Itc.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("elg");
        sb.append('=');
        sb.append(((this.elg == null)?"<null>":this.elg));
        sb.append(',');
        sb.append("txI");
        sb.append('=');
        sb.append(((this.txI == null)?"<null>":this.txI));
        sb.append(',');
        sb.append("txC");
        sb.append('=');
        sb.append(((this.txC == null)?"<null>":this.txC));
        sb.append(',');
        sb.append("txS");
        sb.append('=');
        sb.append(((this.txS == null)?"<null>":this.txS));
        sb.append(',');
        sb.append("txCs");
        sb.append('=');
        sb.append(((this.txCs == null)?"<null>":this.txCs));
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
        result = ((result* 31)+((this.elg == null)? 0 :this.elg.hashCode()));
        result = ((result* 31)+((this.txCs == null)? 0 :this.txCs.hashCode()));
        result = ((result* 31)+((this.txI == null)? 0 :this.txI.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.txC == null)? 0 :this.txC.hashCode()));
        result = ((result* 31)+((this.txS == null)? 0 :this.txS.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Itc) == false) {
            return false;
        }
        Itc rhs = ((Itc) other);
        return (((((((this.elg == rhs.elg)||((this.elg!= null)&&this.elg.equals(rhs.elg)))&&((this.txCs == rhs.txCs)||((this.txCs!= null)&&this.txCs.equals(rhs.txCs))))&&((this.txI == rhs.txI)||((this.txI!= null)&&this.txI.equals(rhs.txI))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.txC == rhs.txC)||((this.txC!= null)&&this.txC.equals(rhs.txC))))&&((this.txS == rhs.txS)||((this.txS!= null)&&this.txS.equals(rhs.txS))));
    }

}
