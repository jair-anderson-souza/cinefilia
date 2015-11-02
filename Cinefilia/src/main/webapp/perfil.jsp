<%-- 
    Document   : perfil
    Created on : Nov 2, 2015, 11:22:18 AM
    Author     : anderson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Perfil - ${requestScope.perfil.primeiroNome} ${requestScope.perfil.segundoNome}</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-lg-3 col-sm-3">
                    <div class="panel panel-default text-center">
                        <div class="panel-heading">
                            <span class="fa-stack fa-5x">
                                <i class="fa fa-circle fa-stack-2x text-primary"></i>
                                <i class="fa fa-tree fa-stack-1x fa-inverse"></i>
                            </span>
                        </div>
                    </div>
                </div>
                <div class="col-lg-9 col-sm-9">
                    <div class="panel-body">
                        <h2>Nome: ${requestScope.perfil.primeiroNome} ${requestScope.perfil.segundoNome}</h2>
                        <h3>Data de Nascimento: ${requestScope.perfil.dataDeNascimento} </h3>
                        <h3>Cidade: ${requestScope.perfil.cidade} </h3>
                        <h3>Estado: ${requestScope.perfil.estado} </h3>
                        
                        <a href="controller?command=AdicionarAosAmigos&email=${perfil.email}" class="btn btn-primary">Adicionar aos Amigos</a>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
