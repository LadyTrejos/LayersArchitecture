package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Ciudadanos")
@NamedQueries(@NamedQuery(name="Ciudadano.verTodos", query="SELECT c FROM Ciudadano c"))
public class Ciudadano implements Serializable{

    @Id
    @Column(name = "Cedula")
    private int cedula;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Apellido")
    private String apellido;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "Prestamos",
            joinColumns = @JoinColumn(name = "Cedula"),
            inverseJoinColumns = @JoinColumn(name = "ISBN")
    )
    private List<Libro> libros = new ArrayList<>();

    public Ciudadano() {
    }

    public Ciudadano(int cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Ciudadano{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }

}
