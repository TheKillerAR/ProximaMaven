package model;

public class Frequenza {

	private int idfrequenza;
	private int idedizione;
	private int idimp;
	
public Frequenza(){
		
	}
	
	public Frequenza(int idfrequenza, int idedizione, int idimp) {
		
		this.idfrequenza = idfrequenza;
		this.idedizione = idedizione;
		this.idimp = idimp;
	}

	public int getIdfrequenza() {
		return idfrequenza;
	}

	public void setIdfrequenza(int idfrequenza) {
		this.idfrequenza = idfrequenza;
	}

	public int getIdedizione() {
		return idedizione;
	}

	public void setIdedizione(int idedizione) {
		this.idedizione = idedizione;
	}

	public int getIdimp() {
		return idimp;
	}

	public void setIdimp(int idimp) {
		this.idimp = idimp;
	}

	public void add(Frequenza fr) {
		// TODO Auto-generated method stub
		
	}
	
}
