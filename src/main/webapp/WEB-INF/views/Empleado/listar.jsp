<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Empleado</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
		<div class="container mt-2">
		<h1>Empleados</h1>
		<a href="/senati/index">Volver al Inicio</a>
		<a href="/senati/anime/listar">Volver a Animes</a>
		<a href="/senati/empleado/registrar">Registrar</a>
		<div class="table-responsive">
			<table class="table table-bordered">
			<thead>
				<tr>
					<th>#ID</th>
					<th>Nombre</th>
					<th>Salario</th>
					<th>Genero</th>
					<th>Fecha de Empleo</th>
					<th>Horario Laboral</th>
					<th>Cargo</th>
					<th>Estudio de Producción</th>
					<th>Acciones</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="empleado" items="${bEmpleado}">
					<tr>
						<td>${empleado.empleadoId}</td>
						<td>${empleado.nombre}</td>
						<td>${empleado.salario}</td>
						<td>${empleado.genero}</td>
						<td>${empleado.fecha_empleo}</td>
						<td>${empleado.horario_laboral}</td>
						<td>${empleado.cargo}</td>
						<td>${empleado.estudioproduccion.nombre}</td>
						<td>
							<a href="/senati/empleado/editar/${empleado.empleadoId}">Editar</a>
							<a href="/senati/empleado/borrar/${empleado.empleadoId}">Eliminar</a>
							<a href="/senati/empleado/detalle/${empleado.empleadoId}">Detalles</a>
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