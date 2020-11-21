package com.pst.szdr.util;

import java.sql.DriverManager;

import com.sun.jdi.connect.spi.Connection;

public class DbConnection {
	private static Connection con = null;
    public static Connection getConn(){
        
    
    //JDBC
    //load the driver
        try {
            Class.forName("com.mysql.jdbc.Driver"); //sredi racune u fascikle sutra 
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/diplomskirad", "root", "mladenmladen");
        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
        return con;
    //get the connection
    //creating statement - sql query
    //execute get Result
    //close
    
    }

}
