package Util;

import dto.CorsoDTO;
import model.Corso;

public class ConvCorso {
	
	public static CorsoDTO convertCorso(Corso cor){
		
		CorsoDTO cdt = new CorsoDTO();
	
		cdt.setIdcorso(cor.getIdcorso());
		cdt.setDescrizione(cor.getDescrizione());
		
		return cdt;
	}
}