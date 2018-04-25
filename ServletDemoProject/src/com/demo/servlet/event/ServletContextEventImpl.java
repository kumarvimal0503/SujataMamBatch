package com.demo.servlet.event;

import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpServlet;

public class ServletContextEventImpl implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent e) {
		System.out.println("Server is going down: ");
	}

	@Override
	public void contextInitialized(ServletContextEvent e) { 
		
		ServletContext context = e.getServletContext();
		
		
		Enumeration<String> params = context.getInitParameterNames();
		while (params.hasMoreElements()) {
			String param = (String) params.nextElement();
			System.out.println("Param: "+param);
		}
		
	}

	
	
	
}
