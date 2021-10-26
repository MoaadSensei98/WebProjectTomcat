<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mejores Videojuegos</title>
</head>
<body>
	<h1>Lista de Videojuegos</h1>
	<h2>${lista}</h2> 
	</table>
	<h3>Busqueda por id:</h3>
	<form action="SegundoServlet">
		Id: <input type="number" name="id"> <input type="submit"
			value="Buscar">
	</form>
</body>
</html>