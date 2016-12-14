package com.techm.bluemix.smarterairport.Wrapper;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class FlightDurationsWrapper {
	
	private String scheduledBlockMinutes;

	@Override
	public String toString() {
		return "FlightDurationsWrapper [scheduledBlockMinutes=" + scheduledBlockMinutes + "]";
	}

	public String getScheduledBlockMinutes() {
		return scheduledBlockMinutes;
	}

	public void setScheduledBlockMinutes(String scheduledBlockMinutes) {
		this.scheduledBlockMinutes = scheduledBlockMinutes;
	}

}
