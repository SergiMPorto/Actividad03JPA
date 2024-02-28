package prueba;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.entidad.Autor;
import modelo.entidad.Editorial;
import modelo.entidad.Libreria;
import modelo.entidad.Libro;

public class AltaLibro {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Pruebajpa_libreria");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
        Autor autor1 = em.find(Autor.class, 1); 
        Autor autor2 = em.find(Autor.class, 2); 
        Autor autor3 = em.find(Autor.class, 3);
        Editorial edit1 = em.find(Editorial.class, 1); 
        Editorial edit2 = em.find(Editorial.class, 2); 
        Libreria libre1 =em.find(Libreria.class, 1);
        Libreria libre2 =em.find(Libreria.class, 2);
        
        
        List<Libreria> librerias = new ArrayList<>();
        librerias.add(libre1);
        librerias.add(libre2);
        
        Libro libro1 = new Libro();
        libro1.setTitulo("La Ciudad y los Perros");
        libro1.setPrecio(25); 
        libro1.setAutor(autor3);
        libro1.setEditorial(edit2);
        em.persist(libro1);
        
        Libro libro2 = new Libro();
        libro2.setTitulo("El Paraiso en la otra esquina");
        libro2.setPrecio(25); 
        libro2.setAutor(autor3);
        libro2.setEditorial(edit2);
        em.persist(libro2);
        
        Libro libro3 = new Libro();
        libro3.setTitulo("La fiesta del Chivo");
        libro3.setPrecio(25); 
        libro3.setAutor(autor3);
        libro3.setEditorial(edit2);
        em.persist(libro3);
        
        Libro libro4 = new Libro();
        libro4.setTitulo("Si me necesitas llámame");
        libro4.setPrecio(25); 
        libro4.setAutor(autor1);
        libro4.setEditorial(edit1);
        em.persist(libro4);
        
        List<Libro> libros = new ArrayList<>();
        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);
        libros.add(libro4);
        
        
        libre1.setLibros(libros);
        
        
        Libro libro5 = new Libro();
        libro5.setTitulo("It");
        libro5.setPrecio(25); 
        libro5.setAutor(autor2);
        libro5.setEditorial(edit2);
        em.persist(libro5);
        
        Libro libro6 = new Libro();
        libro6.setTitulo("Cementerio de Animales");
        libro6.setPrecio(25); 
        libro6.setAutor(autor2);
        libro6.setEditorial(edit2);
        em.persist(libro6);
        
        Libro libro7 = new Libro();
        libro7.setTitulo("Misery");
        libro7.setPrecio(25); 
        libro7.setAutor(autor2);
        libro7.setEditorial(edit2);
        em.persist(libro7);
        
        Libro libro8 = new Libro();
        libro8.setTitulo("El Resplandor");
        libro8.setPrecio(25); 
        libro8.setAutor(autor2);
        libro8.setEditorial(edit2);
        em.persist(libro8);
        
        
        List<Libro> libros2 = new ArrayList<>();
        libros2.add(libro5);
        libros2.add(libro6);
        libros2.add(libro7);
        libros2.add(libro8);

        libre2.setLibros(libros2);
        
        
        
        
        
     
        
     
        
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}

