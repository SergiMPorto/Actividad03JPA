package prueba;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import modelo.entidad.Autor;
import modelo.entidad.Libro;

public class MostrarAutores {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Pruebajpa_libreria");
        EntityManager em = emf.createEntityManager();

        List<Autor> autores = em.createQuery("SELECT DISTINCT a FROM Autor a LEFT JOIN FETCH a.libros", Autor.class)
                                .getResultList();

        for (Autor autor : autores) {
            System.out.println("Autor: " + autor.getNombre() + " " + autor.getApellidos());
            System.out.println("Libros:");
            for (Libro libro : autor.getLibros()) {
                System.out.println("- " + libro.getTitulo());
            }
            System.out.println();
        }

        em.close();
        emf.close();
    }
}

