package dao;

import java.util.List;
import javax.ejb.Local;
import modelo.Ciudadano;
import modelo.Libro;

@Local
public interface CiudadanoDAOLocal {

    void agregarCiudadano(Ciudadano ciudadano);

    void editarCiudadano(Ciudadano ciudadano);

    void eliminarCiudadano(int cedula);

    Ciudadano buscarCiudadano(int cedula);

    List<Ciudadano> verCiudadanos();
    
    boolean prestarLibro(String ISBN, int cedula);
    
    void devolverLibro(String isbn, int cedula);

    List<Libro> verPrestamosCiudadano(int cedula);
}
