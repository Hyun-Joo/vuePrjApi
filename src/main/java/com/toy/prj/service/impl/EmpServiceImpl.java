package com.toy.prj.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toy.prj.mapper.EmpMapper;
import com.toy.prj.model.EmpDTO;
import com.toy.prj.service.EmpService;

//@Slf4j
@Service
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	EmpMapper mapper;

	@Override
	public List<EmpDTO> showEmpList() {
		List<EmpDTO> list = mapper.empList();
		for(EmpDTO emp : list) {
			//log.info(emp.getNm()+" | "+emp.getPos()+" | "+emp.getAreaNm());
			if(emp != null) {
				trim(emp);
			}
		}
		return list;
	}

	private void trim(EmpDTO emp) {
		String pos = emp.getPos();
		String areaNm = emp.getAreaNm();
		String areaCd = emp.getAreaCd();
		String stDt = emp.getStDt();
		String etDt = emp.getEtDt();
		if(StringUtils.isNotEmpty(emp.getPos())) {
			emp.setPos(pos.trim());
		}
		if(StringUtils.isNotEmpty(emp.getAreaNm())) {
			emp.setAreaNm(areaNm.trim());
		}
		if(StringUtils.isNotEmpty(emp.getAreaCd())) {
			emp.setAreaCd(areaCd.trim());
		}
		if(StringUtils.isNotEmpty(emp.getStDt())) {
			emp.setStDt(stDt.trim());
		}
		if(StringUtils.isNotEmpty(emp.getEtDt())) {
			emp.setEtDt(etDt.trim());
		}
	}

}
