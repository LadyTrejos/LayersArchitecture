/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function popupLibroInfo(id) {
    document.getElementById(id).style.display = "block";
}

function closeInfo(id) {
    document.getElementById(id).style.display = "none";
}

function registro(checked) {
    document.getElementById("registroNombre").disabled = checked;
    document.getElementById("registroApellido").disabled = checked;
}

$(document).on("submit", "#buscarLibro", function(event) {
    $("#resultado").html("");
   
    var $form = $(this);

    $.get($form.attr("action"), $form.serialize(), function(responseText) {
        $("#resultado").wrapInner(responseText);
    });

    event.preventDefault(); // Important! Prevents submitting the form.
});