package com.techm.bluemix.smarterairport.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.db2.jcc.DB2SimpleDataSource;
import com.ibm.nosql.json.api.BasicDBList;
import com.ibm.nosql.json.api.BasicDBObject;
import com.ibm.nosql.json.util.JSON;
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
			
		 getCurrentSession().persist(p);
		}
	

	@Override
	public User getUserByUsername(String uname) {
		// TODO Auto-generated method stub
			
		User u = (User) getCurrentSession().load(User.class, new String(uname));		
		return u;
	}


	
}
