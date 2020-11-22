<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<style type="text/css">
        .container{ 
        }
        </style>
<meta charset="ISO-8859-1">
<title>Dodaj diplomski</title>
</head>
<body>
	<script type="text/javascript">
            function doValidate(){
                var name = document.forms["dipl_form"]["name"].value;
                var nameLastname = document.forms["dipl_form"]["nameLastname"].value;
                var brojIndeksa = document.forms["dipl_form"]["brojIndeksa"].value;
                var smer = document.forms["dipl_form"]["smer"].value;
                var nameLastnameM = document.forms["dipl_form"]["nameLastnameM"].value;
                
                var nameStatus;
                var nameLastnameStatus;
                var brojIndeksaStatus;
                var smerStatus;
                var nameLastnameMStatus;
                
                var nameMsg;
                var nameLastnameMsg;
                var brojIndeksaMsg;
                var smerMsg;
                var nameLastnameMMsg;
                    
                    if(document.getElementById("nameMsg").innerHTML  != ""){
                        document.getElementById("nameMsg").innerHTML = "";
                    }
                    if(document.getElementById("nameLastnameMsg").innerHTML  != ""){
                        document.getElementById("nameLastnameMsg").innerHTML = "";
                    }
                    if(document.getElementById("brojIndeksaMsg").innerHTML  != ""){
                        document.getElementById("brojIndeksaMsg").innerHTML = "";
                    }
                    if(document.getElementById("smerMsg").innerHTML  != ""){
                        document.getElementById("smerMsg").innerHTML = "";
                    }
                    if(document.getElementById("nameLastnameMMsg").innerHTML  != ""){
                        document.getElementById("nameLastnameMMsg").innerHTML = "";
                    }
                    
                    if(name == ""){
                        nameStatus = false;
                        nameMsg = "*Naziv diplomskog rada mora biti popunjen!";
                        var spanEle = document.getElementById("nameMsg");
                        spanEle.style.color = "red";
                        spanEle.innerHTML = nameMsg;
                        //document.getElementById("nameMsg").innerHTML = nameMsg;
                    }if(nameLastname == ""){
                        nameLastnameStatus = false;
                        nameLastnameMsg = "*Ime i prezime moraju biti popunjeni!";
                        var spanEle = document.getElementById("nameLastnameMsg");
                        spanEle.style.color = "red";
                        spanEle.innerHTML = nameLastnameMsg;
                        //document.getElementById("nameLastnameMsg").innerHTML = nameLastnameMsg;
                    }if(brojIndeksa == ""){
                        brojIndeksaStatus = false;
                        brojIndeksaMsg = "*Broj indeksa mora biti popunjen!!";
                        var spanEle = document.getElementById("brojIndeksaMsg");
                        spanEle.style.color = "red";
                        spanEle.innerHTML = brojIndeksaMsg;
                        //document.getElementById("brojIndeksaMsg").innerHTML = brojIndeksaMsg;
                    }if(smer == ""){
                        smerStatus = false;
                        smerMsg = "*Morate izabrati smer!";
                        var spanEle = document.getElementById("smerMsg");
                        spanEle.style.color = "red";
                        spanEle.innerHTML = smerMsg;
                        //document.getElementById("smerMsg").innerHTML = smerMsg;
                    }if(nameLastnameM == ""){
                        nameLastnameMStatus = false;
                        nameLastnameMMsg = "*Ime mentora mora biti popunjeno!";
                        var spanEle = document.getElementById("nameLastnameMMsg");
                        spanEle.style.color = "red";
                        spanEle.innerHTML = nameLastnameMMsg;
                        //document.getElementById("nameLastnameMMsg").innerHTML = nameLastnameMMsg;
                    }
                    
                if(nameStatus == false || nameLastnameStatus == false || brojIndeksaStatus == false || smerStatus == false || nameLastnameMStatus == false){
                    return false;
                }
                }
        </script>
        <%
        String msg = (String)request.getAttribute("msg");
        if(msg == null){
        	msg = "";
        }
        %>
        
        <div><%@include file="header.html"%> </div>
        
        <div class="container">
            <center>
                <h1>Dodaj diplomski rad</h1>
                <h4 style="color:green"><%= msg %></h4>
                <form action="./AddDiplController" name ="dipl_form" method="post" onsubmit="return doValidate()">
                <table>
                    <tr><td>Naziv diplomskog rada</td><td><input type="text" name="name"><span id = "nameMsg"></span></td></tr>
                    
                    <tr><td>Ime i prezime studenta</td><td><input type="text" name="nameLastname"><span id = "nameLastnameMsg"></span></td></tr>
                    
                    <tr><td>Broj indeksa</td><td><input type="text" name="brojIndeksa"><span id = "brojIndeksaMsg"></span></td></tr>
                    
                    <tr><td>Smer</td><td><select name = "smer">
                            <option value="">--select--</option>
                            <option value="informacione_tehnologije">Informacione tehnologije</option>
                            <option value="menadzment">Menadzment u turizmu i ugostiteljstvu</option>
                            <option value="ekonomija">Primenjena ekonomija i preduzetnistvo</option>
                            <option value="gastronomija">Tehnologija hrane i gastronomija</option>
                            <option value="dizajn">Dizajn</option>
                            <option value="zastita">Zastita zivotne i radne sredine</option> 
                            </select><span id = "smerMsg"></span></td></tr>
                    
                    <tr><td>Ime i prezime mentora</td><td><input type="text" name="nameLastnameM"><span id = "nameLastnameMMsg"></span></td></tr>
                    
                    <tr><td><input type="submit" value="Dodaj diplomski rad"><td><input type="button" value="Cancel"></td></td></tr>
                    
                </table>
                
            </form>  
            </center>
        </div>
        
        <div><%@include file="footer.html"%> </div>

</body>
</html>