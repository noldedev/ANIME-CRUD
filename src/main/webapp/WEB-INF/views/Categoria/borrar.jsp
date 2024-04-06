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
	<h3>�Borrar - Categorias!</h3>
	<!-- Spring Form -->
	<form:form name="" method="post" modelAttribute="categoria" action="">
		CategoriaID: <form:input type="text" path="categoriaId" readonly="true"/><br>
		Nombre: <form:input type="text" path="nombre" readonly="true"/> <br>
		Descripci�n: <form:input type="text" path="descripcion" readonly="true"/> <br>
		
		<p>�Est� seguro de borrar?</p>		
		<button type="submit">Si, borrar</button>
		<button type="button" onclick="location.href='/senati/categoria/listar'">Cancelar</button>
	</form:form>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>
</html>