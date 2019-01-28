<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Registration Form</title>
</head>
<body>

	<form:form action="processForm" modelAttribute="student">

First Name: <form:input path="firstName" />
		<br>
		<br>
Last Name: <form:input path="lastName" />
		<br>
		<br>
Country: <form:select path="country">
			<form:options items="${student.countryOptions}"></form:options>

			<br>
			<br>

		</form:select>
		<br>
		<br>
		 Please Select your favorite language: 
		
		<br>
		<form:radiobutton path="favoriteLanguage" value="c#" />C# 
		<br>
		<form:radiobutton path="favoriteLanguage" value="java" />JAVA 
		<br>
		<form:radiobutton path="favoriteLanguage" value="angular" /> ANGULAR
		<br>
		<form:radiobutton path="favoriteLanguage" value="php" /> PHP
		<br>
		<br>
		<br>
		<input type="submit" value="Submit">
		
		<br><br>
		<form:checkbox path="opertingSystem" value="linux"/> Linux
		<form:checkbox path="opertingSystem" value="Mac OS"/> Mac OS
		<form:checkbox path="opertingSystem" value="Windows"/> Windows
		 
	</form:form>
</body>
</html>