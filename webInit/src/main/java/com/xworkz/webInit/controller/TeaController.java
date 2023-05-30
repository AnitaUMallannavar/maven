package com.xworkz.webInit.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping(value = "/")
public class TeaController {
	public TeaController() {
		System.out.println("create" + this.getClass().getSimpleName());
	}

	@RequestMapping(value = "clickME")
	public String click() {
		System.out.println("Running click method in TeaController..");
		return "/Display.jsp";
	}
}
