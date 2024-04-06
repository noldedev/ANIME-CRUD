<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editar</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<h3 class="text-center">¡Imagen - Editar!</h3>

	<div align="center" class="w-50 mx-auto">
		<form name="" method="post"
		action="/senati/imagen/editar/${imagen.imagenId}"
		enctype="multipart/form-data">
		Imagen ID: <input type="text" name="imagenId"
			value="${imagen.imagenId}" readonly="true" /><br> 
		<br>
		Imagen actual: <br>
		<img src="data:image/${imagen.getTypeImage()};base64,${imagen.getBase64Image()}"  width="300px" height="300px"/>
		<br><br>
		
			
		Cmabiar Imagen: <input type="file" name="picture" accept="image/*"
			onchange="document.getElementById('imageId').src=window.URL.createObjectURL(this.files[0])"
			class="form-control" width="300px"/> <br> 
			
		Imagen Cambiado: <br> <img
			id="imageId" width="200px" height="200px"
			class="img-thumbnail border border-primary mb-4"><br>

		<button type="submit">Editar</button>
		<button type="button" onclick="location.href='/senati/imagen/listar'">Cancelar</button>
	</form>
	
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>
</html>