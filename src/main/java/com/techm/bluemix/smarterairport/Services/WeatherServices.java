package com.techm.bluemix.smarterairport.Services;

import java.util.List;

import org.springframework.stereotype.Service;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.File;
import org.apache.commons.configuration.ConfigurationException;


import com.techm.bluemix.smarterairport.Wrapper.WeatherForecastWrapper;
import com.techm.bluemix.smarterairport.Wrapper.WeatherStatusWrapper;


@Service
public interface WeatherServices {

	public WeatherStatusWrapper trackByGeo(String latitude, String longitude);

	public List<WeatherForecastWrapper> trackWeatherForecast(String latitude, String longitude, String days);
	
	public void propUpdate(String appid, String appkey, String fname, String api) throws ConfigurationException, InterruptedException;

}
