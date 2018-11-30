package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.RuoloDao;
import model.Ruolo;

@WebServlet("/RuoloServlet")
public class RuoloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RuoloServlet() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());

		String funzione = request.getParameter("funzione");

		if (funzione.equals("inserisciruolo")) {

			String nomeruolo = request.getParameter("nomeruolo");
			int stipendio = Integer.parseInt(request.getParameter("stipendio"));

			Ruolo role = new Ruolo(0, nomeruolo, stipendio);

			try {
				
				RuoloDao.insert(role);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		else if (funzione.equals("cerca")) {

			int id = Integer.parseInt(request.getParameter("id"));
			try {
				RuoloDao.searchId(id);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		else if (funzione.equals("aggiorna")) {

			String nomeruolo = request.getParameter("nomeruolo");
			int stipendio = Integer.parseInt(request.getParameter("stipendio"));
			int id = Integer.parseInt(request.getParameter("id"));

			try {
				RuoloDao.update(nomeruolo, stipendio, id);
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		else if (funzione.equals("elimina")) {

			int id = Integer.parseInt(request.getParameter("id"));

			try {
				RuoloDao.delete(id);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);

	}

}
