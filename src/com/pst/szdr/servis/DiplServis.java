package com.pst.szdr.servis;

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

}
