package com.techm.bluemix.smarterairport.Controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.format.annotation.DateTimeFormat;
import com.techm.bluemix.smarterairport.Services.FlightServices;
import com.techm.bluemix.smarterairport.Wrapper.FlightStatusWrapper;
import com.techm.bluemix.smarterairport.Wrapper.FlightStatusbyFSWrapper;
import com.techm.bluemix.smarterairport.utils.SAConstant;
import com.techm.bluemix.smarterairport.utils.SAUtils;
import com.techm.bluemix.smarterairport.utils.SAProp;

@Controller
@RequestMapping("/flight")
public class FlightController<fsWrapper> {
	
	@Autowired(required=true)
	private FlightServices flightServices;

		
	@RequestMapping(value="/trackByRoute", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView trackFlightByRoute(@RequestParam("departure") String departure,@RequestParam("arrival") String arrival,@RequestParam("departarrival") String departarrival,@RequestParam("dat")@DateTimeFormat(pattern = "yyyy-MM-dd") Date dat) throws JsonParseException, JsonMappingException, IOException
	{	
		
		List<FlightStatusWrapper> fswrapper = flightServices.trackByRoute(departure,arrival,departarrival,dat);
		System.out.println(fswrapper);
		if(fswrapper.get(0).getFlightStatuses().length<1){		
			String message="Flight details not Found, Please try again";
			return new ModelAndView("flighterror","message",message);
		}
		else{
			return new ModelAndView("flightstatus","fswrapper",fswrapper);			
		}
	}
	
	@RequestMapping(value="/trackByAirport", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView trackFlightByAirport(@RequestParam(value="airline", required=false) String airline,@RequestParam("airports") String airports,@RequestParam("hoursofday") String hoursofday,@RequestParam("departarrival") String departarrival,@RequestParam("dat")@DateTimeFormat(pattern = "yyyy-MM-dd") Date dat) throws JsonParseException, JsonMappingException, IOException
	{	
		
		if(airline.equals(null)||airline.isEmpty()||airline.equals(""))
		{
			List<FlightStatusWrapper> fswrapper = flightServices.trackByAirport(airports,departarrival,hoursofday,dat);	
			System.out.println(fswrapper);
			if(fswrapper.get(0).getFlightStatuses().length<1 || fswrapper.get(0).getFlightStatuses().equals(null)){		
			String message="Flight details not Found, Please try again";
			return new ModelAndView("flighterror","message",message);
			}
			else{
				return new ModelAndView("flightstatus","fswrapper",fswrapper);			
			}
		}
		else {
			List<FlightStatusWrapper> fswrapper = flightServices.trackByAirport(airports,departarrival,hoursofday,dat,SAUtils.airlineCodeMap.get(airline));
			System.out.println(fswrapper);
			if(fswrapper.get(0).getFlightStatuses().length<1 || fswrapper.get(0).getFlightStatuses().equals(null)){		
			String message="Flight details not Found, Please try again";
			return new ModelAndView("flighterror","message",message);
			}
			else{
				return new ModelAndView("flightstatus","fswrapper",fswrapper);			
			}
		}
		
	}
	
	@RequestMapping(value="/trackByflightID", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView trackFlightByflightID(@RequestParam("airline") String airline,@RequestParam("flightId") String flightId,@RequestParam("departarrival") String departarrival,@RequestParam("dat")@DateTimeFormat(pattern = "yyyy-MM-dd") Date dat) throws JsonParseException, JsonMappingException, IOException
	{	
		
		List<FlightStatusWrapper> fswrapper = flightServices.trackByflightID(SAUtils.airlineCodeMap.get(airline),flightId, departarrival,dat);
		System.out.println(fswrapper);
		if(fswrapper.get(0).getFlightStatuses().length<1 || fswrapper.get(0).getFlightStatuses().equals(null)){		
			String message="Flight details not Found, Please try again";
			return new ModelAndView("flighterror","message",message);
		}
		else{
			return new ModelAndView("flightstatus","fswrapper",fswrapper);			
		}
	}
	
	
}
