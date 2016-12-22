package com.techm.bluemix.smarterairport.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.techm.bluemix.smarterairport.Wrapper.WeatherForecastWrapper;
import com.techm.bluemix.smarterairport.Wrapper.WeatherStatusWrapper;


@Service
public interface WeatherServices {

	public WeatherStatusWrapper trackByGeo(String latitude, String longitude);

	public List<WeatherForecastWrapper> trackWeatherForecast(String latitude, String longitude, String days);

}
