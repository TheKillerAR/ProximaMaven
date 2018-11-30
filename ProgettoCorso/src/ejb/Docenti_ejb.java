package ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dao.DocentiDAO;

import dto.DocentiDTO;


@Stateless
@LocalBean
public class Docenti_ejb implements Docenti_ejbRemote, Docenti_ejbLocal {
	
	@PersistenceContext(unitName= "Hib4PU")
	private EntityManager em;

	public Docenti_ejb() {
	}
	
	public boolean insertDocentijpa(DocentiDTO ddto){
		DocentiDAO dd = new DocentiDAO(em);
		modeljpa.Docenti djpa = new modeljpa.Docenti();
		djpa.setIddocente(ddto.getIddocente());
		djpa.setNome(ddto.getNome());
		djpa.setCognome(ddto.getCognome());
		djpa.setCf(ddto.getCf());
		dd.insertDocentejpa(djpa);
		return true;
	}
	
	public boolean updateDocentijpa(DocentiDTO ddto){
		DocentiDAO dd = new DocentiDAO(em);
		modeljpa.Docenti djpa = new modeljpa.Docenti();
		djpa.setIddocente(ddto.getIddocente());
		djpa.setNome(ddto.getNome());
		djpa.setCognome(ddto.getCognome());
		djpa.setCf(ddto.getCf());
		dd.updateDocentejpa(djpa);
		return true;
	}
	
	public DocentiDTO cercaId(int iddocente) {
		DocentiDAO dd = new DocentiDAO(em);
		modeljpa.Docenti djpa = new modeljpa.Docenti();
		djpa = dd.cercaId(iddocente);
		DocentiDTO ddto = new DocentiDTO();
		ddto.setIddocente(djpa.getIddocente());
		ddto.setNome(djpa.getNome());
		ddto.setCognome(djpa.getCognome());
		ddto.setCf(djpa.getCf());
		return ddto;
		}
}

//	@Override
//	public boolean aggiornaDocente(int arg0, String arg1, String arg2, String arg3) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean cancellaDocente(int arg0) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public DocentiDTO cercaIddocente(int arg0) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public boolean inserisciDocente(int arg0, String arg1, String arg2, String arg3) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public ArrayList<DocentiDTO> mostraDocenti() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//}
//
//	public ArrayList<DocentiDTO> mostraDocenti() {
//		DocentiDAO dd = new DocentiDAO();
//
//		ArrayList<DocentiDTO> ddt = new ArrayList<DocentiDTO>();
//		ArrayList<Docenti> dt;
//
//		try {
//
//			dt = dd.mostraDocenti();
//			for (Docenti d : dt) {
//				DocentiDTO ddto = new DocentiDTO();
//				ddto.setIddocente(d.getIddocente());
//				ddto.setNome(d.getNome());
//				ddto.setCognome(d.getCognome());
//				ddto.setCf(d.getCf());
//
//				ddt.add(ddto);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} catch (NamingException e) {
//			e.printStackTrace();
//		}
//		return ddt;
//	}
//
//	public DocentiDTO cercaIddocente(int iddocente) {
//		DocentiDAO dao = new DocentiDAO();
//		try {
//			return ConvDocenti.convertDocenti(dao.cercaIddocente(iddocente));
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} catch (NamingException e) {
//			e.printStackTrace();
//		}
//		return null;
//	}
//
//	public boolean aggiornaDocente(int iddocente, String nome, String cognome, String cf) {
//		DocentiDAO dao = new DocentiDAO();
//		try {
//			dao.aggiornaDocente(iddocente, nome, cognome, cf);
//		} catch (SQLException e) {
//			e.printStackTrace();
//
//		} catch (NamingException e) {
//			e.printStackTrace();
//		}
//		return true;
//	}
//
//	public boolean inserisciDocente(int iddocente, String nome, String cognome, String cf) {
//		DocentiDAO d = new DocentiDAO();
//
//		d.inserisciDocente(iddocente, nome, cognome, cf);
//
//		return true;
//	}
//
//	public boolean cancellaDocente(int iddocente) {
//
//		DocentiDAO d = new DocentiDAO();
//
//		d.cancellaDocente(iddocente);
//
//		return true;
//	}
//}