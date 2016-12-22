package com.techm.bluemix.smarterairport.Wrapper;



import java.util.Arrays;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown=true)
public class FlightStatusWrapper{
	
	@JsonProperty("appendix")
	AppendixWrapper appendix;	
	
	@JsonProperty("flightStatuses")
	FlightStatusesWrapper[] flightStatuses;
	
	

	public AppendixWrapper getAppendix() {
		return appendix;
	}

	public void setAppendix(AppendixWrapper appendix) {
		this.appendix = appendix;
	}

	public FlightStatusesWrapper[] getFlightStatuses() {
		return flightStatuses;
	}

	public void setFlightStatuses(FlightStatusesWrapper[] flightStatuses) {
		this.flightStatuses = flightStatuses;
	}

	@Override
	public String toString() {
		return "FlightStatusWrapper [appendix=" + appendix + ", flightStatuses=" + Arrays.toString(flightStatuses)
				+ "]";
	}

	

	
	
}
