<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Estudio de Producción</title>
</head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<body>
	<div class="container mt-2">
		<h1>Estudio de Producción</h1>
		<a href="/senati/index">Volver al Inicio</a>
		<a href="/senati/anime/listar">Volver a Animes</a>
		<a href="/senati/estudio/registrar">Registrar</a>
		<div class="table-responsive">
			<table class="table table-bordered">
			<thead>
				<tr>
					<th>#ID</th>
					<th>Nombre</th>
					<th>Contacto</th>
					<th>Redes Sociales</th>
					<th>Tipo de Producción</th>
					<th>Ubicación</th>
					<th>Acciones</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="estudio" items="${bEstudio}">
					<tr>
						<td>${estudio.estudioId}</td>
						<td>${estudio.nombre}</td>
						<td>${estudio.contacto}</td>
						<td>${estudio.redes_sociales}</td>
						<td>${estudio.tipo_produccion}</td>
						<td>${estudio.ubicacion}</td>
						<td>
							<a href="/senati/estudio/editar/${estudio.estudioId}">Editar</a>
							<a href="/senati/estudio/borrar/${estudio.estudioId}">Eliminar</a>
							<a href="/senati/estudio/detalle/${estudio.estudioId}">Detalles</a>
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