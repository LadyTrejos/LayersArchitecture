/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).on("submit", "#buscarLibro", function(event) {
    var $form = $(this);

    $.get($form.attr("action"), $form.serialize(), function(responseText) {
        $("#resultado").wrapInner(responseText);
    });

    event.preventDefault(); // Important! Prevents submitting the form.
});
