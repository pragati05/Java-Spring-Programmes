<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.* ,com.javaDemo.Student" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Tags</title>
</head>
<body>

<c:set var="date" value = "<%= new java.util.Date() %>" />
Time on the server is ${date}

<%

List<Student> data = new ArrayList<Student>();
data.add(new Student("Pragati", "Naigaonkar", true));
data.add(new Student("Rohit", "Shende", true));
data.add(new Student("Payal", "Sharma", true));
pageContext.setAttribute("myStudents", data);

%>

<c:forEach  var="temp" items="${myStudents}">
${temp.firstName}, ${temp.lastName}, ${temp.goldenCustomer} <br/>
</c:forEach>

</body>
</html>