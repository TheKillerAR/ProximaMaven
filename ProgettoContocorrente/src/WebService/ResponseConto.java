package WebService;

import model.Corso;

public class ResponseConto extends ResponseBase {

	private static final long serialVersionUTD = 1L;

	private Corso co;

	public Corso getCo() {
		return co;
	}

	public void setCo(Corso co) {
		this.co = co;
	}
}
