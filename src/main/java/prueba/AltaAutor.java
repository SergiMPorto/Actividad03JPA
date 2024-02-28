package prueba;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import modelo.entidad.Autor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AltaAutor {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Pruebajpa_libreria");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

       
        Autor autor1 = new Autor();
        autor1.setNombre("Raimond");
        autor1.setApellidos("Carver");
        autor1.setFechaNacimiento(parseDate("1927-03-06")); 
        em.persist(autor1);

       
        Autor autor2 = new Autor();
        autor2.setNombre("Stephen");
        autor2.setApellidos("King");
        autor2.setFechaNacimiento(parseDate("1949-09-21"));

        em.persist(autor2);

      
        Autor autor3 = new Autor();
        autor3.setNombre("Mario");
        autor3.setApellidos("Vargas Llosa");
        autor3.setFechaNacimiento(parseDate("1936-03-28"));

        em.persist(autor3);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }

    
    private static Date parseDate(String dateString) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
