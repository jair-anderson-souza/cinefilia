<%-- 
    Document   : filmes
    Created on : Oct 10, 2015, 7:44:22 PM
    Author     : Anderson Souza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar Filmes</title>
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    </head>
    <body>
        <br>
        <br>
        <br>
        <br>
        <div class="container">
            <div class="col-md-6">
                <form role="form">
                    <div class="form-group">
                        <label for="titulo">Titulo</label>
                        <input type="text" class="form-control" id="titulo">
                    </div>
                    <div class="form-group">
                        <label for="ano">Ano</label>
                        <input type="text" class="form-control" id="ano">
                    </div>
                    <div class="form-group">
                        <label for="sinopse">Sinopse</label>
                        <textarea class="form-control" rows="3" id="sinopse"></textarea>
                    </div>
                    <div class="form-group">
                        <label for="ano">Ano</label>
                        <input type="text" class="form-control" id="ano">
                    </div>
                    <div class="checkbox"></div>
                    <button type="submit" class="btn btn-default">Submit</button>
                </form>
            </div>
        </div>
        <c:if test="${Exception.FilmeException}">
            <%=Erro na hora de salvar %>
        </c:if>


       
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

    </body>
</html>
