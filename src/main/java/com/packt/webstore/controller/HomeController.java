package com.packt.webstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

@RequestMapping(value="/", method=RequestMethod.GET)
public String welcome(Model model)
{
	model.addAttribute("message", "Welcome to the Store");
	model.addAttribute("tagline", "All products related to vaping");
	return "welcome";
}
	
}
