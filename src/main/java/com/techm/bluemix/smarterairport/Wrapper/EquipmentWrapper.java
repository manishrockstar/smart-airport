package com.techm.bluemix.smarterairport.Wrapper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class EquipmentWrapper {
	
	private String iata,name;
	private Boolean turboProp,jet,widebody,regional;
	public String getIata() {
		return iata;
	}
	public void setIata(String iata) {
		this.iata = iata;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getTurboProp() {
		return turboProp;
	}
	public void setTurboProp(Boolean turboProp) {
		this.turboProp = turboProp;
	}
	public Boolean getJet() {
		return jet;
	}
	public void setJet(Boolean jet) {
		this.jet = jet;
	}
	public Boolean getWidebody() {
		return widebody;
	}
	public void setWidebody(Boolean widebody) {
		this.widebody = widebody;
	}
	public Boolean getRegional() {
		return regional;
	}
	public void setRegional(Boolean regional) {
		this.regional = regional;
	}
	@Override
	public String toString() {
		return "EquipmentWrapper [iata=" + iata + ", name=" + name + ", turboProp=" + turboProp + ", jet=" + jet
				+ ", widebody=" + widebody + ", regional=" + regional + "]";
	}
	

}
