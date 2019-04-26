package dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.Ciudadano;
import modelo.Libro;

@Stateless
public class CiudadanoDAO implements CiudadanoDAOLocal {
    @PersistenceContext
    private EntityManager em;
    
    private LibroDAOLocal libroDAO;
    
    @Override
    public void agregarCiudadano(Ciudadano ciudadano) {
        em.persist(ciudadano);
    }

    @Override
    public void editarCiudadano(Ciudadano ciudadano) {
        em.merge(ciudadano);
    }

    @Override
    public void eliminarCiudadano(int cedula) {
        em.remove(buscarCiudadano(cedula));
    }

    @Override
    public Ciudadano buscarCiudadano(int cedula) {
        return em.find(Ciudadano.class, cedula);
    }

    @Override
    public List<Ciudadano> verCiudadanos() {
        return em.createNamedQuery("Ciudadano.verTodos").getResultList();
    }

    @Override
    public boolean prestarLibro(String ISBN, int cedula) {
        Ciudadano ciudadano = buscarCiudadano(cedula);
        Libro libro = em.find(Libro.class, ISBN);
        int ejemplares = libro.getNum_ejemplares();

        if (ejemplares == 0) {
            return false;
        } else {
            libro.setNum_ejemplares(ejemplares - 1);
            ciudadano.getLibros().add(libro);
            libro.getCiudadanos().add(ciudadano);
            editarCiudadano(ciudadano);
            //libroDAO.editarLibro(libro);
            return true;
        }

    }

    @Override
    public void devolverLibro(String isbn, int cedula) {
        Ciudadano ciudadano = buscarCiudadano(cedula);
        Libro libro = em.find(Libro.class, isbn);
        libro.setNum_ejemplares(libro.getNum_ejemplares() + 1);

        ciudadano.getLibros().remove(libro);
        libro.getCiudadanos().remove(ciudadano);
        editarCiudadano(ciudadano);
        //libroDAO.editarLibro(libro);
    }

    
}
