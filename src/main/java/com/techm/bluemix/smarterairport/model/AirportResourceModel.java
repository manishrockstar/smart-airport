package com.techm.bluemix.smarterairport.model;

public class AirportResourceModel {
	private String departureGate;
	private String arrivalTerminal;
	private String arrivalGate;
	private String baggage;

	/**
	 * @return the departureGate
	 */
	public String getDepartureGate() {
		return departureGate;
	}

	/**
	 * @param departureGate
	 *            the departureGate to set
	 */
	public void setDepartureGate(String departureGate) {
		this.departureGate = departureGate;
	}

	/**
	 * @return the arrivalTerminal
	 */
	public String getArrivalTerminal() {
		return arrivalTerminal;
	}

	/**
	 * @param arrivalTerminal
	 *            the arrivalTerminal to set
	 */
	public void setArrivalTerminal(String arrivalTerminal) {
		this.arrivalTerminal = arrivalTerminal;
	}

	/**
	 * @return the arrivalGate
	 */
	public String getArrivalGate() {
		return arrivalGate;
	}

	/**
	 * @param arrivalGate
	 *            the arrivalGate to set
	 */
	public void setArrivalGate(String arrivalGate) {
		this.arrivalGate = arrivalGate;
	}

	/**
	 * @return the baggage
	 */
	public String getBaggage() {
		return baggage;
	}

	/**
	 * @param baggage
	 *            the baggage to set
	 */
	public void setBaggage(String baggage) {
		this.baggage = baggage;
	}

	@Override
	public String toString() {
		return "AirportResourceModel [departureGate=" + departureGate + ", arrivalTerminal=" + arrivalTerminal
				+ ", arrivalGate=" + arrivalGate + ", baggage=" + baggage + "]";
	}
}