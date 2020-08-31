package com.biz.hello.controller;

import java.util.List;

import javax.inject.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.biz.hello.model.DeptVO;
import com.biz.hello.service.DeptService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping(value="/dept")
@Controller
public class DeptController {
	
	@Autowired
	@Qualifier("deptServiceV1")
	private DeptService deptService;
	
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String deptList(Model model) {
		List<DeptVO> deptList = deptService.selectAll();
		model.addAttribute("DEPT_LIST", deptList);
		
	}
	
	
	
	

}
