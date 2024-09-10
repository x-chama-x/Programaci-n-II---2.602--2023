# Proyecto de Pruebas de Aplicación Web version 2

Este proyecto es una aplicación web simple desarrollada en Java utilizando el framework de servlets de Jakarta EE. La aplicación permite a los usuarios enviar un formulario con su nombre, apellido y color favorito, y luego muestra un saludo personalizado con el color favorito del usuario.

## Estructura del Proyecto

- `src/main/webapp/index.html`: Página principal que contiene el formulario HTML.
- `src/main/webapp/WEB-INF/web.xml`: Archivo de configuración del servlet.
- `src/main/java/com/mycompany/projecto/para/pruebas/de/aplicacion/web/saludoEspecialServlet.java`: Servlet que maneja la lógica del formulario y genera la respuesta HTML.
- `src/main/webapp/WEB-INF/saludo.jsp`: Página JSP que muestra el saludo personalizado.

## Descripción de Archivos

### `index.html`

Este archivo contiene un formulario HTML que solicita al usuario su nombre, apellido y color favorito. El formulario se envía mediante el método POST a la URL `/saludar`.

### `web.xml`

Este archivo configura el servlet `saludoEspecialServlet` y mapea la URL `/saludar` a este servlet.

### `saludoEspecialServlet.java`

Este servlet maneja las solicitudes POST enviadas desde el formulario. Realiza las siguientes acciones:

1. Obtiene los parámetros del formulario (`nombre`, `apellido`, `color`).
2. Obtiene el User-Agent y el idioma del navegador.
3. Determina el navegador y el sistema operativo del usuario.
4. Establece los atributos de la solicitud con la información obtenida.
5. Reenvía la solicitud a la página JSP `saludo.jsp`.

### `saludo.jsp`

Esta página JSP genera una respuesta HTML que muestra un saludo personalizado con el color favorito del usuario. Utiliza los atributos establecidos en el servlet para mostrar el nombre, apellido, color favorito, navegador, idioma y sistema operativo del usuario.

## Modificaciones Realizadas

Se ha incorporado una nueva página JSP (`saludo.jsp`) para separar la lógica de presentación de la lógica de negocio. Anteriormente, la respuesta HTML se generaba directamente en el servlet, lo cual no seguía las mejores prácticas de desarrollo web. Ahora, el servlet maneja la lógica de negocio y reenvía la solicitud a la página JSP, que se encarga de la presentación.

## Cómo Ejecutar

1. Clona el repositorio en tu máquina local.
2. Importa el proyecto en tu IDE preferido (por ejemplo, IntelliJ IDEA).
3. Asegúrate de tener configurado un servidor compatible con Jakarta EE (por ejemplo, Apache Tomcat).
4. Despliega la aplicación en el servidor.
5. Accede a la aplicación a través de tu navegador web en la URL correspondiente (por ejemplo, `http://localhost:8080/tu-contexto/index.html`).

## Requisitos

- Java 11 o superior
- Maven 3.6.0 o superior
- Servidor de aplicaciones compatible con Jakarta EE 9 o superior
