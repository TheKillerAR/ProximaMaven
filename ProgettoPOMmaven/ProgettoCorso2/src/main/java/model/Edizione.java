package model;

import java.sql.Date;

public class Edizione {

	private int idedizione;
	private int numero;
	private int idcorso;
	private int idsede;
	private int iddocente;
	private Date datain;
	private Date datafi;
	
public Edizione(){
		
	}

	public Edizione(int idedizione, int numero, int idcorso, int idsede, int iddocente, Date datain, Date datafi) {

		this.idedizione = idedizione;
		this.numero = numero;
		this.idcorso = idcorso;
		this.idsede = idsede;
		this.iddocente = iddocente;
		this.datain = datain;
		this.datafi = datafi;
	}

	public int getIdedizione() {
		return idedizione;
	}

	public void setIdedizione(int idedizione) {
		this.idedizione = idedizione;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getIdcorso() {
		return idcorso;
	}

	public void setIdcorso(int idcorso) {
		this.idcorso = idcorso;
	}

	public int getIdsede() {
		return idsede;
	}

	public void setIdsede(int idsede) {
		this.idsede = idsede;
	}

	public int getIddocente() {
		return iddocente;
	}

	public void setIddocente(int iddocente) {
		this.iddocente = iddocente;
	}

	public Date getDatain() {
		return datain;
	}

	public void setDatain(Date datain) {
		this.datain = datain;
	}

	public Date getDatafi() {
		return datafi;
	}

	public void setDatafi(Date datafi) {
		this.datafi = datafi;
	}

}
