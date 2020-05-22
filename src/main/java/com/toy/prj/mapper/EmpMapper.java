package com.toy.prj.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.toy.prj.model.EmpDTO;

@Repository
@Mapper
public interface EmpMapper {
	
	public List<EmpDTO> empList();

}
