package com.techm.bluemix.smarterairport.Wrapper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class OperationalTimesWrapper {
	
	@JsonProperty("publishedDeparture")
	private PublishedDepartureWrapper publishedDeparture;
	
	@JsonProperty("publishedArrival")
	private PublishedArrivalWrapper publishedArrival;
	
	@JsonProperty("scheduledGateDeparture")
	private ScheduledGateDepartureWrapper scheduledGateDeparture;
	
	@JsonProperty("scheduledGateArrival")
	private ScheduledGateArrivalWrapper scheduledGateArrival;
	
	public PublishedDepartureWrapper getPublishedDeparture() {
		return publishedDeparture;
	}

	public void setPublishedDeparture(PublishedDepartureWrapper publishedDeparture) {
		this.publishedDeparture = publishedDeparture;
	}

	public PublishedArrivalWrapper getPublishedArrival() {
		return publishedArrival;
	}

	public void setPublishedArrival(PublishedArrivalWrapper publishedArrival) {
		this.publishedArrival = publishedArrival;
	}

	public ScheduledGateDepartureWrapper getScheduledGateDeparture() {
		return scheduledGateDeparture;
	}

	public void setScheduledGateDeparture(ScheduledGateDepartureWrapper scheduledGateDeparture) {
		this.scheduledGateDeparture = scheduledGateDeparture;
	}

	public ScheduledGateArrivalWrapper getScheduledGateArrival() {
		return scheduledGateArrival;
	}

	public void setScheduledGateArrival(ScheduledGateArrivalWrapper scheduledGateArrival) {
		this.scheduledGateArrival = scheduledGateArrival;
	}

	@Override
	public String toString() {
		return "OperationalTimesWrapper [publishedDeparture=" + publishedDeparture + ", publishedArrival="
				+ publishedArrival + ", scheduledGateDeparture=" + scheduledGateDeparture + ", scheduledGateArrival="
				+ scheduledGateArrival + "]";
	}

	
	

}
