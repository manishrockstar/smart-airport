<%@ page import="java.io.IOException"%>
<%@ page import="java.io.PrintWriter"%>
<%@ page import="java.net.InetAddress"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.SQLException"%>
<%@ page import="java.sql.Statement"%>
<%@ page import="java.util.Set"%>
<%@ page import="com.ibm.db2.jcc.DB2SimpleDataSource"%>
<%@ page import="javax.servlet.ServletException"%>
<%@ page import="javax.servlet.annotation.WebServlet"%>
<%@ page import="javax.servlet.http.HttpServlet"%>
<%@ page import="javax.servlet.http.HttpServletRequest"%>
<%@ page import="javax.servlet.http.HttpServletResponse"%>
<%@ page import="com.ibm.nosql.json.api.BasicDBList"%>
<%@ page import="com.ibm.nosql.json.api.BasicDBObject"%>
<%@ page import="com.ibm.nosql.json.util.JSON"%>
<%
	String databaseHost = "localhost";
	int port = 50000;
	String databaseName = "mydb";
    String user = "myuser";
	String pasword = "mypass";
	String url = "myurl";
	String username = request.getParameter("username");   
    String paword = request.getParameter("password");
    
    //HttpSession session = request.getSession();
	PrintWriter writer = response.getWriter();
	
//	private boolean processVCAP(PrintWriter writer)
//{
		// VCAP_SERVICES is a system environment variable
		
		String VCAP_SERVICES = System.getenv("VCAP_SERVICES");
	//	writer.println("VCAP_SERVICES content: " + VCAP_SERVICES);

		if (VCAP_SERVICES != null)
		{
			// parse the VCAP JSON structure
			BasicDBObject obj = (BasicDBObject) JSON.parse(VCAP_SERVICES);
			String thekey = null;
			Set<String> keys = obj.keySet();
		//	writer.println("Searching through VCAP keys");
			// Look for the VCAP key that holds the SQLDB information
			for (String eachkey : keys) 
			{
			//	writer.println("Key is: " + eachkey);
				// Just in case the service name gets changed to lower case in the future, use toUpperCase
				if (eachkey.toUpperCase().contains("weatherinsights")) 
				{
					thekey = eachkey;
				}
			}
			if (thekey == null) 
			{
			//	writer.println("Cannot find any SQLDB service in the VCAP; exiting");
			//	return false;
			}
			BasicDBList list = (BasicDBList) obj.get(thekey);
			obj = (BasicDBObject) list.get("0");
			//writer.println("Service found: " + obj.get("name"));
			// parse all the credentials from the vcap env variable
			obj = (BasicDBObject) obj.get("credentials");
			databaseHost = (String) obj.get("host");
			databaseName = (String) obj.get("db");
			//port = (int)obj.get("port");
			user = (String) obj.get("username");
			pasword = (String) obj.get("password");
			url = (String) obj.get("jdbcurl");
		}
		
		/*writer.println();
		writer.println("database host: " + databaseHost);
		writer.println("database port: " + port);
		writer.println("database name: " + databaseName);
		writer.println("username: " + user);
		writer.println("password: " + password);
		writer.println("url: " + url);*/
		//return true;
	//}
	


		/*writer.println("IBM SQL Database, Java Demo Application using DB2 drivers");
		writer.println("Servlet: " + this.getClass().getName());
		writer.println();
		writer.println("Host IP:" + InetAddress.getLocalHost().getHostAddress());
*/
		// process the VCAP env variable and set all the global connection parameters
/*		if (processVCAP(writer)) {
	
			// Connect to the Database*/
			Connection con = null;
		//	try {
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
			//} catch (SQLException e) {
				//writer.println("Error connecting to database");
				//writer.println("SQL Exception: " + e);
			//	return;
		//	} 
	
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
			tableName ="USER17260.DDP_DIR";
	/*
			try {
				stmt = con.createStatement();
				// Create the CREATE SCHEMA SQL statement and execute it
				sqlStatement = "CREATE SCHEMA " + schemaName;
				writer.println("Executing: " + sqlStatement);
				stmt.executeUpdate(sqlStatement);
			} catch (SQLException e) {
				writer.println("Error creating schema: " + e);
			}
	
			// create a table
			try {
				stmt = con.createStatement();
				// Create the CREATE TABLE SQL statement and execute it
				sqlStatement = "CREATE TABLE " + tableName
						+ " (NAME VARCHAR(20), AGE INTEGER)";
				writer.println("Executing: " + sqlStatement);
				stmt.executeUpdate(sqlStatement);
			} catch (SQLException e) {
				writer.println("Error creating table: " + e);
			}
	*/
			// Execute some SQL statements on the table: Insert, Select and Delete
			//try {
				stmt = con.createStatement();
			//	sqlStatement = "INSERT INTO " + tableName						+ " VALUES (\'John Smith\', 52)";
			//	writer.println("Executing: " + sqlStatement);
			//	stmt.executeUpdate(sqlStatement);
	
				sqlStatement = "SELECT * FROM " + tableName
						+ " WHERE UNAME='"+username+"' AND PWORD='"+paword+"'";
				ResultSet rs = stmt.executeQuery(sqlStatement);
				
			//writer.println("Executing: " + sqlStatement);
	
				// Process the result set
				if(rs.next()){
					String dname;
				//	writer.println(" \nConnection Succeed\n\n");
						
					dname = rs.getString(6);
					//writer.println("  Found Employee: " + dname);
					session.setAttribute("dname", dname);
					
				
				
				// Close the ResultSet
				rs.close();
				
				
				//RequestDispatcher dispatcher=request.getRequestDispatcher("");
				
				//dispatcher.forward(request, response);
		        response.sendRedirect("menu.jsp");
				}
				else
				{
					response.sendRedirect("index.jsp");
				}
				// Delete the record
			/*	sqlStatement = "DELETE FROM " + tableName
						+ " WHERE NAME = \'John Smith\'";
				writer.println("Executing: " + sqlStatement);
				stmt.executeUpdate(sqlStatement);*/
			//} catch (SQLException e) {
				//writer.println("Error executing:" + sqlStatement);
				//writer.println("SQL Exception: " + e);
			//}
	
			// Remove the table from the database
		/*	try {
				sqlStatement = "DROP TABLE " + tableName;
				writer.println("Executing: " + sqlStatement);
				stmt.executeUpdate(sqlStatement);
			} catch (SQLException e) {
				writer.println("Error dropping table: " + e);
			}
			
			// Remove the schema from the database
			try {
				sqlStatement = "DROP SCHEMA " + schemaName + " RESTRICT";
				writer.println("Executing: " + sqlStatement);
				stmt.executeUpdate(sqlStatement);
			} catch (SQLException e) {
				writer.println("Error Dropping schema: " + e);
			}
	*/
			// Close everything off
		//	try {
				// Close the Statement
				stmt.close();
				// Connection must be on a unit-of-work boundary to allow close
				con.commit();
				// Close the connection
				con.close();
				//writer.println("Finished");
	
			//} catch (SQLException e) {
				//writer.println("Error closing things off");
				//writer.println("SQL Exception: " + e);
			//}
		//}
		//writer.close();
	



  /*  String username = request.getParameter("username");   
    String password = request.getParameter("password");
    Class.forName("com.db2.jdbc.app.Driver");
    Connection con = DriverManager.getConnection("jdbc:db2://user14336:7QS49SFrbMAH@75.126.155.153:50000/SQLDB");
    Statement st = con.createStatement();
    ResultSet rs;
    rs = st.executeQuery("select displayname from USER14336.ddp_direct where user_id='" + username + "' and password='" +password + "'");
    
    if (rs.next()) {
        session.setAttribute("userid", rs);
        response.sendRedirect("menu.jsp");
    } else {
        out.println("Invalid password <a href='login.jsp'>Try again</a>");
    }
    /*
    if (username=="sanrad"){
    	session.setAttribute("userid", username);
        response.sendRedirect("menu.jsp");
    } else {
        out.println("Invalid password <a href='login.jsp'>Try again</a>");
    }*/ 
    
%>