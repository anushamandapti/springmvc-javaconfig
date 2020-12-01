<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student List</title>
</head>
<body>

	<h1>Student Details </h1>

	StudentName =      ${requestScope.STUD_DTLS.studentName}</br>
	Address City =     ${requestScope.STUD_DTLS.address.city} </br>
	Address ZipCode =  ${requestScope.STUD_DTLS.address.pincode}</br>
   
</body>
</html>