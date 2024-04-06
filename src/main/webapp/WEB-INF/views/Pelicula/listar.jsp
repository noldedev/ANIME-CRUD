<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Peliculas</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>

	<div class="container mt-2">
		<h1>Peliculas</h1>
		<a href="/senati/index">Volver al Inicio</a>
		<a href="/senati/pelicula/registrar">Registrar</a>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>#ID</th>
					<th>Titulo</th>
					<th>Fecha Creacion</th>
					<th>Duración</th>
					<th>Director</th>
					<th>Actores</th>
					<th>Tipo</th>
					<th>Gastos</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="pelicula" items="${bPeliculas}">
					<tr>
						<td>${pelicula.peliculaId}</td>
						<td>${pelicula.titulo}</td>
						<td>${pelicula.fvCreacion}</td>
						<td>${pelicula.duracion}</td>
						<td>${pelicula.director}</td>
						<td>${pelicula.actores}</td>
						<td>${pelicula.tipo}</td>
						<td>${pelicula.gastos}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>
</html>