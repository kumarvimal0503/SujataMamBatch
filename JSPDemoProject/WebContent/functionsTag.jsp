<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>:: Function Tags ::</title>
</head>
<body>
	
		<c:set var="userName" value="Tomcat" />
		
		<c:out value="${fn:toUpperCase(userName)}" />
		
		<br>
		Substring of ${userName }: <c:out value="${fn:substring(userName,0,3)}" />


</body>
</html>