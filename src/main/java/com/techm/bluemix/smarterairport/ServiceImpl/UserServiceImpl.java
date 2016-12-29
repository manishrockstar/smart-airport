package com.techm.bluemix.smarterairport.ServiceImpl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.techm.bluemix.smarterairport.DAO.UserDAO;
import com.techm.bluemix.smarterairport.Services.UserServices;
import com.techm.bluemix.smarterairport.Wrapper.UserWrapper;

@Service
public class UserServiceImpl implements UserServices {
	
	private UserDAO userDAO;
	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	@Transactional
	public void signUp(UserWrapper u) {
		// TODO Auto-generated method stub
		this.userDAO.signUp(u);
	}

	@Override
	public UserWrapper getUserByUsername(String uname) {
		// TODO Auto-generated method stub
		UserWrapper uw=userDAO.getUserByUsername(uname);
		return uw;
		
	}

}
