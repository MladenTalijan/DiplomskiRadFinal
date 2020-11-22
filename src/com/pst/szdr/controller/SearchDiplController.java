package com.pst.szdr.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pst.szdr.dto.DiplDto;
import com.pst.szdr.servis.DiplServis;

@WebServlet("/SearchDiplController")
public class SearchDiplController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DiplServis servis = null;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		servis = new DiplServis();
		DiplDto dto =  servis.searchDipl(name);
		request.setAttribute("dto", dto);
		request.getRequestDispatcher("./update_dipl.jsp").forward(request, response);
	}

}
