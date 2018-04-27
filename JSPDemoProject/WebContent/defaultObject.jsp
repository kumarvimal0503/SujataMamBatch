<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isErrorPage="true"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		String userName = request.getParameter("userName");
		if(null != userName) {
			pageContext.setAttribute("userName", userName,PageContext.REQUEST_SCOPE);
			pageContext.setAttribute("userName", userName,PageContext.SESSION_SCOPE);
			pageContext.setAttribute("userName", userName,PageContext.APPLICATION_SCOPE);
		}
	%>
	<p>Request level user name: <%= pageContext.getAttribute("userName",PageContext.REQUEST_SCOPE) %></p>
	<p>Session level user name: <%= pageContext.getAttribute("userName",PageContext.SESSION_SCOPE) %></p>
	<p>Application level user name: <%= pageContext.getAttribute("userName",PageContext.APPLICATION_SCOPE) %></p>
	
	<p>Config level user name: <%= config.getInitParameter("User Name") %></p>
	
	<%
		exception.printStackTrace();
	%>
	

</body>
</html>