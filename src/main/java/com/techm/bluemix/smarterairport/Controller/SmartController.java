package com.techm.bluemix.smarterairport.Controller;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.File;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.configuration.reloading.FileChangedReloadingStrategy;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;
import com.techm.bluemix.smarterairport.Wrapper.LoginForm;
import com.techm.bluemix.smarterairport.Wrapper.User;	
import org.springframework.web.bind.annotation.ModelAttribute;
import com.techm.bluemix.smarterairport.Services.WeatherServices;
@Controller
@RequestMapping("/")
public class SmartController {
	
	@Autowired(required=true)
	private WeatherServices weatherServices;

	
	@RequestMapping(value="", method=RequestMethod.GET)
	public ModelAndView smartIndex(){
		return new ModelAndView("index","loginForm", new LoginForm());
	}	
	
	// Update API ID and key
	@RequestMapping(value="update", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView smartUpdate(@RequestParam("appid") String appid,@RequestParam("appkey") String appkey,@RequestParam("api") String api) throws ConfigurationException, InterruptedException {
		String filename="db.properties";
		weatherServices.propUpdate(appid, appkey, filename, api);
		return new ModelAndView("home");		
				
	}
	
	
	@RequestMapping(value="home", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView smartHome(){
		return new ModelAndView("home");
	}	
	
	@RequestMapping(value="register", method=RequestMethod.GET)
	public ModelAndView smartRegister(){
		return new ModelAndView("signup", "user", new User());
	}	
	
	@RequestMapping(value="restroom", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView smartRestRoom(){
		return new ModelAndView("restroom");
	}	
	
	
	@RequestMapping(value="emergency", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView smartEmergency(){
		return new ModelAndView("emergency");
	}	
		
		// Shopping pages
		
	@RequestMapping(value="shopping", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView smartShopping(){
		return new ModelAndView("shopping");
	}	
	
	@RequestMapping(value="apparel", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView smartApparel(){
		return new ModelAndView("apparel");
	}	
	
	@RequestMapping(value="/beauty", method={RequestMethod.GET,RequestMethod.POST})
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
	
		@RequestMapping(value="/packed", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView smartPacked(){
		return new ModelAndView("packed");
	}	
	
		@RequestMapping(value="/watches", method={RequestMethod.GET,RequestMethod.POST})
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
	
		@RequestMapping(value="travelacc", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView smartTravell(){
		return new ModelAndView("travelacc");
	}	
	
		@RequestMapping(value="wine", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView smartWine(){
		return new ModelAndView("wine");
	}	
	
		@RequestMapping(value="books", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView smartBooks(){
		return new ModelAndView("books");
	}	
	
	// Restaurant pages
	
	@RequestMapping(value="restaurant", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView smartRestaurant(){
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
	
	@RequestMapping(value="coffee", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView smartCoffee(){
		return new ModelAndView("coffee");
	}	
		
	@RequestMapping(value="food", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView smartFood(){
		return new ModelAndView("food");
	}	

	
}
