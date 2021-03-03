package com.codinglife.java.tally;

public class Totalinvoices {
	
private String	inum;
private String	idt;
private Double	val;
 
private Double txval;
private Integer rt;
    private Double iamt;
    private Double camt;
private Double    samt;
public Totalinvoices(String inum, String idt, Double val, Double txval, Integer rt, Double iamt, Double camt,
		Double samt) {
	super();
	this.inum = inum;
	this.idt = idt;
	this.val = val;
	this.txval = txval;
	this.rt = rt;
	this.iamt = iamt;
	this.camt = camt;
	this.samt = samt;
}
public String getInum() {
	return inum;
}
public void setInum(String inum) {
	this.inum = inum;
}
public String getIdt() {
	return idt;
}
public void setIdt(String idt) {
	this.idt = idt;
}
public Double getVal() {
	return val;
}
public void setVal(Double val) {
	this.val = val;
}
public Double getTxval() {
	return txval;
}
public void setTxval(Double txval) {
	this.txval = txval;
}
public Integer getRt() {
	return rt;
}
public void setRt(Integer rt) {
	this.rt = rt;
}
public Double getIamt() {
	return iamt;
}
public void setIamt(Double iamt) {
	this.iamt = iamt;
}
public Double getCamt() {
	return camt;
}
public void setCamt(Double camt) {
	this.camt = camt;
}
public Double getSamt() {
	return samt;
}
public void setSamt(Double samt) {
	this.samt = samt;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((camt == null) ? 0 : camt.hashCode());
	result = prime * result + ((iamt == null) ? 0 : iamt.hashCode());
	result = prime * result + ((idt == null) ? 0 : idt.hashCode());
	result = prime * result + ((inum == null) ? 0 : inum.hashCode());
	result = prime * result + ((rt == null) ? 0 : rt.hashCode());
	result = prime * result + ((samt == null) ? 0 : samt.hashCode());
	result = prime * result + ((txval == null) ? 0 : txval.hashCode());
	result = prime * result + ((val == null) ? 0 : val.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Totalinvoices other = (Totalinvoices) obj;
	if (camt == null) {
		if (other.camt != null)
			return false;
	} else if (!camt.equals(other.camt))
		return false;
	if (iamt == null) {
		if (other.iamt != null)
			return false;
	} else if (!iamt.equals(other.iamt))
		return false;
	if (idt == null) {
		if (other.idt != null)
			return false;
	} else if (!idt.equals(other.idt))
		return false;
	if (inum == null) {
		if (other.inum != null)
			return false;
	} else if (!inum.equals(other.inum))
		return false;
	if (rt == null) {
		if (other.rt != null)
			return false;
	} else if (!rt.equals(other.rt))
		return false;
	if (samt == null) {
		if (other.samt != null)
			return false;
	} else if (!samt.equals(other.samt))
		return false;
	if (txval == null) {
		if (other.txval != null)
			return false;
	} else if (!txval.equals(other.txval))
		return false;
	if (val == null) {
		if (other.val != null)
			return false;
	} else if (!val.equals(other.val))
		return false;
	return true;
}
@Override
public String toString() {
	return "Totalinvoices [inum=" + inum + ", idt=" + idt + ", val=" + val + ", txval=" + txval + ", rt=" + rt
			+ ", iamt=" + iamt + ", camt=" + camt + ", samt=" + samt + "]";
}
}
