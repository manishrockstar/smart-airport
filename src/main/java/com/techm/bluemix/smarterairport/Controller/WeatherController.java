package com.techm.bluemix.smarterairport.Controller;

import java.io.IOException;
import java.util.List;
import org.springframework.ui.ModelMap;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.techm.bluemix.smarterairport.Services.WeatherServices;
import com.techm.bluemix.smarterairport.Wrapper.WeatherForecastWrapper;
import com.techm.bluemix.smarterairport.Wrapper.WeatherStatusWrapper;
import com.techm.bluemix.smarterairport.utils.SAProp;
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
	
		
	@RequestMapping(value="/forecast", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView trackWeatherForecast(@RequestParam("w_country") String w_country,@RequestParam("days") String days, ModelMap mm) throws JsonParseException, JsonMappingException, IOException
	{
		
		List<WeatherForecastWrapper> wfwrapper = weatherServices.trackWeatherForecast(SAUtils.prop.getProperty(w_country),SAProp.prop.getProperty(w_country), days);
		
		mm.addAttribute("msg", w_country);
		mm.addAttribute("wfwrapper", wfwrapper);
		return new ModelAndView("weatherForecast");
	}
	
}
