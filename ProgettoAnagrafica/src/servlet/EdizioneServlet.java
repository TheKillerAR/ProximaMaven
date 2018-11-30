package servlet;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.EdizioneDTO;
import ejb.Edizione_ejbRemote;

@WebServlet("/EdizioneServlet")
public class EdizioneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Resource(mappedName = "java:jboss/exported/ProgettoEAR/ProgettoCorso/Edizione_ejb!ejb.Edizione_ejbRemote")
	private Edizione_ejbRemote ediejbr;

    public EdizioneServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String fn = request.getParameter("funzione");
		
		if (fn.equals("inserisci")) {
		
			String numero2 = request.getParameter("numero");			
			String idcorso2 = request.getParameter("idcorso");
			String idsede2 = request.getParameter("idsede");
			String iddocente2 = request.getParameter("iddocente");
			String datain = request.getParameter("datain");
			String datafi = request.getParameter("datafi");
			
			EdizioneDTO edto = new EdizioneDTO();
			
			int numero = Integer.parseInt(request.getParameter("numero"));
			int idcorso = Integer.parseInt(request.getParameter("idcorso"));
			int idsede = Integer.parseInt(request.getParameter("idsede"));
			int iddocente = Integer.parseInt(request.getParameter("iddocente"));
			
			edto.setNumero(numero);
			edto.setIdcorso(idcorso);
			edto.setIdsede(idsede);
			edto.setIddocente(iddocente);
			
			ediejbr.insertEdizionejpa(edto);
			
		}else if (fn.equals("aggiorna")){
			
			String numero2 = request.getParameter("numero");			
			String idcorso2 = request.getParameter("idcorso");
			String idsede2 = request.getParameter("idsede");
			String iddocente2 = request.getParameter("iddocente");
			String datain = request.getParameter("datain");
			String datafi = request.getParameter("datafi");
			
			EdizioneDTO edto = new EdizioneDTO();
			
			int numero = Integer.parseInt(request.getParameter("numero"));
			int idcorso = Integer.parseInt(request.getParameter("idcorso"));
			int idsede = Integer.parseInt(request.getParameter("idsede"));
			int iddocente = Integer.parseInt(request.getParameter("iddocente"));
			
			edto.setNumero(numero);
			edto.setIdcorso(idcorso);
			edto.setIdsede(idsede);
			edto.setIddocente(iddocente);
			
			ediejbr.insertEdizionejpa(edto);
		}else if(fn.equals("cercaid")) {
			
			int idedizione = Integer.parseInt(request.getParameter("idedizione"));
		
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
