package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BookDao;

@WebServlet({"/list", "/write", "/update", "/detail", "/delete"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String url = request.getServletPath();
		System.out.println("url=" + url);
		
		BookDao dao = new BookDao(request);
		
		switch (url) {
		case "/write":
			break;
		case "/update":
			break;
		case "/detail":
			break;
		case "/delete":
			break;
		default :
			System.out.println("잘못된 url입니다.");
			break;
		}
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
