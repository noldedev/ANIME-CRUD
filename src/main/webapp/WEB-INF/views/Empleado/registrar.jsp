<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
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
<div>
<h3>¡Registrar Empleado!</h3>
	
	<!-- Spring Form -->
	<form:form name="" method="post" modelAttribute="empleado" action="">
		Nombre: <form:input type="text" path="nombre"/> <br>
		salario: <form:input type="text" path="salario"/> <br>
		Genero: <form:input type="text" path="Genero"/> <br>
		Fecha de empleo: <form:input type="date" path="fecha_empleo"/> <br>
		Horario laboral: <form:input type="time" path="horario_laboral"/> <br>
		Cargo: <form:input type="text" path="cargo"/> <br>
		
		Estudio de producción:
		<form:select path="estudioproduccion.estudioId" class="form-select" style="width: 20%">
			<form:options items="${bEstudio}" itemValue="estudioId" itemLabel="nombre"/>
		</form:select> <br>
		
		<button type="submit">Guardar</button>
		<button type="button" onclick="location.href='/senati/empleado/listar'">Cancelar</button>
	</form:form>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>
</html>