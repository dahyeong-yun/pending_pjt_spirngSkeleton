package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/test")
	public String test(Model model) {
		model.addAttribute("msg", "Hello World!");
		return "test";
	}
}