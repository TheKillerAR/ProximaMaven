package servlet;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.DocentiDTO;
import ejb.Docenti_ejbRemote;

@WebServlet("/DocentiServlet")
public class DocentiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Resource(mappedName = "java:jboss/exported/ProgettoEAR/ProgettoCorso/Docenti_ejb!ejb.Docenti_ejbRemote")
	private Docenti_ejbRemote docejbr;
       
    public DocentiServlet() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String fn = request.getParameter("funzione");
		
		if (fn.equals("inserisci")) {
			
			String nome = request.getParameter("nome");
			String cognome = request.getParameter("cognome");
			String cf = request.getParameter("cf");
			
			DocentiDTO ddto = new DocentiDTO();
			
			ddto.setNome(nome);
			ddto.setCognome(cognome);
			ddto.setCf(cf);
			
			docejbr.insertDocentijpa(ddto);			
		}else if(fn.equals("aggiorna")){
			
			String nome = request.getParameter("nome");
			String cognome = request.getParameter("cognome");
			String cf = request.getParameter("cf");
			
			DocentiDTO ddto = new DocentiDTO();
			
			ddto.setNome(nome);
			ddto.setCognome(cognome);
			ddto.setCf(cf);
			
			docejbr.updateDocentijpa(ddto);
		}else if(fn.equals("cercaid")) {
			
			int iddocente = Integer.parseInt(request.getParameter("iddocente")); 
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
