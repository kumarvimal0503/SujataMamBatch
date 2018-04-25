package com.demo.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletConfigDemo
 */
@WebServlet(value="/ServletConfigDemo",initParams={
		@WebInitParam(name="pin",value="411048"),
		@WebInitParam(name="pin",value="411048")})

public class ServletConfigDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletConfig config = getServletConfig();
		
		response.getWriter().println("Servlet Name: "+config.getServletName());
		
		response.getWriter().println("Address: "+config.getInitParameter("address"));
		
		Enumeration<String> params = config.getInitParameterNames();
		
		while (params.hasMoreElements()) {
			String param = (String) params.nextElement();
			response.getWriter().println(param+ ": "+config.getInitParameter(param));
		}
		
	}

}
