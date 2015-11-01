<%-- 
    Document   : editProfile
    Created on : Sep 22, 2015, 8:17:50 PM
    Author     : Anderson Souza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="model.values.Usuario" session="true"%>  
<jsp:useBean id="usuario" class="model.values.Usuario" scope="session" />

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Perfil</title>
    </head>
    <body>
        
        <h1></h1>
        
        <form action="controller?command=EditarUsuarioCommand" name="editar" method="post">
            
            <label>Primeiro Nome</label>
            <input type=text name="primeiroNome" placeholder="${sessionScope.usuario.primeiroNome}" value="${sessionScope.usuario.primeiroNome}"> 

            <br>

            <label>Segundo Nome</label>
            <input type="text" name="segundoNome" value="${sessionScope.usuario.segundoNome}" required>

            <br>

            <label>Apelido</label>
            <input type="text" name="apelido" value="${sessionScope.usuario.apelido}" required>

            <br>
            
            <label>Email</label>
            <input type="email" name="email" value="${sessionScope.usuario.email}" required>

            <br>

            <label>Senha</label>
            <input type="password" name="password" value="${sessionScope.usuario.password}" required>

            <br>
            
            <label>Data de Nascimento</label>
            <input type="text" name="dataDeNascimento" value="${sessionScope.usuario.dataDeNascimento}" required>

            <br>

            <label>Cidade</label>
            <input type="text" name="cidade" value="${sessionScope.usuario.cidade}" required>

            <br>

            <label>Estado</label>
            <input type="text" name="estado" value="${sessionScope.usuario.estado}" required>

            <br>

            <input type="submit" name="enviar" value="Enviar">

       
    </form>
            
    </body>
</html>
