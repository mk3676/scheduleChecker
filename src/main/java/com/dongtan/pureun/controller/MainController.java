package com.dongtan.pureun.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class MainController {
	// ���� ȭ������ �̵�
	@GetMapping("/main")
	public ModelAndView mainPage() {
		ModelAndView model = new ModelAndView();
		model.setViewName("main");
		
		return model;
	}
	
	// �α��� ȭ������ �̵�
	@GetMapping("/login")
	public ModelAndView loginPage() {
		ModelAndView model = new ModelAndView();
		model.setViewName("/member/login");
		
		return model;
	}
	
	// ȸ������ ȭ������ �̵�
	@GetMapping("/register")
	public ModelAndView registerPage() {
		ModelAndView model = new ModelAndView();
		model.setViewName("/member/register");
		
		return model;
	}
}
