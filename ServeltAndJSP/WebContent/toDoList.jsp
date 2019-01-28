<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>To Do List</title>
</head>
<body>

<!-- Create HTML Form -->
<form action="toDoList.jsp">

Add New Item: <input type="text" name="theItem"> <br/> 
<input  type="submit" value="Submit">
</form>


Item Entered: <%= request.getParameter("theItem") %> 

<%

%>
</body>
</html>