package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ImpiegatoDao;
import model.Impiegato;

@WebServlet("/ImpiegatoServlet")
public class ImpiegatoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ImpiegatoServlet() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());

		String funzione = request.getParameter("funzione");

		if (funzione.equals("inserisci")) {

			String cf = request.getParameter("cf");
			String nome = request.getParameter("nome");
			String cognome = request.getParameter("cognome");

			Impiegato imp = new Impiegato(0, cf, nome, cognome);

			try {

				ImpiegatoDao.insert(imp);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		else if (funzione.equals("cercaid")) {

			int id = Integer.parseInt(request.getParameter("id"));
			try {
				ImpiegatoDao.searchId(id);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		else if (funzione.equals("mostratutti")) {
			ArrayList<Impiegato> listaimpiegati = null;
			try {
				
			listaimpiegati = ImpiegatoDao.getImpiegati();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			request.getSession().setAttribute("listaimpiegati", listaimpiegati);
		}

		else if (funzione.equals("cercanome")) {

			String nome = request.getParameter("nome");
			try {
				ImpiegatoDao.searchNome(nome);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		else if (funzione.equals("cercacognome")) {

			String cognome = request.getParameter("cognome");
			try {
				ImpiegatoDao.searchCognome(cognome);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		else if (funzione.equals("aggiorna")) {

			int id = Integer.parseInt(request.getParameter("id"));
			String cf = request.getParameter("cf");
			String nome = request.getParameter("nome");
			String cognome = request.getParameter("cognome");

			try {
				ImpiegatoDao.update(id, cf, nome, cognome);
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}

	// else if (funzione.equals("elimina")) {
	//
	// int id = Integer.parseInt(request.getParameter("id"));
	//
	// try {
	// ImpiegatoDao.delete(id);
	// } catch (SQLException e) {
	// e.printStackTrace();
	// }
	// }
	// }
	//
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);

	}
}
