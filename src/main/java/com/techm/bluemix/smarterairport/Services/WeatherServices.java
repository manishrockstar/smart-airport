package com.techm.bluemix.smarterairport.Services;

import org.springframework.stereotype.Service;

import com.techm.bluemix.smarterairport.Wrapper.WeatherStatusWrapper;


@Service
public interface WeatherServices {

	public WeatherStatusWrapper trackByGeo(String latitude, String longitude);

}
