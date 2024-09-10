package com.mycompany.projecto.para.pruebas.de.aplicacion.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class saludoEspecialServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener los parámetros del formulario
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String colorFavorito = request.getParameter("color");

        // Obtener el User-Agent y el idioma
        String userAgent = request.getHeader("User-Agent");
        String codigoIdioma = request.getLocale().getLanguage();
        String idioma = determinarIdioma(codigoIdioma);

        // Determinar el navegador
        String navegador = determinarNavegador(userAgent);

        // Determinar el sistema operativo
        String sistemaOperativo = determinarSistemaOperativo(userAgent);

        // Establecer los atributos de la solicitud
        establecerAtributosSolicitud(request, nombre, apellido, colorFavorito, navegador, idioma, sistemaOperativo);

        // Reenviar la solicitud al JSP
        request.getRequestDispatcher("/WEB-INF/saludo.jsp").forward(request, response);
    }


    private void establecerAtributosSolicitud(HttpServletRequest request, String nombre, String apellido, String colorFavorito, String navegador, String idioma, String sistemaOperativo) {
        request.setAttribute("nombre", nombre);
        request.setAttribute("apellido", apellido);
        request.setAttribute("colorFavorito", colorFavorito);
        request.setAttribute("navegador", navegador);
        request.setAttribute("idioma", idioma);
        request.setAttribute("sistemaOperativo", sistemaOperativo);
    }

    private String determinarNavegador(String userAgent) {
        String navegador = "Desconocido";
        if (userAgent.contains("Edg")) {
            navegador = "Edge";
        } else if (userAgent.contains("Chrome")) {
            navegador = "Chrome";
        } else if (userAgent.contains("Firefox")) {
            navegador = "Firefox";
        } else if (userAgent.contains("Brave")) {
            navegador = "Brave";
        }
        return navegador;
    }

    private String determinarSistemaOperativo(String userAgent) {
        String sistemaOperativo = "Desconocido";
        if (userAgent.contains("Windows")) {
            sistemaOperativo = "Windows";
        } else if (userAgent.contains("Mac")) {
            sistemaOperativo = "Mac";
        } else if (userAgent.contains("Linux")) {
            sistemaOperativo = "Linux";
        }
        return sistemaOperativo;
    }

    private String determinarIdioma(String codigoIdioma) {
        switch (codigoIdioma) {
            case "es":
                return "Español";
            case "en":
                return "Inglés";
            case "fr":
                return "Francés";
            case "de":
                return "Alemán";
            default:
                return "Desconocido";
        }
    }
}