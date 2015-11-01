<%-- 
    Document   : verGrupos
    Created on : Nov 1, 2015, 12:58:09 AM
    Author     : anderson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Grupos</title>
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
        <link class="jsbin" href="http://ajax.googleapis.com/ajax/libs/jqueryui/1/themes/base/jquery-ui.css" rel="stylesheet" type="text/css" />
        <script class="jsbin" src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
        <script class="jsbin" src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.0/jquery-ui.min.js"></script>
        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>
        
        <div class="container">
            <div class="row"><br><br>
                
            <div class="col-md-3">
                <div class="list-group">
                    <a href="controller?command=RecuperaGruposCommand" class="active list-group-item">Todos os Grupos</a>
                    <a href="controller?command=VerMeusGrupos" class="list-group-item">Meus Grupos</a>
                </div>
            </div>
             <!--Content Column--> 
            <div class="col-md-9">
                <c:forEach items="${requestScope.meusGrupos}" var="grupo">
                    <div class="col-md-3 text-center">
                        <div class="thumbnail">
                            <div class="caption">
                                <h3>${grupo.nomeGrupo}<br>
                                    <small>${grupo.descricaoTextual}</small>
                                </h3>
                                <ul class="list-inline"><a type="button" href="controller" class="btn btn-success">QQ</a></ul>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
            </div>
        </div>
    </body>
</html>
