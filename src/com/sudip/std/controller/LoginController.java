package com.sudip.std.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		

		if(uname.equalsIgnoreCase("admin")&&pass.equalsIgnoreCase("admin")){
			HttpSession session=request.getSession(); 
			RequestDispatcher rd= request.getRequestDispatcher("home.jsp");
			session.setAttribute("user", uname);
			rd.forward(request, response);

		}else{
			HttpSession session=request.getSession(); 
			RequestDispatcher rd= request.getRequestDispatcher("login.jsp");
			session.setAttribute("loginFailedMsg", "Username and password donot match");
			rd.include(request, response);
		}

	}

}
