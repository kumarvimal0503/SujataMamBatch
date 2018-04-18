package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyHttpServlet")
public class MyHttpServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		PrintWriter out = response.getWriter();
		
		out.println("<h1> MyHttpServlet </h1>");
		
		out.println("<h1> Servlet Name: "+getServletConfig().getServletName()+" </h1>");
		
	}
}
