package com.demo.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ObjectScope
 */
@WebServlet("/ObjectScope")
public class ObjectScope extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ObjectScope() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		if(userName != null) {
			request.setAttribute("userName", userName);
			request.getSession().setAttribute("userName", userName);
			getServletContext().setAttribute("userName", userName);
		}
		response.getWriter().println("Request Scope User Name: "+request.getAttribute("userName"));
		response.getWriter().println("Session Scope User Name: "+request.getSession().getAttribute("userName"));
		response.getWriter().println("Application Scope User Name: "+getServletContext().getAttribute("userName"));
	}


}
