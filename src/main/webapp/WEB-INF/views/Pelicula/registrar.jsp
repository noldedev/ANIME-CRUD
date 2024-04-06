<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrar Peliculas</title>
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
					<form:form action="" method="post" name="" modelAttribute="pelicula">
						<div class="mb-3">
							<label for="tituloPelicula" class="form-label">Titulo</label> 
							<form:input type="text" class="form-control" id="tituloPelicula" path="titulo"/>
						</div>
						<div class="mb-3">
							<label for="fvCreacion" class="form-label">Fecha Creación</label>
							<form:input type="date" class="form-control" id="fvCreacion" path="fvCreacion"/>
						</div>
						<div class="mb-3">
							<label for="tDuracion" class="form-label">Duración</label> 
							<form:input type="time" class="form-control" id="tDuracion" path="duracion" />
						</div>
						<div class="mb-3">
							<label for="lDirector" class="form-label">Director</label> 
							<form:input type="text" class="form-control" id="lDirector" path="director" />
						</div>
						<div class="mb-3">
							<label for="areaActores" class="form-label">Actores</label>
							<form:textarea class="form-control" id="areaActores" rows="3" path="actores"/>
						</div>

						<div class="mb-3">
							<label for="lbTipo" class="form-label">Tipo</label>
							 <form:input type="text" class="form-control" id="lbTipo" path="tipo" />
						</div>

						<div class="mb-3">
							<label for="dbGastos" class="form-label">Gastos</label> 
							<form:input type="number" step="any" class="form-control" id="dbGastos" path="gastos" />
						</div>

						<div class="row row-cols-2 mx-auto">
							<button class="btn btn-success mt-2 rounded" type="submit">Guardar</button>
							<button class="btn btn-danger mt-2 rounded" type="button" onclick="window.location.href = '/senati/pelicula/listar'">Cancelar</button>						
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