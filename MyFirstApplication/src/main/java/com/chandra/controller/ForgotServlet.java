package com.chandra.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chansra.dao.UserDAO;
import com.chansra.dao.UserDAOImpl;

public class ForgotServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForgotServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String userName = request.getParameter("uname");
		String type = request.getParameter("type");
		UserDAO dao = new UserDAOImpl();
		String password = dao.forgot(userName, type);
		out.println("Your Forgot Password : "+password);
		RequestDispatcher rd = request.getRequestDispatcher("/login.html");
		rd.include(request, response);
	}

}
