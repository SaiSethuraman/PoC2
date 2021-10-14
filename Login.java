package com.booking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





public class Login extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		try
		{
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/customerdetails", "root", "Sai971999*");
		
			Statement stmt = mycon.createStatement();
			
			ResultSet rs = stmt.executeQuery("select* from customer where User Name = '"+username+"'and Password = '"+password+"'");
			
			if(rs.next()){
				response.sendRedirect("Welcome.jsp");
			}
			else {
					response.sendRedirect("Login.jsp");
				}
		}
				
			catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}
	

	


	


