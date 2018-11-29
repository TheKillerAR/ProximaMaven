package Util;

import dto.DocentiDTO;
import model.Docenti;

public class ConvDocenti {

	public static DocentiDTO convertDocenti(Docenti doc) {

		DocentiDTO ddt = new DocentiDTO();

		ddt.setIddocente(doc.getIddocente());
		ddt.setNome(doc.getNome());
		ddt.setCognome(doc.getCognome());
		ddt.setCf(doc.getCf());

		return ddt;

	}
}