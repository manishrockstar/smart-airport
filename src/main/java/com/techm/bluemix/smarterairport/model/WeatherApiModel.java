package com.techm.bluemix.smarterairport.model;

import java.util.Arrays;

public class WeatherApiModel {
	
	
	public WeatherForecast[] forecast;
	public WeatherObservations[] observations;
	
	public WeatherObservations[] getObservations() {
		return observations;
	}
	public void setObservations(WeatherObservations[] observations) {
		this.observations = observations;
	}
	public WeatherForecast[] getForecast() {
		return forecast;
	}
	public void setForecast(WeatherForecast[] forecast) {
		this.forecast = forecast;
	}
	@Override
	public String toString() {
		return "WeatherApiModel [forecast=" + Arrays.toString(forecast) + ", observations="
				+ Arrays.toString(observations) + "]";
	}
	

}
