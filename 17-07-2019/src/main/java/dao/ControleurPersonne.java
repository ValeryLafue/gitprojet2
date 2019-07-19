//package dao;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//import javax.persistence.Query;
//
//
//public class ControleurPersonne {
//
//	
//	EntityManagerFactory emf = Persistence.createEntityManagerFactory("SecondJpaProject");
//	EntityManager em = emf.createEntityManager();
//
//	public Adresse findAdrPers(String nom,String prenom) {
//		Query qury = em.createNativeQuery("select * from personne where nom=? AND prenom=?", dao.Personne.class);
//
//		qury.setParameter(1, nom);
//		qury.setParameter(2, prenom);
//		Personne pers = (Personne) qury.getSingleResult();
//		return pers.getAdress();
//
//
//		
//}
//	
//}
