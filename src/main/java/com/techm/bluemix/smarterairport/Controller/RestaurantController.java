package com.techm.bluemix.smarterairport.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
<<<<<<< HEAD
@RequestMapping("/")
public class SmartController {

	@RequestMapping(value="", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView smartHome(){
		return new ModelAndView("restaurant");
	}	
	
	@RequestMapping(value="cafebar", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView smartCafebar(){
		return new ModelAndView("cafebar");
	}	
	
	@RequestMapping(value="casual", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView smartCasual(){
		return new ModelAndView("casual");
	}	
	
	@RequestMapping(value="coffe", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView smartCoffee(){
		return new ModelAndView("coffee");
	}	
		
	@RequestMapping(value="food", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView smartFood(){
		return new ModelAndView("food");
	}	

}
=======
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
>>>>>>> 88c2d0e8fc87b1d0b73d85003fb48e0cef05e4c0
