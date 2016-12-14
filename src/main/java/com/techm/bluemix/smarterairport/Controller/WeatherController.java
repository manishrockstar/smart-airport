package com.techm.bluemix.smarterairport.Controller;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.techm.bluemix.smarterairport.Services.WeatherServices;
import com.techm.bluemix.smarterairport.Wrapper.WeatherStatusWrapper;
import com.techm.bluemix.smarterairport.utils.SAUtils;

@Controller
@RequestMapping("/weather")
public class WeatherController {
	
	@Autowired
	private WeatherServices weatherServices;

	@RequestMapping(value="", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView flightHome()
	{
		return new ModelAndView("Weather");
	}
	
	@RequestMapping(value="/trackbyGeo", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView trackWeatherByGeo(@RequestParam("w_country") String w_country) throws JsonParseException, JsonMappingException, IOException
	{
		WeatherStatusWrapper wswrapper = weatherServices.trackByGeo(SAUtils.latMap.get(w_country),SAUtils.lonMap.get(w_country));
		return new ModelAndView("weatherstatus","wswrapper",wswrapper);
	}
	
	
}
