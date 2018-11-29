package Util;

import dto.FrequenzaDTO;
import model.Frequenza;

public class ConvFrequenza {
	
	public static FrequenzaDTO convertFrequenza(Frequenza fre){
		
		FrequenzaDTO frt = new FrequenzaDTO();
		
		frt.setIdfrequenza(fre.getIdfrequenza());
		frt.setIdedizione(fre.getIdedizione());
		frt.setIdimp(fre.getIdimp());
		
		return frt;
	}

}