package dao;

import java.sql.*;

import model.Ruolo;

public class RuoloDao {

	public static void searchAll() {

		try {

			// CERCA
			// Carichiamo un driver di tipo 1 (bridge jdbc-odbc)
			String driver = "com.mysql.jdbc.Driver";

			Class.forName(driver);

			// Creiamo la stringa di connessione
			String url = "jdbc:mysql://localhost:3306/appazienda";

			// Otteniamo una connessione con username e password
			Connection con = DriverManager.getConnection(url, "root", "1234");

			// Creiamo un oggetto Statement per poter interrogare il db
			Statement cmd = con.createStatement();

			// Eseguiamo una query e immagazziniamone i risu3ltati
			// in un oggetto ResultSet
			String qry = "SELECT * FROM ruolo";
			ResultSet res = cmd.executeQuery(qry);

			// Stampiamone i risultati riga per riga
			while (res.next()) {
				System.out.println("--------------------");
				System.out.println("ID Ruolo: " + res.getInt("id"));
				System.out.println("Stipendio" + res.getString("stipendio"));

			}

		} catch (Exception e) {

			System.err.println("Errore");

			e.printStackTrace();
		}
	}

	public static void searchId(int id) throws SQLException {
		Connection dbConnection = null;
		java.sql.PreparedStatement preparedStatement = null;

		String updateTableSQL = "SELECT * FROM RUOLO WHERE ID = ?";

		try {
			String driver = "com.mysql.jdbc.Driver";

			Class.forName(driver);

			// Creiamo la stringa di connessione
			String url = "jdbc:mysql://localhost:3306/appazienda?useLegacyDatetimeCode=false&serverTimezone=Europe/Rome&useSSL=false";

			// Otteniamo una connessione con username e password
			dbConnection = DriverManager.getConnection(url, "root", "1234");

			preparedStatement = dbConnection.prepareStatement(updateTableSQL);

			preparedStatement.setInt(1, id);

			// execute update SQL stetement
			ResultSet res = preparedStatement.executeQuery();

			// Stampiamone i risultati riga per riga
			while (res.next()) {

				System.out.println("ID Ruolo: " + res.getInt("id"));
				System.out.println("Nome Ruolo: " + res.getString("nomeruolo"));
				System.out.println("Stipendio: " + res.getInt("stipendio"));

			}

		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			if (preparedStatement != null) {
				preparedStatement.close();
			}

			if (dbConnection != null) {
				dbConnection.close();
			}

		}

	}

	public static void update(String nomeruolo, int stipendio, int id) throws SQLException {

		Connection dbConnection = null;
		java.sql.PreparedStatement preparedStatement = null;

		String updateTableSQL = "UPDATE ruolo SET nomeruolo =?, stipendio =?" + "WHERE id =?";

		try {

			dbConnection = DBConnection.createConnection();

			preparedStatement = dbConnection.prepareStatement(updateTableSQL);

			preparedStatement.setString(1, nomeruolo);
			preparedStatement.setInt(2, stipendio);
			preparedStatement.setInt(3, id);

			preparedStatement.executeUpdate();

			System.out.println("Update effettuato");

		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			if (preparedStatement != null) {
				preparedStatement.close();
			}
			if (dbConnection != null) {
				dbConnection.close();
			}

		}
	}

	public static void insert(Ruolo role) throws SQLException {

		Connection dbConnection = null;
		java.sql.PreparedStatement preparedStatement = null;

		String updateTableSQL = "INSERT INTO ruolo (nomeruolo, stipendio) VALUES(?, ?)";

		try {

			dbConnection = DBConnection.createConnection();

			preparedStatement = dbConnection.prepareStatement(updateTableSQL);

			preparedStatement.setString(1, role.getNomeruolo());
			preparedStatement.setInt(2, role.getStipendio());

			preparedStatement.executeUpdate();

			System.out.println("Ruolo inserito correttamente");

		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			if (preparedStatement != null) {
				preparedStatement.close();
			}

			if (dbConnection != null) {
				dbConnection.close();
			}

		}
	}

	public static void delete(int id) throws SQLException {

		Connection dbConnection = null;
		java.sql.PreparedStatement preparedStatement = null;

		String updateTableSQL = "DELETE FROM ruolo WHERE id =?";

		try {

			dbConnection = DBConnection.createConnection();

			preparedStatement = dbConnection.prepareStatement(updateTableSQL);

			preparedStatement.setInt(1, id);

			preparedStatement.executeUpdate();

			System.out.println("Ruolo rimosso correttamente");

		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			if (preparedStatement != null) {
				preparedStatement.close();
			}

			if (dbConnection != null) {
				dbConnection.close();
			}

		}
	}

}