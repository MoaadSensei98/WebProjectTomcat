<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body> 
<h1>Caracter�sticas del videojuego: ${v.nombre}</h1>
	<h2>Id: ${v.id}</h2>
	<h2>Titulo: ${v.nombre}</h2>
	<h2>Compa�ia: ${v.compa�ia}</h2>
	<h2>Nota: ${v.notaMedia}</h2>
	<h2>Nombre del Creador: ${v.nombreCreador}</h2>
	<h2><a href="${v.paginaWeb}">P�gina web del juego</a></h2>
 </body>
</html>