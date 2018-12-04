package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ImpiegatoDao;
import dto.CorsoDTO;
import ejb.Corso_ejbRemote;
import model.Impiegato;


@WebServlet("/CorsoServlet")
public class CorsoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Resource(mappedName = "java:jboss/exported/ProgettoEARmaven-0.0.1-SNAPSHOT/ProgettoCorso2-0.0.1-SNAPSHOT/Corso_ejb!ejb.Corso_ejbRemote")
	private Corso_ejbRemote corejbr;
       

    public CorsoServlet() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		String fn = request.getParameter("funzione");
		
		if (fn.equals("inserisci")) {
			
			String descrizione = request.getParameter("descrizione");
						
			CorsoDTO cdto = new CorsoDTO();
			
			cdto.setDescrizione(descrizione);
			
			corejbr.insertCorsojpa(cdto);
			
			request.getRequestDispatcher("/jspCORSO/rsinseriscicorsi.jsp").forward(request, response);
		
		}else if (fn.equals("aggiorna")){
			
			String descrizione = request.getParameter("descrizione");
			
			CorsoDTO cdto = new CorsoDTO();
			
			cdto.setDescrizione(descrizione);
			
			corejbr.updateCorsojpa(cdto);			
						
		}else if(fn.equals("cercaid")) {
			
			int idcorso = Integer.parseInt(request.getParameter("idcorso"));
		
			CorsoDTO corCercato = corejbr.cercaId(idcorso);
			ArrayList<CorsoDTO> listaCorso = new ArrayList<CorsoDTO>();
			listaCorso.add(corCercato);
			request.getSession().setAttribute("listaCorso", listaCorso);
			request.getRequestDispatcher("/jspCORSO/rsmostratutticorsi.jsp").forward(request, response);
		
	}
}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
