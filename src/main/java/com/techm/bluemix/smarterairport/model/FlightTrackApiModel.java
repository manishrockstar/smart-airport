package com.techm.bluemix.smarterairport.model;

import java.util.Arrays;

public class FlightTrackApiModel {
	public AirlineModel[] airline;
	public AirportModel[] airport;
	public AirportResourceModel airportResource;

	/**
	 * @return the airline
	 */
	public AirlineModel[] getAirline() {
		return airline;
	}

	/**
	 * @param airline
	 *            the airline to set
	 */
	public void setAirline(AirlineModel[] airline) {
		this.airline = airline;
	}

	/**
	 * @return the airport
	 */
	public AirportModel[] getAirport() {
		return airport;
	}

	/**
	 * @param airport
	 *            the airport to set
	 */
	public void setAirport(AirportModel[] airport) {
		this.airport = airport;
	}

	/**
	 * @return the airportResource
	 */
	public AirportResourceModel getAirportResource() {
		return airportResource;
	}

	/**
	 * @param airportResource
	 *            the airportResource to set
	 */
	public void setAirportResource(AirportResourceModel airportResource) {
		this.airportResource = airportResource;
	}

	@Override
	public String toString() {
		return "FlightTrackApiModel [airline=" + Arrays.toString(airline) + ", airport=" + Arrays.toString(airport)
				+ ", airportResource=" + airportResource + "]";
	}
}