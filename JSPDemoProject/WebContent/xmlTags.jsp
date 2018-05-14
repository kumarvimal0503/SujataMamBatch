<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="vegetable">
		<vegetables> <vegetable> <name>onion</name> <price>40/kg</price>
		</vegetable> <vegetable> <name>Potato</name> <price>30/kg</price> </vegetable> <vegetable>
		<name>Tomato</name> <price>90/kg</price> </vegetable> </vegetables>
	</c:set>

	<x:parse xml="${vegetable}" var="output" />

	<b>Name of the vegetable is</b>:
	<x:out select="$output/vegetables/vegetable[1]/name" />
	<br>
	<b>Price of the Potato is</b>:
	<x:out select="$output/vegetables/vegetable[2]/price" />


</body>
</html>