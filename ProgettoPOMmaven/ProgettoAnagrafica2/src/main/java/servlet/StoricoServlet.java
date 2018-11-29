package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StoricoDao;

import model.Storico;

public class StoricoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public StoricoServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());

		String funzione = request.getParameter("funzione");

		if (funzione.equals("inserisci")) {

			String datainizio2 = request.getParameter("datainizio");
			String datafine2 = request.getParameter("datafine");
			String idruolo2 = request.getParameter("idruolo");
			String idimpiegato2 = request.getParameter("idimpiegato");

			Storico sto = new Storico();

			int datainizio = Integer.parseInt(datainizio2);
			int datafine = Integer.parseInt(datafine2);
			int idruolo = Integer.parseInt(idruolo2);
			int idimpiegato = Integer.parseInt(idimpiegato2);

			try {
				StoricoDao std = new StoricoDao();

				std.insert(datainizio, datafine, idruolo, idimpiegato);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else if (funzione.equals("elimina")) {

			int id = Integer.parseInt(request.getParameter("id"));

			try {

				StoricoDao std = new StoricoDao();

				std.delete(id);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

//		else if (funzione.equals("cercaid")) {
//
//			int id = Integer.parseInt(request.getParameter("id"));
//			try {
//				StoricoDao.searchId(id);
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}

//		else if (funzione.equals("mostratutti")) {
//			ArrayList<Impiegato> listaimpiegati = null;
//			try {
//
//				listaimpiegati = ImpiegatoDao.getImpiegati();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//			request.getSession().setAttribute("listaimpiegati", listaimpiegati);
//		}
//
//		else if (funzione.equals("cercanome")) {
//
//			String nome = request.getParameter("nome");
//			try {
//				ImpiegatoDao.searchNome(nome);
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//
//		else if (funzione.equals("cercacognome")) {
//
//			String cognome = request.getParameter("cognome");
//			try {
//				ImpiegatoDao.searchCognome(cognome);
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//
//		else if (funzione.equals("aggiorna")) {
//
//			int id = Integer.parseInt(request.getParameter("id"));
//			String cf = request.getParameter("cf");
//			String nome = request.getParameter("nome");
//			String cognome = request.getParameter("cognome");
//
//			try {
//				ImpiegatoDao.update(id, cf, nome, cognome);
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//
//		}
//	}
//

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
