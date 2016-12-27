package com.techm.bluemix.smarterairport.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/shopping")
public class ShoppinController {

	@RequestMapping(value="", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView smartShopping(){
		return new ModelAndView("shopping");
	}	
	
	@RequestMapping(value="apparel", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView smartApparel(){
		return new ModelAndView("apparel");
	}
}