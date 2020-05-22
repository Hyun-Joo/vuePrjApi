package com.toy.prj.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.toy.prj.service.EmpService;

@RestController
public class EmpController extends AbstractController {
	
	@Autowired
	EmpService service;
	
	@GetMapping("/empList")
	@CrossOrigin
	public Map<String,Object> getEmpList(){
		return makeQueryResultMap(service.showEmpList());
	}

}
