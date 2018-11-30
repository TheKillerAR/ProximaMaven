package Util;

import dto.SedeDTO;
import model.Sede;

public class ConvSede {

	public static SedeDTO convertSede(Sede sed) {

		SedeDTO sdt = new SedeDTO();

		sdt.setIdsede(sed.getIdsede());
		sdt.setNomesede(sed.getNomesede());
		sdt.setVia(sed.getVia());
		sdt.setCitta(sed.getCitta());
		sdt.setCap(sed.getCap());

		return sdt;
	}

}
