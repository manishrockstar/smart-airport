package com.techm.bluemix.smarterairport.model;

public class AirlineModel {

	private String flightStatsAirlineCode;
	private String iataAirlineCode;
	private String icaoAirlineCode;
	private String name;
	private String phoneNumber;
	private boolean active;

	/**
	 * @return the flightStatsAirlineCode
	 */
	public String getFlightStatsAirlineCode() {
		return flightStatsAirlineCode;
	}

	/**
	 * @param flightStatsAirlineCode
	 *            the flightStatsAirlineCode to set
	 */
	public void setFlightStatsAirlineCode(String flightStatsAirlineCode) {
		this.flightStatsAirlineCode = flightStatsAirlineCode;
	}

	/**
	 * @return the iataAirlineCode
	 */
	public String getIataAirlineCode() {
		return iataAirlineCode;
	}

	/**
	 * @param iataAirlineCode
	 *            the iataAirlineCode to set
	 */
	public void setIataAirlineCode(String iataAirlineCode) {
		this.iataAirlineCode = iataAirlineCode;
	}

	/**
	 * @return the icaoAirlineCode
	 */
	public String getIcaoAirlineCode() {
		return icaoAirlineCode;
	}

	/**
	 * @param icaoAirlineCode
	 *            the icaoAirlineCode to set
	 */
	public void setIcaoAirlineCode(String icaoAirlineCode) {
		this.icaoAirlineCode = icaoAirlineCode;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber
	 *            the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * @param active
	 *            the active to set
	 */
	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "AirlineModel [flightStatsAirlineCode=" + flightStatsAirlineCode + ", iataAirlineCode=" + iataAirlineCode
				+ ", icaoAirlineCode=" + icaoAirlineCode + ", name=" + name + ", phoneNumber=" + phoneNumber
				+ ", active=" + active + "]";
	}
}