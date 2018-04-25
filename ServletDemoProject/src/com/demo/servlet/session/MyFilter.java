package com.demo.servlet.session;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Servlet Called... "+request.getParameter("userName"));
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		System.out.println("Servlet Initialized"+config.getFilterName());
	}

}
