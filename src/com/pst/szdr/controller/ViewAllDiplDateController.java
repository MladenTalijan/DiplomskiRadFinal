package com.pst.szdr.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pst.szdr.dto.DiplDto;
import com.pst.szdr.servis.DiplServis;

/**
 * Servlet implementation class ViewAllDiplDateController
 */
@WebServlet("/ViewAllDiplDateController")
public class ViewAllDiplDateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewAllDiplDateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DiplServis servis = new DiplServis();
		List<DiplDto> list = servis.getAllDipl();
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("./view_date_dipl.jsp").forward(request, response);
	}
	

	

}
