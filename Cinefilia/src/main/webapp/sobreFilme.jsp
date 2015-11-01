<%-- 
    Document   : mostraFilme
    Created on : Oct 23, 2015, 2:21:34 PM
    Author     : jairanderson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p>${requestScope.filme.ano}</p>
        <p>${requestScope.filme.titulo}</p>
        <p>${requestScope.filme.idUsuario}</p>
        <p>${requestScope.filme.idFilme}</p>
    </body>
</html>
