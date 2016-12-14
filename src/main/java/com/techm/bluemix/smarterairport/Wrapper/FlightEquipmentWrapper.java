package com.techm.bluemix.smarterairport.Wrapper;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class FlightEquipmentWrapper {

	private String scheduledEquipmentIataCode;

	@Override
	public String toString() {
		return "FlightEquipmentWrapper [scheduledEquipmentIataCode=" + scheduledEquipmentIataCode + "]";
	}

	public String getScheduledEquipmentIataCode() {
		return scheduledEquipmentIataCode;
	}

	public void setScheduledEquipmentIataCode(String scheduledEquipmentIataCode) {
		this.scheduledEquipmentIataCode = scheduledEquipmentIataCode;
	}
}
