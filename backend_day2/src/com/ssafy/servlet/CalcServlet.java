package com.ssafy.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssafy.model.CalcService;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet("/calc/calculator")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String p1 = request.getParameter("num1");
		String p2 = request.getParameter("num2");
		System.out.println(p1+" : "+p2);
		// Controller로써의 Servlet
		// 역활 1. 입력 파라미터에 대한 검증
		if(p1==null || p1.equals("") || p2==null || p2.equals("")) {
			// 역활2: 뷰 페이지 연동
			// 원래의 페이지로 이동
			response.sendRedirect("calcpage.html");
		}else {
			// 계산 처리
			// 역할 3: 모델에 데이터 처리 요청
			int num1 = Integer.parseInt(p1);
			int num2 = Integer.parseInt(p2);
			int result = CalcService.getService().add(num1, num2);
			// 역활2: 뷰 페이지 연동
			request.setAttribute("result", result);	// 추가적인 데이터
			RequestDispatcher disp = request.getRequestDispatcher("calcresult.jsp");
			// forward는 request, response가 그대로 전달된다.!!!
			disp.forward(request, response);
		}
		
	}

}
