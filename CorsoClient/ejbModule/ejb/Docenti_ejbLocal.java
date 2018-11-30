package ejb;

import javax.ejb.Local;

import dto.DocentiDTO;

@Local
public interface Docenti_ejbLocal {
	
	public boolean insertDocentijpa(DocentiDTO ddto);
	
	public boolean updateDocentijpa(DocentiDTO ddto);
	
	public DocentiDTO cercaId(int iddocente);
	
//	public ArrayList<DocentiDTO> mostraDocenti();
//
//	public DocentiDTO cercaIddocente(int iddocente);
//
//	public boolean aggiornaDocente(int iddocente, String nome, String cognome, String cf);
//
//	public boolean inserisciDocente(int iddocente, String nome, String cognome, String cf);
//
//	public boolean cancellaDocente(int iddocente); 

}
