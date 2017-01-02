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

		 String databaseHost;
			int port;
			String databaseName;
		    String user;
			String pasword;
			String url;
			
			String VCAP_SERVICES = System.getenv("VCAP_SERVICES");
		//	writer.println("VCAP_SERVICES content: " + VCAP_SERVICES);

				// parse the VCAP JSON structure
				BasicDBObject obj = (BasicDBObject) JSON.parse(VCAP_SERVICES);
				String thekey = null;
				Set<String> keys = obj.keySet();
				//writer.println("Searching through VCAP keys");
				// Look for the VCAP key that holds the SQLDB information
				for (String eachkey : keys) 
				{
					//writer.println("Key is: " + eachkey);
					// Just in case the service name gets changed to lower case in the future, use toUpperCase
					if (eachkey.toUpperCase().contains("dashDB For Transactions")) 
					{
						thekey = eachkey;
					}
				}
				
				BasicDBList list = (BasicDBList) obj.get(thekey);
				obj = (BasicDBObject) list.get("0");
				//writer.println("Service found: " + obj.get("name"));
				// parse all the credentials from the vcap env variable
				obj = (BasicDBObject) obj.get("credentials");
				databaseHost = (String) obj.get("host");
				databaseName = (String) obj.get("db");
				port = (int)obj.get("port");
				user = (String) obj.get("username");
				pasword = (String) obj.get("password");
				url = (String) obj.get("jdbcurl");
			
		
			// Connect to the Database
			Connection con = null;
		try {
				//writer.println();
				//writer.println("Connecting to the database");
				DB2SimpleDataSource dataSource = new DB2SimpleDataSource();
				dataSource.setServerName(databaseHost);
				dataSource.setPortNumber(port);
				dataSource.setDatabaseName(databaseName);
				dataSource.setUser(user);
				dataSource.setPassword (pasword);
				dataSource.setDriverType(4);
				con=dataSource.getConnection();
				con.setAutoCommit(false);
			} catch (SQLException e) {
				//writer.println("Error connecting to database");
				//writer.println("SQL Exception: " + e);
				return;
			} 
	
			// Try out some dynamic SQL Statements
			Statement stmt = null;
			String tableName = "";
			String sqlStatement = "";
			// It is recommend NOT to use the default schema since it is correlated
			// to the generated user ID
			//String schemaName = "SQLDBSAMPLE";
			// create a unique table name to make sure we deal with our own table
			// If another version of this sample app binds to the same database, 
			// this gives us some level of isolation
			tableName = "BLUADMIN.SIGNUP";

			// Execute some SQL statements on the table: Insert, Select and Delete
			
				try {
					stmt = con.createStatement();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				sqlStatement = "INSERT INTO " + tableName+ " VALUES ("+u.getNAME()+u.getUSERNAME()+u.getEMAIL()+u.getCONTACT()+u.getPASSWORD()+")";
				
				try {
					stmt.executeUpdate(sqlStatement);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	

	@Override
	public User getUserByUsername(String uname) {
		// TODO Auto-generated method stub
			
		User u = (User) getCurrentSession().load(User.class, new String(uname));		
		return u;
	}


	
}
