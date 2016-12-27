package com.techm.bluemix.smarterairport.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/restaurant")
public class RestaurantController {

	@RequestMapping(value="", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView smartRestaurant(){
		return new ModelAndView("restaurant");
	}	
	
	@RequestMapping(value="/cafebar", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView smartCafebar(){
		return new ModelAndView("cafebar");
	}
}