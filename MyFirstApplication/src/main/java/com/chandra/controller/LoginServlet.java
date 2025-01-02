package com.chandra.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chansra.dao.UserDAO;
import com.chansra.dao.UserDAOImpl;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		UserDAO dao = new UserDAOImpl();
		String userName= request.getParameter("uname");
		String passWord = request.getParameter("password");
		String type= dao.login(userName,passWord);
		if(type.equals("admin")) {
			out.println("<center><h1>Welcome to Admin Main Menu</h1></center>");
		}else {
			out.println("<center><h1>Welcome to User Main Menu</h1></center>");
		}
		
	}

}
