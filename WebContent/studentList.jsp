<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student List</title>
<%@ include file="header.jsp"%>
</head>
<body>
	<h1>STudent List</h1>
	<a href="StudentController?actions=add_new">Add New</a>
	<c:if test="${! empty students }">
		<table>
			<thead>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Password</th>
				<th>Email</th>
				<th>Address</th>
				<th>Country</th>
				<th>phone</th>
				<th>Dob</th>
				<th>Gender</th>
			</tr>
			</thead>
			<tbody>
				<c:forEach items="${students}" var="student">
					<tr>
						<td><c:out value="${student.id}"></c:out></td>
						<td><c:out value="${student.name}"></c:out></td>
						<td><c:out value="${student.password}"></c:out></td>
						<td><c:out value="${student.email}"></c:out></td>
						<td><c:out value="${student.address}"></c:out></td>
						<td><c:out value="${student.country}"></c:out></td>
						<td><c:out value="${student.phone}"></c:out></td>
						<td><c:out value="${student.dob}"></c:out></td>
						<td><c:out value="${student.gender}"></c:out></td>
						<td><a  href="StudentController?actions=edit&id=<c:out value="${student.id}"></c:out>">Edit</a>
						<a  href="StudentController?actions=delet&id=<c:out value="${student.id}"></c:out>"">Delet</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</c:if>
</body>
</html>