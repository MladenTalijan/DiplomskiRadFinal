package com.pst.szdr.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pst.szdr.servis.DiplServis;

@WebServlet("/DeleteDiplController")
public class DeleteDiplController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DiplServis servis = null;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		servis = new DiplServis();
		boolean status = servis.removeDipl(name);
		System.out.println("con"+status);
	}

}
