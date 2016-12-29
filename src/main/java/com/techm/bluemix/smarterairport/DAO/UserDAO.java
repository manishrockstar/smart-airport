package com.techm.bluemix.smarterairport.DAO;

import com.techm.bluemix.smarterairport.Wrapper.UserWrapper;

public interface UserDAO {
	
	public void signUp(UserWrapper u);
	public UserWrapper getUserByUsername(String uname);

}
