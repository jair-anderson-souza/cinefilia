<%-- 
    Document   : header
    Created on : Sep 10, 2015, 2:03:09 PM
    Author     : Anderson Souza
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">


        <!-- Bootstrap Core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="css/modern-business.css" rel="stylesheet">

        <!-- Custom Fonts -->
        <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

    </head>
    <body>
        <!-- Modal -->
        <div id="cadastro" class="modal fade" role="dialog">
            <div class="modal-dialog">
                <!-- Modal content-->
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                        <h4 class="modal-title">Cadastro</h4>
                    </div>
                    <div class="modal-body">
                        <form role="form" action="controller?command=AdicionarUsuarioCommand" method="post">
                            <div class="modal-body">
                                <input type="file" name="foto" onchange="readURL(this);">
                                <img src="#" id="foto" class="img-responsive">
                            </div>

                            <div class="form-group">
                                <label for="primeiroNome">Nome</label>
                                <input type="text" class="form-control" id="primeiroNome" name="primeiro">
                            </div>

                            <div class="form-group">
                                <label for="segundoNome" >Sobrenome</label>
                                <input type="text" class="form-control" id="segundoNome" name="segundoNome">
                            </div>

                            <div class="form-group">
                                <label for="apelido" >Apelido</label>
                                <input type="text" class="form-control" id="apelido" name="apelido">
                            </div>

                            <div class="form-group">
                                <label for="email">Email</label>
                                <input type="email" name="email" class="form-control" id="email">
                            </div>

                            <div class="form-group">
                                <label for="password">Senha</label>
                                <input type="password" name="password" class="form-control" id="password">
                            </div>



                            <div class="form-group">
                                <label for="dataDeNascimento">Data de Nascimento</label>
                                <input type="text" name="dataDeNascimento" class="form-control" id="dataDeNascimento" pattern="\d{1,2}/\d{1,2}/\d{4}" title="Padrão dd/MM/YYYY">
                            </div>

                            <div class="form-group">
                                <label for="cidade">Cidade</label>
                                <input type="text" name="cidade" class="form-control" id="cidade">
                            </div>
                            <div class="form-group">
                                <label for="estado">Estado</label>
                                <input type="text" name="estado" class="form-control" id="estado">
                            </div>

                            <div class="checkbox">
                                <label><input type="checkbox">Lembrar</label>
                            </div>
                            <button type="submit" class="btn btn-default">Entrar</button>
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Fechar</button>
                    </div>
                </div>

            </div>
        </div>
    </div>
        <div id="deletarCadastro" class="modal fade" role="dialog">
            <div class="modal-dialog">
                <!-- Modal content-->
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                        <h4 class="modal-title">Excluir Conta</h4>
                    </div>
                    <div class="modal-body">
                        <form role="form" action="controller?command=DeleteUsuarioCommand" method="post">
                            <div class="modal-body">
                                <button type="button" class="close" data-dismiss="modal">&times;</button>
                                <h4 class="modal-title"></h4>
                            </div>

                            <div class="form-group">
                                <label for="email">Email</label>
                                <input type="email" name="username" class="form-control" id="email">
                            </div>

                            <div class="form-group">
                                <label for="password">Senha</label>
                                <input type="password" name="password" class="form-control" id="password">
                            </div>
                            
                            <button type="submit" class="btn btn-default">Excluir</button>
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Fechar</button>
                    </div>
                </div>

            </div>
        </div>
    </div>
    <div id="editarCadastro" class="modal fade" role="dialog">
        <div class="modal-dialog">
            <!-- Modal content-->
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title">Editar Cadastro</h4>
                </div>
                <div class="modal-body">
                    <form role="form" action="controller?command=EditarUsuarioCommand" method="post">
                        <div class="modal-body">
                            <input type="file" name="foto" onchange="readURL(this);">
                            <img src="#" id="foto" class="img-responsive">
                        </div>

                        <div class="form-group">
                            <label for="primeiroNome">Nome</label>
                            <input type="text" class="form-control" id="primeiroNome" name="primeiroNome" placeholder="${sessionScope.usuario.primeiroNome}" value="${sessionScope.usuario.primeiroNome}">
                        </div>

                        <div class="form-group">
                            <label for="segundoNome" >Sobrenome</label>
                            <input type="text" class="form-control" id="segundoNome" name="segundoNome" value="${sessionScope.usuario.segundoNome}">
                        </div>

                        <div class="form-group">
                            <label for="apelido" >Apelido</label>
                            <input type="text" class="form-control" id="apelido" name="apelido" value="${sessionScope.usuario.apelido}">
                        </div>

                        <div class="form-group">
                            <label for="email">Email</label>
                            <input type="email" name="email" class="form-control" id="email" value="${sessionScope.usuario.email}">
                        </div>

                        <div class="form-group">
                            <label for="password">Senha</label>
                            <input type="password" name="password" class="form-control" id="password" value="${sessionScope.usuario.password}">
                        </div>



                        <div class="form-group">
                            <label for="dataDeNascimento">Data de Nascimento</label>
                            <input type="text" name="dataDeNascimento" class="form-control" id="dataDeNascimento" pattern="\d{1,2}/\d{1,2}/\d{4}" title="Padrão dd/MM/YYYY"  value="${sessionScope.usuario.dataDeNascimento}">
                        </div>

                        <div class="form-group">
                            <label for="cidade">Cidade</label>
                            <input type="text" name="cidade" class="form-control" id="cidade" value="${sessionScope.usuario.cidade}">
                        </div>
                        <div class="form-group">
                            <label for="estado">Estado</label>
                            <input type="text" name="estado" class="form-control" id="estado" value="${sessionScope.usuario.estado}">
                        </div>

                        <div class="checkbox">
                            <label><input type="checkbox">Lembrar</label>
                        </div>
                        <button type="submit" class="btn btn-default">Entrar</button>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Fechar</button>
                </div>
            </div>

        </div>
    </div>
</div>

<!-- Modal -->
<div id="login" class="modal fade" role="dialog">
    <div class="modal-dialog">
        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">Login</h4>
            </div>
            <div class="modal-body">
                <form role="form" action="controller?command=LoginUsuarioCommand" method="post">
                    <div class="form-group">
                        <label for="email">Username</label>
                        <input type="email" name="username" class="form-control" id="email">
                    </div>

                    <div class="form-group">
                        <label for="password">Senha</label>
                        <input type="password" name="senha" class="form-control" id="password">
                    </div>

                    <div class="checkbox">
                        <label><input type="checkbox">Lembrar</label>
                    </div>
                    <button type="submit" class="btn btn-default">Entrar</button>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Fechar</button>
            </div>
        </div>

    </div>
</div>
</div>

<!-- Navigation -->
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav navbar-right">

                <li>
                    <a href="index.jsp">Pagina Inicial</a>
                </li>

                <li>
                    <a href="controller?command=RecuperaFilmesCommand">Filmes</a>
                </li>

                <c:if test="${sessionScope.usuario == null}">
                    <li>
                        <a href="#" data-toggle="modal" data-target="#cadastro"><span class="glyphicon glyphicon-user"></span> Sign Up</a>
                    </li>
                    <li>
                        <a href="#" data-toggle="modal" data-target="#login"><span class="glyphicon glyphicon-log-in"></span> Login</a>
                    </li>


                </c:if>
                <c:if test="${sessionScope.usuario != null}">
                    <li>
                        <a href="controller?command=VerTodosOsUsuarios">Usuarios</a>
                    </li>
                    <li>
                        <a href="controller?command=RecuperaGruposCommand">Grupos</a>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Perfil <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li>
                                <a href="#" data-toggle="modal" data-target="#editarCadastro">Editar Perfil</a>
                            </li>
                            <li>
                                <a href="#" data-toggle="modal" data-target="#deletarCadastro">Excluir Perfil</a>
                            </li>
                        </ul>
                    </li>
                </c:if>
                <li>
                    <form action="controller?command=PesquisaFilmePorTituloCommand" method="post" class="navbar-form pull-right">
                        <!--<input type="text" name="pesquisa" class="span3">-->
                        <div class="input-group">
                            <input type="text" class="form-control" placeholder="Search for...">
                            <span class="input-group-btn">
                                <button class="btn btn-default" type="button"><span  class="glyphicon glyphicon-search" aria-hidden="true"></span></button>
                            </span>
                        </div>
                        <!--                        <button type="submit" class="btn">Search<span class="glyphicon glyphicon-search" aria-hidden="true"></span></button>-->
                    </form>
                </li>
            </ul>



        </div>

    </div>
</nav>
</body>
</html>