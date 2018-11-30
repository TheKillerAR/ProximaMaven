package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
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

		String funzione = request.getParameter("funzione");
		
//		System.out.println("la fuzione è "+funzione);

		if (funzione.equals("inserisci")) {

			String cf = request.getParameter("cf");
			String nome = request.getParameter("nome");
			String cognome = request.getParameter("cognome");

			Impiegato imp = new Impiegato(0, cf, nome, cognome);

			try {

				ImpiegatoDao.insert(imp);
				
				request.getRequestDispatcher("/jspIMPIEGATO/rsinserisciimpiegato.jsp").forward(request, response);
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		else if (funzione.equals("cercaid")) {

			int id = Integer.parseInt(request.getParameter("id"));
			try {
				Impiegato impCercato = ImpiegatoDao.searchId(id);
				ArrayList<Impiegato> listaImpiegato = new ArrayList<Impiegato>();
				listaImpiegato.add(impCercato);
				request.getSession().setAttribute("listaImp", listaImpiegato);
				request.getRequestDispatcher("/jspIMPIEGATO/rsmostratuttiimpiegati.jsp").forward(request, response);
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		else if (funzione.equals("mostratutti")) {
			ArrayList<Impiegato> listaimpiegati = null;
			try {
				
			listaimpiegati = ImpiegatoDao.getImpiegati();
			
			request.getSession().setAttribute("listaImp", listaimpiegati);
			
			request.getRequestDispatcher("/jspIMPIEGATO/rsmostratuttiimpiegati.jsp").forward(request, response);
			
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}

		else if (funzione.equals("cercanome")) {

			String nome = request.getParameter("nome");
			
			ArrayList<Impiegato> listaimpiegati = null;
			
			try {
				listaimpiegati = ImpiegatoDao.searchNome(nome);
				
				request.getSession().setAttribute("listaImp", listaimpiegati);
				
				request.getRequestDispatcher("/jspIMPIEGATO/rsmostratuttiimpiegati.jsp").forward(request, response);
				
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		else if (funzione.equals("cercacognome")) {

			String cognome = request.getParameter("cognome");
			
			ArrayList<Impiegato> listaimpiegati = null;
			
			try {
				listaimpiegati = ImpiegatoDao.searchCognome(cognome);
				
				request.getSession().setAttribute("listaImp", listaimpiegati);
				
				request.getRequestDispatcher("/jspIMPIEGATO/rsmostratuttiimpiegati.jsp").forward(request, response);
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		else if (funzione.equals("cercacf")) {

			String cf = request.getParameter("cf");
			
			ArrayList<Impiegato> listaimpiegati = null;
			
			try {
				Impiegato impCercato = ImpiegatoDao.searchCf(cf);
				ArrayList<Impiegato> listaImpiegato = new ArrayList<Impiegato>();
				listaImpiegato.add(impCercato);
				
				request.getSession().setAttribute("listaImp", listaImpiegato);
				
				request.getRequestDispatcher("/jspIMPIEGATO/rsmostratuttiimpiegati.jsp").forward(request, response);
				
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
