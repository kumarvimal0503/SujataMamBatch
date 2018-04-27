<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%
	
	out.println("Hello JSP");

	response.getWriter().println("Hello World");
	
	String moveName = "****** Avengers- Infinity War ******";
	
	String userName = "Tomcat";

%>
<br>

<div>My User name is: <%= userName %></div>

<%! 
	String userName = "Apache"	;
	public static int add(int a, int b) {
		return (a + b);
	}

	{
		add(10,20);
	}
	
%>


<p style="color:'blue'">Addition of 10 and 20 is:<%= add(10,20) %> </p>

</body>
</html>