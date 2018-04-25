package com.demo.servlet;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletContextDemo
 */
@WebServlet("/ServletContextDemo")
public class ServletContextDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext context = getServletConfig().getServletContext();
		
		InputStream stream = context.getResourceAsStream("/demo.txt");
		BufferedReader bis = new BufferedReader(new InputStreamReader(stream));
		
		
		response.getWriter().println(bis.readLine());
		
		Enumeration<String> params = context.getInitParameterNames();
		
		while (params.hasMoreElements()) {
			String param = (String) params.nextElement();
			
			response.getWriter().println(param+ ": "+context.getInitParameter(param));
		}
		
	}

}
