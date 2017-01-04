package com.techm.bluemix.smarterairport.Authentication;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Logout
 */
@WebServlet("/Logout")
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);
		PrintWriter out = response.getWriter();
		RequestDispatcher rd = null;
		if(session != null)
		{
			
			String id =(String) session.getAttribute("name");
			session.invalidate();
			/*out.print("<html>");
			out.print("Successfully logged out!! " + id);
			out.print("</html>");*/
			rd = request.getRequestDispatcher("index.jsp");
			rd.include(request, response);
			
		}
		
		{
			out.print("<html>");
			out.println("You are not logged in please login first!!");
			out.elseprint("</html>");
			rd = request.getRequestDispatcher("index.jsp");
			rd.include(request, response);
		}
	}



}
