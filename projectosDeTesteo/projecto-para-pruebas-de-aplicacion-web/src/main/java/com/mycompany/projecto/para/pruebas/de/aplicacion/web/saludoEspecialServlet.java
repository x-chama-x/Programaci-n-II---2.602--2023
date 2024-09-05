
package com.mycompany.projecto.para.pruebas.de.aplicacion.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.io.PrintWriter;

public class saludoEspecialServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener los parámetros del formulario
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String colorFavorito = request.getParameter("color");
        
        // Configurar la respuesta
        configurarRespuesta(response);

        // Generar la respuesta HTML
        try (PrintWriter out = response.getWriter()) {
            generarRespuestaHTML(out, nombre, apellido, colorFavorito);
        } // try-with-resources cierra automáticamente el recurso PrintWriter, sirve para evitar memory leaks (fugas de memoria)

    }

    private void configurarRespuesta(HttpServletResponse response) {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
    }


    private void generarRespuestaHTML(PrintWriter out, String nombre, String apellido, String colorFavorito) {
        out.println("<!DOCTYPE html>");
        out.println("<html lang='es'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>Saludo Personalizado</title>");
        out.println("<style>");
        out.println("body { font-family: Arial, sans-serif; text-align: center; }");
        out.println("h1 { color: " + colorFavorito + "; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>¡Hola, " + nombre + " " + apellido + "!</h1>");
        out.println("<p>Tu color favorito es: <span style='color: " + colorFavorito + ";'>" + colorFavorito + "</span></p>");
        out.println("</body>");
        out.println("</html>");
    }
}
