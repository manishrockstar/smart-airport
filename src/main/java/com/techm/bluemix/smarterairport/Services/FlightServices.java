package com.techm.bluemix.smarterairport.Services;

import java.io.IOException;

import java.util.Date;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.springframework.stereotype.Service;

import com.techm.bluemix.smarterairport.Wrapper.FlightStatusWrapper;
import com.techm.bluemix.smarterairport.Wrapper.FlightStatusbyFSWrapper;


@Service
public interface FlightServices {
	
	public FlightStatusbyFSWrapper trackByFS(String fs) throws JsonParseException, JsonMappingException, IOException;

	public FlightStatusWrapper trackByRoute(String departure, String destination, String maxnoflight, Date dat);

	public List<FlightStatusWrapper> trackByAirport(String airports, String departarrival, String hoursofday, Date dat) throws IOException;

}
