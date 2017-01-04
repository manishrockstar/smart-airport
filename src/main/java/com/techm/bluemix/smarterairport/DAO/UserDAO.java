package com.techm.bluemix.smarterairport.DAO;

import com.techm.bluemix.smarterairport.Wrapper.User;

public interface UserDAO {
	
	public void signUp(User u);
	public User getUserByUsername(String uname);

}
