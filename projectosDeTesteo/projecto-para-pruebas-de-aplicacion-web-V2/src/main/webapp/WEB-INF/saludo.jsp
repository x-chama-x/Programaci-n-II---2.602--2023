<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Saludo Personalizado</title>
    <style>
        body { font-family: Arial, sans-serif; text-align: center; }
        h1 { color: ${colorFavorito}; }
    </style>
</head>
<body>
    <h1>¡Hola, ${nombre} ${apellido}!</h1>
    <p>Tu color favorito es: <span style="color: ${colorFavorito};">${colorFavorito}</span></p>
    <p>Estas usando ${navegador} en ${idioma} sobre el S.O de ${sistemaOperativo}</p>
</body>
</html>