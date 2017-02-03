package com.techm.bluemix.smarterairport.ServiceImpl;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

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
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.techm.bluemix.smarterairport.Services.FlightServices;
import com.techm.bluemix.smarterairport.Wrapper.FlightStatusWrapper;
import com.techm.bluemix.smarterairport.Wrapper.FlightStatusbyFSWrapper;

import com.techm.bluemix.smarterairport.utils.SAConstant;
import com.techm.bluemix.smarterairport.utils.SAUtils;
@SuppressWarnings("unused")
@Service("flightServices")
public class FlightServiceImpl implements FlightServices {

	
	@Override
	public FlightStatusbyFSWrapper trackByFS(String fs) throws JsonParseException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		String srcURL=SAConstant.FLIGHSTATS_API_BASE_URI+SAConstant.F_WEBSERVICE_FS+fs+SAConstant.FLIGHSTATS_APP_ID_KEY;
		System.out.println(srcURL);
		//RestTemplate restTemplate=new RestTemplate(SAUtils.getClientFactory());
		RestTemplate restTemplate=new RestTemplate();
		ResponseEntity<FlightStatusbyFSWrapper> jsonString=restTemplate.getForEntity(srcURL, FlightStatusbyFSWrapper.class);
		System.out.println(jsonString.getBody());
		return jsonString.getBody();
	}
	
	/**Flight Status by Route
	 * 
	 * 
	 */
	@Override
	public List<FlightStatusWrapper> trackByRoute(String departure, String destination, String departarrival, Date dat) {
		// TODO Auto-generated method stub
		//Date mydate=new Date(dat);
		
		Date mydate=dat;
		SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
	    SimpleDateFormat monFormat = new SimpleDateFormat("MM");
	    SimpleDateFormat datFormat = new SimpleDateFormat("dd");
	    //dat.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	    String yy=yearFormat.format(mydate);
	    String mm=monFormat.format(mydate);
	    String dd=datFormat.format(mydate);
		
		String srcURL=SAConstant.FLIGHSTATS_API_BASE_URI+SAConstant.F_WEBSERVICE_ROUTE+departure+"/"+destination+"/"+departarrival+"/"+yy+"/"+mm+"/"+dd+SAConstant.FLIGHSTATS_APP_ID_KEY+SAConstant.F_WEBSERVICE_ROUTE_END+"&sort=departureDate&departureDate.dir=asc";
		System.out.println(srcURL);
		//RestTemplate restTemplate=new RestTemplate(SAUtils.getClientFactory());
		RestTemplate restTemplate=new RestTemplate();
		ResponseEntity<FlightStatusWrapper> jsonString=restTemplate.getForEntity(srcURL, FlightStatusWrapper.class);
		List<FlightStatusWrapper> data = new ArrayList<>(Arrays.asList(jsonString.getBody()));
		System.out.println(data);
		return data;

	}
	/**Flight Status by Airport
	 * 
	 * 
	 */
	@Override
	public List<FlightStatusWrapper> trackByAirport(String airports, String departarrival, String hoursofday, Date dat) {
		// TODO Auto-generated method stub
		Date mydate=dat;
		SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
	    SimpleDateFormat monFormat = new SimpleDateFormat("MM");
	    SimpleDateFormat datFormat = new SimpleDateFormat("dd");
	    //dat.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	    String yy=yearFormat.format(mydate);
	    String mm=monFormat.format(mydate);
	    String dd=datFormat.format(mydate);
		
		String srcURL=SAConstant.FLIGHSTATS_API_BASE_URI+SAConstant.F_WEBSERVICE_AIRPORTS+airports+"/"+departarrival+"/"+yy+"/"+mm+"/"+dd+"/"+hoursofday+SAConstant.FLIGHSTATS_APP_ID_KEY+SAConstant.F_WEBSERVICE_Airport_END+"&sort=departureDate&departureDate.dir=asc";
		System.out.println(srcURL);
		//RestTemplate restTemplate=new RestTemplate(SAUtils.getClientFactory());
		RestTemplate restTemplate=new RestTemplate();
		ResponseEntity<FlightStatusWrapper> jsonString=restTemplate.getForEntity(srcURL, FlightStatusWrapper.class);
		List<FlightStatusWrapper> data = new ArrayList<>(Arrays.asList(jsonString.getBody()));
	
		System.out.println(data);
		return data;
	}
	
	
	@Override
	public List<FlightStatusWrapper> trackByAirport(String airports, String departarrival, String hoursofday, Date dat,
			String airline) {
		// TODO Auto-generated method stub
		Date mydate=dat;
		SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
	    SimpleDateFormat monFormat = new SimpleDateFormat("MM");
	    SimpleDateFormat datFormat = new SimpleDateFormat("dd");
	    //dat.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	    String yy=yearFormat.format(mydate);
	    String mm=monFormat.format(mydate);
	    String dd=datFormat.format(mydate);
		
		String srcURL=SAConstant.FLIGHSTATS_API_BASE_URI+SAConstant.F_WEBSERVICE_AIRPORTS+airports+"/"+departarrival+"/"+yy+"/"+mm+"/"+dd+"/"+hoursofday+SAConstant.FLIGHSTATS_APP_ID_KEY+SAConstant.F_WEBSERVICE_Airport_END+"&carrier="+airline+"&sort=departureDate&departureDate.dir=asc";
		System.out.println(srcURL);
		//RestTemplate restTemplate=new RestTemplate(SAUtils.getClientFactory());
		RestTemplate restTemplate=new RestTemplate();
		ResponseEntity<FlightStatusWrapper> jsonString=restTemplate.getForEntity(srcURL, FlightStatusWrapper.class);
		List<FlightStatusWrapper> data = new ArrayList<>(Arrays.asList(jsonString.getBody()));
	
		System.out.println(data);
		return data;
	}

	/**Flight Status by FlightID
	 * 
	 * 
	 */
	@Override
	public List<FlightStatusWrapper> trackByflightID(String airline, String flightId, String departarrival, Date dat) {
		// TODO Auto-generated method stub
		Date mydate=dat;
		SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
	    SimpleDateFormat monFormat = new SimpleDateFormat("MM");
	    SimpleDateFormat datFormat = new SimpleDateFormat("dd");
	    //dat.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	    String yy=yearFormat.format(mydate);
	    String mm=monFormat.format(mydate);
	    String dd=datFormat.format(mydate);
		
		String srcURL=SAConstant.FLIGHSTATS_API_BASE_URI+SAConstant.F_WEBSERVICE_FLIGHTS+airline+"/"+flightId+"/"+departarrival+"/"+yy+"/"+mm+"/"+dd+"/"+SAConstant.FLIGHSTATS_APP_ID_KEY+SAConstant.F_WEBSERVICE_Airport_END+"&sort=departureDate&departureDate.dir=asc";
		System.out.println(srcURL);
		//RestTemplate restTemplate=new RestTemplate(SAUtils.getClientFactory());
		RestTemplate restTemplate=new RestTemplate();
		ResponseEntity<FlightStatusWrapper> jsonString=restTemplate.getForEntity(srcURL, FlightStatusWrapper.class);
		List<FlightStatusWrapper> data = new ArrayList<>(Arrays.asList(jsonString.getBody()));
	
		System.out.println(data);
		return data;
	}
	
	
}
