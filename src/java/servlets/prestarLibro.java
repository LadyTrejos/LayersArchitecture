/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.servlet;

import dao.CiudadanoDAOLocal;
import java.io.IOException;
import java.io.PrintWriter;
import static java.util.Objects.isNull;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jdk.nashorn.internal.runtime.JSType;
import modelo.Ciudadano;

/**
 *
 * @author jd
 */
@WebServlet(name = "prestarLibro", urlPatterns = {"/prestar"})
public class prestarLibro extends HttpServlet {
    
    @EJB
    private CiudadanoDAOLocal ciudadanoDAO;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String check = request.getParameter("check");
        String isbn = request.getParameter("isbn");
        int cedula = Integer.parseInt(request.getParameter("cedula"));
        PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
        if (isNull(check)) {
            String nombre = request.getParameter("nombre");
            String apellidos = request.getParameter("apellido");
            
            Ciudadano ciudadano = new Ciudadano(cedula, nombre, apellidos);
            
            ciudadanoDAO.agregarCiudadano(ciudadano);
        }
        
        if (ciudadanoDAO.buscarCiudadano(cedula) != null){
            boolean resultado = ciudadanoDAO.prestarLibro(isbn, cedula);
            response.sendRedirect("/Biblioteca/faces/libros.xhtml");
        } else {
            out.println("<div class='popupInfo'>");
            out.println("<h4>No se ha encontrado al ciudadano con cédula " + cedula + "</h4>");
            out.println("</div>");
        }
        
        
        
        
    }   

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
