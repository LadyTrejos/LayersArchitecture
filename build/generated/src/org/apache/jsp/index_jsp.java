package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/nuevoLibro.html");
    _jspx_dependants.add("/devolucionLibro.html");
    _jspx_dependants.add("/buscarLibro.html");
    _jspx_dependants.add("/prestamos.html");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <script src=\"js/changeMain.js\"></script>\r\n");
      out.write("        <title>Biblioteca</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <header>\r\n");
      out.write("            <h1>Biblioteca</h1>\r\n");
      out.write("            <nav>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li onclick=\"displayNuevoLibro()\">Nuevo libro</li>\r\n");
      out.write("                    <li onclick=\"displayDevolucionLibro()\">Devolución de libro</li>\r\n");
      out.write("                    <li onclick=\"displayBuscarLibro()\">Buscar libro</li>\r\n");
      out.write("                    <li onclick=\"displayPrestamos()\">Ver préstamos</li>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </header>\r\n");
      out.write("        <main>\r\n");
      out.write("            <p>¿Qué deseas hacer?</p>\r\n");
      out.write("            <p>Selecciona alguna opción del menú de tu izquierda.</p>\r\n");
      out.write("            <div id=\"nuevoLibro\" style=\"display: none\">\r\n");
      out.write("                ");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--\r\n");
      out.write("To change this license header, choose License Headers in Project Properties.\r\n");
      out.write("To change this template file, choose Tools | Templates\r\n");
      out.write("and open the template in the editor.\r\n");
      out.write("-->\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <form action=\"nuevo\" method=\"POST\">\r\n");
      out.write("            <input type=\"text\" placeholder=\"Titulo\" name=\"titulo\"/>\r\n");
      out.write("            <input type=\"text\" placeholder=\"Autor\" name=\"autor\"/>\r\n");
      out.write("            <input type=\"text\" placeholder=\"ISBN\" name=\"isbn\"/>\r\n");
      out.write("            <input type=\"number\" placeholder=\"Cantidad de copias\" name=\"copias\"/>\r\n");
      out.write("            <input type=\"submit\" value=\"Agregar\" />\r\n");
      out.write("        </form>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"devolucionLibro\" style=\"display: none\">\r\n");
      out.write("                ");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--\r\n");
      out.write("To change this license header, choose License Headers in Project Properties.\r\n");
      out.write("To change this template file, choose Tools | Templates\r\n");
      out.write("and open the template in the editor.\r\n");
      out.write("-->\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <form action=\"#\" method=\"POST\">\r\n");
      out.write("            <input type=\"text\" placeholder=\"Libro\" />\r\n");
      out.write("            <input type=\"number\" placeholder=\"C&eacute;dula\" />\r\n");
      out.write("            <input type=\"submit\" value=\"Registrar devoluci&oacute;n\" />\r\n");
      out.write("        </form>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"buscarLibro\" style=\"display: none\">\r\n");
      out.write("                ");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--\r\n");
      out.write("To change this license header, choose License Headers in Project Properties.\r\n");
      out.write("To change this template file, choose Tools | Templates\r\n");
      out.write("and open the template in the editor.\r\n");
      out.write("-->\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <select form=\"form_buscarLibro\" id=\"buscar\" name=\"buscar\">\r\n");
      out.write("            <option value=\"Titulo\" selected>Titulo</option>\r\n");
      out.write("            <option value=\"Autor\">Autor</option>\r\n");
      out.write("        </select>\r\n");
      out.write("        <form id=\"form_buscarLibro\" action=\"#\" method=\"GET\">\r\n");
      out.write("            <input type=\"text\" placeholder=\"Buscar...\" />\r\n");
      out.write("            <input type=\"submit\" value=\"Buscar\" />\r\n");
      out.write("        </form>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"prestamos\" style=\"display: none\">\r\n");
      out.write("                ");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--\r\n");
      out.write("To change this license header, choose License Headers in Project Properties.\r\n");
      out.write("To change this template file, choose Tools | Templates\r\n");
      out.write("and open the template in the editor.\r\n");
      out.write("-->\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <form action=\"#\" method=\"GET\">\r\n");
      out.write("            <input type=\"number\" placeholder=\"C&eacute;dula\" />\r\n");
      out.write("            <input type=\"submit\" value=\"Buscar\" />\r\n");
      out.write("        </form>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </main>\r\n");
      out.write("        <footer>\r\n");
      out.write("            <h5>Copyright&copy; 2019.</h5>\r\n");
      out.write("        </footer>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
