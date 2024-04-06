<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Estudio de Producción</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<div>
	 <h3>¡Registrar - Estudios de Producción!</h3>
	
	<!-- Spring Form -->
	<form:form name="" method="post" modelAttribute="estudios" action="">
		Nombre: <form:input type="text" path="nombre"/> <br>
		Contacto: <form:input type="text" path="contacto"/> <br>
		Redes Sociales: <form:input type="text" path="redes_sociales"/> <br>
		Tipo de Producción: <form:input type="text" path="tipo_produccion"/> <br>
		Ubicación: <form:input type="text" path="ubicacion"/> <br>
		
		<button type="submit">Guardar</button>
		<button type="button" onclick="location.href='/senati/estudio/listar'">Cancelar</button>
	</form:form>
	</div>
		<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>
</html>