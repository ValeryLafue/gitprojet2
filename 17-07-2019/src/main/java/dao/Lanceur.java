package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.Personne;

public class Lanceur {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SecondJpaProject");
		EntityManager em = emf.createEntityManager();

//		Adresse ad1= new Adresse("rue1", "ville1");
//		Adresse ad2= new Adresse("rue2", "ville2");
//		Adresse ad3= new Adresse("rue3", "ville3");
//		
//		Personne p1= new Personne("Sparrow", "Jack");
//		Personne p2= new Personne("Lenormand", "Gerard");
//		Personne p3= new Personne("Bigard", "Jean");
//	
//		p1.setAdress(ad3);
//		p2.setAdress(ad2);
//		p3.setAdress(ad1);
//		
//		em.getTransaction().begin();
//		em.persist(ad1);
//		em.persist(ad2);
//		em.persist(ad3);
//		
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);
//		
//		em.getTransaction().commit();
//		
//		em.close();
//		emf.close();

// autre solution...
//		Adresse ad4= new Adresse("Rue des roses", "Bidart");
//		Personne p4= new Personne("Sparrow", "Jack",ad4);
//	
//	
//		p4.setAdress(ad4);
//		
//		
//		em.getTransaction().begin();
//
//		em.persist(ad4);
//		em.persist(p4);
//	
//		
//		em.getTransaction().commit();
//		
//		em.close();
//		emf.close();

		Adresse ad1 = new Adresse("rue1", "ville1");
		Adresse ad2 = new Adresse("rue2", "ville2");
		Adresse ad3 = new Adresse("rue3", "ville3");
		Adresse ad4 = new Adresse("rue4", "ville4");
		Adresse ad5 = new Adresse("rue5", "ville5");

		Personne p1 = new Personne("Nom1", "Prenom1");
		Personne p2 = new Personne("Nom2", "Prenom2");
		Personne p3 = new Personne("Nom3", "Prenom3");
		Personne p4 = new Personne("Nom4", "Prenom4");
		Personne p5 = new Personne("Nom5", "Prenom5");

		List<Adresse> listAd = new ArrayList<Adresse>();
		listAd.add(ad2);
		listAd.add(ad3);

		p1.setAdress(listAd);

		List<Adresse> listAd2 = new ArrayList<Adresse>();
		listAd2.add(ad1);
		listAd2.add(ad4);

		p2.setAdress(listAd2);

		em.getTransaction().begin();

		em.persist(ad1);
		em.persist(ad2);
		em.persist(ad3);
		em.persist(ad4);
		em.persist(ad5);

		em.persist(p1);
		em.persist(p2);

		em.getTransaction().commit();

		em.close();
		emf.close();

	}

}
