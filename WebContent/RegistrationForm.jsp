<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SignUp form</title>
<%@ include file="header.jsp"%>
</head>
<body>
	<form action="StudentController" method="post">
	<table align ="center">
			<input type="hidden" name="id" value="${student.id}"/>
	
	<tr>
		<td><label>Name</label></td>
		<td><input type="text" name="name"  value="${student.name}" /></td>
	</tr>
	<tr>
		<td><label>Password</label></td>
		<td><input type="password" name="pass"  value="${student.password}"/></td>
	</tr>
	<tr>
		<td><label>Address</label></td>
		<td><input type="text" name="address"  value="${student.address}"/></td>
	</tr>
	<tr>
		<td><label>Email</label></td>
		<td><input type="email" name="email"  value="${student.email}"/></td>
	</tr>
	<tr>
		<td><label>Phone</label></td>
		<td><input type="number" name="phone"  value="${student.phone}"/></td>
	</tr>
	<tr>
		<td><label>Gender</label></td>
		<td><input type="radio" name="gender" value="male"
		${student.gender =='male'?'checked':'' or student.gender==null?'checked':''}/>Male
		<input type="radio" name="gender" value="female" 
		${student.gender =='female'?'checked':''}/>Female
		</td>
	</tr>
	<tr>
		<td><label>Date of Birth</label></td>
		<td><input type="date" name="dob"  value="${student.dob}"/></td>
	</tr>
	<tr>
		<td><label>Country</label></td>
		<td><select name="country">
			<option value="nepal">Nepal</option>
			<option value="india">India</option>
			<option value="america">America</option>
			<option value="china">China</option>
			<option value="russia">Russia</option>
		</select></td>
	</tr>
	<tr>
	<td><input type="reset" value="reset"/></td>
		<td><input type="submit" value="submit"/></td>
	</tr>
	</table>
	</form>
</body>
</html>