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
		return new ModelAndView("shopping");
	}	
	
	@RequestMapping(value="apparel", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView smartApparel(){
		return new ModelAndView("apparel");
	}	
	
	@RequestMapping(value="beauty", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView smartBeauty(){
		return new ModelAndView("beauty");
	}	
	
	@RequestMapping(value="travel", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView smartTravel(){
		return new ModelAndView("travel");
	}	
		
	@RequestMapping(value="electronics", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView smartElectronics(){
		return new ModelAndView("electronics");
	}	
	 
	 	@RequestMapping(value="fashion", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView smartFashion(){
		return new ModelAndView("fashion");
	}	
	
		@RequestMapping(value="jewellery", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView smartJewellery(){
		return new ModelAndView("jewellery");
	}	
	
		@RequestMapping(value="packed", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView smartPacked(){
		return new ModelAndView("packed");
	}	
	
		@RequestMapping(value="watches", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView smartWatches(){
		return new ModelAndView("watches");		
	}	
	
		@RequestMapping(value="perfumes", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView smartPerfumes(){
		return new ModelAndView("perfumes");
	}	
	
		@RequestMapping(value="gifts", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView smartGifts(){
		return new ModelAndView("gifts");
	}	
	
		@RequestMapping(value="toys", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView smartToys(){
		return new ModelAndView("toys");
	}	
	
		@RequestMapping(value="travell", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView smartTravell(){
		return new ModelAndView("travell");
	}	
	
		@RequestMapping(value="wine", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView smartWine(){
		return new ModelAndView("wine");
	}	
	
		@RequestMapping(value="books", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView smartBooks(){
		return new ModelAndView("books");
	}	
	
	
	

}
