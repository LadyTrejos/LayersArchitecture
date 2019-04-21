<%-- 
    Document   : index
    Created on : 18/04/2019, 08:15:28 PM
    Author     : mau
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="js/changeMain.js"></script>
        <title>Biblioteca</title>
    </head>
    <body>
        <header>
            <h1>Biblioteca</h1>
            <nav>
                <ul>
                    <li onclick="displayNuevoLibro()">Nuevo libro</li>
                    <li onclick="displayDevolucionLibro()">Devolución de libro</li>
                    <li onclick="displayBuscarLibro()">Buscar libro</li>
                    <li onclick="displayPrestamos()">Ver préstamos</li>
            </nav>
        </header>
        <main>
            <p>¿Qué deseas hacer?</p>
            <p>Selecciona alguna opción del menú de tu izquierda.</p>
            <div id="nuevoLibro" style="display: none">
                <%@include file="nuevoLibro.html" %>
            </div>
            <div id="devolucionLibro" style="display: none">
                <%@include file="devolucionLibro.html" %>
            </div>
            <div id="buscarLibro" style="display: none">
                <%@include file="buscarLibro.html" %>
            </div>
            <div id="prestamos" style="display: none">
                <%@include file="prestamos.html" %>
            </div>
        </main>
        <footer>
            <h5>Copyright&copy; 2019.</h5>
        </footer>
    </body>
</html>
