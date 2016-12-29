package com.techm.bluemix.smarterairport.ServiceImpl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import com.techm.bluemix.smarterairport.DAO.UserDAO;
import com.techm.bluemix.smarterairport.Services.UserServices;
import com.techm.bluemix.smarterairport.Wrapper.UserWrapper;

@Service
public class UserServiceImpl implements UserServices {
	
	@Autowired
	private UserDAO userDAO;
	
	
	@Override
	@Transactional
	public void signUp(UserWrapper u) {
		// TODO Auto-generated method stub
		userDAO.signUp(u);
	}

	@Override
	public UserWrapper getUserByUsername(String uname) {
		// TODO Auto-generated method stub
		UserWrapper uw=userDAO.getUserByUsername(uname);
		return uw;
		
	}

}
