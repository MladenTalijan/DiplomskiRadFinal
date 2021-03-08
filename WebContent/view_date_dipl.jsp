<%@page import="com.pst.szdr.dto.DiplDto"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pogledaj diplomske radove po datumima</title>
</head>
<body>
<%
List<DiplDto> list = (ArrayList<DiplDto>)request.getAttribute("list");
%>

		<div><%@include file="header.html"%> </div>
        <div>
        <center>
        <h1> Pogledaj sve diplomske radove</h1>
		<table border="1px">
		<thead>
		<tr><td>Naziv diplomskog rada</td><td>Ime i prezime studenta</td><td>Broj indeksa</td><td>Smer</td><td>Ime i prezime mentora</td><td>Datum</td></tr>
		</thead>
		<%
		for(DiplDto d : list){%>
		<tr><td><%=d.getName() %></td><td><%=d.getNameLastname() %></td></td><td><%=d.getSmer() %></td><td><%=d.getNameLastnameM() %></td><td><%=d.getDate() %></td></tr>
		<%}
		%>
		</table>
			</center>
        </div>
        <div><%@include file="footer.html"%> </div>
</body>
</html>