<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>College Students</title>
</head>
<body>

	<h1>College Details</h1>
	
	<div>College Name : ${requestScope.COLLEGE.collegeName}</div> 
	<div>City :  ${requestScope.COLLEGE.city}</div>
	<div>Pincode : ${requestScope.COLLEGE.pincode} </div>
	<div>Website Link :  <a href="#">${requestScope.COLLEGE.website}</a></div>
	
	
	<h2>Student List</h2>
	
	<table>
	
		<thead>
			<tr>
				<th>Id</th>
				<th>First name</th>
				<th>Last name</th>
				<th>Email</th>
				<th></th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="emp" items="${COLLEGE_STUDENTS}" >
					<tr>
						<td>${emp.id}</td>
						<td>${emp.firstName}</td>
						<td>${emp.lastName}</td>
						<td>${emp.email}</td>
						<td><a href="/student/edit/${emp.id}">Edit</a></td>
						<td><a href="/student/delete/${emp.id}">Delete</a></td>
					</tr>		
				</c:forEach>
			
			
		</tbody>
	</table>
	
	
</body>
</html>