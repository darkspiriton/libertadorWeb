<%-- 
    Document   : buscarRegistro
    Created on : Jul 16, 2015, 8:51:04 PM
    Author     : StOn
--%>

<%@page import="com.libertadorweb.clase.Recibo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="lrecibo" class="java.util.ArrayList" scope="session"/>
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
				<h5>Buscar recibos por DNI</h5>
				<div class="hit">La busqueda de recibos se realizara por el DNI asociado
				</div>
			</div>
			<div class="body">
                            <form action="BuscarRecibo" method="post">	   
                                <p><label for="dni">DNI</label><input placeholder="Ingrese su dni" id="dni" name="dni" type="text" required/></p>
                                <span class="boton"><input name="commit" type="submit" value="Buscar Recibos"></span>                        
                            </form>
                    				 	
			</div>
			<section class="partidos">

                <% if (lrecibo != null ) { %>                   
             	<%for (int i=0; i < lrecibo.size(); i++ ) {Recibo r = (Recibo)lrecibo.get(i);%>

				<article class="partido">
					<div class="descripcion">
						<figure class="imagen">
							<img src="imagenes/foto.png" />
						</figure>
						<div class="detalles">
							<h2 class="titulo">
								<%= r.getDni() %>
							</h2>
							<p class="autor">
								Codigo: <span class="nombreAutor"><%= r.getCod() %></span>
							</p>
							<a href="#" class="horario">Monto: <%= r.getMonto() %> </a>
							<p class="fecha"><strong></strong>Estado</p>
						</div>
					</div>

				 </article>
                             <%} %><% }else { %>
                	
                        <%}%>

			</section>				                
		</div>	
	</div>
              
	
	<footer>
       <jsp:include page="/layout/footer.jsp"/>
	</footer>

  
</body>
</html>
