package ejb;

import javax.ejb.Remote;

import dto.SedeDTO;

@Remote
public interface Sede_ejbRemote {
	
	public boolean insertSedejpa(SedeDTO sdto);
	
	public boolean updateSedejpa(SedeDTO sdto);
	
	public SedeDTO cercaId(int idsede);

//	public ArrayList<SedeDTO> mostraSede();
//
//	public SedeDTO cercaIdsede(int idsede);
//
//	public boolean aggiornaSede(int idsede, String nomesede, String via, String citta, int cap);
//
//	public boolean inserisciSede(int idsede, String nomesede, String via, String citta, int cap);
//
//	public boolean cancellaSede(int idsede);
}
