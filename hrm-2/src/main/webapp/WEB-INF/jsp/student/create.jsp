<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>

	<form:form action="/createStudent" method="POST" modelAttribute="studentform">
		
		<div>
			<form:label path="firstName">First Name</form:label>
	    	<form:input type="text" path="firstName" placeholder="Enter FirstName" />
		</div>
		
		<div>
			<form:label path="lastName">Last Name</form:label>
	    	<form:input type="text" path="lastName" placeholder="Enter LastName" />
		</div>
		
		
		<div>
			<form:label path="email">Email</form:label>
	    	<form:input type="text" path="email" placeholder="Enter Email" />
		</div>
		
		<hr>
		
		<div>
			<input type="submit" value="Create Student" />
		</div>
	
	</form:form>

</body>
</html>