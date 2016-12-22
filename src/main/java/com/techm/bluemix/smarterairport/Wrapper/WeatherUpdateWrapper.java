package com.techm.bluemix.smarterairport.Wrapper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class WeatherUpdateWrapper{
	
		
	private WeatherStatusWrapper ws;
	private WeatherForecastWrapper wf;
	
	public WeatherStatusWrapper getWs() {
		return ws;
	}
	public void setWs(WeatherStatusWrapper ws) {
		this.ws = ws;
	}
	public WeatherForecastWrapper getWf() {
		return wf;
	}
	public void setWf(WeatherForecastWrapper wf) {
		this.wf = wf;
	}
	@Override
	public String toString() {
		return "WeatherUpdateWrapper [ws=" + ws + ", wf=" + wf + "]";
	}
	
	
	
	
}
