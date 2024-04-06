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
</head>
<body>

	<div class="container mt-2">
		<h1>Imagenes</h1>
		<a href="/senati/index">Volver al Inicio</a> <a
			href="/senati/imagen/registrar">Registrar</a> <a
			href="/senati/anime/listar">Volver a animes</a>
		<div class="table-responsive">
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>#ID</th>
						<th>Nombre</th>
						<th>Archivo</th>
						<th>Acciones</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="imagen" items="${bImagen}">
						<tr>
							<td>${imagen.imagenId}</td>
							<td>${imagen.file_name}</td>
							<td>
							<img src="data:image/${imagen.getTypeImage()};base64,${imagen.getBase64Image()}"  class="img-fluid " style="width: 100px; height: 100px">
							</td>
							<td><a href="/senati/imagen/editar/${imagen.imagenId}">Editar</a>
								<a href="/senati/imagen/borrar/${imagen.imagenId}">Eliminar</a>
								<a href="/senati/imagen/detalle/${imagen.imagenId}">Detalles</a>
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