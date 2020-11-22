package com.pst.szdr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.pst.szdr.bo.DiplBo;
import com.pst.szdr.util.DbConnection;


//Data access object
public class DiplDao {
	private final String SAVE_DIPL = "insert into diplomski(name, nameLastname, brojIndeksa, smer, nameLastnameM)values(?,?,?,?,?)";
    public int addDipl(DiplBo diplBo){
      //do database operation logic
      int i = 0;
        try{
            Connection con = DbConnection.getConn();
            //PreparedStatement ps = con.prepareStatement(SAVE_DIPL);
            PreparedStatement ps = con.prepareStatement(SAVE_DIPL);
            ps.setString(1, diplBo.getName());
            ps.setString(2, diplBo.getNameLastname());
            ps.setString(3, diplBo.getBrojIndeksa());
            ps.setString(4, diplBo.getSmer());
            ps.setString(5, diplBo.getNameLastnameM());
            
            i = ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
        return i;
    }
}
