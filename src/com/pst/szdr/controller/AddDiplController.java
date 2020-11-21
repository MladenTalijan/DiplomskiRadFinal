package com.pst.szdr.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddDiplController")
public class AddDiplController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	 	DiplVo diplVo = null;
	    DiplServis diplServis = null;
	    

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get data from ui
		String name = request.getParameter("name");
        String nameLastname = request.getParameter("nameLastname");
        String brojIndeksa = request.getParameter("brojIndeksa");
        String smer = request.getParameter("smer");
        String nameLastnameM = request.getParameter("nameLastnameM");
        
        diplVo = new DiplVo();
        diplVo.setName(name);
        diplVo.setNameLastname(nameLastname);
        diplVo.setBrojIndeksa(brojIndeksa);
        diplVo.setSmer(smer);
        diplVo.setNameLastnameM(nameLastnameM);
        
        diplServis = new DiplServis();
        int i = diplServis.saveDipl(diplVo);
        
        if(i != 0){
            response.getWriter().print("Uspesno ste dodali diplomski rad.");//01.10
        }
	}

}
