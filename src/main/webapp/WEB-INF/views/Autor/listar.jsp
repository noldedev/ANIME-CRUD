<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Autor</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>	
	<div class="container mt-2">
		<h1>Autores</h1>
		<a href="/senati/index">Volver al Inicio</a>
		<a href="/senati/anime/listar">Volver a Animes</a>
		<a href="/senati/autor/registrar">Registrar</a>
		<div class="table-responsive">
			<table class="table table-bordered">
			<thead>
				<tr>
					<th>#ID</th>
					<th>Nombre</th>
					<th>Apellidos</th>
					<th>Fecha de Nacimiento</th>
					<th>Nacionalidad</th>
					<th>Acciones</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="autor" items="${bAutor}">
					<tr>
						<td>${autor.autorId}</td>
						<td>${autor.nombre}</td>
						<td>${autor.apellido}</td>
						<td>${autor.fechaNacimiento}</td>
						<td>${autor.nacionalidad}</td>
						<td>
							<a href="/senati/autor/editar/${autor.autorId}">Editar</a>
							<a href="/senati/autor/borrar/${autor.autorId}">Eliminar</a>
							<a href="/senati/autor/detalle/${autor.autorId}">Detalles</a>
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