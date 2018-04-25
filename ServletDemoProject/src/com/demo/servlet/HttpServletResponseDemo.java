package com.demo.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HttpServletResponseDemo
 */
@WebServlet("/HttpServletResponseDemo")
public class HttpServletResponseDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.addCookie(new Cookie("cookieName","CookieVal")); //
		
		
		response.getContentType(); // Returns content type sent by the client
		
		response.getHeader("header"); // REturns value of response header attr
		
		//response.sendError("error code"); // Send error on the basis of error codes
		
		response.isCommitted(); //  Checks if response is already commited
		
		
		
	}

}
