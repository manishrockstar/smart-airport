package com.techm.bluemix.smarterairport.Wrapper;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class FlightStatusesWrapper {

	
	private String flightId;
	private String carrierFsCode,
	flightNumber,
	departureAirportFsCode,
	arrivalAirportFsCode,status;
	
	public String getFlightId() {
		return flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	public String getCarrierFsCode() {
		return carrierFsCode;
	}

	public void setCarrierFsCode(String carrierFsCode) {
		this.carrierFsCode = carrierFsCode;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getDepartureAirportFsCode() {
		return departureAirportFsCode;
	}

	public void setDepartureAirportFsCode(String departureAirportFsCode) {
		this.departureAirportFsCode = departureAirportFsCode;
	}

	public String getArrivalAirportFsCode() {
		return arrivalAirportFsCode;
	}

	public void setArrivalAirportFsCode(String arrivalAirportFsCode) {
		this.arrivalAirportFsCode = arrivalAirportFsCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@JsonProperty("departureDate")
	private DepartureWrapper departureDate;
	
	@JsonProperty("arrivalDate")
	private ArrivalWrapper arrivalDate;
	
	@JsonProperty("schedule")
	private ScheduleWrapper schedule;
	
	@JsonProperty("operationalTimes")
	private OperationalTimesWrapper operationalTimes;
	
	@JsonProperty("codeshares")
	private CodesharesWrapper[] codeshares;
	
	@JsonProperty("flightDurations")
	private FlightDurationsWrapper flightDurations;
	
	@JsonProperty("airportResources")
	private AirportResourcesWrapper airportResources;
	
	@JsonProperty("flightEquipment")
	private FlightEquipmentWrapper flightEquipment;

	

	public DepartureWrapper getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(DepartureWrapper departureDate) {
		this.departureDate = departureDate;
	}

	public ArrivalWrapper getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(ArrivalWrapper arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public ScheduleWrapper getSchedule() {
		return schedule;
	}

	public void setSchedule(ScheduleWrapper schedule) {
		this.schedule = schedule;
	}

	public OperationalTimesWrapper getOperationalTimes() {
		return operationalTimes;
	}

	public void setOperationalTimes(OperationalTimesWrapper operationalTimes) {
		this.operationalTimes = operationalTimes;
	}

	public CodesharesWrapper[] getCodeshares() {
		return codeshares;
	}

	public void setCodeshares(CodesharesWrapper[] codeshares) {
		this.codeshares = codeshares;
	}

	public FlightDurationsWrapper getFlightDurations() {
		return flightDurations;
	}

	public void setFlightDurations(FlightDurationsWrapper flightDurations) {
		this.flightDurations = flightDurations;
	}

	public AirportResourcesWrapper getAirportResources() {
		return airportResources;
	}

	public void setAirportResources(AirportResourcesWrapper airportResources) {
		this.airportResources = airportResources;
	}

	public FlightEquipmentWrapper getFlightEquipment() {
		return flightEquipment;
	}

	public void setFlightEquipment(FlightEquipmentWrapper flightEquipment) {
		this.flightEquipment = flightEquipment;
	}

	@Override
	public String toString() {
		return "FlightStatusesWrapper [flightId=" + flightId + ", carrierFsCode=" + carrierFsCode + ", flightNumber="
				+ flightNumber + ", departureAirportFsCode=" + departureAirportFsCode + ", arrivalAirportFsCode="
				+ arrivalAirportFsCode + ", status=" + status + ", departureDate=" + departureDate + ", arrivalDate="
				+ arrivalDate + ", schedule=" + schedule + ", operationalTimes=" + operationalTimes + ", codeshares="
				+ Arrays.toString(codeshares) + ", flightDurations=" + flightDurations + ", airportResources="
				+ airportResources + ", flightEquipment=" + flightEquipment + "]";
	}

	
	

	
	
	

}
