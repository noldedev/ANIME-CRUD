<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<h3>¡Borrar - Empleados!</h3>
	<form:form name="" method="post" modelAttribute="empleado" action="">
		EmpleadoID: <form:input type="text" path="empleadoId" readonly="true" /><br>
		Nombre: <form:input type="text" path="nombre" readonly="true" /> <br>
		salario: <form:input type="text" path="salario" readonly="true" /> <br>
		Genero: <form:input type="text" path="Genero" readonly="true" /> <br>
		Fecha de empleo: <form:input type="date" path="fecha_empleo" readonly="true" /> <br>
		Horario laboral: <form:input type="time" path="horario_laboral" readonly="true" /> <br>
		Cargo: <form:input type="text" path="cargo" readonly="true" /> <br>
		
		Estudio de producción:
		<form:input  type="text" path="estudioproduccion.nombre"/>
		
		<p>¿Está seguro de borrar?</p>		
		<button type="submit">Si, borrar</button>
		<button type="button" onclick="location.href='/senati/empleado/listar'">Cancelar</button>
	</form:form>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>
</html>