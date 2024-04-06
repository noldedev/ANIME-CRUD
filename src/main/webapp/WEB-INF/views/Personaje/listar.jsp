<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<body>
	 	<div class="container mt-2">
		<h1>Personajes</h1>
		<a href="/senati/index">Volver al Inicio</a>
		<a href="/senati/anime/listar">Volver a Animes</a>
		<a href="/senati/personaje/registrar">Registrar</a>
		<div class="table-responsive">
			<table class="table table-bordered">
			<thead>
				<tr>
					<th>#ID</th>
					<th>Nombres</th>
					<th>Anime</th>
					<th>Acciones</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="personaje" items="${bPersonaje}">
					<tr>
						<td>${personaje.personajeId}</td>
						<td>${personaje.nombres}</td>
						<td>${personaje.anime.nombre}</td>
						<td>
							<a href="/senati/personaje/editar/${personaje.personajeId}">Editar</a>
							<a href="/senati/personaje/borrar/${personaje.personajeId}">Eliminar</a>
							<a href="/senati/personaje/detalle/${personaje.personajeId}">Detalles</a>
						</td>			
					</tr>
				</c:forEach>
			</tbody>
		</table>
		</div>
	</div>
 
 <script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>
</html>