package com.pst.szdr.util;

import java.sql.DriverManager;

import java.sql.Connection;

public class DbConnection {
	private static Connection con = null;
    public static Connection getConn(){
        
    
    //JDBC
    //load the driver
        try {
            Class.forName("com.mysql.jdbc.Driver");  
            String JdbcURL = "jdbc:mysql://localhost:3306/diplomskirad";
            String Username = "root";
            String password = "mladenmladen";
            con =  DriverManager.getConnection(JdbcURL, Username, password);
         //   con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/diplomskirad", "root", "mladenmladen");
        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
    //get the connection
    //creating statement - sql query
    //execute get Result
    //close
    
    }
  }

