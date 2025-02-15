package com.chandra.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chansra.bean.Users;
import com.chansra.dao.UserDAO;
import com.chansra.dao.UserDAOImpl;

/**
 * Servlet implementation class RegistrationServlet
 */

public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Users user = new Users();
		user.setUserName(request.getParameter("uname"));
		user.setPassWord(request.getParameter("password"));
		user.setType(request.getParameter("type"));
		UserDAO dao = new UserDAOImpl();
		String message = dao.register(user);
		out.println("<h1><center>"+message+"</center></h1");
	}

}
