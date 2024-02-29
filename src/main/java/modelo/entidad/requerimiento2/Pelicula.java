package modelo.entidad.requerimiento2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "pelicula")
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String titulo;
    private int anoLanzamiento;
    private int duracion;
    
    @ManyToMany(mappedBy = "peliculas")
    private List<Director> directores;

    @OneToMany(mappedBy = "pelicula")
    private List<Alquiler> alquileres;

    
   
    public Pelicula() {
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoLanzamiento() {
        return anoLanzamiento;
    }

    public void setAnoLanzamiento(int anoLanzamiento) {
        this.anoLanzamiento = anoLanzamiento;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public List<Alquiler> getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(List<Alquiler> alquileres) {
        this.alquileres = alquileres;
    }

    public List<Director> getDirectores() {
        return directores;
    }

    public void setDirectores(List<Director> directores) {
        this.directores = directores;
    }

    @Override
    public String toString() {
        return "Pelicula [id=" + id + ", titulo=" + titulo + ", anoLanzamiento=" + anoLanzamiento + ", duracion=" + duracion + "]";
    }
}

