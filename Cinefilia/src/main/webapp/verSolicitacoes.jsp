<%-- 
    Document   : verSolicitacoes
    Created on : Nov 2, 2015, 11:36:07 PM
    Author     : anderson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Solicitações de Amizade</title>
    </head>
    <body>
        <c:forEach items="solicitacoes" var="amigo">
            <p>${amigo.primeiroNome}</p>
        </c:forEach>
        
    </body>
</html>
