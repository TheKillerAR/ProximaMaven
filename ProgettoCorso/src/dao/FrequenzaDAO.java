package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.sql.DataSource;

import model.Frequenza;

public class FrequenzaDAO {
	
	private EntityManager em;
	
	public FrequenzaDAO() {

	}

	public FrequenzaDAO(EntityManager em) {
		super();
		this.em = em;
	}
	
	public boolean insertFrequenzajpa(modeljpa.Frequenza f){
		em.persist(f);
		return true;
	}
	
	public boolean updateFreqeunzajpa(modeljpa.Frequenza f){
		em.merge(f);
		return true;
	}
	
public modeljpa.Frequenza cercaId(int idfrequenza){
		
		return em.find(modeljpa.Frequenza.class, idfrequenza);
	}

	public ArrayList<Frequenza> mostraFrequenza() throws SQLException, NamingException {

		Connection con = ((DataSource) new InitialContext().lookup("java:jboss/datasources/CORSO")).getConnection();

		ArrayList<Frequenza> frList = new ArrayList<Frequenza>();

		String qry = "SELECT * FROM frequenza";

		PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(qry);

		ResultSet res = preparedStatement.executeQuery();

		while (res.next()) {

			Frequenza fr = new Frequenza();

			fr.setIdfrequenza(res.getInt("idfrequenza"));
			fr.setIdedizione(res.getInt("idedizione"));
			fr.setIdimp(res.getInt("idimp"));

			fr.add(fr);
		}

		return frList;

	}

	public Frequenza cercaIdfrequenza(int idfrequenza) throws SQLException, NamingException {

		Connection con = ((DataSource) new InitialContext().lookup("java:jboss/datasources/CORSO")).getConnection();

		Frequenza fr = new Frequenza();

		String qry = "SELECT * FROM frequenza WHERE idfrequenza = ?";

		PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(qry);

		preparedStatement.setInt(1, idfrequenza);

		ResultSet res = preparedStatement.executeQuery();

		if (res.next()) {
			fr.setIdfrequenza(idfrequenza);
			fr.setIdedizione(res.getInt("idedizione"));
			fr.setIdimp(res.getInt("idimp"));
		}

		return fr;
	}

	public boolean aggiornaFrequenza(int idfrequenza, int idedizione, int idimp) throws SQLException, NamingException {

		Connection con = ((DataSource) new InitialContext().lookup("java:jboss/datasources/CORSO")).getConnection();

		String qry = "SELECT * INTO frequenza (idfrequenza, idedizione, idimp) VALUES (?, ?, ?)";

		PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(qry);

		preparedStatement.setInt(1, idfrequenza);
		preparedStatement.setInt(2, idedizione);
		preparedStatement.setInt(3, idimp);

		preparedStatement.executeUpdate();

		System.out.println("Modifica effettuata");

		return true;

	}

	public boolean inserisciFrequenza(int idfrequenza, int idedizione, int idimp) {

		try {
			Connection con = ((DataSource) new InitialContext().lookup("java:jboss/datasources/CORSO")).getConnection();

			String qry = "INSERT INTO frequenza (idfrequenza, idedizione, idimp) VALUES (?, ?, ?)";

			PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(qry);

			preparedStatement.setInt(1, idfrequenza);
			preparedStatement.setInt(2, idedizione);
			preparedStatement.setInt(3, idimp);

			preparedStatement.executeUpdate();

			return true;

		} catch (SQLException e) {

			e.printStackTrace();
		} catch (NamingException e) {

			e.printStackTrace();
		}
		return false;
	}

	public boolean cancellaFrequenza(int idfrequenza) {

		try {
			Connection con = ((DataSource) new InitialContext().lookup("java:jboss/datasources/CORSO")).getConnection();

			String qry = "DELETE FROM frequenza WHERE idfrequenza =?";

			PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(qry);

			preparedStatement.executeUpdate();

			return true;

		} catch (SQLException | NamingException e) {

			e.printStackTrace();
		}

		return false;

	}
}