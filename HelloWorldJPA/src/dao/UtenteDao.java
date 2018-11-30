package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;



import model.Utente;

public class UtenteDao {
	
	private EntityManager entityManager;

	public UtenteDao(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public boolean insertUtente(Utente ut) throws Exception {

		entityManager.persist(ut);

		return true;
	}

	public boolean removeUtente(Utente ut) throws Exception {

		//Utente utRes = entityManager.find(Utente.class, ut.getId());
		entityManager.remove(ut);

		return true;
	}

	public Utente saveOrUpdateTester(Utente ut) throws Exception {

		Utente utRes = entityManager.merge(ut);
		return utRes;
	}

	public Utente selectById(int id) throws Exception {

		Utente res = entityManager.find(Utente.class, id);
		return res;
	}
	
	
	
	public List<Utente> findAllUsersCriteria() {
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Utente> cq = builder.createQuery(Utente.class);
		Root<Utente> root = cq.from(Utente.class);
		cq.select(root);
		return entityManager.createQuery(cq).getResultList();
	}
	
	
	public Utente selectHQLById(String cognome) throws Exception {
		
		Utente res = (Utente) entityManager.createQuery(
			    "SELECT c FROM Utente c WHERE c.cognome = :cognome")
			    .setParameter("cognome", cognome);
		return res;
	}	
	
	public List<Utente> selectQueryName() throws Exception {
		
		List<Utente> res =  (List<Utente>) entityManager.createNamedQuery("Utente.findAll");
		return res;
	}		

}