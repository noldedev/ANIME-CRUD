<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Warning</title>
</head>
<body>
<div align="center">
		<br><br>
		<p>No se puede borrar la imagen <b>${imagen.file_name}</b><br>Se encuentra asociada a otra tabla.<br><br>
		<span>Consulta con los encargados del sistema.</span></p>
		<br><br>
		<a href="/senati/imagen/listar">Volver</a>
	</div>
</body>
</html>