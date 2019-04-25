package dao;

import java.util.List;
import javax.ejb.Local;
import modelo.Ciudadano;

@Local
public interface CiudadanoDAOLocal {

    void agregarCiudadano(Ciudadano ciudadano);

    void editarCiudadano(Ciudadano ciudadano);

    void eliminarCiudadano(int cedula);

    Ciudadano buscarCiudadano(int cedula);

    List<Ciudadano> verCiudadanos();

    void prestarLibro(String ISBN, int cedula);

    
}
