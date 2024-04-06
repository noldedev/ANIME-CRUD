<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Animes</title>
</head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<body>

	<div class="container mt-2">
		<h1>Animes</h1>
		<a href="/senati/index">Volver al Inicio</a> <a
			href="/senati/anime/registrar">Registrar</a> <a
			href="/senati/categoria/listar"
			class="badge text-bg-primary text-decoration-none">Categorias</a> <a
			href="/senati/autor/listar"
			class="badge text-bg-success text-decoration-none">Autor</a> <a
			href="/senati/empleado/listar"
			class="badge text-bg-danger text-decoration-none">Empleado</a> <a
			href="/senati/estudio/listar"
			class="badge text-bg-warning text-decoration-none">Estudio de
			Producción</a> <a href="/senati/imagen/listar"
			class="badge text-bg-info text-decoration-none">Imagen</a> <a
			href="/senati/personaje/listar"
			class="badge text-bg-dark text-decoration-none">Personajes</a>
		<div class="table-responsive">
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>#ID</th>
						<th>Nombre</th>
						<th>Descripción</th>
						<th>Fecha Publicación</th>
						<th>Capitulos</th>
						<th>Estado</th>
						<th>Calificación</th>
						<th>Autor</th>
						<th>Estudio de Producción</th>
						<th>Enlace</th>
						<th>Portada</th>
						<th>Acciones</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="anime" items="${bAnimes}">
						<tr>
							<td>${anime.animeId}</td>
							<td>${anime.nombre}</td>
							<td>${anime.descripcion}</td>
							<td>${anime.fvPublicacion}</td>
							<td>${anime.capitulos}</td>
							<td>${anime.estado}</td>
							<td>${anime.califacion}</td>
							<td>${anime.autor.nombre}</td>
							<td>${anime.estudioproduccion.nombre}</td>
							<td>
							<a href="${anime.enlaceMAL}" target="_blank">
							Ver Anime</a>
							</td>
							<td>
								<img src="data:image/${anime.imagenes.getTypeImage()};base64,${anime.imagenes.getBase64Image()}" width="100px" height="100px" />
							</td>
						
							<td><a href="/senati/anime/editar/${anime.animeId}">Editar</a>
								<a href="/senati/anime/eliminar/${anime.animeId}">Eliminar</a> <a
								href="/senati/anime/detalle/${anime.animeId}">Detalles</a></td>
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