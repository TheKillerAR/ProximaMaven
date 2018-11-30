package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.CorsoDTO;
import dto.EdizioneDTO;
import dto.SedeDTO;
import ejb.Sede_ejbRemote;

public class SedeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    @Resource(mappedName = "java:jboss/exported/ProgettoEARmaven-0.0.1-SNAPSHOT/ProgettoCorso2-0.0.1-SNAPSHOT/Sede_ejb!ejb.Sede_ejbRemote")
	private Sede_ejbRemote sedejbr;
    
    public SedeServlet() {
        super();
       }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fn = request.getParameter("funzione");
		
		if (fn.equals("inserisci")) {
		
			String nomesede = request.getParameter("nomesede");			
			String via = request.getParameter("via");
			String citta = request.getParameter("citta");
			String cap2 = request.getParameter("cap");
			
			SedeDTO sdto = new SedeDTO();
			
			int cap = Integer.parseInt(request.getParameter("cap"));
			
			sdto.setNomesede(nomesede);
			sdto.setVia(via);
			sdto.setCitta(citta);
			sdto.setCap(cap);
			
			sedejbr.insertSedejpa(sdto);
			
			request.getRequestDispatcher("/jspCORSO/rsinseriscisedi.jsp").forward(request, response);
			
		}else if (fn.equals("aggiorna")){
			
			String nomesede = request.getParameter("nomesede");			
			String via = request.getParameter("via");
			String citta = request.getParameter("citta");
			String cap2 = request.getParameter("cap");
			
			SedeDTO sdto = new SedeDTO();
			
			int cap = Integer.parseInt(request.getParameter("cap"));
			
			sdto.setNomesede(nomesede);
			sdto.setVia(via);
			sdto.setCitta(citta);
			sdto.setCap(cap);
			
			sedejbr.insertSedejpa(sdto);
			
		}else if(fn.equals("cercaid")) {
			
			int idsede = Integer.parseInt(request.getParameter("idsede"));
			
			SedeDTO sedCercato = sedejbr.cercaId(idsede);
			ArrayList<SedeDTO> listaSede = new ArrayList<SedeDTO>();
			listaSede.add(sedCercato);
			request.getSession().setAttribute("listaSede", listaSede);
			request.getRequestDispatcher("/jspCORSO/rsmostratuttesedi.jsp").forward(request, response);
		
		
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
