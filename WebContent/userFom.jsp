<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create User</title>
<%@ include file="header.jsp" %>
</head>
<body>
	<form action="StudentController" method="post">
	<table align ="center">
			<input type="hidden" name="u_id" value="${user.u_id}"/>
	
	<tr>
		<td><label>First Name</label></td>
		<td><input type="text" name="fname"  value="${user.fname}" /></td>
	</tr>
	<tr>
		<td><label>Last Name</label></td>
		<td><input type="text" name="lname"  value="${user.lname}" /></td>
	</tr>
	<tr>
		<td><label>Password</label></td>
		<td><input type="password" name="pass"  value="${user.password}"/></td>
	</tr>

	<tr>
		<td><label>Email</label></td>
		<td><input type="email" name="email"  value="${user.email}"/></td>
	</tr>
		<tr>
		<td><label>Username</label></td>
		<td><input type="text" name="uname"  value="${user.name}" /></td>
	</tr>
	
	<tr>
		<td><label>Date of Birth</label></td>
		<td><input type="date" name="dob"  value="${student.dob}"/></td>
	</tr>
	
	<tr>
	<td><input type="reset" value="reset"/></td>
		<td><input type="submit" value="submit"/></td>
	</tr>
	</table>
	</form>
</body>
</html>