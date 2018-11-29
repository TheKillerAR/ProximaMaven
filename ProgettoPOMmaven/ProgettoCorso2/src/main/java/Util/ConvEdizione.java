package Util;

import dto.EdizioneDTO;
import model.Edizione;

public class ConvEdizione {

	public static EdizioneDTO convertEdizione(Edizione edi) {

		EdizioneDTO edt = new EdizioneDTO();

		edt.setIdedizione(edi.getIdedizione());
		edt.setNumero(edi.getNumero());
		edt.setIdcorso(edi.getIdcorso());
		edt.setIdsede(edi.getIdsede());
		edt.setIddocente(edi.getIddocente());
		edt.setDatain(edi.getDatain());
		edt.setDatafi(edi.getDatafi());

		return edt;
	}

}
