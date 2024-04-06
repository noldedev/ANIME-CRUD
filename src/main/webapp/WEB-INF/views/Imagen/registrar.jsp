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

	<div class="container mt-4">
		<div class="w-50 mx-auto">
			<div class="card">
				<div class="card-body">
				    <h1 class="card-title">Registrar Imagenes</h1>
					<!-- Spring Form -->
					<form name="" method="post" action="/senati/imagen/registrar"
						enctype="multipart/form-data">
						Archivo: <input type="file" name="picture" accept="image/*"
							onchange="document.getElementById('imageId').src=window.URL.createObjectURL(this.files[0])" class="form-control" />
						<br> Imagen: <br> <img id="imageId" width="200px"
							height="200px" class="img-thumbnail border border-primary mb-4"><br>

						<button type="submit" class="btn btn-danger">Guardar</button>
						<button type="button"
							onclick="location.href='/senati/imagen/listar'" class="btn btn-info">Cancelar</button>
					</form>
				</div>
			</div>

		</div>
	</div>




	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>
</html>