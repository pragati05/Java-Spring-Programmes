<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  import="com.javaDemo.FunUtil" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Demo</title>
</head>
<body>

<!-- JSP Expreesiion Tag - java object converted into toString -->
The Time on the Server is <%= new java.util.Date() %>

<!-- Declare a method or variable inside Decalation Tag -->

<%! String makeItLower(String str){
	return str.toLowerCase();
			} %>

<br/><br/>
Lower case of "Hello World" <%= makeItLower("Hello World") %>
}


<!-- If you want to include more java code user Scriptlet tag. Note try to avoid more java code inside jsp, rather follow MVC patter and create Sepreate Servelt or java class  -->
<%
for (int i =0;  i < 5; i++){
	out.print("<br/> "+ i);
}
%>


<!--  call java class from JSP -->
<br/><br/>
Upper case of "Hello World" <%= FunUtil.makeItUpper("Hello World") %>
</body>
</html>