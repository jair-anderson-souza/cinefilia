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
                <h1 class="page-header">Cadastro de Filmes</h1>
                <form role="form" action="controller?command=AdicionarFilmeCommand" method="post">
                    <div class="form-group">
                        <label for="titulo">Titulo</label>
                        <input type="text" name="titulo" class="form-control" id="titulo">
                    </div>
                    <div class="form-group">
                        <label for="ano">Ano</label>
                        <input type="text" name="ano" class="form-control" id="ano">
                    </div>
                    <div class="form-group">
                        <label for="sinopse">Sinopse</label>
                        <textarea class="form-control" name="sinopse" rows="3" id="sinopse"></textarea>
                    </div>
                    <div class="form-group">
                        <label for="ano">Foto</label>
                        <input type="text" name="" class="form-control" id="ano">
                    </div>
                    
                     <div class="checkbox">
                         <label><input name="genero" type="checkbox"> Açao</label>
                    </div>
                     <div class="checkbox">
                        <label><input name="genero" type="checkbox"> Drama</label>
                    </div>
                    
                    <br>
                    <br>
                    
                    <div class="checkbox"></div>
                    <button type="submit" class="btn btn-default">Cadastrar</button>
                </form>
            </div>
        </div>

        <br>
        <br>
        <br>
        <br>
       
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

    </body>
</html>
