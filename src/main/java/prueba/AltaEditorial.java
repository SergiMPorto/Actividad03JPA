package prueba;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import modelo.entidad.Editorial;

public class AltaEditorial {

	public static void main(String[] args) {
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("Pruebajpa_libreria");
	        EntityManager em = emf.createEntityManager();

	        em.getTransaction().begin();
		
		Editorial edit1 = new Editorial();
		edit1.setNombre("Anagrama");
		edit1.setDireccion("Calle MalaEspina nª 123");
		em.persist(edit1);
		
		Editorial edit2 = new Editorial();
		edit2.setNombre("Alfagura");
		edit2.setDireccion("Terror nº 666");
		em.persist(edit2);
		
		
		 em.getTransaction().commit();
		em.close();
        emf.close();
		
	}
}
