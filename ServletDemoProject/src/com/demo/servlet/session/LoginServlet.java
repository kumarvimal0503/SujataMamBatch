package com.demo.servlet.session;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "session.LoginServlet", urlPatterns = { "/session/LoginServlet" })
public class LoginServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException  {
		String userName = request.getParameter("userName");
		String pass = request.getParameter("pass");
		
		if("123456".equals(pass)) {
			//Cookie cookie1 = new Cookie("userName", userName);
			//Cookie cookie2 = new Cookie("displayName", userName.toUpperCase());
			//response.addCookie(cookie1);
			//response.addCookie(cookie2);
			
			HttpSession session = request.getSession();
			
			session.setAttribute("userName", userName);
			session.setAttribute("displayName", userName.toUpperCase());
			
			response.sendRedirect("HomeServlet");
		} else {
			response.sendRedirect("ErrorServlet");
		}
	}
}
