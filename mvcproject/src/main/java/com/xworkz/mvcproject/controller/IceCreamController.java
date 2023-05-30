package com.xworkz.mvcproject.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
@Component
@RequestMapping(value = "/")
public class IceCreamController {
	 public IceCreamController() {
		System.out.println("Create:"+this.getClass().getSimpleName());
	}

	@RequestMapping(value = "/click")
	public String onClick() {
		System.out.println("Running onClick Method");
		return "index.jsp";
	}
}
