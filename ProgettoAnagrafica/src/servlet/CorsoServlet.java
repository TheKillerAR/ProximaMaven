package servlet;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.CorsoDTO;
import ejb.Corso_ejbRemote;


@WebServlet("/CorsoServlet")
public class CorsoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Resource(mappedName = "java:jboss/exported/ProgettoEAR/ProgettoCorso/Corso_ejb!ejb.Corso_ejbRemote")
	private Corso_ejbRemote corejbr;
       

    public CorsoServlet() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String fn = request.getParameter("funzione");
		
		if (fn.equals("inserisci")) {
			
			String descrizione = request.getParameter("descrizione");
						
			CorsoDTO cdto = new CorsoDTO();
			
			cdto.setDescrizione(descrizione);
			
			corejbr.insertCorsojpa(cdto);
		
		}else if (fn.equals("aggiorna")){
			
			String descrizione = request.getParameter("descrizione");
			
			CorsoDTO cdto = new CorsoDTO();
			
			cdto.setDescrizione(descrizione);
			
			corejbr.updateCorsojpa(cdto);			
						
		}else if(fn.equals("cercaid")) {
			
			int idcorso = Integer.parseInt(request.getParameter("idcorso")); 
		
		}
//		else if(fn.equals("elimina")) {}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
