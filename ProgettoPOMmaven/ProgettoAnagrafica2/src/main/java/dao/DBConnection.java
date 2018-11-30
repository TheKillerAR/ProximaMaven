package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection createConnection() throws SQLException {

		String driver = "com.mysql.jdbc.Driver";

		String url = "jdbc:mysql://localhost:3306/anagrafica_roberti?useLegacyDatetimeCode=false&serverTimezone=Europe/Rome&useSSL=false";

		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		Connection con = DriverManager.getConnection(url, "corso", "corso2016");

		return con;

	}

}
