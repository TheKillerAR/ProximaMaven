package dao;

import javax.persistence.EntityManager;

public class EdizioneDAO {
	
	private EntityManager em;

	public EdizioneDAO() {

	}

	public EdizioneDAO(EntityManager em) {
		super();
		this.em = em;
	}
	
	public boolean insertEdizionejpa(modeljpa.Edizione e){
		em.persist(e);
		return true;
	}
	
	public boolean updateEdizione(modeljpa.Edizione e){
		em.merge(e);
		return true;
	}
	
	public modeljpa.Edizione cercaId(int idedizione){
		
		return em.find(modeljpa.Edizione.class, idedizione);
	}

//	public ArrayList<Edizione> mostraEdizione() throws SQLException, NamingException {
//
//		Connection con = ((DataSource) new InitialContext().lookup("java:jboss/datasources/CORSO")).getConnection();
//
//		ArrayList<Edizione> edList = new ArrayList<Edizione>();
//
//		String qry = "SELECT * FROM edizione";
//
//		PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(qry);
//
//		ResultSet res = preparedStatement.executeQuery();
//
//		while (res.next()) {
//
//			Edizione ed = new Edizione();
//
//			ed.setIdedizione(res.getInt("idedizione"));
//			ed.setNumero(res.getInt("numero"));
//			ed.setIdcorso(res.getInt("idcorso"));
//			ed.setIdsede(res.getInt("idsede"));
//			ed.setIddocente(res.getInt("iddocente"));
//			ed.setDatain(res.getDate("datain"));
//			ed.setDatafi(res.getDate("datafi"));
//
//			edList.add(ed);
//		}
//
//		return edList;
//
//	}
//
//	public Edizione cercaIdedizione(int idedizione) throws SQLException, NamingException {
//
//		Connection con = ((DataSource) new InitialContext().lookup("java:jboss/datasources/CORSO")).getConnection();
//
//		Edizione ed = new Edizione();
//		try {
//			String qry = "SELECT * FROM edizione WHERE idedizione = ?";
//
//			PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(qry);
//
//			preparedStatement.setInt(1, idedizione);
//
//			ResultSet res = preparedStatement.executeQuery();
//
//			if (res.next()) {
//				ed.setIdedizione(idedizione);
//				ed.setNumero(res.getInt("numero"));
//				ed.setIdcorso(res.getInt("idcorso"));
//				ed.setIdsede(res.getInt("idsede"));
//				ed.setIddocente(res.getInt("iddocente"));
//				ed.setDatain(res.getDate("datain"));
//				ed.setDatafi(res.getDate("datafi"));
//			}
//		} catch (SQLException e) {
//
//			e.printStackTrace();
//		}
//
//		return ed;
//	}
//
//	public boolean aggiornaEdizione(int idedizione, int numero, int idcorso, int idsede, int iddocente, Date datain,
//			Date datafi) throws SQLException, NamingException {
//
//		Connection con = ((DataSource) new InitialContext().lookup("java:jboss/datasources/CORSO")).getConnection();
//		try {
//
//			String qry = "UPDATE edizione SET numero =?, idcorso =?, idsede =?, iddocente =?, datain =?, datafin =?"
//					+ "WHERE idedizione =?";
//
//			PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(qry);
//
//			preparedStatement.setInt(1, idedizione);
//			preparedStatement.setInt(2, numero);
//			preparedStatement.setInt(3, idcorso);
//			preparedStatement.setInt(4, idsede);
//			preparedStatement.setInt(5, iddocente);
//			preparedStatement.setDate(6, datain);
//			preparedStatement.setDate(7, datafi);
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
//
//	}
//
//	public boolean inserisciEdizione(int idedizione, int numero, int idcorso, int idsede, int iddocente, Date datain,
//			Date datafi) {
//
//		try {
//			Connection con = ((DataSource) new InitialContext().lookup("java:jboss/datasources/CORSO")).getConnection();
//
//			String qry = "INSERT INTO edizione (idedizione, numero, idcorso, idsede, iddocente, datain, datafi) VALUES (?, ?, ?, ?, ?, ?, ?)";
//
//			PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(qry);
//
//			preparedStatement.setInt(1, idedizione);
//			preparedStatement.setInt(2, numero);
//			preparedStatement.setInt(3, idcorso);
//			preparedStatement.setInt(4, idsede);
//			preparedStatement.setInt(5, iddocente);
//			preparedStatement.setDate(6, datain);
//			preparedStatement.setDate(7, datafi);
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
//	public boolean cancellaEdizione(int idedizione) {
//
//		try {
//			Connection con = ((DataSource) new InitialContext().lookup("java:jboss/datasources/CORSO")).getConnection();
//			FrequenzaDAO fd = new FrequenzaDAO();
//
//			fd.cancellaFrequenza(idedizione);
//
//			String qry = "DELETE FROM edizione WHERE idedizione =?";
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
}