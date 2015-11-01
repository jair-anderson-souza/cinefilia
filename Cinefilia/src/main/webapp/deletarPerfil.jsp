<%-- 
    Document   : deleteProfile
    Created on : Sep 24, 2015, 7:18:02 PM
    Author     : Anderson Souza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="header.jsp" %>
        
        <form action="controller?command=DeleteUsuarioCommand" name="deletar" method="post">
            
            <label>Digite seu email/apelido pra confirmar:</label>
            <input type="text" name="username">
            
            <br>
            
            <label>Digite sua senha pra confirmar:</label>
            <input type="password" name="password">
            
            <br>
            
            <input type="submit" value="Enviar">
        
        </form>
        
        <%@include file="footer.jsp" %>
    </body>
</html>
