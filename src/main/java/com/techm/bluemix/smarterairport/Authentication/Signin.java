package com.techm.bluemix.smarterairport.Authentication;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Signin")
public class Signin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		RequestDispatcher rd = null;
		PrintWriter out = response.getWriter();
		Statement stmt = null;
		Connection conn;
		ResultSet rs = null;
		
		String email = request.getParameter("uname");
		String pwd = request.getParameter("psw");
		
		String uname = "bluadmin";
		String pass = "Mjk4YzIzZmYyNTgz";
		String url = "jdbc:db2://dashdb-txn-small-yp-dal09-39.services.dal.bluemix.net:50000/BLUDB";
		
		try{
			Class.forName("com.ibm.db2.jcc.DB2Driver");
			conn = DriverManager.getConnection(url,uname,pass);
			stmt = conn.createStatement();
			
			String sql = "SELECT * FROM signup where email like '" + email + "' and password like '" + pwd + "'";
			rs = stmt.executeQuery(sql);
			
			if(rs.next())
			{
				
				
				HttpSession session = request.getSession();
				session.setAttribute("name", rs.getString("sname"));
				session.setAttribute("email",email);
				session.getMaxInactiveInterval();
			
				
				out.println("<html><body>");
			      out.println("Thank you, " + email + 
			                     ". You are now logged into the system");
			      // Encodes the specified URL by including the session ID in it,
			      // or, if encoding is not needed, returns the URL unchanged
			      //String newURL = response.encodeURL("/ServletSession/GetSession");
			      out.println("</body></html>");
			     // String newURL = response.encodeUrl(request.getContextPath() + "/index.jsp");
			    /* getServletContext().getRequestDispatcher(response.encodeUrl(request.getContextPath() + "/index.jsp")).forward(
							request, response);*/
			     /* String url1=request.getContextPath() + "/index.jsp";
			     String url2= URLEncoder.encode(url1, "UTF-8");*/
				rd = request.getRequestDispatcher("/index.jsp");
				rd.include(request, response);
				out.close();
			}
			else{
				
				out.println("Login failed please try again!!");
				
			}
		}
		catch(Exception e)
		{
			
			System.err.println(e.getMessage());
		}
		
	}

}
