package com.pst.szdr.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.pst.szdr.bean.User;

public class DataProvider {
	public void writeData(User user) {
		dBConnectionP dbP = new dBConnectionP();
		Connection con = dbP.getCon();
		
		try {
			Statement stmt = con.createStatement();
			stmt.executeUpdate("insert into profesori(imePrezimeP, sifra, email) values('"+user.getUname()+"', '"+user.getPassword()+"', '"+user.getEmail()+"')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String readData(User user) {
		
		dBConnectionP dbP = new dBConnectionP();
		ResultSet rs;
		Connection con = dbP.getCon();
		
		try {
			Statement stmt = con.createStatement();
			rs = stmt.executeQuery("select email, sifra from profesori where email = '"+user.getEmail()+"' and sifra='"+user.getPassword()+"' ");
			rs.next();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Uspesno ste se logovali";
	}
}
