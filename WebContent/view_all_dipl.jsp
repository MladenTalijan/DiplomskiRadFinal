<%@page import="com.pst.szdr.dto.DiplDto"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pogledaj sve diplomske radove</title>
</head>
<body>
<%
List<DiplDto> list = (ArrayList<DiplDto>)request.getAttribute("list");
%>
<center>
<table border="1px">
<thead>
<tr><td>Naziv diplomskog rada</td><td>Ime i prezime studenta</td><td>Broj indeksa</td><td>Smer</td><td>Ime i prezime mentora</td></tr>
</thead>
<%
for(DiplDto d : list){%>
	<tr><td><%=d.getName() %>></td><td><%=d.getNameLastname() %>></td><td><%=d.getBrojIndeksa() %></td><td><%=d.getSmer() %></td><td><%=d.getNameLastnameM() %></td></tr>
<%}
%>
</table>
</center>
</body>
</html>