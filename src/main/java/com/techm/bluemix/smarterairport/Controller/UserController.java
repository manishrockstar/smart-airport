package com.techm.bluemix.smarterairport.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.techm.bluemix.smarterairport.Services.UserServices;
import com.techm.bluemix.smarterairport.Wrapper.UserWrapper;

@Controller
public class UserController {
	
	private UserServices userServices;

	@Autowired(required=true)
	@Qualifier(value="userServices")
	public void setUserServices(UserServices userServices) {
		this.userServices = userServices;
	}
	
	@RequestMapping(value= "/signup", method = RequestMethod.POST)
	public ModelAndView smartSignup(UserWrapper u){
		
		this.userServices.signUp(u);
		return new ModelAndView("index");
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
