/* global tecnologias */

function validarForma(forma) {
    var usuario = forma.usuario;
    if (usuario.value == "" || usuario.value == "Escribir usuario") {
        alert("Debe proporcionar un nombre de usuario");
        usuario.focus();
        usuario.select();
        return false;
    }

    var password = forma.password;
    if (password.value === "" || password.value.length < 3) {
        alert("debe proporcionar un password al menos de 3 caracteres");
        password.focus();
        password.select();
        return false;
    }

    var tecnologia = forma.tecnologias;
    var checkSeleccionado = false;

    for (var i = 0; i < tecnologias.length; i++) {
        if (tecnologias[i].checked) {
            checkSeleccionado = true;
        }
    }

    if (!checkSeleccionado) {
        alert("debe seleccionar una tecnologia");
        return false;
    }

    var generos = forma.genero;
    var radioSeleccionado = false;

    for (var i = 0; i < generos.length; i++) {
        if (generos[i].checked) {
            radioSeleccionado = true;
        }
    }
    if (!radioSeleccionado) {
        alert("debe seleccionar un genero");
        return false;
    }

    var ocupacion = forma.ocupacion;
    if (ocupacion.value === "") {
        alert("debe seleccionar una ocupacion");
        return false;
    }

    //formulario es valido
    alert("formulario valido, enviando datos al servidor");
    return true;
}
