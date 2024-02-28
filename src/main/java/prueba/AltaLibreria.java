package prueba;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.entidad.Libreria;

public class AltaLibreria {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Pruebajpa_libreria");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Libreria libre1 = new Libreria();
        libre1.setNombre("Libroteca");
        libre1.setNombreDueno("Sergio");
        libre1.setDireccion("Calle Placer");
        
        em.persist(libre1);
        
        Libreria libre2 = new Libreria();
        libre2.setNombre("Librouro");
        libre2.setNombreDueno("Anton");
        libre2.setDireccion("Calle Dolor");
        
        em.persist(libre2);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
