/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import modelo.Ciudadano;
import modelo.Libro;

/**
 *
 * @author lady
 */
public interface Service {
    boolean prestarLibro(String ISBN, int cedula);
    void devolverLibro(String isbn, int cedula);
    List<Libro> verPrestamosPorCiudadano(int cedula);
    List<Ciudadano> verPrestamosPorLibro(String ISBN);
}
