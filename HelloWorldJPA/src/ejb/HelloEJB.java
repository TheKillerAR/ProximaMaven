package ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dao.UtenteDao;
import model.Utente;

/**
 * Session Bean implementation class HelloEJB
 */

@WebService
@Stateless
@LocalBean
public class HelloEJB {

	
	@PersistenceContext(unitName="Hib4PU")
	private EntityManager em;
	
	
    /**
     * Default constructor. 
     */
    public HelloEJB() {
        // TODO Auto-generated constructor stub
    }
    
    public boolean inser(Utente ut)
    {
    	UtenteDao dao  = new UtenteDao(em);
    	
    	
    	try {
			dao.insertUtente(ut);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return true;
    }
  
    public boolean merge(Utente ut)
    {
    	UtenteDao dao  = new UtenteDao(em);
    	
    	
    	try {
			dao.saveOrUpdateTester(ut);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return true;
    }
    public Utente select(int id)
    {
    	UtenteDao dao  = new UtenteDao(em);
    	
    	
    	try {
			Utente ut2 = dao.selectById(id);
		//	ut2.setNome("PPIP");// OGGETTO ATTACHED QUESTE MODIFICHE SN PORTATE NEL DB SENZA FARE MERGE
			return ut2;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return null;
    }
    
    
    public boolean persistVsMerge()
    {//
	// fatto con jpa senza le jta	
		// scenario 1
		// tran starts
    	
    	
    	
    	
		Utente ut = new Utente();
		ut.setCognome("Rossi");
		ut.setEta(36);
		ut.setNome("mario");
	
		em.persist(ut); 
		
//			ut.setEta(20); //---> //NON FUNZIONA PERCHE  L OGGETTO CHE DIVENTA ATTACCHED NON HA  ID , DATO CHE
//        // LA TRANSAZIONE ANCORA NON è CHIUSA, E QUINDI QUANDO FA L UPDATE VA IN ECCEZIONE (è SENZA ID)
//    	
    	Utente ut2 = em.find(Utente.class, 1);
    	ut2.setEta(100);//--> oggetto attacched

    	////		// scenario 2
		//Utente ut3 = new Utente();
    	Utente ut3 = em.find(Utente.class, 114);
		ut3.setCognome("Rossi2");
		ut3.setId(114);

		Utente ut4 = em.merge(ut3);//  Detached objects can be attached to any EntityManager by using the merge method
									// l oggetto in input viene lasciato nello stato in cui si trova (detached o attached)
									// quello in output è attacched
		ut4.setCognome("Pippo2");
		ut3.setEta(50);
		
	
		//mostrargli come un oggetto detached lanci eccezione su remove c
		// remove vuole proprio un oggetto attacched
		// per creare un oggetto detached fare anche esempio di oggetto passato al web tier e poi ritornato all ejb
//		Utente ut5 = new Utente();
//		ut5.setId(115);
//		em.remove(ut5);
		
		return true;
		
		
    }
    
    
    public boolean remove(Utente ut5)
    {//
    	
    	ut5 = em.merge(ut5);// rende ut5 da detached a attacched cosi la puo rimuovere
    	em.remove(ut5);
    	return true;
    }
    
    //esempio query
    //getSingleResult
//    public Category selectByName(int macrocategory, String name) {
//
//        TypedQuery<Category> qry = entityManager.createQuery("SELECT c FROM Category c WHERE c.name=:name AND c.macrocategoryBean.id = :macrocategory", Category.class);
//        qry.setParameter("macrocategory", macrocategory);
//        qry.setParameter("name", name);
//        if (qry.getResultList().size() == 0) return null;
//        return qry.getSingleResult();
//    }
//    
//    createNamedQuery
//    public Collection<Category> getCategories()
//    {
//        TypedQuery<Category> qry = entityManager.createNamedQuery("Category.findAll", Category.class);
//        return qry.getResultList();
//    }

    //getResultList
//    public boolean checkConstraint(int macroCategory, String name)
//    {
//        TypedQuery<Category> qry = entityManager.createQuery("SELECT c FROM Category c WHERE c.name=:name AND c.macrocategoryBean.id=:idMacro", Category.class);
//        qry.setParameter("name", name);
//        qry.setParameter("idMacro", macroCategory);
//        return qry.getResultList().size() == 0;
//    }  
    
    
    

}
