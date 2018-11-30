package WebService;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.jws.WebService;
import javax.naming.NamingException;
import javax.xml.datatype.XMLGregorianCalendar;

import dao.ContoDAO;
import model.Corso;
import model.Util;

@WebService

public class WebServiceConto {

	public ResponseMostraConti mostraConti() {

		ArrayList<Corso> co = new ArrayList<Corso>();

		ResponseMostraConti rmc = new ResponseMostraConti();

		rmc.setResult("OK");
		rmc.setErrorCode(0);

		return rmc;
	}

	public ResponseCercaIdConto cercaIdconto(int idconto) throws SQLException, NamingException {

		Corso co = ContoDAO.cercaIdconto(idconto);

		ResponseCercaIdConto cic = new ResponseCercaIdConto();

		if (co.getIdconto() != 0) {
			cic.setResult("OK");
			System.out.println("Corretto");
		}

		else if (co.getIdconto() == 0) {
			cic.setErrorDesc("Errore");
			cic.setErrorCode(13);
			cic.setResult("KO");
			System.out.println("Error");

		} else if (co.getIdconto() < 0) {
			cic.setErrorDesc("Errore");
			cic.setErrorCode(14);
			cic.setResult("KO");
			System.out.println("l'id del conto deve essere positivo");
		}

		return cic;
	}

	public ResponseConto cercaIdimpiegato(int idimpiegato) throws SQLException, NamingException {
		Corso co = ContoDAO.cercaIdimpiegato(idimpiegato);

		ResponseConto rc = new ResponseConto();

		if (co.getIdimpiegato() != 0) {
			rc.setResult("OK");
			rc.setCo(co);
			System.out.println("Corretto");
		}

		else if (co.getIdimpiegato() == 0) {
			rc.setErrorDesc("Errore");
			rc.setErrorCode(3);
			rc.setResult("KO");
			System.out.println("Error");

		} else if (co.getIdimpiegato() < 0) {
			rc.setErrorDesc("Errore");
			rc.setErrorCode(4);
			rc.setResult("KO");
			System.out.println("l'id dell'impiegato deve essere positivo");
		}

		return rc;
	}

	public ResponseBase inserisciConto(int idimpiegato, double saldo, XMLGregorianCalendar datainizio) {

		try {

			ContoDAO.inserisciConto(idimpiegato, saldo, Util.xmlToSqlDate(datainizio));

			ResponseBase rb = new ResponseBase();

			rb.setResult("OK");
			rb.setErrorCode(0);
			rb.setErrorDesc("Conto Salvato nel DataBase");
			System.out.println("OK");

		} catch (Exception e) {
			ResponseBase rb = new ResponseBase();
			rb.setErrorDesc("Errore");
			rb.setErrorCode(14);
			rb.setResult("KO");
			e.printStackTrace();
			return null;

		}

		return null;
	}
}