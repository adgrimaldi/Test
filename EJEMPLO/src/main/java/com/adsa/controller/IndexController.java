package com.adsa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.adsa.service.FetchService;

@Controller
public class IndexController {

	@Autowired
	private FetchService fetchService;
	
	
	@GetMapping("/Testing")
	public String getInitialView(Model model) {
		
		model.addAttribute("zonas",fetchService.getAllZones());
		
		return "index";
	}
	
	@GetMapping("/Testing/Vista2")
	public String getInitialView2(Model model) {
		
		model.addAttribute("variable",6);
		
		return "index";
	}
	
}
