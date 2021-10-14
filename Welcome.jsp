<%@page import="org.apache.tomcat.dbcp.dbcp2.DriverManagerConnectionFactory"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	WELCOME TO KAATUBOCHHI RESORT ${username}
	

	<form action="Welcome">
	
	<input type = "submit" value = "Rooms">
	
	</form>
	
	
	<form action="Logout">
	
	 <input type = "submit" value = "Logout">
	
	</form>
	
</body>
</html>