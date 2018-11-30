package dao;

import javax.persistence.EntityManager;

public class SedeDAO {
	
	private EntityManager em;
	
	public SedeDAO() {

	}

	public SedeDAO(EntityManager em) {
		super();
		this.em = em;
	}
	
public modeljpa.Sede cercaId(int idsede){
		
		return em.find(modeljpa.Sede.class, idsede);
	}
	
	public boolean insertSedejpa(modeljpa.Sede s){
		em.persist(s);
		return true;
	}
	
	public boolean updateSedejpa(modeljpa.Sede s){
		em.merge(s);
		return true;
	}

}

//	public ArrayList<Sede> mostraSede() throws SQLException, NamingException {
//
//		Connection con = ((DataSource) new InitialContext().lookup("java:jboss/datasources/CORSO")).getConnection();
//
//		ArrayList<Sede> sdList = new ArrayList<Sede>();
//
//		String qry = "SELECT * FROM sede";
//
//		PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(qry);
//
//		ResultSet res = preparedStatement.executeQuery();
//
//		while (res.next()) {
//
//			Sede sd = new Sede();
//
//			sd.setIdsede(res.getInt("idsede"));
//			sd.setNomesede(res.getString("nomesede"));
//			sd.setVia(res.getString("via"));
//			sd.setCitta(res.getString("citta"));
//			sd.setCap(res.getInt("cap"));
//
//			sdList.add(sd);
//		}
//
//		return sdList;
//
//	}
//
//	public Sede cercaIdsede(int idsede) throws SQLException, NamingException {
//
//		Connection con = ((DataSource) new InitialContext().lookup("java:jboss/datasources/CORSO")).getConnection();
//
//		Sede sd = new Sede();
//
//		String qry = "SELECT * FROM sede WHERE idsede = ?";
//
//		PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(qry);
//
//		preparedStatement.setInt(1, idsede);
//
//		ResultSet res = preparedStatement.executeQuery();
//
//		if (res.next()) {
//			sd.setIdsede(idsede);
//			sd.setNomesede(res.getString("nomesede"));
//			sd.setVia(res.getString("via"));
//			sd.setCitta(res.getString("citta"));
//			sd.setCap(res.getInt("cap"));
//		}
//
//		return sd;
//	}
//
//	public Sede aggiornaSede(int idsede, String nomesede, String via, String citta, int cap)
//			throws SQLException, NamingException {
//
//		Connection con = ((DataSource) new InitialContext().lookup("java:jboss/datasources/CORSO")).getConnection();
//
//		Sede sd = new Sede();
//
//		String qry = "UPDATE sede SET nomesede =?, via =?, citta =?, cap =?" + "WHERE idsede =?";
//
//		PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(qry);
//
//		preparedStatement.setInt(1, idsede);
//		preparedStatement.setString(2, "nomesede");
//		preparedStatement.setString(3, "via");
//		preparedStatement.setString(4, "citta");
//		preparedStatement.setInt(5, cap);
//
//		preparedStatement.executeUpdate();
//
//		System.out.println("Modifica effettuata");
//
//		return sd;
//
//	}
//
//	public boolean inserisciSede(int idsede, String nomesede, String via, String citta, int cap) {
//
//		try {
//			Connection con = ((DataSource) new InitialContext().lookup("java:jboss/datasources/CORSO")).getConnection();
//
//			String qry = "INSERT INTO sede (idsede, nomesede, via, citta, cap) VALUES (?, ?, ?, ?, ?)";
//
//			PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(qry);
//
//			preparedStatement.setInt(1, idsede);
//			preparedStatement.setString(2, "nomesede");
//			preparedStatement.setString(3, "via");
//			preparedStatement.setString(4, "citta");
//			preparedStatement.setInt(5, cap);
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
//	public boolean cancellaSede(int idsede) {
//
//		try {
//			Connection con = ((DataSource) new InitialContext().lookup("java:jboss/datasources/CORSO")).getConnection();
//			FrequenzaDAO fd = new FrequenzaDAO();
//			EdizioneDAO ed = new EdizioneDAO();
//
//			fd.cancellaFrequenza(idsede);
//
//			ed.cancellaEdizione(idsede);
//
//			String qry = "DELETE FROM sede WHERE idsede =?";
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