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


@WebServlet("/Signup")
public class Signup extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		RequestDispatcher rd = null;
		Connection conn;
		Statement stmt;
		ResultSet rs = null;
		
		String uname = "bluadmin";
		String pass = "Mjk4YzIzZmYyNTgz";
		String url = "jdbc:db2://dashdb-txn-small-yp-dal09-39.services.dal.bluemix.net:50000/BLUDB";
		
		String sname = request.getParameter("sname");
		String suname = request.getParameter("suname");
		String email = request.getParameter("semail");
		String contact = request.getParameter("scontact");
		String pwd = request.getParameter("psw1");
		
		try{
			
			Class.forName("com.ibm.db2.jcc.DB2Driver");
			conn = DriverManager.getConnection(url,uname,pass);
			stmt = conn.createStatement();
			
			/*String sql = "SELECT * FROM signup where semail like '" + email + "'"; 
			rs = stmt.executeQuery(sql);
			
			if(rs.next())
			{
				out.println("User already exist please try to login!!");
				rd = request.getRequestDispatcher("/Signup");
				rd.include(request, response);
				
			}
			else
			{*/
				String i_sql = "INSERT INTO signup values('" + sname + "', '" + suname + "', '" + email + "', '" + contact + "', '" + pwd + "')"; 
				stmt.executeUpdate(i_sql);
				
				out.print("User Added SuccessFully!!");
				rd = request.getRequestDispatcher("/index.jsp");
				rd.include(request, response);
			
			conn.close();
			stmt.close();
			
			
		}
		catch(Exception e)
		{
			System.err.println(e.getMessage());
		}

		
		
	}

}
