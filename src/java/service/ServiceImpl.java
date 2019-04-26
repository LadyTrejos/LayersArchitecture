package service;

import dao.CiudadanoDAOLocal;
import dao.LibroDAOLocal;
import java.util.List;
import modelo.Ciudadano;
import modelo.Libro;

public class ServiceImpl implements Service {

    public CiudadanoDAOLocal ciudadanoDAO;
    public LibroDAOLocal libroDAO;

    @Override
    public boolean prestarLibro(String ISBN, int cedula) {
        Ciudadano ciudadano = ciudadanoDAO.buscarCiudadano(cedula);
        Libro libro = libroDAO.buscarLibro(ISBN);
        int ejemplares = libro.getNum_ejemplares();

        if (ejemplares == 0) {
            return false;
        } else {
            libro.setNum_ejemplares(ejemplares - 1);
            ciudadano.getLibros().add(libro);
            libro.getCiudadanos().add(ciudadano);
            ciudadanoDAO.editarCiudadano(ciudadano);
            libroDAO.editarLibro(libro);
            return true;
        }

    }

    @Override
    public void devolverLibro(String isbn, int cedula) {
        Ciudadano ciudadano = ciudadanoDAO.buscarCiudadano(cedula);
        Libro libro = libroDAO.buscarLibro(isbn);
        libro.setNum_ejemplares(libro.getNum_ejemplares() + 1);

        ciudadano.getLibros().remove(libro);
        libro.getCiudadanos().remove(ciudadano);
        ciudadanoDAO.editarCiudadano(ciudadano);
        libroDAO.editarLibro(libro);
    }

    @Override
    public List<Libro> verPrestamosPorCiudadano(int cedula) {
        Ciudadano ciudadano = ciudadanoDAO.buscarCiudadano(cedula);
        List<Libro> libros = ciudadano.getLibros();
        return libros;
    }

    @Override
    public List<Ciudadano> verPrestamosPorLibro(String ISBN) {
        Libro libro = libroDAO.buscarLibro(ISBN);
        List<Ciudadano> ciudadanos = libro.getCiudadanos();
        return ciudadanos;
    }
}
