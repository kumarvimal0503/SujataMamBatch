<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>:: Action Tags ::</title>
</head>
<body>

	<%= "Add result is: " %>	
	<jsp:include page="/addResult.jsp">
		<jsp:param value="10" name="num1"/>
		<jsp:param value="20" name="num2"/>
	</jsp:include>
	

</body>
</html>