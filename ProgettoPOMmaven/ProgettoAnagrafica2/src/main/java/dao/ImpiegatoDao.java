package dao;

import java.sql.*;
import java.util.ArrayList;

import model.Impiegato;

public class ImpiegatoDao {

	public static ArrayList<Impiegato> getImpiegati() throws SQLException {

		ArrayList<Impiegato> impList = new ArrayList<Impiegato>();

		Connection con = null;

		try {
			String qry = "SELECT * FROM impiegato";

			con = DBConnection.createConnection();

			PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(qry);

			ResultSet res = preparedStatement.executeQuery();

			while (res.next()) {

				Impiegato imp = new Impiegato();

				imp.setId(res.getInt("id"));
				imp.setNome(res.getString("nome"));
				imp.setCognome(res.getString("cognome"));
				imp.setCf(res.getString("cf"));

				impList.add(imp);

			}
		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			con.close();

		}
		return impList;

	}

	public static Impiegato searchId(int id) throws SQLException {

		Impiegato imp = new Impiegato();
		Connection con = null;
		try {
			String qry = "SELECT * FROM impiegato WHERE ID = ?";

			con = DBConnection.createConnection();

			PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(qry);
			preparedStatement.setInt(1, id);

			ResultSet res = preparedStatement.executeQuery();

			if (res.next()) {
				imp.setId(id);
				imp.setCf(res.getString("cf"));
				imp.setNome(res.getString("nome"));
				imp.setCognome(res.getString("cognome"));


			}

		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			con.close();

		}
		return imp;
	}

	public static ArrayList<Impiegato> searchNome(String nome) throws SQLException {

		ArrayList<Impiegato> impList = new ArrayList<Impiegato>();

		Connection con = null;

		try {
			String qry = "SELECT * FROM impiegato WHERE nome = ?";

			con = DBConnection.createConnection();

			PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(qry);
			preparedStatement.setString(1, nome);

			ResultSet res = preparedStatement.executeQuery();

			while (res.next()) {

				Impiegato imp = new Impiegato();

				imp.setId(res.getInt("id"));
				imp.setNome(res.getString("nome"));
				imp.setCognome(res.getString("cognome"));
				imp.setCf(res.getString("cf"));

				impList.add(imp);
			}
		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			con.close();

		}
		return impList;

	}

	public static ArrayList<Impiegato> searchCognome(String cognome) throws SQLException {

		ArrayList<Impiegato> impList = new ArrayList<Impiegato>();

		Connection con = null;

		try {
			String qry = "SELECT * FROM impiegato WHERE cognome = ?";

			con = DBConnection.createConnection();

			PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(qry);
			preparedStatement.setString(1, cognome);

			ResultSet res = preparedStatement.executeQuery();

			while (res.next()) {

				Impiegato imp = new Impiegato();

				imp.setId(res.getInt("id"));
				imp.setNome(res.getString("nome"));
				imp.setCognome(res.getString("cognome"));
				imp.setCf(res.getString("cf"));

				impList.add(imp);
			}
		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			con.close();

		}
		return impList;

	}

	public static Impiegato searchCf(String cf) throws SQLException {
		Impiegato imp = new Impiegato();
		Connection con = null;
		try {
			String qry = "SELECT * FROM impiegato WHERE cf = ?";

			con = DBConnection.createConnection();

			PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(qry);
			preparedStatement.setString(1, cf);

			ResultSet res = preparedStatement.executeQuery();

			if (res.next()) {
				imp.setId(res.getInt("id"));
				imp.setCf(cf);
				imp.setNome(res.getString("nome"));
				imp.setCognome(res.getString("cognome"));

//				System.out.println(imp);

			}

		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			con.close();

		}
		return imp;

	}

	public static void update(int id, String cf, String nome, String cognome) throws SQLException {

		Connection con = null;
		java.sql.PreparedStatement preparedStatement = null;

		String qry = "UPDATE impiegato SET cf =?, nome =?, cognome =?" + "WHERE id =?";

		try {

			con = DBConnection.createConnection();

			preparedStatement = (PreparedStatement) con.prepareStatement(qry);

			preparedStatement.setString(1, cf);
			preparedStatement.setString(2, nome);
			preparedStatement.setString(3, cognome);
			preparedStatement.setInt(4, id);

			preparedStatement.executeUpdate();

			System.out.println("Update effettuato");

		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			if (preparedStatement != null) {
				preparedStatement.close();
			}
			if (con != null) {
				con.close();
			}

		}
	}

	public static void insert(Impiegato imp) throws SQLException {

		Connection con = null;
		java.sql.PreparedStatement preparedStatement = null;

		String qry = "INSERT INTO impiegato (cf, nome, cognome) VALUES(?, ?, ?)";

		try {

			con = DBConnection.createConnection();

			preparedStatement = (PreparedStatement) con.prepareStatement(qry);

			preparedStatement.setString(1, imp.getCf());
			preparedStatement.setString(2, imp.getNome());
			preparedStatement.setString(3, imp.getCognome());

			preparedStatement.executeUpdate();

			System.out.println("Impiegato inserito correttamente");

		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			con.close();

		}
	}
}