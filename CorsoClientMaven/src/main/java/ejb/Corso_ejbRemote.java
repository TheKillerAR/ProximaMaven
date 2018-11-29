package ejb;

//import java.util.ArrayList;

import javax.ejb.Remote;

import dto.CorsoDTO;

@Remote
public interface Corso_ejbRemote {
	
	public boolean insertCorsojpa(CorsoDTO cdto);
	
	public boolean updateCorsojpa(CorsoDTO cdto);
	
	public CorsoDTO cercaId(int idcorso);
	
//	public ArrayList<CorsoDTO> mostraCorso();
//	public CorsoDTO cercaIdcorso(int idcorso);
//	public boolean aggiornaCorso(int idcorso, String descrizione);
//	public boolean inserisciCorso(int idcorso, String descrizione);
//	public boolean cancellaCorso(int idcorso);

}
