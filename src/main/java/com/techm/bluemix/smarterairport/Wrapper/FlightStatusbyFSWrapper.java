package com.techm.bluemix.smarterairport.Wrapper;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown=true)
public class FlightStatusbyFSWrapper {
	
	@JsonProperty("airline")
	private AirlineWrapper airline;

	public AirlineWrapper getAirline() {
		return airline;
	}

	public void setAirline(AirlineWrapper airline) {
		this.airline = airline;
	}

	@Override
	public String toString() {
		return "FlightStatusbyFSWrapper [airline=" + airline + "]";
	}
	
	
	
	
	
}
