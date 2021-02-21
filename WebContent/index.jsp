<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Servis za diplomske radove </title>
</head>
<body>
<h2> Registruj se </h2>
<form action="http://localhost:8080/ServisZaDiplomskeRadove/Register">
<pre>

<input type="text" name = "uname" placeholder="Ime i Prezime">

<input type="password" name = "upass" placeholder="Unesite lozinku">

<input type="email" name = "email" placeholder="Unesite e-mail">

<input type="submit" value="Registruj se">

</pre>
</form>
<h2> Uloguj se </h2>
<form action="http://localhost:8080/ServisZaDiplomskeRadove/Login">
<pre>

<input type="email" name = "email" placeholder="Unesite e-mail">

<input type="password" name = "upass" placeholder="Unesite lozinku">

<input type="submit" value="Uloguj se">

</pre>
</form>


</body>
</html>