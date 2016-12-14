package com.techm.bluemix.smarterairport.Wrapper;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class AirportResourcesWrapper {
	
	@Override
	public String toString() {
		return "AirportResourcesWrapper [arrivalTerminal=" + arrivalTerminal + "]";
	}

	public String getArrivalTerminal() {
		return arrivalTerminal;
	}

	public void setArrivalTerminal(String arrivalTerminal) {
		this.arrivalTerminal = arrivalTerminal;
	}

	private String arrivalTerminal;
}
