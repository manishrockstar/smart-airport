package com.techm.bluemix.smarterairport.ServiceImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.File;
import java.io.IOException;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.UsernamePasswordCredentials;
import org.apache.commons.httpclient.auth.AuthScope;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.io.FileUtils;
import org.springframework.core.io.FileSystemResource; 
import org.springframework.http.HttpEntity; 
import org.springframework.http.HttpHeaders; 
import org.springframework.http.HttpMethod; 
import org.springframework.http.HttpStatus; 
import org.springframework.http.MediaType; 
import org.springframework.http.ResponseEntity; 
import org.apache.http.HttpHost;
import org.springframework.web.util.UriComponentsBuilder;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
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
import com.ibm.watson.developer_cloud.util.CredentialUtils;

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
		
		
		String srcURL=SAConstant.localhost+SAConstant.W_GEOCODE+"/"+latitude+"/"+longitude+SAConstant.W_FORECAST+SAConstant.W_PERIOD+days+SAConstant.W_JSONFILE+SAConstant.W_LANGUAGE+SAConstant.W_UNITS;
		System.out.println(srcURL);
		DefaultHttpClient httpClient = new DefaultHttpClient(); 
		BasicCredentialsProvider credentialsProvider = new BasicCredentialsProvider(); 
		credentialsProvider.setCredentials(AuthScope.ANY, new UsernamePasswordCredentials(user, password)); 
		httpClient.setCredentialsProvider(credentialsProvider);
		RestTemplate restTemplate=new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
    	headers.set("Accept", "application/json");
    	HttpEntity entity = new HttpEntity(headers);
   		ResponseEntity<WeatherStatusWrapper> jsonString = restTemplate.exchange(srcURL, HttpMethod.GET, entity, WeatherStatusWrapper.class);
		/*Map<String, String> params = new HashMap<String, String>();
		params.put("username", SAConstant.uname);
		params.put("password", SAConstant.pword);		
		ResponseEntity<WeatherForecastWrapper> jsonString=restTemplate.getForEntity(srcURL, WeatherForecastWrapper.class, params);*/
		System.out.println(jsonString);
		List<WeatherForecastWrapper> data = new ArrayList<>(Arrays.asList(jsonString.getBody()));	
		System.out.println(data);
		return data;
		
	}
}