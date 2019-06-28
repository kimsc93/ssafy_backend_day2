package work.com.ssafy.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import work.com.ssafy.model.Book;
import work.com.ssafy.model.BookService;
import work.com.ssafy.model.LoginService;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/work/main")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		// 로그인 가능 여부를 모델에게 확인
		boolean result = LoginService.getService().login(id, pass);
		// 페이지 분기 처리
		if (result) {
			request.setAttribute("id", id);
			RequestDispatcher disp = request.getRequestDispatcher("LoginSuccess.jsp");
			disp.forward(request, response);
		}else {
			request.setAttribute("msg", "아이디 또는 패스워드가 다릅니다.");
			RequestDispatcher disp = request.getRequestDispatcher("Error.jsp");
			disp.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String isbn = request.getParameter("isbn1") + "-" + request.getParameter("isbn2") + "-" + request.getParameter("isbn3");
		String title = request.getParameter("title");
		String cat = request.getParameter("category");
		String country = request.getParameter("country");
		String pubDate = request.getParameter("date");

		String publisher = request.getParameter("publisher");

		String author = request.getParameter("author");
		String price = request.getParameter("price");
		String unit = request.getParameter("unit");
		String desc = request.getParameter("desc");
		
		// model 연동
		Book book = BookService.getService().makeBook(title, isbn, cat, country, pubDate, publisher, author, price, unit, desc);
		request.setAttribute("book", book);
		// 페이지 이동
		RequestDispatcher disp = request.getRequestDispatcher("Result.jsp");
		disp.forward(request, response);
	}

}
