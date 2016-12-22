package com.techm.bluemix.smarterairport.Wrapper;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class AppendixWrapper {
	
	@JsonProperty("airlines")
	private AirlineWrapper[] airlines;
	
	@JsonProperty("airports")
	private AirportWrapper[] airports;
	
	@JsonProperty("equipments")
	private EquipmentWrapper[] equipments;

	public AirlineWrapper[] getAirlines() {
		return airlines;
	}

	public void setAirlines(AirlineWrapper[] airlines) {
		this.airlines = airlines;
	}

	public AirportWrapper[] getAirports() {
		return airports;
	}

	public void setAirports(AirportWrapper[] airports) {
		this.airports = airports;
	}

	public EquipmentWrapper[] getEquipments() {
		return equipments;
	}

	public void setEquipments(EquipmentWrapper[] equipments) {
		this.equipments = equipments;
	}

	@Override
	public String toString() {
		return "AppendixWrapper [airlines=" + Arrays.toString(airlines) + ", airports=" + Arrays.toString(airports)
				+ ", equipments=" + Arrays.toString(equipments) + "]";
	}
	
	

}
