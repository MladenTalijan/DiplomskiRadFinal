package com.pst.szdr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.pst.szdr.bo.DiplBo;
import com.pst.szdr.dto.DiplDto;
import com.pst.szdr.util.DbConnection;
import com.pst.szdr.vo.DiplVo;


//Data access object
public class DiplDao {
	private final String SAVE_DIPL = "insert into diplomski(name, nameLastname, brojIndeksa, smer, nameLastnameM)values(?,?,?,?,?)";
	private final String VIEW_DIPL ="select name, nameLastname, brojIndeksa, smer, nameLastnameM from diplomski";
    private final String DELETE_DIPL = "delete from diplomski where name = ?";
    private final String SEARCH_DIPL = "select name, nameLastname, brojIndeksa, smer, nameLastnameM from diplomski where name=?";
	private final String UPDATE_DIPL = "update diplomski set nameLastname=?, brojIndeksa=?, smer=?, nameLastnameM=? where name=?";
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
    public List<DiplDto> viewDipl() {
    	DiplDto dto = null;
    	List<DiplDto> diplList = new ArrayList<>();
    	try {
    		Connection con = DbConnection.getConn();
        	PreparedStatement ps = con.prepareStatement(VIEW_DIPL);
        	ResultSet rs = ps.executeQuery();
        	while(rs.next()) {
        		dto = new DiplDto();
        		dto.setName(rs.getString(1));
        		dto.setNameLastname(rs.getString(2));
        		dto.setBrojIndeksa(rs.getString(3));
        		dto.setSmer(rs.getString(4));
        		dto.setNameLastnameM(rs.getString(5));
        		diplList.add(dto);
        	}
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	return diplList;
    }
    public boolean delete(String name) {
    	boolean status = true;
    	try {
    		Connection con = DbConnection.getConn();
        	PreparedStatement ps = con.prepareStatement(DELETE_DIPL);
        	ps.setString(1, name);
        	status = ps.execute();
        	System.out.println("status:: " + status);
    	}catch(Exception e) {
    		e.getStackTrace();
    	}
    	return status;
    }
    public DiplDto getDiplDetails(String name) {
    	DiplDto dto = null;
    	try {
    		Connection con = DbConnection.getConn();
        	PreparedStatement ps = con.prepareStatement(SEARCH_DIPL);
        	ps.setString(1, name);
        	ResultSet rs = ps.executeQuery();
        	if(rs.next()) {
        		dto = new DiplDto();
        		dto.setName(rs.getString(1));
        		dto.setNameLastname(rs.getString(2));
        		dto.setBrojIndeksa(rs.getString(3));
        		dto.setSmer(rs.getString(4));
        		dto.setNameLastnameM(rs.getString(5));
        	}
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	return dto;
    }
    public int updateDipl(DiplBo diplBo) {
    	int i = 0;
    	try {
    		Connection con = DbConnection.getConn();
        	PreparedStatement ps = con.prepareStatement(UPDATE_DIPL);
        	ps.setString(1, diplBo.getNameLastname());
        	ps.setString(2, diplBo.getBrojIndeksa());
        	ps.setString(3, diplBo.getSmer());
        	ps.setString(4, diplBo.getNameLastnameM());
        	ps.setString(5, diplBo.getName());
        	i = ps.executeUpdate();
    	}catch(Exception e) {
    		e.getStackTrace();
    	}
    	return i;
    }
}
