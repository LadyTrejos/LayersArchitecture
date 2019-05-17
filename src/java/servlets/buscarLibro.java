
import dao.LibroDAOLocal;
import java.io.IOException;
import javax.ejb.EJB;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Libro;

@WebServlet(urlPatterns = {"/buscar"})
public class buscarLibro extends HttpServlet {

    @EJB
    private LibroDAOLocal libroDAO;

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

        String buscarPor = request.getParameter("buscarPor");
        String buscar = request.getParameter("buscar");
        List<Libro> libros = new ArrayList<>();

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        if (buscar.isEmpty()){
            libros = libroDAO.verLibros();
        }else if (buscarPor.equals("Autor")) {
            libros = libroDAO.buscarLibroPorAutor(buscar);
        } else if (buscarPor.equals("Titulo")) {
            libros = libroDAO.buscarLibroPorTitulo(buscar);
        }

        for (Libro libro : libros) {
            out.println("<div  id='" + libro.getISBN() + "' class='popupInfo'>");
            out.println("<div class='popup-content'>");
            out.println("<span id='" + libro.getISBN() + "' class='close' onclick='closeInfo(this.id)'>&times;</span>");

            out.println("<div class='dataLibro'>");
            out.println("<h4>Titulo: " + libro.getTitulo() + "</h4>");
            out.println("<h5>Autor: " + libro.getAutor() + "</h5>");
            out.println("<h5>ISBN: " + libro.getISBN() + "</h5>");
            out.println("<h5>Ejemplares disponibles: " + libro.getNum_ejemplares() + "</h5>");
            out.println("</div>");

            out.println("<form action='prestar' method='post'>");
            out.println("<input type='hidden' value='" + libro.getISBN() + "' name='isbn'/>");
            out.println("<input type='checkbox' onchange='registro(this.checked)' name='check' value='1'/>");
            out.println("<label>El ciudadano ya se encuentra registrado.</label>");
            out.println("</br>");
            out.println("<input type='text' placeholder='Nombre' id='registroNombre' name='nombre' />");
            out.println("<input type='text' placeholder='Apellidos' id='registroApellido' name='apellido' />");
            out.println("<input type='number' placeholder='Cédula' name='cedula' />");
            out.println("</br>");
            if (libro.getNum_ejemplares() == 0) {
                out.println("<input disabled type='submit' value='Realizar préstamo' />");
                out.println("</br>");
                out.println("<label style=\"color:red;\">No hay ejemplares disponibles.</label>");
            } else {
                out.println("<input type='submit' value='Realizar préstamo' />");

            }
            out.println("</form>");
            out.println("</div>");
            out.println("</div>");

            out.println("<div class='infoLibro'>");
            out.println("<div class='dataLibro'>");
            out.println("<h4>Titulo: " + libro.getTitulo() + "</h4>");
            out.println("<h5>Autor: " + libro.getAutor() + "</h5>");
            out.println("</div>");
            out.println("<button id='" + libro.getISBN() + "'   onclick='popupLibroInfo(this.id)'>Prestar</button>");
            out.println("<hr />");
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
