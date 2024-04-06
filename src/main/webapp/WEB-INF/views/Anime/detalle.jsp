<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Detalle</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<div align="center">
		<form:form action="" method="post" name="" modelAttribute="anime">
			<p>Nombre: ${anime.nombre}</p>
			<br>

			<p>Descripción: ${anime.descripcion}</p>
			<br>

			<p>Fecha de Publicación: ${anime.fvPublicacion}</p>
			<br>

			<p>Capitulos: ${anime.capitulos}</p>
			<br>

			<p>Estado: ${anime.estado}</p>

			<br>

			<p>Calificación: ${anime.califacion}</p>
			<br>
			<p>Autor: ${anime.autor.nombre}</p>
			<br>
		 	<p>Estudio de Producción: ${anime.estudioproduccion.nombre}</p>
		 	<br>
			<p>Enlace: ${anime.enlaceMAL}</p>
			<br>
			<button type="button" onclick="location.href='/senati/anime/listar'">Volver</button>
	
		</form:form>

	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>
</html>