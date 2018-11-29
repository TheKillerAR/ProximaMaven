package WebService;

import java.util.ArrayList;

import javax.jws.WebService;

import model.Movimento;

@WebService

public class WebServiceMovimento {

	public ResponseMostraMovimenti mostraMovimenti() {

		ArrayList<Movimento> mov = new ArrayList<Movimento>();

		ResponseMostraMovimenti rmm = new ResponseMostraMovimenti();

		rmm.setResult("OK");
		rmm.setErrorCode(0);

		return rmm;

	}

}