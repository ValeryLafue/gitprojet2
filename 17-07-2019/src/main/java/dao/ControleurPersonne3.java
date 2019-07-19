package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;




public class ControleurPersonne3 {

	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("SecondJpaProject");
	EntityManager em = emf.createEntityManager();

	
	public void CreatePersonne2(String nom,String prenom,String rue1,String ville1,String rue2,String ville2) {
	Personne pers = new Personne(nom,prenom);
	Adresse ad1 = new Adresse(rue1, ville1);
	Adresse ad2 = new Adresse(rue2, ville2);
	List<Adresse> listAd = new ArrayList<Adresse>();
	listAd.add(ad1);
	listAd.add(ad2);

	pers.setAdress(listAd);
	
	
	em.getTransaction().begin();

	em.persist(ad1);
	em.persist(ad2);
	em.persist(pers);

	
	em.getTransaction().commit();
	
	em.close();
	emf.close();

		
}
	
}
