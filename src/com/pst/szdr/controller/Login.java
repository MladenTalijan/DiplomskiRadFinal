package com.pst.szdr.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pst.szdr.bean.User;
import com.pst.szdr.model.DataProvider;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out = response.getWriter();
		
		String password = request.getParameter("upass");
		String email = request.getParameter("email");
		
		User user = new User();
		
		user.setEmail(email);
		user.setPassword(password);
		
		DataProvider dp = new DataProvider();
		String s1 = dp.readData(user);
		
		if(s1.equalsIgnoreCase("Uspesno ste se logovali")) {
			response.sendRedirect("http://localhost:8080/ServisZaDiplomskeRadove/admin_home.jsp");
		}else {
			out.println("Pogresan email ili sifra");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
