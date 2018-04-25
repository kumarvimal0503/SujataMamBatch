package com.demo.servlet.session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet(name = "session.HomeServlet", urlPatterns = { "/session/HomeServlet" })
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Cookie[] cookies = request.getCookies();
		
		HttpSession session = request.getSession(false);
		
		//if(cookies != null) {
		if(session != null) {
			//response.getWriter().println("<h1>User Name: "+cookies[0].getValue()+"</h1>");
			//response.getWriter().println("<h1>Welcome: "+cookies[1].getValue()+"</h1>");
			
			response.getWriter().println("<h1>User Name: "+session.getAttribute("userName")+"</h1>");
			response.getWriter().println("<h1>Welcome: "+session.getAttribute("displayName")+"</h1>");
		} else {
			response.sendRedirect("ErrorServlet");
		}
		
		session.invalidate();
		
	}

}
