<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee List Page</title>
</head>
<body>
<div>
	<div>
		<h1>Employee List Page</h1>

		<table>
			<thead>
				<tr>
					<th>Id</th>
					<th>FirstName</th>
					<th>LastName</th>
					<th>Email</th>
					<th></th>
					<th></th>
				</tr>
			</thead>
			<tbody>
			
				<c:forEach var="emp" items="${EMP_LIST}" >
					<tr>
						<td>${emp.id}</td>
						<td>${emp.firstName}</td>
						<td>${emp.lastName}</td>
						<td>${emp.email}</td>
						<td><a href="/edit/${emp.id}">Edit</a></td>
						<td><a href="/delete/${emp.id}">Delete</a></td>
					</tr>		
				</c:forEach>
				
				

			</tbody>
		</table>
	</div>

	<div>
		<a href="create">Add Employee</a>
	</div>
</div>

</body>
</html>