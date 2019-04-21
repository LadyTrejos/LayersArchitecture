package dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.Libro;

@Stateless
public class LibroDAO implements LibroDAOLocal {
    @PersistenceContext
    private EntityManager em;
    
    @Override
    public void agregarLibro(Libro libro) {
        em.persist(libro);
    }
    
    @Override
    public void editarLibro(Libro libro) {
        em.merge(libro);
    }
    
    @Override
    public void eliminarLibro(String ISBN) {
        em.remove(buscarLibro(ISBN));
    }

    @Override
    public Libro buscarLibro(String ISBN) {
        return em.find(Libro.class, ISBN);
    } 

    @Override
    public List<Libro> verLibros() {
        return em.createNamedQuery("Libro.verTodos").getResultList();
    }
    
}
