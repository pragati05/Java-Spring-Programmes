<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<c:set var="theLocale" value="${param.theLocale}"></c:set>
<fmt:setLocale value="${theLocale }" />
<fmt:setBundle basename="i18n.resource.myLabel"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>i18n test</title>
</head>
<body>


<a href="i18n_message_test.jsp?theLocale=en_US">English</a>  | <a href="i18n_message_test.jsp?theLocale=es_ES">Spanish</a> 
<br>

<fmt:message key="label.info"></fmt:message>

</body>
</html>