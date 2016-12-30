package com.techm.bluemix.smarterairport.ServiceImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.httpclient.HttpClient;

import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.AuthCache;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.BasicAuthCache;
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
import org.springframework.http.HttpEntity;
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
		
		
		//String srcURL=SAConstant.WEATHER_API_BASE_URI+SAConstant.W_GEOCODE+"/"+latitude+"/"+longitude+SAConstant.W_FORECAST+SAConstant.W_PERIOD+days+SAConstant.W_JSONFILE+SAConstant.W_LANGUAGE+SAConstant.W_UNITS;
		//System.out.println(srcURL);
		/*HttpClient client = HttpClientBuilder.create().build();
		HttpGet getRequest = new HttpGet(srcURL);
		getRequest.addHeader("Accept", "application/json");
		HttpResponse response = httpClient.execute(getRequest);
		if (response.getStatusLine().getStatusCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
			   + response.getStatusLine().getStatusCode());
		}
		
		
		BasicCredentialsProvider credentialsProvider = new BasicCredentialsProvider(); 
		credentialsProvider.setCredentials(AuthScope.ANY, new UsernamePasswordCredentials(SAConstant.uname, SAConstant.pword)); 
		httpClient.setCredentialsProvider(credentialsProvider);*/
		
		/*String plainCreds = "28188990-cb66-4dc4-95c7-c340adb75cf5:p547h8yKfg";
		byte[] plainCredsBytes = plainCreds.getBytes();
		byte[] base64CredsBytes = Base64.encodeBase64(plainCredsBytes);
		String base64Creds = new String(base64CredsBytes);*/
		String srcURL=SAConstant.localhost+SAConstant.W_GEOCODE+"/"+latitude+"/"+longitude+SAConstant.W_FORECAST+SAConstant.W_PERIOD+days+SAConstant.W_JSONFILE+SAConstant.W_LANGUAGE+SAConstant.W_UNITS;
		System.out.println(srcURL);
		
		CloseableHttpClient httpclient = HttpClients.createDefault();
		ContextAwareHttpComponentsClientHttpRequestFactory customFactory = new ContextAwareHttpComponentsClientHttpRequestFactory(httpclient);
		HttpHost targetHost = new HttpHost(SAConstant.localhost, SAConstant.localport, "http");
		CredentialsProvider credsProvider = new BasicCredentialsProvider();
		credsProvider.setCredentials(
		        new AuthScope(targetHost.getHostName(), targetHost.getPort()),
		        new UsernamePasswordCredentials(SAConstant.uname, SAConstant.pword));

		// Create AuthCache instance
		AuthCache authCache = new BasicAuthCache();
		// Generate BASIC scheme object and add it to the local auth cache
		BasicScheme basicAuth = new BasicScheme();
		authCache.put(targetHost, basicAuth);

		// Add AuthCache to the execution context
		HttpClientContext context = HttpClientContext.create();
		context.setCredentialsProvider(credsProvider);
		context.setAuthCache(authCache);		
		customFactory.setHttpContext(context);
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", "application/json");
    	HttpEntity<WeatherForecastWrapper> entity = new HttpEntity<WeatherForecastWrapper>(headers);
		RestTemplate restTemplate=new RestTemplate(customFactory);
		ResponseEntity<WeatherForecastWrapper> jsonString = restTemplate.exchange(srcURL, HttpMethod.GET, entity, WeatherForecastWrapper.class);		

		/*
		HttpClient<HashMap<String,Object>> http = new HttpClient<>();
		HttpHeaders headers = http.createBasicAuthenticationHttpHeaders(SAConstant.uname, SAConstant.pword);
		RestTemplate restTemplate=new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		//headers.add("Authorization", "Basic " + base64Creds);
		headers.set("Authorization", "Bearer " +getOauthAdminAuthToken()); 
    	headers.set("Accept", "application/json");
    	HttpEntity<WeatherForecastWrapper> entity = new HttpEntity<WeatherForecastWrapper>(headers);
   		
		Map<String, String> params = new HashMap<String, String>();
		params.put("username", SAConstant.uname);
		params.put("password", SAConstant.pword);		
		ResponseEntity<WeatherForecastWrapper> jsonString = restTemplate.exchange(srcURL, HttpMethod.GET, entity, WeatherForecastWrapper.class);*/
		//ResponseEntity<WeatherForecastWrapper> jsonString=restTemplate.getForEntity(srcURL, WeatherForecastWrapper.class, params);
		System.out.println(jsonString);
		List<WeatherForecastWrapper> data = new ArrayList<>(Arrays.asList(jsonString.getBody()));
		//List<WeatherForecastWrapper> data = new ArrayList<>(Arrays.asList(response.getEntity().getContent()));
		System.out.println(data);
		return data;
		
	}
}