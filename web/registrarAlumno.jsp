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
				<h5>Registrate</h5>
				
			</div>
			<div class="body">
                            <form action="RegistroAlumno" method="post">	   
                                <p><label for="dni">DNI</label><input placeholder="Ingrese su dni" id="dni" name="dni" type="text" required/></p>
                                <p><label for="nombre">Nombre</label><input placeholder="Ingrese su nombre" id="nombre" name="nombre" type="text" required/></p>
                                <p><label for="apellido">Apellido</label><input placeholder="Ingrese su pellido"  id="apellido" name="apellido" type="text" required/></p>
                                <span class="boton"><input name="commit" type="submit" value="Registrar Alumno"></span>                        
                            </form>
                    				 	
			</div>
			<div class="footer">
 				
 			</div>					                
		</div>	
	</div>
              
	
	<footer>
       <jsp:include page="/layout/footer.jsp"/>
	</footer>

  
</body>
</html>

