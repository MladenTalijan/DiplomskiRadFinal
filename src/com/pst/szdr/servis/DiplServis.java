package com.pst.szdr.servis;

import java.util.List;

import com.pst.szdr.bo.DiplBo;
import com.pst.szdr.dao.DiplDao;
import com.pst.szdr.dto.DiplDto;
import com.pst.szdr.vo.DiplVo;

public class DiplServis {
	DiplDao diplDao = null;
    DiplBo diplBo = null;
    public int saveDipl(DiplVo diplVo){
        //business
        diplDao = new DiplDao();
        diplBo = new DiplBo();
        diplBo.setName(diplVo.getName());
        diplBo.setNameLastname(diplVo.getNameLastname());
        diplBo.setBrojIndeksa(diplVo.getBrojIndeksa());
        diplBo.setSmer(diplVo.getSmer());
        diplBo.setNameLastnameM(diplVo.getNameLastnameM());
        
        int i = diplDao.addDipl(diplBo);
        return i;
    }
    public List<DiplDto> getAllDipl() {
    	diplDao = new DiplDao();
    	return diplDao.viewDipl();
    }
    public boolean removeDipl(String name) {
    	diplDao = new DiplDao();
    	return diplDao.delete(name);
    }
    public DiplDto searchDipl(String name) {
    	diplDao = new DiplDao();
    	return diplDao.getDiplDetails(name);
    }
    public int modifyDipl(DiplVo diplVo) {
    	diplDao = new DiplDao();
        diplBo = new DiplBo();
        diplBo.setName(diplVo.getName());
        diplBo.setNameLastname(diplVo.getNameLastname());
        diplBo.setBrojIndeksa(diplVo.getBrojIndeksa());
        diplBo.setSmer(diplVo.getSmer());
        diplBo.setNameLastnameM(diplVo.getNameLastnameM());
        
        diplDao = new DiplDao();
        return diplDao.updateDipl(diplBo);
        
    }
}
