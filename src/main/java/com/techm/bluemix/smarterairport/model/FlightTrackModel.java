package com.techm.bluemix.smarterairport.model;

public class FlightTrackModel {

	private String flightId;
	private String carrierFsCode;
	private String flightNumber;
	private String tailNumber;
	private String departureAirportFsCode;
	private String arriavalAirportFsCode;
	private String departureDate_local;
	private String departureDate_utc;
	private String delayMinutes;

	/**
	 * @return the flightId
	 */
	public String getFlightId() {
		return flightId;
	}

	/**
	 * @param flightId
	 *            the flightId to set
	 */
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	/**
	 * @return the carrierFsCode
	 */
	public String getCarrierFsCode() {
		return carrierFsCode;
	}

	/**
	 * @param carrierFsCode
	 *            the carrierFsCode to set
	 */
	public void setCarrierFsCode(String carrierFsCode) {
		this.carrierFsCode = carrierFsCode;
	}

	/**
	 * @return the flightNumber
	 */
	public String getFlightNumber() {
		return flightNumber;
	}

	/**
	 * @param flightNumber
	 *            the flightNumber to set
	 */
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	/**
	 * @return the tailNumber
	 */
	public String getTailNumber() {
		return tailNumber;
	}

	/**
	 * @param tailNumber
	 *            the tailNumber to set
	 */
	public void setTailNumber(String tailNumber) {
		this.tailNumber = tailNumber;
	}

	/**
	 * @return the departureAirportFsCode
	 */
	public String getDepartureAirportFsCode() {
		return departureAirportFsCode;
	}

	/**
	 * @param departureAirportFsCode
	 *            the departureAirportFsCode to set
	 */
	public void setDepartureAirportFsCode(String departureAirportFsCode) {
		this.departureAirportFsCode = departureAirportFsCode;
	}

	/**
	 * @return the arriavalAirportFsCode
	 */
	public String getArriavalAirportFsCode() {
		return arriavalAirportFsCode;
	}

	/**
	 * @param arriavalAirportFsCode
	 *            the arriavalAirportFsCode to set
	 */
	public void setArriavalAirportFsCode(String arriavalAirportFsCode) {
		this.arriavalAirportFsCode = arriavalAirportFsCode;
	}

	/**
	 * @return the departureDate_local
	 */
	public String getDepartureDate_local() {
		return departureDate_local;
	}

	/**
	 * @param departureDate_local
	 *            the departureDate_local to set
	 */
	public void setDepartureDate_local(String departureDate_local) {
		this.departureDate_local = departureDate_local;
	}

	/**
	 * @return the departureDate_utc
	 */
	public String getDepartureDate_utc() {
		return departureDate_utc;
	}

	/**
	 * @param departureDate_utc
	 *            the departureDate_utc to set
	 */
	public void setDepartureDate_utc(String departureDate_utc) {
		this.departureDate_utc = departureDate_utc;
	}

	/**
	 * @return the delayMinutes
	 */
	public String getDelayMinutes() {
		return delayMinutes;
	}

	/**
	 * @param delayMinutes
	 *            the delayMinutes to set
	 */
	public void setDelayMinutes(String delayMinutes) {
		this.delayMinutes = delayMinutes;
	}

	@Override
	public String toString() {
		return "FlightTrackModel [flightId=" + flightId + ", carrierFsCode=" + carrierFsCode + ", flightNumber="
				+ flightNumber + ", tailNumber=" + tailNumber + ", departureAirportFsCode=" + departureAirportFsCode
				+ ", arriavalAirportFsCode=" + arriavalAirportFsCode + ", departureDate_local=" + departureDate_local
				+ ", departureDate_utc=" + departureDate_utc + ", delayMinutes=" + delayMinutes + "]";
	}
}