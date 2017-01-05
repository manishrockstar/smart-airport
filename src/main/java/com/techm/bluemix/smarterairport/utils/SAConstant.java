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
	public static final String F_WEBSERVICE_FS = "/airlines/rest/v1/json/fs/";
	
	//Account Authentication
	public static final String FLIGHSTATS_APP_ID_KEY = "?appId=fe647c90&appKey=acc7c5bf565d3ff434254541df7e1785";	//Flightstats account specific
	//Flight By Route
	public static final String F_WEBSERVICE_ROUTE = "/flightstatus/rest/v2/json/route/status/";
	public static final String F_WEBSERVICE_AIRPORTS = "/flightstatus/rest/v2/json/airport/status/";
	public static final String F_WEBSERVICE_FLIGHTS = "/flightstatus/rest/v2/json/flight/status/";
	public static final String F_WEBSERVICE_ROUTE_END="&hourOfDay=0&utc=false&numHours=24&maxFlights=5";
	public static final String F_WEBSERVICE_Airport_END="&utc=false&numHours=4&maxFlights=5";

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
public static final String WEATHER_API_BASE_URI = "https://28188990-cb66-4dc4-95c7-c340adb75cf5:p547h8yKfg@twcservice.mybluemix.net/api/weather/v1";
	public static final String 	W_API="/api/weather/v1";
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
	public static final String uname="e694bb30-ea42-485a-8659-46a574267f78";
	public static final String pword="DnRyIrHbF8";
	
	public static Map<String, String> airportCodeMap;
	
	
	static{
	airportCodeMap= new HashMap<String, String>();
	airportCodeMap.put("(BOM) CHHATRAPATI SHIVAJI INTERNATIONAL, INDIA", "BOM");
	airportCodeMap.put("(BLR) Kempegowda International Airport, INDIA", "BLR");
	airportCodeMap.put("(CCU) Netaji Subhas Chandra Bose Airport,India","CCU");
	airportCodeMap.put("(DEL) Indira Gandhi Intl, Delhi, INDIA","DEL");
	airportCodeMap.put("(HYD) Rajiv Gandhi International Airport,INDIA","HYD");
	airportCodeMap.put("(MAA) Chennai Airport, Chennai, IN","MAA");
	airportCodeMap.put("(PNQ) Pune Airport, Pune, IN","PNQ");
	airportCodeMap.put("(AMD) Ahmedabad Airport, Ahmedabad, IN","AMD");
	airportCodeMap.put("(VNS) Lal Bahadur Shastri Intl, Varanasi, IN","VNS");
	airportCodeMap.put("(PAT) Jay Prakash Narayan Intl, Patna, IN","PAT");
	airportCodeMap.put("(ISK) Gandhinagar Airport, Nasik, IN","ISK");
	airportCodeMap.put("(GOI) Dabolim Airport, Goa, IN","GOI");
	airportCodeMap.put("(TIR) Tirupati Airport, Tirupati, IN","TIR");
	airportCodeMap.put("(SXR) Srinagar Intl, Srinagar, IN","SXR");
	airportCodeMap.put("(TRV) Trivandrum Intl, Thiruvananthapuram, IN","TRV");
	airportCodeMap.put("(IXC) Chandigarh Airport, Chandigarh, IN","IXC");
	airportCodeMap.put("(ADL) Adelaide Airport, Adelaide, SA, AU,IN","ADL");
	airportCodeMap.put("(SYD) Sydney (Kingsford Smith) Airport, Sydney, NSW, AU","SYD");
	airportCodeMap.put("(SFO) San Francisco Intl, San Francisco, CA, US","SFO");
	airportCodeMap.put("(BNE) Brisbane Airport, Brisbane, QLD, AU","BNE");
	airportCodeMap.put("(GOS) Gosford Airport, Gosford, NSW, AU","GOS");
	airportCodeMap.put("(IAH) George Bush Intercontinental Airport, Houston, TX, US","IAH");
	airportCodeMap.put("(YHM) Hamilton Airport","YHM");
	airportCodeMap.put("(CLT) Charlotte Douglas International Airport","CLT");
	airportCodeMap.put("(CLT) Charlotte Douglas International Airport","CLT");
	airportCodeMap.put("(MHT) Manchester Boston Regional Airport, Manchester, NH, US","MHT");
	airportCodeMap.put("(ANC) Ted Stevens Anchorage International Airport","ANC");
	airportCodeMap.put("(PER) Perth Airport, Perth, WA, AU","PER");
	}
}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		