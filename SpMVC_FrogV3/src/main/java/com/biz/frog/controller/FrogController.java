package com.biz.frog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.biz.frog.model.FrogVO;
import com.biz.frog.service.FrogService;

@RequestMapping(value="/frog")
@Controller
public class FrogController {
	// @Service Annotation이 부착된 클래스를 주입해 달라
//	@Autowired
//	private FrogService fService;
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String list(Model model) {
		
//		List<FrogVO> frogList = fService.selectAll();
//		System.out.println(frogList.get(0).getTitle());
//		model.addAttribute("FROGS",frogList);
		return "list";
	
	}
	
//	@RequestMapping(value="/getfrog",method=RequestMethod.GET)
//	public String getFrog(Model model) {
//		System.out.println("여기는 블로그 리스트 보기!!!");
		
//		List<FrogVO> frogList = fService.selectAll();
//		if(frogList != null) {
//			int size = frogList.size();
//			model.addAttribute("TITLE",frogList.get(size - 1).getTitle());
//			model.addAttribute("CONTENT",frogList.get(size - 1).getContent());
//			model.addAttribute("USER",frogList.get(size - 1).getUser());
//		} else {
//			model.addAttribute("TITLE","데이터가 없음");
//		}
//		return "view";
//	}
	@RequestMapping(value="/input",method=RequestMethod.GET)
	public String input() {
		return "write";
	}
	
	/*
	 * @ModelAttribute
	 * 	form에서 input에 입력한 문자열이
	 * 	전송되어 오면 input tag의 변수(name)을 분석하여
	 * 	VO class의 필드변수와 일치하면 전달된 
	 * 	데이터(값)을 VO객체에 담아달라
	 */
	@RequestMapping(value="/write",method=RequestMethod.POST)
	public String write(@ModelAttribute FrogVO frogVO,Model model) {
		
		System.out.println("USER : " + frogVO.getUser());
		System.out.println("TITLE : " + frogVO.getTitle());
		System.out.println("CONTENT : " + frogVO.getContent());
	
//		fService.insert(frogVO);
		
		model.addAttribute("TITLE",frogVO.getTitle());
		model.addAttribute("CONTENT",frogVO.getContent());
		model.addAttribute("USER",frogVO.getUser());
		return "view";
	
	}

}
