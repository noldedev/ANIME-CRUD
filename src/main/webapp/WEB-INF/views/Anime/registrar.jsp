<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrar Animes</title>
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
					<form:form action="" method="post" name="" modelAttribute="anime">
						<div class="mb-3">
							<label for="nombreAnime" class="form-label">Nombre</label> 
							<form:input type="text" class="form-control" id="nombreAnime" path="nombre"/>
						</div>
						<div class="mb-3">
							<label for="description" class="form-label">Descripción</label>
							<form:input type="text" class="form-control" id="description" path="descripcion"/>
						</div>
						<div class="mb-3">
							<label for="fvpublic" class="form-label">Fecha de Publicación</label> 
							<form:input type="date" class="form-control" id="fvpublic" path="fvPublicacion" />
						</div>
						<div class="mb-3">
							<label for="captlos" class="form-label">Capitulos</label> 
							<form:input type="number" class="form-control" id="captlos" path="capitulos" />
						</div>
	
						<div class="mb-3">
							<label for="estadox" class="form-label">Estado</label>
							 <form:input type="text" class="form-control" id="estadox" path="estado" />
						</div>
						
						<div class="mb-3">
							<label for="calif" class="form-label">Califación</label> 
							<form:input type="number" step="any" class="form-control" id="calif" path="califacion" />
						</div>
						
						<div class="mb-3">
							<label for="vistaenla" class="form-label">Ver</label>
							 <form:input type="text" class="form-control" id="vistaenla" path="enlaceMAL" />
						</div>
										
						<div class="mb-3">
						<label for="autorSelect" class="form-label">Autores:</label>
						<form:select path="autor.autorId" class="form-select">
							<form:options items="${bAutor}" itemValue="autorId" itemLabel="nombre"/>
						</form:select>
						</div>
							
						<div class="mb-3">
    					<label for="estudioSelect" class="form-label">Estudio de producción:</label>
						<form:select path="estudioproduccion.estudioId" class="form-select">
							<form:options items="${bEstudio}" itemValue="estudioId" itemLabel="nombre"/>
						</form:select>
						</div>
						
						<div class="mb-3">
   						<label for="imagenSelect" class="form-label">Imagen portada:</label>
						<form:select path="imagenes.imagenId" class="form-select">
							<form:options items="${bImagen}" itemValue="imagenId" itemLabel="file_name" />
						</form:select>
						</div>	
						
						<div class="row row-cols-2 mx-auto">
							<button class="btn btn-success mt-2 rounded" type="submit">Guardar</button>
							<button class="btn btn-danger mt-2 rounded" type="button" onclick="window.location.href = '/senati/anime/listar'">Cancelar</button>						
						</div>		
					</form:form>
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