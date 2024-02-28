package prueba;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import modelo.entidad.Libro;

public class MostrarLibros {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Pruebajpa_libreria");
        EntityManager em = emf.createEntityManager();

        List<Libro> libros = em.createQuery("SELECT l FROM Libro l JOIN FETCH l.editorial JOIN FETCH l.autor", Libro.class)
                              .getResultList();

        for (Libro libro : libros) {
            System.out.println(libro);
        }

        em.close();
        emf.close();
    }
}

