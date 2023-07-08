package com.dongtan.pureun.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class MainController {
	@PostMapping("/main")
	public ModelAndView mainPage() {
		ModelAndView model = new ModelAndView();
		model.setViewName("login");
		
		return model;
	}
	
}
