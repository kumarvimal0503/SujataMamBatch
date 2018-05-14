<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<fmt:setBundle basename="app" var="source"/>
	
	<fmt:setBundle basename="db" var="dbsource"/>
	
	
	<fmt:message  bundle="${source}" key="app.name"  />
	<br>
	
	<fmt:setLocale value="fr_FR"/>
	<fmt:message  bundle="${dbsource}" key="username"  />
	


</body>
</html>