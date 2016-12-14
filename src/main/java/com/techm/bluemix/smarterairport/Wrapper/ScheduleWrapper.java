package com.techm.bluemix.smarterairport.Wrapper;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ScheduleWrapper {
	
	private String flightType,serviceClasses,restrictions;
	
	@JsonProperty("downlines")
	private DownlinesWrapper[] downlines;
	
	@JsonProperty("uplines")
	private DownlinesWrapper[] uplines;

	
	

	@Override
	public String toString() {
		return "ScheduleWrapper [flightType=" + flightType + ", serviceClasses=" + serviceClasses + ", restrictions="
				+ restrictions + ", downlines=" + Arrays.toString(downlines) + ", uplines=" + Arrays.toString(uplines)
				+ "]";
	}

	public DownlinesWrapper[] getDownlines() {
		return downlines;
	}

	public void setDownlines(DownlinesWrapper[] downlines) {
		this.downlines = downlines;
	}

	public DownlinesWrapper[] getUplines() {
		return uplines;
	}

	public void setUplines(DownlinesWrapper[] uplines) {
		this.uplines = uplines;
	}

	public String getFlightType() {
		return flightType;
	}

	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}

	public String getServiceClasses() {
		return serviceClasses;
	}

	public void setServiceClasses(String serviceClasses) {
		this.serviceClasses = serviceClasses;
	}

	public String getRestrictions() {
		return restrictions;
	}

	public void setRestrictions(String restrictions) {
		this.restrictions = restrictions;
	}

}
