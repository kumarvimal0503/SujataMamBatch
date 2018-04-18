package com.demo.servlet;

import java.io.IOException;
import java.security.Principal;
import java.util.Locale;

import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HttpServletRequestServlet")
public class HttpServletRequestServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		String name = request.getParameter("uname");
		
		request.getParameterNames(); // Total param names

		
		
		String attr = (String) request.getAttribute("attr");
		
		request.setAttribute("attr","Apache");
		
		request.getAttributeNames(); // Total attribute names as enumeration
	
		request.getContentType();
		
		// text/html
		// application/pdf
		// application/msword.vnd
		
		request.getContextPath();
		
		request.getRequestURL();
		
		request.getProtocol();
		
		request.getQueryString();
		
		request.getLocalPort();
		
		request.getServletPath();
		
		request.getHeader("attrName");
		
		request.getHeaderNames(); // Total header attributes name as enumeration
		
		request.getCookies(); // It returns cookies array sent from client
		
		Principal principal  = request.getUserPrincipal(); //It return principle object
		
		request.getLocale(); // it returns localization code sent from client
		
		request.getRemoteAddr(); // IT returns client IP address
		
		request.getRequestDispatcher("targetResourceURL"); // IT return RequestDispatcher Object for communication
		
		ServletOutputStream out = response.getOutputStream();
		
		out.println("<h1>User Name: "+name+"</h1>");
		
	}


}
