package manager;

import org.hibernate.Session;

import dao.Personne;
import util.HibernateUtil;

public class PersonneManager {

	public void ajoutPersonne(String nom, String prenom, String tel, String email) {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		Personne p = new Personne();
		p.setNom(nom);
		p.setPrenom(prenom);
		p.setTel(tel);
		p.setEmail(email);
		session.save(p);
		session.getTransaction().commit();
	}
	
	public void supprimePersonne(int id) {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		Personne p = (Personne) session.load(Personne.class, id); 
		session.delete(p);
		session.getTransaction().commit();
	}
}
