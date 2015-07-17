<%@page import="com.libertadorweb.clase.Recibo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="es">
<head>
    <jsp:include page="/layout/head.jsp"/>
</head>
<body>

	<header>
		<div class="logo">
			<img src="imagenes/logo.png" alt="Futbol5"/>
		</div>
		<div class="titular">
			<h1 class="titulo">
				Comunidad Educativa
			</h1>
			<div>
				<a href="#" class="filtro">
					El Libertador
				</a>
			</div>
		</div>
                
	</header>

	<nav>
		<ul class="menu">
                    <jsp:include page="/layout/nav.jsp"/>
		</ul>
	</nav>

	<div  class="container">
		<div class="main_content">
			<div class="header">
				<h5>Importar recibos del Gestor de Cola</h5>
				<div class="hit">Se importara todos los recibos almacenados en el Gestor de Cola
				</div>
			</div>
			<div class="body">
                            <form action="ImportarRecibo" method="post"> 
                                <span class="boton"><input name="commit" type="submit" value="Importar Recibos"></span>                        
                            </form>
                    				 	
			</div>
			<section class="partidos">
			</section>				                
		</div>	
	</div>
              
	
	<footer>
       <jsp:include page="/layout/footer.jsp"/>
	</footer>

  
</body>
</html>
