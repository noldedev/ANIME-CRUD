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
</head>
<body>
<!-- Spring Form -->
	<form:form name="" method="post" modelAttribute="estudios" action="">
		
		<p>Nombre: ${estudios.nombre}</p><br>
		<p>Contacto: ${estudios.nombre}</p><br>
		<p>Redes Sociales: ${estudios.redes_sociales}</p><br>
		<p>Tipo de Producci�n:${estudios.tipo_produccion}</p><br>
		<p>Ubicaci�n:  ${estudios.ubicacion}</p>
		
		<button type="button" onclick="location.href='/senati/estudio/listar'">Volver</button>
	</form:form>
<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>
</html>