<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>:: Use Bean Demo ::</title>
</head>
<body>


	<jsp:useBean id="stud" class="com.demo.bean.Student">
	</jsp:useBean>
	
	<%-- <jsp:setProperty property="name" name="stud" value="Vimal"/>
	<jsp:setProperty property="roll" name="stud" value="120"/> --%>
	
	<jsp:setProperty property="*" name="stud"/>
	
	<%-- <jsp:setProperty property="name" name="stud" value="<%=request.getParameter(\"name\") %>"/>
	<jsp:setProperty property="roll" name="stud" value="<%=request.getParameter(\"roll\") %>"/> --%>
	
	
	Name: <jsp:getProperty property="name" name="stud"/> <br>
	Roll: <jsp:getProperty property="roll" name="stud"/>

</body>
</html>