<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
        <meta charset="UTF-8">
	<meta name="viewport" content="width=device-width,  initial-scale=1, maximum-scale=1">
	<title>El Libertador</title>
	<link rel="stylesheet" href="css/estilos.css"/>
	<link rel="stylesheet" href="css/normalize.css"/>
	
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
		<jsp:include page="/layout/nav.jsp"/>
	</nav>

	<div class="container">
		<div class="main_content">
			<div class="header">
				<h5>Bienvenido a la Web del El Libertador</h5>
				<div class="hit"> </div>
			</div>
			<div class="body">
				
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