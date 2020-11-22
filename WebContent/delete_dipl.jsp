<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Izbrisi diplomski rad</title>
</head>
<body>
		<%
		String msg = request.getParameter("message");
		if(msg == null){
			msg = "";
		}
		%>
		
		<div><%@include file="header.html"%> </div>
        <div>
        <center>
        <h1>Izbrisi diplomski rad</h1>
        <h4 style="color:green"><%=msg %></h4>
        <form action="./DeleteDiplController" method = "post">
        <pre>
        Naziv diplomskog rada: <input type="text" name="name"/>
        </pre>
        <pre>
        <input type="submit" value="Izbrisi"/>
        </pre>
        </form>
        </center>
        </div>
        <div><%@include file="footer.html"%> </div>
</body>
</html>