package ejb;

import dto.CorsoDTO;

import javax.ejb.Local;

@Local
public interface Corso_ejbLocal {
	
	public boolean insertCorsojpa(CorsoDTO cdto);
	
	public boolean updateCorsojpa(CorsoDTO cdto);
	
	public CorsoDTO cercaId(int idcorso);

//	public ArrayList<CorsoDTO> mostraCorso();
//	public CorsoDTO cercaIdcorso(int idcorso);
//	public boolean aggiornaCorso(int idcorso, String descrizione);
//	public boolean inserisciCorso(int idcorso, String descrizione);
//	public boolean cancellaCorso(int idcorso);
	
}
