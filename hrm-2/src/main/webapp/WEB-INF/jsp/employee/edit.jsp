<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Employee</title>
</head>
<body>


    <form:form action="/edit" method="POST" modelAttribute="employee">
    
    	<form:label path="id">Id</form:label>
    	<form:input type="text" path="id" disabled="true" />
    
    	<form:label path="firstName">First Name</form:label>
    	<form:input type="text" path="firstName" placeholder="Enter FirstName" />
    	
    	<form:label path="lastName">Last Name</form:label>
    	<form:input type="text" path="lastName" placeholder="Enter LastName" />
    	
    	<form:label path="email">Email</form:label>
    	<form:input type="email" path="email" placeholder="Enter Email" />
    
    	<input type="submit" value="Submit" />
    	
    </form:form>
</body>
</html>