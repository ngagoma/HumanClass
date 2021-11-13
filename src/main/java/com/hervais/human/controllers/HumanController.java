package com.hervais.human.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
//@RequestMapping("/")
public class HumanController {
	
//	@RequestMapping("")
//	public String web() {
//		return "home"; 
//	}
////	
	@RequestMapping("/")
	public String person(@RequestParam("name") String userName, Model model) {
		model.addAttribute("name", userName);
		System.out.println("Hello " + userName); 
		return "home";
	}
}
