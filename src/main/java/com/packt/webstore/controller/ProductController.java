package com.packt.webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.packt.webstore.repository.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {

@Autowired
	private ProductService productService;
	

@RequestMapping
public String showProducts(Model model)
{
	model.addAttribute("products", productService.getListOfAllProducts());
	return "products";
}
	
	
}
