package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProvaServlet
 */
@WebServlet("/ProvaServlet")
public class ProvaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProvaServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		System.out.println("cognome da doget:" + request.getParameter("cognome"));

		response.getWriter().append("tutto ok ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("cognome da dopost:" + request.getParameter("cognome"));

		 request.getRequestDispatcher("/success.jsp").forward(request, response);
		 
		 
		 
//		 request.getSession().setAttribute("tipoOper", tipoO);
//		 
//		 
//		 request.getSession().getAttribute("tipoOper"
//		 		+ "")
//		 response.sendRedirect("/success.jsp");
	}
	

}
