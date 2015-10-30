<%-- 
    Document   : deleteProfile
    Created on : Sep 24, 2015, 7:18:02 PM
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

        <title>Cinefilia</title>

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
            }
            ;
        </script>
    </head>

    <body>

        <!-- Team Members -->

<!--        <div class="container">
            <div class="jumbotron">
                <h1 style="font-family: Verdana;">Cinefilia</h1>      
                <p>A sua rede social de filmes</p>      
            </div>
        </div>  -->

        <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="background/transcendence.jpg" alt="Transcendence" width="1500" height="700">
        <div class="carousel-caption">
          <h3>Transcendence</h3>
        </div>      
      </div>

      <div class="item">
        <img src="background/oiluminado.png" alt="O Iluminado" width="1500" height="700">
        <div class="carousel-caption">
          <h3>O Iluminado</h3>
        </div>      
      </div>
    
      <div class="item">
        <img src="background/starwars.jpg" alt="Star Wars Awakening Force" width="1500" height="700">
        <div class="carousel-caption">
          <h3>Star Wars Awakening Force</h3>
        </div>      
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
</div>

<div id="band" class="container text-center">
    <h3>Amamos Filmes!!</h3>
    <p><small>We have created a fictional band website. 
            Lorem ipsum dolor sit amet, consectetur adipiscing elit, 
            sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. 
            Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris 
            nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit 
            in voluptate velit esse cillum dolore eu fugiat nulla pariatur. 
            Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia 
            deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod 
            tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, 
            quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</small></p>
            <br>
            <div class="row">
                <div class="col-sm-6">
                    <p class="text-center"><strong>Anderson Souza</strong></p><br>
                        <img src="background/perfil.jpg" class="img-circle person" alt="Random Name" width="155" height="180">
                        <p>Dev Back-End</p>
                        <p>Loves long walks on the beach</p>
                        <p>Member since 1988</p>
                </div>
                <div class="col-sm-6">
                    <p class="text-center"><strong>Jederson Moura</strong></p><br>
                        <img src="background/perfil2.jpg" class="img-circle person" alt="Random Name" width="155" height="180">
                        <p>Dev Back-End</p>
                        <p>Loves long walks on the beach</p>
                        <p>Member since 1988</p>
                    <div id="demo2" class="collapse">
                        <p>Drummer</p>
                        <p>Loves drummin'</p>
                        <p>Member since 1988</p>
                    </div>
                </div>
                
            </div>
        </div>



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
