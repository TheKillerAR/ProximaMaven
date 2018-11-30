package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import model.Corso;
import model.Movimento;

public class MovimentoDAO {

	public static Movimento creaMovimento(int idconto, int idmovimento, double importo, Date datamovimento)
			throws SQLException, NamingException {

		Connection con = ((DataSource) new InitialContext().lookup("java:jboss/datasources/contocorrente_roberti")).getConnection();

		Movimento mov = new Movimento();

		if (idmovimento == 1) {

			String qry = "SELECT * INTO movimenti (idconto, idmovimento, importo, datamovimento) VALUES (?, ?, ?, ?)";

			PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(qry);

			preparedStatement.setInt(1, mov.getIdconto());
			preparedStatement.setInt(2, mov.getIdconto());
			preparedStatement.setDouble(3, mov.getImporto());
			preparedStatement.setDate(4, mov.getDatamovimento());

			preparedStatement.executeUpdate();

		} else if (idmovimento == 2) {

			String qry = "SELCET * INTO movimenti (idconto, idmovimento, importo, datamovimento) VALUES (?, ?, ?, ?)";

			PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(qry);

			preparedStatement.setInt(1, mov.getIdconto());
			preparedStatement.setInt(2, mov.getIdconto());
			preparedStatement.setDouble(3, mov.getImporto());
			preparedStatement.setDate(4, mov.getDatamovimento());

			preparedStatement.executeUpdate();

		}
		return mov;

	}

	public static ArrayList<Movimento> mostraMovimenti() throws SQLException, NamingException {

		Connection con = ((DataSource) new InitialContext().lookup("java:jboss/datasources/contocorrente_roberti")).getConnection();

		ArrayList<Movimento> movList = new ArrayList<Movimento>();

		String qry = "SELECT * FROM movimenti";

		PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(qry);

		ResultSet res = preparedStatement.executeQuery();

		while (res.next()) {
			Movimento mov = new Movimento();

			mov.setIdconto(res.getInt("idconto"));
			mov.setIdmovimento(res.getInt("idmovimento"));
			mov.setImporto(res.getDouble("importo"));
			mov.setDatamovimento(res.getDate("datamovimento"));

			movList.add(mov);
		}

		return movList;

	}

}