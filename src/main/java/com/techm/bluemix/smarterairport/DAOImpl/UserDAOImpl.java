package com.techm.bluemix.smarterairport.DAOImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.techm.bluemix.smarterairport.DAO.UserDAO;
import com.techm.bluemix.smarterairport.Wrapper.UserWrapper;

@Repository
public class UserDAOImpl implements UserDAO {
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}


	@Override
	public void signUp(UserWrapper u) {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(u);
	}

	@Override
	public UserWrapper getUserByUsername(String uname) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();		
		UserWrapper u = (UserWrapper) session.load(UserWrapper.class, new String(uname));		
		return u;
	}


	
}
