<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div> ${logoutMsg} </div>
<div> ${loginFailedMsg} </div>
	<form action="LoginController" method="post">
		<table>
			<tr>
				<td><label>Name</label></td>
				<td><input type="text" name="uname" /></td>
			</tr>
			<tr>
				<td><label>Password</label></td>
				<td><input type="password" name="pass" /></td>
			</tr>
			<tr>
				<td><input type="reset" value="reset" /></td>
				<td><input type="submit" value="log in" /></td>
			</tr>
		</table>
	</form>
</body>
</html>