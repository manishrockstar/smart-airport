package com.techm.bluemix.smarterairport.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.techm.bluemix.smarterairport.Services.UserServices;
import com.techm.bluemix.smarterairport.Wrapper.UserWrapper;
import org.springframework.ui.Model;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;


@Controller
public class UserController {
	
	@Autowired(required=true)
	private UserServices userServices;
	
	 @RequestMapping(value = "/signup", method = RequestMethod.GET)
	    public String registration(Model model) {
	        model.addAttribute("u", new UserWrapper());
	        return "signup";
	    }
	
	@RequestMapping(value= "/signup", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView smartSignup(@ModelAttribute("command")UserWrapper u, BindingResult result){
		System.out.println("Entered into Controller");
		userServices.signUp(u);
		String message = "User successfully Registered. Please login now";
		return new ModelAndView("index", "message", message);
	}
	
	
	@RequestMapping(value= "/signin", method = RequestMethod.POST)
	public ModelAndView smartSignin(@RequestParam("uname") String uname, @RequestParam("pword") String pword){
		
		UserWrapper uw=userServices.getUserByUsername(uname);
		if(uw!=null){
			if(uw.getPASSWORD().equals(pword)){
				return new ModelAndView("home","name",uw.getNAME());
			}	
		}
		return new ModelAndView("index");
		
	}
	
	

}
