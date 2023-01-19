package com.adsa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {


	@GetMapping("/")
	public String getHome(Model model) {
		
		return "index";
	}
	
	@GetMapping("/Testing")
	public String getInitialView2(Model model) {
		
		model.addAttribute("variable",6);
		
		return "index";
	}
	
}
