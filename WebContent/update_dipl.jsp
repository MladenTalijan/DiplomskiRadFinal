<%@page import="com.pst.szdr.dto.DiplDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Azuriraj diplomski rad</title>
</head>
<body>
<%
DiplDto dto = (DiplDto)request.getAttribute("dto");
if(dto == null){
	dto = new DiplDto();
	dto.setName("");
	dto.setNameLastname("");
	dto.setBrojIndeksa("");
	dto.setSmer("");
	dto.setNameLastnameM("");
}
	String msg = request.getParameter("msg");
	if(msg == null){
		msg = "";
	}
%>

<div><%@include file="header.html"%> </div>
     <div>
     <center>
        <div class = "search">
        <h1>Azuriraj diplomski rad</h1>
        <h4 style="color:green"></h4>
        <form action="./SearchDiplController" method = "post">
        <pre>
        Naziv diplomskog rada: <input type="text" name="name"/>
        </pre>
        <pre>
        <input type="submit" value="Pretrazi"/>
        </pre>
        </form>
        </div>
        <div>
        <h4 style="color:green"><%=msg %></h4>
        <form action="./UpdateDiplController" name ="dipl_form" method="post"> 
                <table>
                    <tr><td>Naziv diplomskog rada</td><td><input type="text" name="name" value="<%=dto.getName() %>"><span id = "nameMsg"></span></td></tr>
                    
                    <tr><td>Ime i prezime studenta</td><td><input type="text" name="nameLastname" value="<%=dto.getNameLastname()%>"><span id = "nameLastnameMsg"></span></td></tr>
                    
                    <tr><td>Broj indeksa</td><td><input type="text" name="brojIndeksa" value="<%=dto.getBrojIndeksa() %>"><span id = "brojIndeksaMsg"></span></td></tr>
                    
                    <tr><td>Smer</td><td><input name = "smer" value="<%=dto.getSmer() %>">
                           </td></tr>
                    
                    <tr><td>Ime i prezime mentora</td><td><input type="text" name="nameLastnameM" value="<%=dto.getNameLastnameM() %>"><span id = "nameLastnameMMsg"></span></td></tr>
                    
                    <tr><td><input type="submit" value="Azuriraj diplomski rad"><td><input type="button" value="Cancel"></td></td></tr>
                </table>
            </form>
        
        </div>
        
        </center>
        </div>
<div><%@include file="footer.html"%> </div>
</body>
</html>