package ejb;

import javax.ejb.Remote;

import dto.FrequenzaDTO;

@Remote
public interface Frequenza_ejbRemote {
	
	public boolean insertFrequenzajpa(FrequenzaDTO fdto);
	
	public boolean updateFrequenzajpa(FrequenzaDTO fdto);
	
	public FrequenzaDTO cercaId(int idfrequenza);

//	public ArrayList<FrequenzaDTO> mostraFrequenza();
//
//	public FrequenzaDTO cercaIdfrequenza(int idfrequenza);
//
//	public boolean inserisciFrequenza(int idfrequenza, int idedizione, int idimp);
//
//	public boolean aggiornaFrequenza(int idfrequenza, int idedizione, int idimp);
//
//	public boolean cancellaFrequenza(int idfrequenza);

}
