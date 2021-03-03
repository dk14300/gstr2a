
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
    "inum",
    "idt",
    "val",
    "pos",
    "rchrg",
    "inv_typ",
    "cflag",
    "updby",
    "itms"
})
public class Inv {

    @JsonProperty("inum")
    private String inum;
    @JsonProperty("idt")
    private String idt;
    @JsonProperty("val")
    private Double val;
    @JsonProperty("pos")
    private String pos;
    @JsonProperty("rchrg")
    private String rchrg;
    @JsonProperty("inv_typ")
    private String invTyp;
    @JsonProperty("cflag")
    private String cflag;
    @JsonProperty("updby")
    private String updby;
    @JsonProperty("itms")
    private List<Itm> itms = new ArrayList<Itm>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("inum")
    public String getInum() {
        return inum;
    }

    @JsonProperty("inum")
    public void setInum(String inum) {
        this.inum = inum;
    }

    @JsonProperty("idt")
    public String getIdt() {
        return idt;
    }

    @JsonProperty("idt")
    public void setIdt(String idt) {
        this.idt = idt;
    }

    @JsonProperty("val")
    public Double getVal() {
        return val;
    }

    @JsonProperty("val")
    public void setVal(Double val) {
        this.val = val;
    }

    @JsonProperty("pos")
    public String getPos() {
        return pos;
    }

    @JsonProperty("pos")
    public void setPos(String pos) {
        this.pos = pos;
    }

    @JsonProperty("rchrg")
    public String getRchrg() {
        return rchrg;
    }

    @JsonProperty("rchrg")
    public void setRchrg(String rchrg) {
        this.rchrg = rchrg;
    }

    @JsonProperty("inv_typ")
    public String getInvTyp() {
        return invTyp;
    }

    @JsonProperty("inv_typ")
    public void setInvTyp(String invTyp) {
        this.invTyp = invTyp;
    }

    @JsonProperty("cflag")
    public String getCflag() {
        return cflag;
    }

    @JsonProperty("cflag")
    public void setCflag(String cflag) {
        this.cflag = cflag;
    }

    @JsonProperty("updby")
    public String getUpdby() {
        return updby;
    }

    @JsonProperty("updby")
    public void setUpdby(String updby) {
        this.updby = updby;
    }

    @JsonProperty("itms")
    public List<Itm> getItms() {
        return itms;
    }

    @JsonProperty("itms")
    public void setItms(List<Itm> itms) {
        this.itms = itms;
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
        sb.append(Inv.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("inum");
        sb.append('=');
        sb.append(((this.inum == null)?"<null>":this.inum));
        sb.append(',');
        sb.append("idt");
        sb.append('=');
        sb.append(((this.idt == null)?"<null>":this.idt));
        sb.append(',');
        sb.append("val");
        sb.append('=');
        sb.append(((this.val == null)?"<null>":this.val));
        sb.append(',');
        sb.append("pos");
        sb.append('=');
        sb.append(((this.pos == null)?"<null>":this.pos));
        sb.append(',');
        sb.append("rchrg");
        sb.append('=');
        sb.append(((this.rchrg == null)?"<null>":this.rchrg));
        sb.append(',');
        sb.append("invTyp");
        sb.append('=');
        sb.append(((this.invTyp == null)?"<null>":this.invTyp));
        sb.append(',');
        sb.append("cflag");
        sb.append('=');
        sb.append(((this.cflag == null)?"<null>":this.cflag));
        sb.append(',');
        sb.append("updby");
        sb.append('=');
        sb.append(((this.updby == null)?"<null>":this.updby));
        sb.append(',');
        sb.append("itms");
        sb.append('=');
        sb.append(((this.itms == null)?"<null>":this.itms));
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
        result = ((result* 31)+((this.val == null)? 0 :this.val.hashCode()));
        result = ((result* 31)+((this.itms == null)? 0 :this.itms.hashCode()));
        result = ((result* 31)+((this.pos == null)? 0 :this.pos.hashCode()));
        result = ((result* 31)+((this.updby == null)? 0 :this.updby.hashCode()));
        result = ((result* 31)+((this.idt == null)? 0 :this.idt.hashCode()));
        result = ((result* 31)+((this.rchrg == null)? 0 :this.rchrg.hashCode()));
        result = ((result* 31)+((this.invTyp == null)? 0 :this.invTyp.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.inum == null)? 0 :this.inum.hashCode()));
        result = ((result* 31)+((this.cflag == null)? 0 :this.cflag.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Inv) == false) {
            return false;
        }
        Inv rhs = ((Inv) other);
        return (((((((((((this.val == rhs.val)||((this.val!= null)&&this.val.equals(rhs.val)))&&((this.itms == rhs.itms)||((this.itms!= null)&&this.itms.equals(rhs.itms))))&&((this.pos == rhs.pos)||((this.pos!= null)&&this.pos.equals(rhs.pos))))&&((this.updby == rhs.updby)||((this.updby!= null)&&this.updby.equals(rhs.updby))))&&((this.idt == rhs.idt)||((this.idt!= null)&&this.idt.equals(rhs.idt))))&&((this.rchrg == rhs.rchrg)||((this.rchrg!= null)&&this.rchrg.equals(rhs.rchrg))))&&((this.invTyp == rhs.invTyp)||((this.invTyp!= null)&&this.invTyp.equals(rhs.invTyp))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.inum == rhs.inum)||((this.inum!= null)&&this.inum.equals(rhs.inum))))&&((this.cflag == rhs.cflag)||((this.cflag!= null)&&this.cflag.equals(rhs.cflag))));
    }

}
