package com.techm.bluemix.smarterairport.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.techm.bluemix.smarterairport.DAO.UserDAO;
import com.techm.bluemix.smarterairport.Wrapper.User;

@Repository
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
	        return sessionFactory.getCurrentSession();
	    }
	 

	@Override
	public void signUp(User u) {
		// TODO Auto-generated method stub
		getCurrentSession().save(u);
	}

	@Override
	public User getUserByUsername(String uname) {
		// TODO Auto-generated method stub
			
		User u = (User) getCurrentSession().load(User.class, new String(uname));		
		return u;
	}


	
}
