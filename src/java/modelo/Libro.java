package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Libros")
@NamedQueries(@NamedQuery(name = "Libro.verTodos", query="SELECT l FROM Libro l"))
public class Libro implements Serializable {

    @Id
    @Column(name = "ISBN")
    private String ISBN;

    @Column(name = "Titulo")
    private String titulo;

    @Column(name = "Autor")
    private String autor;

    @Column(name = "Num_Paginas")
    private int num_paginas;
    
    @Column(name = "Num_Ejemplares")
    private int num_ejemplares;
    
    @ManyToMany(mappedBy = "libros")
    private List<Ciudadano> ciudadanos = new ArrayList<>();

    public Libro() {
    }

    public Libro(String ISBN, String titulo, String autor, int num_paginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.num_paginas = num_paginas;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNum_paginas() {
        return num_paginas;
    }

    public void setNum_paginas(int num_paginas) {
        this.num_paginas = num_paginas;
    }

    public int getNum_ejemplares() {
        return num_ejemplares;
    }

    public void setNum_ejemplares(int num_ejemplares) {
        this.num_ejemplares = num_ejemplares;
    }

    public List<Ciudadano> getCiudadanos() {
        return ciudadanos;
    }

    public void setCiudadanos(List<Ciudadano> ciudadanos) {
        this.ciudadanos = ciudadanos;
    }
    
    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", num_paginas=" + num_paginas + '}';
    }
}
