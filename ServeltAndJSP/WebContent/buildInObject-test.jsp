<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Build In Object</title>
</head>
<body>

<h3> Request Object</h3>
Session Details: <%= request.getSession() %>
Language:  <%= request.getLocalName() %>

<h3> Response Object </h3>
Get class <%= response.getClass() %>



<h3> Session Object </h3>
Session ID: <%= session.getId() %>


<h3> Application Object </h3>
Server Info <%= application.getServerInfo() %>
</body>
</html>