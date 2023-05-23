package com.xworkz.servlet.luck;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/send")
public class ColdServlet extends HttpServlet{

	public ColdServlet() {
		System.out.println("Creating no args const in ColdServlet.. ");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
	System.out.println("overriding doGet method.........");
	}
}
