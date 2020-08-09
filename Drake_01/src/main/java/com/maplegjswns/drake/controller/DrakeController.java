package com.maplegjswns.drake.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.maplegjswns.drake.service.DrakeService;
import com.maplegjswns.model.DrakeVO;

@Controller
public class DrakeController {
	
	@Autowired
	private DrakeService dService;
	
	@RequestMapping(value="/list")
	public String drakeList(Model model) {
		
		List<DrakeVO> drakeList = dService.selectAll();
		
		System.out.println("Controller에서 받은 데이터");
		System.out.println(drakeList);
		
		model.addAttribute("DRAKES", drakeList);
		return "drake/list";
	}
	
	@RequestMapping(value= "/input", method=RequestMethod.GET)
	public String input() {
		return "drake/input";
	}
	
	@RequestMapping(value= "/input", method=RequestMethod.POST)
	public String input(
			@ModelAttribute DrakeVO drakeVO,
			Model model
			) {
			System.out.println(drakeVO);
			int ret = dService.insert(drakeVO);
			return "redirect:/list";
	}

	
	@RequestMapping(value = "/drake")
	public String getDrake(String seq, String name, Model model ) {
		
		System.out.println("SEQ값 : " + seq);
		System.out.println("NAME 값 : " + name);
		
		long longSeq = 0;
		try {
			longSeq = Long.valueOf(seq);
		} catch (Exception e) {
			System.out.println("SEQ값을 받지 못함 :(");
		}
		DrakeVO drakeVO = dService.findBySeq(longSeq);
		
		model.addAttribute("DRAKE", drakeVO);
		
		return "drake/detail_view";
	}
	
	@RequestMapping(value = "/insert", method=RequestMethod.POST)
	public String insert(
			@ModelAttribute DrakeVO drakeVO,
			Model model
			) {
			System.out.println(drakeVO);
			int ret = dService.insert(drakeVO);
			return "redirect:/list";
	}
	
	@RequestMapping(value = "/insert", method=RequestMethod.GET)
	public String insert(
			String d_title,
			String d_newtitle,
			String d_feat,
			Model model)
	
	{
		System.out.println("노래제목 : " + d_title);
		System.out.println("신곡 : " + d_newtitle);
		System.out.println("피쳐링 : " + d_feat);
		
		DrakeVO drakeVO = new DrakeVO();
		
		drakeVO.setD_title(d_title);
		drakeVO.setD_newtitle(d_newtitle);
		drakeVO.setD_feat(d_feat);
		
		int ret = dService.insert(drakeVO);
		
		
		
		return null;
	}
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(String seq) {
		
		long longSeq = 0;
		try {
			longSeq = Long.valueOf(seq);
		} catch (Exception e) {
			// TODO: handle exception
		}
		int ret = dService.delete(longSeq);
		return "redirect:/list";
	}
	

			
	
	
	
	
	

}
