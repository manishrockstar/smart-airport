package com.techm.bluemix.smarterairport.Wrapper;



import java.util.Arrays;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown=true)
public class FlightStatusWrapper{
	
		
	@JsonProperty("flightStatuses")
	FlightStatusesWrapper[] flightStatuses;
	
	
	public FlightStatusesWrapper[] getFlightStatuses() {
		return flightStatuses;
	}

	public void setFlightStatuses(FlightStatusesWrapper[] flightStatuses) {
		this.flightStatuses = flightStatuses;
	}

		@Override
	public String toString() {
		return "FlightStatusWrapper [flightStatuses=" + Arrays.toString(flightStatuses) + "]";
	}	
}
