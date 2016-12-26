package com.techm.bluemix.smarterairport.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class SmartController {

	@RequestMapping(value="", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView smartHome(){
		return new ModelAndView("home");
	}	
	
	@RequestMapping(value="restroom", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView smartRestRoom(){
		return new ModelAndView("restroom");
	}	
	
	@RequestMapping(value="restaurant", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView smartRestaurant(){
		return new ModelAndView("restaurant");
	}	
	
	@RequestMapping(value="emergency", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView smartEmergency(){
		return new ModelAndView("emergency");
	}	
		
	@RequestMapping(value="shopping", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView smartShopping(){
		return new ModelAndView("shopping");
	}	

}
