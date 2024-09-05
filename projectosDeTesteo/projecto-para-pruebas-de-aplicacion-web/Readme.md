# Proyecto de Pruebas de Aplicación Web

Este proyecto es una aplicación web simple desarrollada en Java utilizando el framework de servlets de Jakarta EE. La aplicación permite a los usuarios enviar un formulario con su nombre, apellido y color favorito, y luego muestra un saludo personalizado con el color favorito del usuario.

## Estructura del Proyecto

- `src/main/webapp/index.html`: Página principal que contiene el formulario HTML.
- `src/main/webapp/WEB-INF/web.xml`: Archivo de configuración del servlet.
- `src/main/java/com/mycompany/projecto/para/pruebas/de/aplicacion/web/saludoEspecialServlet.java`: Servlet que maneja la lógica del formulario y genera la respuesta HTML.

## Descripción de Archivos

### `index.html`

Este archivo contiene un formulario HTML que solicita al usuario su nombre, apellido y color favorito. El formulario se envía mediante el método POST a la URL `/saludar`.

### `web.xml`

Este archivo configura el servlet `saludoEspecialServlet` y mapea la URL `/saludar` a este servlet.

### `saludoEspecialServlet.java`

Este servlet maneja las solicitudes POST enviadas desde el formulario. Realiza las siguientes acciones:

1. Obtiene los parámetros del formulario (`nombre`, `apellido`, `color`).
2. Configura la respuesta HTTP.
3. Genera una respuesta HTML que muestra un saludo personalizado con el color favorito del usuario.

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
