package com.techm.bluemix.smarterairport.Services;

import com.techm.bluemix.smarterairport.Wrapper.UserWrapper;

public interface UserServices {
	
	public void signUp(UserWrapper u);
	public UserWrapper getUserByUsername(String uname);

}
