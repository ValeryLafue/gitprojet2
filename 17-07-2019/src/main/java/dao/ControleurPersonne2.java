//package dao;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//
//
//
//
//public class ControleurPersonne2 {
//
//	
//	EntityManagerFactory emf = Persistence.createEntityManagerFactory("SecondJpaProject");
//	EntityManager em = emf.createEntityManager();
//
//	
//	public void CreatePersonne(String nom,String prenom,String rue, String ville) {
//	
//	Personne pers = new Personne(nom,prenom);
//	Adresse adr= new Adresse(rue,ville);
//
//
//	pers.setAdress(adr);
//	
//	
//	em.getTransaction().begin();
//
//	em.persist(adr);
//	em.persist(pers);
//
//	
//	em.getTransaction().commit();
//	
//	em.close();
//	emf.close();
//
//		
//}
//	
//}
