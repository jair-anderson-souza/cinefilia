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
        <!-- Bootstrap Core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="css/modern-business.css" rel="stylesheet">

        <!-- Custom Fonts -->
        <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <!-- Bootstrap Core CSS -->
        


        <!-- Custom Fonts -->
        <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <link class="jsbin" href="http://ajax.googleapis.com/ajax/libs/jqueryui/1/themes/base/jquery-ui.css" rel="stylesheet" type="text/css" />
        <script class="jsbin" src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
        <script class="jsbin" src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.0/jquery-ui.min.js"></script>
        <script>
            function readURL(input) {
                if (input.files && input.files[0]) {
                    var reader = new FileReader();
                    reader.onload = function (e) {
                        $('#foto')
                                .attr('src', e.target.result)
                                .width(150)
                                .height(200);
                    };
                    reader.readAsDataURL(input.files[0]);
                }
            $("#plus").click(function(){
                alert('Vai pow');
            });
        };
        </script>
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
                    <div class="modal-body">
                        <input type="file" name="foto" onchange="readURL(this);">
                        <img src="#" id="foto" class="img-responsive">
                    </div>
                    <div class="form-group">
                        <label for="titulo">Titulo</label>
                        <input type="text" name="titulo" class="form-control" id="titulo">
                    </div>
                    <div class="form-group">
                        <label for="ano">Ano</label>
                        <input type="number" name="ano" class="form-control" id="ano">
                    </div>
                    <div class="form-group">
                        <label for="sinopse">Sinopse</label>
                        <textarea class="form-control" name="sinopse" rows="3" id="sinopse"></textarea>
                    </div>
                    <div class="form-group">
                        <label>Generos</label><br>
                        <div class="checkbox-inline" required>
                            <label><input name="genero" value="acao" type="checkbox"> Açao</label>
                        </div>
                        <div class="checkbox-inline">
                            <label><input name="genero" value="drama" type="checkbox"> Drama</label>
                        </div>
                        <div class="checkbox-inline">
                            <label><input name="genero" value="romance" type="checkbox"> Romance</label>
                        </div>
                        <div class="checkbox-inline">
                            <label><input name="genero" value="comedia" type="checkbox"> Comédia</label>
                        </div>
                        <div class="checkbox-inline">
                            <label><input name="genero" value="thrash" type="checkbox"> Thrash</label>
                        </div>
                        <div class="checkbox-inline">
                            <label><input name="genero" value="terror" type="checkbox"> Terror</label>
                        </div>
                        <div class="checkbox-inline">
                            <label><input name="genero" value="suspense" type="checkbox"> Suspense</label>
                        </div><br><br>
                        <div class="form-group">
                            <label>Atores</label>
                            <div class="input-group">
                                <input type="text" name="atores" id="formzinho" class="form-control">
                                    <span class="input-group-btn">
                                        <button class="btn btn-success" id="plus" type="button">
                                            <span  class="glyphicon glyphicon-plus" aria-hidden="true"></span>
                                        </button>
                                    </span>
                            </div>
                        </div>
                        
                        <div class="form-group">
                            <label>Diretores</label>
                            <div class="input-group">
                                <input type="text" name="diretores" class="form-control">
                                    <span class="input-group-btn">
                                        <button class="btn btn-success"  type="button">
                                            <span  class="glyphicon glyphicon-plus" aria-hidden="true"></span>
                                        </button>
                                    </span>
                            </div>
                        </div>
                        
                        
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
        <!-- jQuery -->
        <script src="js/jquery.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="js/bootstrap.min.js"></script>

        <!-- Script to Activate the Carousel -->
        <script>
                            $('.carousel').carousel({
                                interval: 5000 //changes the speed
                            });
        </script>

    </body>
</html>
