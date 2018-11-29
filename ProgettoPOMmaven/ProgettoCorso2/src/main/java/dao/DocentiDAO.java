package dao;

import javax.persistence.EntityManager;

public class DocentiDAO {
	
	private EntityManager em;

	public DocentiDAO() {

	}

	public DocentiDAO(EntityManager em) {
		super();
		this.em = em;
	}
	
	public boolean insertDocentejpa(modeljpa.Docenti d){
		em.persist(d);
		return true;
	}
	
	public boolean updateDocentejpa(modeljpa.Docenti d){
		em.merge(d);
		return true;
	}
	
	public modeljpa.Docenti cercaId(int iddocente){
		
		return em.find(modeljpa.Docenti.class, iddocente);
	}
}
	
//	public ArrayList<Docenti> mostraDocenti() throws SQLException, NamingException {
//
//		Connection con = ((DataSource) new InitialContext().lookup("java:jboss/datasources/CORSO")).getConnection();
//
//		ArrayList<Docenti> dcList = new ArrayList<Docenti>();
//
//		String qry = "SELECT * FROM docenti";
//
//		PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(qry);
//
//		ResultSet res = preparedStatement.executeQuery();
//
//		while (res.next()) {
//
//			Docenti dc = new Docenti();
//
//			dc.setIddocente(res.getInt("iddocente"));
//			dc.setNome(res.getString("nome"));
//			dc.setCognome(res.getString("cognome"));
//			dc.setCf(res.getString("cf"));
//
//			dcList.add(dc);
//		}
//
//		return dcList;
//
//	}
//
//	public Docenti cercaIddocente(int iddocente) throws SQLException, NamingException {
//
//		Connection con = ((DataSource) new InitialContext().lookup("java:jboss/datasources/CORSO")).getConnection();
//
//		Docenti dc = new Docenti();
//
//		String qry = "SELECT * FROM docenti WHERE iddocente = ?";
//
//		PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(qry);
//
//		preparedStatement.setInt(1, iddocente);
//
//		ResultSet res = preparedStatement.executeQuery();
//
//		if (res.next()) {
//			dc.setIddocente(iddocente);
//			dc.setNome(res.getString("nome"));
//			dc.setCognome(res.getString("cognome"));
//			dc.setCf(res.getString("cf"));
//		}
//
//		return dc;
//	}
//
//	public boolean aggiornaDocente(int iddocente, String nome, String cognome, String cf)
//			throws SQLException, NamingException {
//
//		Connection con = ((DataSource) new InitialContext().lookup("java:jboss/datasources/CORSO")).getConnection();
//		try {
//
//			String qry = "UPDATE docenti SET nome =?, cognome =?, cf =?," + "WHERE iddocente =?";
//
//			PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(qry);
//
//			preparedStatement.setInt(1, iddocente);
//			preparedStatement.setString(2, "nome");
//			preparedStatement.setString(3, "cognome");
//			preparedStatement.setString(4, "cf");
//
//			preparedStatement.executeUpdate();
//
//			System.out.println("Modifica effettuata");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return true;
//
//	}
//
//	public boolean inserisciDocente(int iddocente, String nome, String cognome, String cf) {
//
//		try {
//			Connection con = ((DataSource) new InitialContext().lookup("java:jboss/datasources/CORSO")).getConnection();
//
//			String qry = "INSERT INTO docenti (iddocente, nome, cognome, cf) VALUES (?, ?, ?, ?)";
//
//			PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(qry);
//
//			preparedStatement.setInt(1, iddocente);
//			preparedStatement.setString(2, "nome");
//			preparedStatement.setString(3, "cognome");
//			preparedStatement.setString(4, "cf");
//
//			preparedStatement.executeUpdate();
//
//			return true;
//
//		} catch (SQLException e) {
//
//			e.printStackTrace();
//		} catch (NamingException e) {
//
//			e.printStackTrace();
//		}
//		return false;
//	}
//
//	public boolean cancellaDocente(int iddocente) {
//
//		try {
//			Connection con = ((DataSource) new InitialContext().lookup("java:jboss/datasources/CORSO")).getConnection();
//			FrequenzaDAO fd = new FrequenzaDAO();
//			EdizioneDAO ed = new EdizioneDAO();
//
//			fd.cancellaFrequenza(iddocente);
//
//			ed.cancellaEdizione(iddocente);
//
//			String qry = "DELETE FROM docenti WHERE iddocente =?";
//
//			PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(qry);
//
//			preparedStatement.executeUpdate();
//
//			return true;
//
//		} catch (SQLException | NamingException e) {
//
//			e.printStackTrace();
//		}
//
//		return false;
//
//	}
//}