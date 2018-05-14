
	<%-- <h1>Add Result page: <%= request.getParameter("message") %></h1> --%>
	
	<%
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		out.println((num1+num2));
	%>



