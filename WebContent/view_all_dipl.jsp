<%@page import="com.pst.szdr.dto.DiplDto"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<meta charset="UTF-8">
<head>
<title>Pogledaj sve diplomske radove</title>
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
		<tr><td>Naziv diplomskog rada</td><td>Ime i prezime studenta</td><td>Broj indeksa</td><td>Smer</td><td>Ime i prezime mentora</td></tr>
		</thead>
		<%
		for(DiplDto d : list){%>
		<tr><td><%=d.getName() %>></td><td><%=d.getNameLastname() %>></td><td><%=d.getBrojIndeksa() %></td><td><%=d.getSmer() %></td><td><%=d.getNameLastnameM() %></td></tr>
		<%}
		%>
		</table>
			</center>
        </div>
        <div><%@include file="footer.html"%> </div>
</body>
</html>