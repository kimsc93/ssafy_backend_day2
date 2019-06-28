package com.ssafy.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssafy.model.LoginService;
import com.ssafy.model.UserInfo;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/user/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String name = request.getParameter("name");
		// parameter --> DTO
		UserInfo info = new UserInfo(id, name, pass);
		
		//String nick = LoginService.getService().login(id, pass);
		UserInfo result = LoginService.getService().login(info);
		if(result!=null) {
			request.setAttribute("user", result);
			RequestDispatcher disp = request.getRequestDispatcher("loginResult.jsp");
			disp.forward(request, response);
		}else{
			//response.sendRedirect("loginForm.jsp");
			request.setAttribute("status", "fail");
			RequestDispatcher disp = request.getRequestDispatcher("loginForm.jsp");
			disp.forward(request, response);
		}
	}

}
