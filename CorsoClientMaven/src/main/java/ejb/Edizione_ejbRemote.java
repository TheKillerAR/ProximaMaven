package ejb;

import javax.ejb.Remote;

import dto.EdizioneDTO;

@Remote
public interface Edizione_ejbRemote {
	
	public boolean insertEdizionejpa( EdizioneDTO edto);
	
	public boolean updateEdizionejpa( EdizioneDTO edto);
	
	public  EdizioneDTO cercaId(int idedizione);

//	public ArrayList<EdizioneDTO> mostraEdizione();
//
//	public EdizioneDTO cercaIdedizione(int idedizione);
//
//	public boolean aggiornaEdizione(int idedizione, int numero, int idcorso, int idsede, int iddocente, Date datain,
//			Date datafi);
//
//	public boolean inserisciEdizione(int idedizione, int numero, int idcorso, int idsede, int iddocente, Date datain,
//			Date datafi);
//
//	public boolean cancellaEdizione(int idedizione);

}
