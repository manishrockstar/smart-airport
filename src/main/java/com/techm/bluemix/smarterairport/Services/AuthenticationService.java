package com.techm.bluemix.smarterairport.Services;



import org.springframework.stereotype.Service;



@Service
public interface AuthenticationServices {

	public String smartLogin(String uname, String pword);


}