<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>:: Tag Lib (SQL) ::</title>
</head>
<body>

	<sql:setDataSource driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/test" user="root" password="root"
		var="ds" scope="page" />

	<sql:query var="employeeRecord" dataSource="${ds}">
		select * from employee
	</sql:query>

	<table border="1">
		<thead>
			<tr>
				<th>Emp Id</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Age</th>
				<th>Salary</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${employeeRecord.rows}" var="record">
				<tr>
					<td>${record.id}</td>
					<td>${record.first_name}</td>
					<td>${record.last_name}</td>
					<td>${record.age}</td>
					<td>${record.salary}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>