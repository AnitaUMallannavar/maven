package com.xworkz.mvcPre.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping(value = "/")
public class CoffeeController {

	public CoffeeController() {
		System.out.println("Create"+this.getClass().getSimpleName());
	}
	
	@RequestMapping(value = "/click")
	public String onClick() {
		System.out.println("Running onClick method in CoffeeController..");
		return "index.jsp";
	}
	
	
}
