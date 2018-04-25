package com.demo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestDispatcherDemo
 */
@WebServlet("/ServletOne")
public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletOne() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		
		if(null != userName) {
			request.setAttribute("password", "123456");
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("ServletTwo");
		response.getWriter().println("Request Recieved at Servlet One");		
		//dispatcher.include(request, response);
		dispatcher.forward(request, response);
		
		
		response.getWriter().println("Your are at home now");
		
	}

}
