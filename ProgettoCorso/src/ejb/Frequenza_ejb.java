package ejb;

import java.sql.SQLException;

import java.util.ArrayList;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import Util.ConvFrequenza;
import dao.FrequenzaDAO;
import dto.FrequenzaDTO;
import model.Frequenza;
import modeljpa.Edizione;

@Stateless
@LocalBean
public class Frequenza_ejb implements Frequenza_ejbRemote, Frequenza_ejbLocal {
	
	@PersistenceContext(unitName= "Hib4PU")
	private EntityManager em;

	public Frequenza_ejb() {
	}
	
	public boolean insertFrequenzajpa(FrequenzaDTO fdto){
		FrequenzaDAO fd = new FrequenzaDAO(em);
		modeljpa.Frequenza fjpa = new modeljpa.Frequenza();
		fjpa.setIdfrequenza(fdto.getIdfrequenza());
		fjpa.setEdizione(em.find(Edizione.class, fdto.getIdedizione()));
		fjpa.setIdimp(fdto.getIdimp());
		fd.insertFrequenzajpa(fjpa);
		return true;
		}
	
	public boolean updateFrequenzajpa(FrequenzaDTO fdto){
		FrequenzaDAO fd = new FrequenzaDAO(em);
		modeljpa.Frequenza fjpa = new modeljpa.Frequenza();
		fjpa.setIdfrequenza(fdto.getIdfrequenza());
		fjpa.setEdizione(em.find(Edizione.class, fdto.getIdedizione()));
		fjpa.setIdimp(fdto.getIdimp());
		fd.updateFreqeunzajpa(fjpa);
		return true;
		}
	
public FrequenzaDTO cercaId(int idfrequenza) {
	FrequenzaDAO fd = new FrequenzaDAO(em);
	modeljpa.Frequenza fjpa = new modeljpa.Frequenza();
	fjpa = fd.cercaId(idfrequenza);
	FrequenzaDTO fdto = new FrequenzaDTO();
	fdto.setIdfrequenza(fjpa.getIdfrequenza());
	fdto.setIdedizione(fjpa.getEdizione().getIdedizione());
	fdto.setIdimp(fjpa.getIdimp());
	return fdto;
	
}


	public ArrayList<FrequenzaDTO> mostraFrequenza() {

		FrequenzaDAO fd = new FrequenzaDAO();

		ArrayList<FrequenzaDTO> fdt = new ArrayList<FrequenzaDTO>();
		ArrayList<Frequenza> fr;

		try {
			fr = fd.mostraFrequenza();
			for (Frequenza f : fr) {
				FrequenzaDTO fdto = new FrequenzaDTO();
				fdto.setIdfrequenza(f.getIdfrequenza());
				fdto.setIdedizione(f.getIdedizione());
				fdto.setIdimp(f.getIdimp());
				fdt.add(fdto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (NamingException e) {
			e.printStackTrace();
		}
		return fdt;
	}

	public FrequenzaDTO cercaIdfrequenza(int idfrequenza) {
		FrequenzaDAO dao = new FrequenzaDAO();
		try {
			return ConvFrequenza.convertFrequenza(dao.cercaIdfrequenza(idfrequenza));
		} catch (SQLException e) {

			e.printStackTrace();
		} catch (NamingException e) {

			e.printStackTrace();
		}
		return null;
	}

	public boolean inserisciFrequenza(int idfrequenza, int idedizione, int idimp) {

		FrequenzaDAO f = new FrequenzaDAO();

		f.inserisciFrequenza(idfrequenza, idedizione, idimp);

		return true;
	}

	public boolean aggiornaFrequenza(int idfrequenza, int idedizione, int idimp) {
		FrequenzaDAO dao = new FrequenzaDAO();
		try {
			return dao.aggiornaFrequenza(idfrequenza, idedizione, idimp);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (NamingException e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean cancellaFrequenza(int idfrequenza) {

		FrequenzaDAO f = new FrequenzaDAO();

		f.cancellaFrequenza(idfrequenza);

		return true;
	}
}