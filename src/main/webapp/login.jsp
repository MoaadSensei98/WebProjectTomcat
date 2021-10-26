<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Usuario</title>
</head>
<body>
	<div class="container">
		    <form action="LoginServlet" method="get">
			<label>Usuario : </label><br> <input type="text"
			placeholder="Usuario" name="user" required> 
			<br><br>
			<label>Contraseña: </label> 
			<br>
			<input type="password" placeholder="Contraseña" name="pass" required> 
			<br><br>
			
			<input type="submit"
			value="Login">
	</form>
		<br>
	</div>
</body>
</html>