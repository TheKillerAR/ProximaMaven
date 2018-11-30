package ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dao.SedeDAO;
import dto.SedeDTO;

@Stateless
@LocalBean
public class Sede_ejb implements Sede_ejbRemote, Sede_ejbLocal {

	@PersistenceContext(unitName = "Hib4PU")
	private EntityManager em;

	public Sede_ejb() {

	}

	public boolean insertSedejpa(SedeDTO sdto) {
		SedeDAO sd = new SedeDAO(em);
		modeljpa.Sede sjpa = new modeljpa.Sede();
		sjpa.setIdsede(sdto.getIdsede());
		sjpa.setNomesede(sdto.getNomesede());
		sjpa.setVia(sdto.getVia());
		sjpa.setCitta(sdto.getCitta());
		sjpa.setCap(sdto.getCap());
		sd.insertSedejpa(sjpa);
		return true;
	}
	
	public boolean updateSedejpa(SedeDTO sdto){
		SedeDAO sd = new SedeDAO(em);
		modeljpa.Sede sjpa = new modeljpa.Sede();
		sjpa.setIdsede(sdto.getIdsede());
		sjpa.setNomesede(sdto.getNomesede());
		sjpa.setVia(sdto.getVia());
		sjpa.setCitta(sdto.getCitta());
		sjpa.setCap(sdto.getCap());
		sd.updateSedejpa(sjpa);
		return true;
	}
	
	public SedeDTO cercaId(int idsede) {
		SedeDAO sd = new SedeDAO(em);
		modeljpa.Sede sjpa = new modeljpa.Sede();
		sjpa = sd.cercaId(idsede);
		SedeDTO sdto = new SedeDTO();
		sdto.setIdsede(sjpa.getIdsede());
		sdto.setNomesede(sjpa.getNomesede());
		sdto.setVia(sjpa.getVia());
		sdto.setCitta(sjpa.getCitta());
		sdto.setCap(sjpa.getCap());
		return sdto;
	}
}
//
//	@Override
//	public boolean aggiornaSede(int arg0, String arg1, String arg2, String arg3, int arg4) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean cancellaSede(int arg0) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public SedeDTO cercaIdsede(int arg0) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public boolean inserisciSede(int arg0, String arg1, String arg2, String arg3, int arg4) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public ArrayList<SedeDTO> mostraSede() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//}
//
//	public ArrayList<SedeDTO> mostraSede() {
//
//		SedeDAO sd = new SedeDAO();
//
//		ArrayList<SedeDTO> sdt = new ArrayList<SedeDTO>();
//		ArrayList<Sede> sr;
//
//		try {
//
//			sr = sd.mostraSede();
//			for (Sede s : sr) {
//				SedeDTO sdto = new SedeDTO();
//				sdto.setIdsede(s.getIdsede());
//				sdto.setNomesede(s.getNomesede());
//				sdto.setVia(s.getVia());
//				sdto.setCitta(s.getCitta());
//				sdto.setCap(s.getCap());
//
//				sdt.add(sdto);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} catch (NamingException e) {
//			e.printStackTrace();
//		}
//		return sdt;
//	}
//
//	public SedeDTO cercaIdsede(int idsede) {
//		SedeDAO dao = new SedeDAO();
//
//		try {
//			return ConvSede.convertSede(dao.cercaIdsede(idsede));
//		} catch (SQLException e) {
//
//			e.printStackTrace();
//		} catch (NamingException e) {
//
//			e.printStackTrace();
//		}
//		return null;
//
//	}
//
//	public boolean aggiornaSede(int idsede, String nomesede, String via, String citta, int cap) {
//		SedeDAO dao = new SedeDAO();
//
//		try {
//			dao.aggiornaSede(idsede, nomesede, via, citta, cap);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} catch (NamingException e) {
//			e.printStackTrace();
//		}
//
//		return true;
//	}
//
//	public boolean inserisciSede(int idsede, String nomesede, String via, String citta, int cap) {
//
//		SedeDAO s = new SedeDAO();
//
//		s.inserisciSede(idsede, nomesede, via, citta, cap);
//
//		return true;
//	}
//
//	public boolean cancellaSede(int idsede) {
//
//		SedeDAO s = new SedeDAO();
//
//		s.cancellaSede(idsede);
//
//		return true;
//	}
//}