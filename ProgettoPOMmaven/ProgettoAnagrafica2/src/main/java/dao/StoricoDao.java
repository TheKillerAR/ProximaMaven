package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StoricoDao {
	
	PreparedStatement ps;

	public boolean delete(int idimpiegato) throws SQLException {
		Connection con = null;
		
		con = DBConnection.createConnection();
		
		if (con != null) {
			try {
				ps = con.prepareStatement("DELETE FROM storico WHERE idimpiegato= ?");
				ps.setInt(1, idimpiegato);

				ps.executeUpdate();
				System.out.println("Record è stato cancellato con successo!");
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					con.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
		}
		return true;
	}

	public boolean insert(int idruolo, int idimpiegato, int datainizio, int datafine) throws SQLException {

		Connection con = null;
		
		con = DBConnection.createConnection();
		
		if (con != null) {
			try {
				ps = con.prepareStatement("INSERT INTO storico (idruolo, idimpiegato, datain, dataf) VALUES (?,?,?,?)");
				ps.setInt(1, idruolo);
				ps.setInt(2, idimpiegato);
				ps.setInt(3, datainizio);
				ps.setInt(4, datafine);

				ps.executeUpdate();
				System.out.println("Record è stato aggiunto con successo!");
			} catch (Exception e) {

				e.printStackTrace();
			} finally {
				try {
					con.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
		}
		return true;
	}
}