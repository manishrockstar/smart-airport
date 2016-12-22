package com.techm.bluemix.smarterairport.Wrapper;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class WeatherForecastWrapper {

	
	
	@JsonProperty("forecasts")
	private ForecastWrapper[] forecasts;

	

	public ForecastWrapper[] getForecasts() {
		return forecasts;
	}

	public void setForecast(ForecastWrapper[] forecasts) {
		this.forecasts = forecasts;
	}
	
	@Override
	public String toString() {
		return "WeatherForecastWrapper [forecasts=" + Arrays.toString(forecasts) + "]";
	}
	

}
