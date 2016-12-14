package com.techm.bluemix.smarterairport.Wrapper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class WeatherStatusWrapper {

	public WeatherStatusWrapper() {
		
		// TODO Auto-generated constructor stub
	}
	
	@JsonProperty("observation")
	private ObservationWrapper observation;

	@Override
	public String toString() {
		return "WeatherStatusWrapper [observation=" + observation + "]";
	}

	public ObservationWrapper getObservation() {
		return observation;
	}

	public void setObservation(ObservationWrapper observation) {
		this.observation = observation;
	}
	

}
