package ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dao.EdizioneDAO;
import dto.EdizioneDTO;
import modeljpa.Corso;
import modeljpa.Docenti;
import modeljpa.Sede;

@Stateless
@LocalBean
public class Edizione_ejb implements Edizione_ejbRemote, Edizione_ejbLocal {
	
	@PersistenceContext(unitName= "Hib4PU")
	private EntityManager em;
	
	public Edizione_ejb() {
	}

	public boolean insertEdizionejpa(EdizioneDTO edto){
		EdizioneDAO ed = new EdizioneDAO(em);
		modeljpa.Edizione ejpa = new modeljpa.Edizione();
		ejpa.setIdedizione(edto.getIdedizione());
		ejpa.setNumero(edto.getNumero());
		ejpa.setCorso(em.find(Corso.class, edto.getIdcorso()));
		ejpa.setSede(em.find(Sede.class, edto.getIdcorso()));
		ejpa.setDocenti(em.find(Docenti.class, edto.getIddocente()));
		ejpa.setDatain(edto.getDatain());
		ejpa.setDatafi(edto.getDatafi());
		ed.insertEdizionejpa(ejpa);
		return true;
	}
	
	public boolean updateEdizionejpa(EdizioneDTO edto){
		EdizioneDAO ed = new EdizioneDAO(em);
		modeljpa.Edizione ejpa = new modeljpa.Edizione();
		ejpa.setIdedizione(edto.getIdedizione());
		ejpa.setNumero(edto.getNumero());
		ejpa.setCorso(em.find(Corso.class, edto.getIdcorso()));
		ejpa.setSede(em.find(Sede.class, edto.getIdcorso()));
		ejpa.setDocenti(em.find(Docenti.class, edto.getIddocente()));
		ejpa.setDatain(edto.getDatain());
		ejpa.setDatafi(edto.getDatafi());
		ed.updateEdizione(ejpa);
		return true;
	}
	
	public EdizioneDTO cercaId(int idedizione) {
		EdizioneDAO ed = new EdizioneDAO(em);
		modeljpa.Edizione ejpa = new modeljpa.Edizione();
		ejpa = ed.cercaId(idedizione);
		EdizioneDTO edto = new EdizioneDTO();
		edto.setIdedizione(ejpa.getIdedizione());
		edto.setNumero(ejpa.getNumero());
		edto.setIdcorso(ejpa.getCorso().getIdcorso());
		edto.setIdsede(ejpa.getSede().getIdsede());
		edto.setIddocente(ejpa.getDocenti().getIddocente());
		edto.setDatain(ejpa.getDatain());
		edto.setDatafi(ejpa.getDatafi());
		return edto;
	}

}

//	@Override
//	public boolean aggiornaEdizione(int arg0, int arg1, int arg2, int arg3, int arg4, java.util.Date arg5,
//			java.util.Date arg6) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean cancellaEdizione(int arg0) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public EdizioneDTO cercaIdedizione(int arg0) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public boolean inserisciEdizione(int arg0, int arg1, int arg2, int arg3, int arg4, java.util.Date arg5,
//			java.util.Date arg6) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public ArrayList<EdizioneDTO> mostraEdizione() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//}
//	public ArrayList<EdizioneDTO> mostraEdizione() {
//
//		EdizioneDAO ed = new EdizioneDAO();
//
//		ArrayList<EdizioneDTO> edt = new ArrayList<EdizioneDTO>();
//		ArrayList<Edizione> ez;
//
//		try {
//			ez = ed.mostraEdizione();
//			for (Edizione e : ez) {
//				EdizioneDTO edto = new EdizioneDTO();
//
//				edto.setIdedizione(e.getIdedizione());
//				edto.setNumero(e.getNumero());
//				edto.setIdcorso(e.getIdcorso());
//				edto.setIdsede(e.getIdsede());
//				edto.setIddocente(e.getIddocente());
//				edto.setDatain(e.getDatain());
//				edto.setDatafi(e.getDatafi());
//
//				edt.add(edto);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} catch (NamingException e) {
//			e.printStackTrace();
//		}
//		return edt;
//
//	}
//
//	public EdizioneDTO cercaIdedizione(int idedizione) {
//		EdizioneDAO dao = new EdizioneDAO();
//
//		try {
//			return ConvEdizione.convertEdizione(dao.cercaIdedizione(idedizione));
//		} catch (SQLException e) {
//
//			e.printStackTrace();
//		} catch (NamingException e) {
//
//			e.printStackTrace();
//		}
//		return null;
//	}
//
//	public boolean aggiornaEdizione(int idedizione, int numero, int idcorso, int idsede, int iddocente, Date datain,
//			Date datafi) {
//		EdizioneDAO dao = new EdizioneDAO();
//		try {
//			dao.aggiornaEdizione(idedizione, numero, idcorso, idsede, iddocente, datain, datafi);
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} catch (NamingException e) {
//			e.printStackTrace();
//		}
//
//		return true;
//	}
//
//	public boolean inserisciEdizione(int idedizione, int numero, int idcorso, int idsede, int iddocente, Date datain,
//			Date datafi) {
//
//		EdizioneDAO e = new EdizioneDAO();
//
//		e.inserisciEdizione(idedizione, numero, idcorso, idsede, iddocente, datain, datafi);
//
//		return true;
//	}
//
//	public boolean cancellaCorso(int idedizione) {
//
//		EdizioneDAO e = new EdizioneDAO();
//
//		e.cancellaEdizione(idedizione);
//
//		return true;
//	}