/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.ejb.Local;
import modelo.Libro;

/**
 *
 * @author lady
 */
@Local
public interface LibroDAOLocal {

    void agregarLibro(Libro libro);

    void editarLibro(Libro libro);
    
    void eliminarLibro(String ISBN);

    Libro buscarLibro(String ISBN);

    List<Libro> verLibros();

    List<Libro> buscarLibroPorTitulo(String titulo);

}
