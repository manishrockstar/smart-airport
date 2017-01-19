package com.techm.bluemix.smarterairport.utils;

import java.util.HashMap;
import java.util.Map;


public class SAConstant {

	public static final String REGEXP_URL = "(http://|https://)(www.)?([a-zA-Z0-9]+).[a-zA-Z0-9]*.[a-z]{3}.?([a-z]+)?[/a-zA-Z0-9]*";
	
	/**
	 * Flightstats parameters
	 */
	//Url prepration
	public static final String FLIGHSTATS_API_BASE_URI = "https://api.flightstats.com/flex";
	public static final String F_WEBSERVICE_FS = "/airports/rest/v1/json/fs/";
	
	//Account Authentication
	public static final String FLIGHSTATS_APP_ID_KEY = "?appId="+SAAuth.prop.getProperty("flight.appid")+"&appKey="+SAAuth.prop.getProperty("flight.appkey");
	//Flight By Route
	public static final String F_WEBSERVICE_ROUTE = "/flightstatus/rest/v2/json/route/status/";
	public static final String F_WEBSERVICE_AIRPORTS = "/flightstatus/rest/v2/json/airport/status/";
	public static final String F_WEBSERVICE_FLIGHTS = "/flightstatus/rest/v2/json/flight/status/";
	public static final String F_WEBSERVICE_ROUTE_END="&hourOfDay=0&utc=false&numHours=24";
	public static final String F_WEBSERVICE_Airport_END="&utc=false&numHours=4";

	/**
	 * API Error messages 
	 */
	public static final String INVALID_FLIGHTID_ERROR_CODE = "INVALID_FLIGHTID";
	public static final String INVALID_FLIGHTID_ERROR_MESSAGE = "Flight Id does not found";
	public static final String INVALID_FLIGHTID_HTTP_STATUS_CODE = "404";
	
	
	/**
	 * Weather API parameters
	 */
	//Url prepration
public static final String WEATHER_API_BASE_URI = "https://"+SAAuth.prop.getProperty("weather.appid")+":"+SAAuth.prop.getProperty("weather.appkey")+"@twcservice.mybluemix.net/api/weather/v1";
	public static final String W_API="/api/weather/v1";
	public static final String W_GEOCODE = "/geocode";
	public static final String W_LOCATION = "/location";
	public static final String W_FORECAST = "/forecast";
	public static final String W_OBSERV = "/observations";
	public static final String W_PERIOD = "/daily";
	//public static final String WF_DAYS = "/3days";
	public static final String W_JSONFILE = ".json?";
	public static final String W_LANGUAGE = "language=en-US";
	public static final String W_UNITS = "&units=m";
	
	/**
	 * API Error messages 
	 */
	public static final String INVALID_LONG_LATI_ERROR_CODE = "INVALID_LONGITUDE_LATITUDE";
	
	/* 
	 * Local Proxy parameters
	 * */
	public static final String localhost="https://twcservice.mybluemix.net:443";
	public static final int localport=443;
	public static final String uname=SAAuth.prop.getProperty("weather.appid");
	public static final String pword=SAAuth.prop.getProperty("weather.appkey");
	
	

	
}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		