package com.techm.bluemix.smarterairport.Services;

import com.techm.bluemix.smarterairport.Wrapper.User;

public interface UserServices {
	
	public void signUp(User u);
	public User getUserByUsername(String uname);

}
