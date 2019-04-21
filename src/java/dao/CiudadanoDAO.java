package dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.Ciudadano;

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

    
}
