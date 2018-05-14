<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Arrays" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<c:url var="homeURL" value="https://google.com" />
		
		<c:set  var="bookList" value="<%= Arrays.asList(\"Java\",\"c++\",\"Python\") %>" />
		
		
		<c:forEach items="${bookList}" var="book">
			<c:out value="${book}" />
			<br>
		</c:forEach>
		
		<c:forEach begin="1" end="${bookList.size()}" var="i">
			
			<c:out value="Hi There:::: ${i}" /><br>
		</c:forEach>
		
		<c:forTokens items="Apple,Guava,Pineapple" delims="," var="fruit">
			<c:out value="${fruit}" /> <br>
		</c:forTokens>

<c:out value = "${data}"/>

	
		<a href="${homeURL}" target="_blank"> Home </a>
		
		<c:redirect  url="${homeURL}"/>

	 <%-- <c:import var = "data" url = "http://www.tutorialspoint.com/index.htm"/> --%>
      
	
</body>
</html>