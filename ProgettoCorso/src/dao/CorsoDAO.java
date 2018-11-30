package dao;

import javax.persistence.EntityManager;

public class CorsoDAO {

	private EntityManager em;

	public CorsoDAO() {

	}

	public CorsoDAO(EntityManager em) {
		super();
		this.em = em;
	}
	
	public modeljpa.Corso cercaId(int idcorso){
		
		return em.find(modeljpa.Corso.class, idcorso);
	}

	public boolean insertCorsojpa(modeljpa.Corso c){
		em.persist(c);
		return true;
	}

	public boolean updateCorsojpa(modeljpa.Corso c){
		em.merge(c);
		return true;
	}
}
	
//	public ArrayList<Corso> mostraCorso() throws SQLException, NamingException {
//
//		Connection con = ((DataSource) new InitialContext().lookup("java:jboss/datasources/CORSO")).getConnection();
//
//		ArrayList<Corso> coList = new ArrayList<Corso>();
//
//		String qry = "SELECT * FROM corso";
//
//		PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(qry);
//
//		ResultSet res = preparedStatement.executeQuery();
//
//		while (res.next()) {
//
//			Corso co = new Corso();
//
//			co.setIdcorso(res.getInt("idcorso"));
//			co.setDescrizione(res.getString("descrizione"));
//
//			coList.add(co);
//		}
//
//		return coList;
//
//	}
//
//	public Corso cercaIdcorso(int idcorso) throws SQLException, NamingException {
//
//		Connection con = ((DataSource) new InitialContext().lookup("java:jboss/datasources/CORSO")).getConnection();
//
//		Corso co = new Corso();
//		try {
//			String qry = "SELECT * FROM corso WHERE idcorso = ?";
//
//			PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(qry);
//
//			preparedStatement.setInt(1, idcorso);
//
//			ResultSet res = preparedStatement.executeQuery();
//
//			if (res.next()) {
//				co.setIdcorso(idcorso);
//				co.setDescrizione(res.getString("descrizione"));
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return co;
//	}
//
//	public boolean aggiornaCorso(int idcorso, String descrizione) throws SQLException, NamingException {
//
//		Connection con = ((DataSource) new InitialContext().lookup("java:jboss/datasources/CORSO")).getConnection();
//		try {
//
//			String qry = "SELECT * INTO corso (idcorso, descrizione) VALUES (?, ?)";
//
//			PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(qry);
//
//			preparedStatement.setInt(1, idcorso);
//			preparedStatement.setString(2, "descrizione");
//
//			preparedStatement.executeUpdate();
//
//			System.out.println("Modifica effettuata");
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return true;
//	}
//
//	public boolean inserisciCorso(int idcorso, String descrizione) {
//
//		try {
//			Connection con = ((DataSource) new InitialContext().lookup("java:jboss/datasources/CORSO")).getConnection();
//
//			String qry = "INSERT INTO corso (idcorso, descrizione) VALUES (?, ?)";
//
//			PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(qry);
//
//			preparedStatement.setInt(1, idcorso);
//			preparedStatement.setString(2, "desccrizione");
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
//	public boolean cancellaCorso(int idcorso) {
//
//		try {
//			Connection con = ((DataSource) new InitialContext().lookup("java:jboss/datasources/CORSO")).getConnection();
//			FrequenzaDAO fd = new FrequenzaDAO();
//			EdizioneDAO ed = new EdizioneDAO();
//
//			fd.cancellaFrequenza(idcorso);
//
//			ed.cancellaEdizione(idcorso);
//
//			String qry = "DELETE FROM corso WHERE idcorso =?";
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