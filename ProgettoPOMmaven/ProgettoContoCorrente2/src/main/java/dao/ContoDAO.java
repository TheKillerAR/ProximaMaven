package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import model.Corso;

public class ContoDAO {

	public static Corso modificaConto(int idconto, int idimpiegato, double saldo, Date datainizio)
			throws SQLException, NamingException {

		Connection con = ((DataSource) new InitialContext().lookup("java:jboss/datasources/contocorrente_roberti")).getConnection();

		Corso co = new Corso();

		String qry = "SELECT * INTO conto (idconto, idimpiegato, saldo, datainizio) VALUES (?, ?, ?, ?)";

		PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(qry);

		preparedStatement.setInt(1, idconto);
		preparedStatement.setInt(2, idimpiegato);
		preparedStatement.setDouble(3, saldo);
		preparedStatement.setDate(4, datainizio);

		preparedStatement.executeUpdate();

		System.out.println("Modifica effettuata");

		return co;

	}

	public static ArrayList<Corso> mostraConti() throws SQLException, NamingException {

		Connection con = ((DataSource) new InitialContext().lookup("java:jboss/datasources/contocorrente_roberti")).getConnection();

		ArrayList<Corso> coList = new ArrayList<Corso>();

		String qry = "SELECT * FROM conto";

		PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(qry);

		ResultSet res = preparedStatement.executeQuery();

		while (res.next()) {

			Corso co = new Corso();

			co.setIdconto(res.getInt("idconto"));
			co.setIdimpiegato(res.getInt("idimpiegato"));
			co.setSaldo(res.getDouble("saldo"));
			co.setDatainizio(res.getDate("datainizio"));

			coList.add(co);
		}

		return coList;
	}

	public static Corso cercaIdconto(int idconto) throws SQLException, NamingException {

		Connection con = ((DataSource) new InitialContext().lookup("java:jboss/datasources/contocorrente_roberti")).getConnection();

		Corso co = new Corso();

		String qry = "SELECT * FROM conto WHERE idconto = ?";

		PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(qry);

		preparedStatement.setInt(1, idconto);

		ResultSet res = preparedStatement.executeQuery();

		if (res.next()) {
			co.setIdconto(idconto);
			co.setIdimpiegato(res.getInt("idimpiegato"));
			co.setSaldo(res.getDouble("saldo"));
			co.setDatainizio(res.getDate("datainizio"));
		}

		return co;
	}

	public static Corso cercaIdimpiegato(int idimpiegato) throws SQLException, NamingException {

		Connection con = ((DataSource) new InitialContext().lookup("java:jboss/datasources/contocorrente_roberti")).getConnection();

		Corso co = new Corso();

		String qry = "SELECT * FROM conto WHERE idimpiegato = ?";

		PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(qry);

		preparedStatement.setInt(1, idimpiegato);

		ResultSet res = preparedStatement.executeQuery();

		if (res.next()) {
			co.setIdconto(res.getInt("idconto"));
			co.setIdimpiegato(idimpiegato);
			co.setSaldo(res.getDouble("saldo"));
			co.setDatainizio(res.getDate("datainizio"));
		}

		return co;
	}

	public static void inserisciConto(int idimpiegato, double saldo, Date datainizio) {

		try {
			Connection con = ((DataSource) new InitialContext().lookup("java:jboss/datasources/contocorrente_roberti"))
					.getConnection();

			String qry = "INSERT INTO conto (idimpiegato, saldo, datainizio) VALUES (?, ?, ?)";

			PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(qry);

			preparedStatement.setInt(1, idimpiegato);
			preparedStatement.setDouble(2, saldo);
			preparedStatement.setDate(3, datainizio);

		} catch (SQLException e) {

			e.printStackTrace();
		} catch (NamingException e) {

			e.printStackTrace();
		}
	}
}