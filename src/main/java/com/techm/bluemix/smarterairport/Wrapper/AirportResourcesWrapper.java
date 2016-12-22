package com.techm.bluemix.smarterairport.Wrapper;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class AirportResourcesWrapper {
	
	
	private String arrivalTerminal,departureGate,arrivalGate,departureTerminal,baggage;

	@Override
	public String toString() {
		return "AirportResourcesWrapper [arrivalTerminal=" + arrivalTerminal + ", departureGate=" + departureGate
				+ ", arrivalGate=" + arrivalGate + ", departureTerminal=" + departureTerminal + ", baggage=" + baggage
				+ "]";
	}

	public String getArrivalTerminal() {
		return arrivalTerminal;
	}

	public void setArrivalTerminal(String arrivalTerminal) {
		this.arrivalTerminal = arrivalTerminal;
	}

	public String getDepartureGate() {
		return departureGate;
	}

	public void setDepartureGate(String departureGate) {
		this.departureGate = departureGate;
	}

	public String getArrivalGate() {
		return arrivalGate;
	}

	public void setArrivalGate(String arrivalGate) {
		this.arrivalGate = arrivalGate;
	}

	public String getDepartureTerminal() {
		return departureTerminal;
	}

	public void setDepartureTerminal(String departureTerminal) {
		this.departureTerminal = departureTerminal;
	}

	public String getBaggage() {
		return baggage;
	}

	public void setBaggage(String baggage) {
		this.baggage = baggage;
	}

	
}
