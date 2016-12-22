package com.techm.bluemix.smarterairport.ServiceImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.ProxyAuthenticationStrategy;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.databind.JsonNode;
import com.techm.bluemix.smarterairport.Services.WeatherServices;
import com.techm.bluemix.smarterairport.Wrapper.FlightStatusWrapper;
import com.techm.bluemix.smarterairport.Wrapper.WeatherForecastWrapper;
import com.techm.bluemix.smarterairport.Wrapper.WeatherStatusWrapper;
import com.techm.bluemix.smarterairport.Wrapper.WeatherUpdateWrapper;
import com.techm.bluemix.smarterairport.utils.SAConstant;
import com.techm.bluemix.smarterairport.utils.SAUtils;
@SuppressWarnings("unused")
@Service("weatherServices")
public class WeatherServiceImpl implements WeatherServices {

	private static final Logger log = LoggerFactory.getLogger(WeatherServiceImpl.class);
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public WeatherStatusWrapper trackByGeo(String latitude, String longitude){
		// TODO Auto-generated method stub
		String srcURL=SAConstant.WEATHER_API_BASE_URI+SAConstant.W_GEOCODE+"/"+latitude+"/"+longitude+SAConstant.W_OBSERV+SAConstant.W_JSONFILE+SAConstant.W_LANGUAGE+SAConstant.W_UNITS;
		System.out.println(srcURL);
		//RestTemplate restTemplate=new RestTemplate(SAUtils.getClientFactory());
		RestTemplate restTemplate=new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", "application/json");
		HttpEntity entity = new HttpEntity(headers);
		//ResponseEntity<WeatherStatusWrapper> jsonString=restTemplate.getForEntity(srcURL, WeatherStatusWrapper.class);
		ResponseEntity<WeatherStatusWrapper> jsonString = restTemplate.exchange(srcURL, HttpMethod.GET, entity, WeatherStatusWrapper.class);
		System.out.println(jsonString.getBody());
		return jsonString.getBody();
	}


	@Override
	public List<WeatherForecastWrapper> trackWeatherForecast(String latitude, String longitude, String days) {
		// TODO Auto-generated method stub
		
		String databaseHost = "localhost";
	int port = 443;
	String databaseName = "mydb";
    String user = "myuser";
	String pasword = "mypass";
	String url = "myurl";
	String username = request.getParameter("username");   
    String paword = request.getParameter("password");
    
    //HttpSession session = request.getSession();
	PrintWriter writer = response.getWriter();
	
//	private boolean processVCAP(PrintWriter writer)
//{
		// VCAP_SERVICES is a system environment variable
		
		String VCAP_SERVICES = System.getenv("VCAP_SERVICES");
	//	writer.println("VCAP_SERVICES content: " + VCAP_SERVICES);

		if (VCAP_SERVICES != null)
		{
			// parse the VCAP JSON structure
			BasicDBObject obj = (BasicDBObject) JSON.parse(VCAP_SERVICES);
			String thekey = null;
			Set<String> keys = obj.keySet();
		//	writer.println("Searching through VCAP keys");
			// Look for the VCAP key that holds the SQLDB information
			for (String eachkey : keys) 
			{
			//	writer.println("Key is: " + eachkey);
				// Just in case the service name gets changed to lower case in the future, use toUpperCase
				if (eachkey.contains("weatherinsights")) 
				{
					thekey = eachkey;
				}
			}
			if (thekey == null) 
			{
			//	writer.println("Cannot find any SQLDB service in the VCAP; exiting");
			//	return false;
			}
			BasicDBList list = (BasicDBList) obj.get(thekey);
			obj = (BasicDBObject) list.get("0");
			//writer.println("Service found: " + obj.get("name"));
			// parse all the credentials from the vcap env variable
			obj = (BasicDBObject) obj.get("credentials");
			databaseHost = (String) obj.get("host");
			port = (int)obj.get("port");
			user = (String) obj.get("username");
			pasword = (String) obj.get("password");
			url = (String) obj.get("jdbcurl");
		}
		
		String srcURL=SAConstant.WEATHER_API_BASE_URI+SAConstant.W_GEOCODE+"/"+latitude+"/"+longitude+SAConstant.W_FORECAST+SAConstant.W_PERIOD+days+SAConstant.W_JSONFILE+SAConstant.W_LANGUAGE+SAConstant.W_UNITS;
		System.out.println(srcURL);
		
		//RestTemplate restTemplate=new RestTemplate(SAUtils.getClientFactory());
		RestTemplate restTemplate=new RestTemplate();
		/*HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", "application/json");
		HttpEntity entity = new HttpEntity(headers);
		ResponseEntity<WeatherForecastWrapper> jsonString = restTemplate.exchange(srcURL, HttpMethod.GET, entity, WeatherForecastWrapper.class);*/
		ResponseEntity<WeatherForecastWrapper> jsonString=restTemplate.getForEntity(srcURL, WeatherForecastWrapper.class);
		System.out.println(jsonString);
		List<WeatherForecastWrapper> data = new ArrayList<>(Arrays.asList(jsonString.getBody()));	
		System.out.println(data);
		return data;
	}
}