import manager.PersonneManager;
	import util.HibernateUtil;

	
public class TestPersonne {


		public static void main(String[] args) {
			// TODO Auto-generated method stub

			PersonneManager pm = new PersonneManager();
			//ajoutr des personne a la base des donnees en utilisant la methode ajoutPersonne
			pm.ajoutPersonne("AMANI"," Mourad", "0753385146", "amani.mourad1991@gmail.com");
			pm.ajoutPersonne("AMANI2"," Mourad2", "07533851462", "amani.mourad19912@gmail.com");
			pm.ajoutPersonne("AMANI3"," Mourad3", "07533851463", "amani.mourad19913@gmail.com");
			pm.ajoutPersonne("AMANI4"," Mourad4", "07533851464", "amani.mourad19914@gmail.com");
			
			//supression des personne en ajoutant la methode supprimePersonne par id
			pm.supprimePersonne(2);
			
			HibernateUtil.sessionFactory.close();
		}

	

	
}
