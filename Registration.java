package com.booking;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */

public class Registration extends HttpServlet {
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response){
		try
		{
			String firstname = request.getParameter("firstname");
			String lastname = request.getParameter("lastname");
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			String dob = request.getParameter("yyyy-mm-dd");
			String phonenumber = request.getParameter("phonenumber");
			
			String sql = "insert into customer(`First Name`, `Last Name`, `User Name`, `Password`, `DOB`, `Phone Number`) values ('?','?', '?', '?', '?', '?')";
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/customerdetails", "root", "Sai971999*");
			
			PreparedStatement ps = mycon.prepareStatement(sql);
			ps.setString(1, firstname);
			ps.setString(2, lastname);
			ps.setString(3, username);
			ps.setString(4, password);
			ps.setString(5, dob);
			ps.setString(6, phonenumber);
			ps.executeUpdate();
			
			PrintWriter out = response.getWriter();
			out.println("Successfully Registered");
			
			response.sendRedirect("login.jsp");
		}
		
		 catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}

}
