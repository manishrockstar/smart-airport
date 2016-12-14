package com.techm.bluemix.smarterairport.utils;

import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.ProxyAuthenticationStrategy;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;

public class SAUtils {

	public static Map<String, String> flightCodeMap;
	public static Map<String, String> countryCodeMap;
	public static Map<String, String> airportCodeMap;
	public static Map<String, Integer> daysMap;
	public static Map<String, String> latMap;
	public static Map<String, String> lonMap;
	
	static {
		flightCodeMap = new HashMap<String, String>();
		flightCodeMap.put("9W2753", "810257324");
		flightCodeMap.put("9W2754", "810257325");
		
		countryCodeMap= new HashMap<String, String>();
		countryCodeMap.put("GA", "/30339%3A4%3AUS");
		countryCodeMap.put("LA", "/90011%3A4%3AUS");
		countryCodeMap.put("NY", "/11368%3A4%3AUS");
		
		daysMap= new HashMap<String, Integer>();
		daysMap.put("/3days", 4);
		daysMap.put("/5days", 6);
		daysMap.put("/7days", 8);
		daysMap.put("/10days", 11);
		
		airportCodeMap= new HashMap<String, String>();
		airportCodeMap.put("Atlanta, GA ", "ATL");
		airportCodeMap.put("Chicago, IL - All airports ", "CHI");
		airportCodeMap.put("Columbia, MO ", "COU");
		airportCodeMap.put("Dallas/Fort Worth, TX ", "DFW");
		airportCodeMap.put("Las Vegas, NV ", "LAS");
		airportCodeMap.put("Los Angeles, CA ", "LAX");
		airportCodeMap.put("New York, NY - All airports ", "NYC");
		airportCodeMap.put("San Diego, CA ", "SAN");
		airportCodeMap.put("San Francisco, CA ", "SFO");
		airportCodeMap.put("Washington DC - All airports ", "WAS");
		
		latMap=new HashMap<String, String>();
		latMap.put("New York", "42.34");
		latMap.put("Ottawa", "45.43");
		latMap.put("London", "51.51");
		latMap.put("Paris", "48.85");
		latMap.put("Rome", "41.9");
		latMap.put("Moscow", "55.75");
		latMap.put("Mumbai", "18.97");
		latMap.put("Kathmandu", "27.7");
		latMap.put("Beijing", "39.91");
		latMap.put("Tokyo", "35.68");

		
		lonMap=new HashMap<String, String>();
		lonMap.put("New York", "-75.18");
		lonMap.put("Ottawa", "-75.68");
		lonMap.put("London", "0.13");
		lonMap.put("Paris", "2.35");
		lonMap.put("Rome", "12.5");
		lonMap.put("Moscow", "37.61");
		lonMap.put("Mumbai", "72.83");
		lonMap.put("Kathmandu", "85.33");
		lonMap.put("Beijing", "116.38");
		lonMap.put("Tokyo", "139.68");

		
		
		
	}
	
	public static ClientHttpRequestFactory getClientFactory(){
		CredentialsProvider credsProvider = new BasicCredentialsProvider();
		credsProvider.setCredentials( new AuthScope(SAConstant.localhost, SAConstant.localport), new UsernamePasswordCredentials(SAConstant.uname, SAConstant.pword) );
		HttpClientBuilder clientBuilder = HttpClientBuilder.create();

		clientBuilder.useSystemProperties();
		clientBuilder.setProxy(new HttpHost(SAConstant.localhost, SAConstant.localport));
		clientBuilder.setDefaultCredentialsProvider(credsProvider);
		clientBuilder.setProxyAuthenticationStrategy(new ProxyAuthenticationStrategy());

		CloseableHttpClient client = clientBuilder.build();

		HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
		factory.setHttpClient(client);
		return factory;
	}
}
