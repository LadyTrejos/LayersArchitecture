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
    public void prestarLibro(String ISBN, int cedula) {
        Libro libro = em.find(Libro.class, ISBN);
        Ciudadano ciudadano = buscarCiudadano(cedula);
        
        ciudadano.addLibro(libro);
        libro.addCiudadano(ciudadano);
    }

    
}
