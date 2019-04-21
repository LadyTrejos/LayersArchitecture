/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function displayNuevoLibro() 
{
    document.getElementById("devolucionLibro").style.display = "none";
    document.getElementById("prestamos").style.display = "none";
    document.getElementById("buscarLibro").style.display = "none";
    document.getElementById("nuevoLibro").style.display = "block";
}

function displayDevolucionLibro() 
{
    document.getElementById("nuevoLibro").style.display = "none";
    document.getElementById("prestamos").style.display = "none";
    document.getElementById("buscarLibro").style.display = "none";
    document.getElementById("devolucionLibro").style.display = "block";
}

function displayPrestamos() 
{
    document.getElementById("nuevoLibro").style.display = "none";
    document.getElementById("devolucionLibro").style.display = "none";
    document.getElementById("buscarLibro").style.display = "none";
    document.getElementById("prestamos").style.display = "block";
}

function displayBuscarLibro() 
{
    document.getElementById("nuevoLibro").style.display = "none";
    document.getElementById("devolucionLibro").style.display = "none";
    document.getElementById("prestamos").style.display = "none";
    document.getElementById("buscarLibro").style.display = "block";
}
