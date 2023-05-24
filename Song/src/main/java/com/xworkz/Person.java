package com.xworkz;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/fav")
public class Person extends HttpServlet{
  
	public Person() {
		System.out.println("creating no args constructor in Person..");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		System.out.println("Running doPost method in Person...");
		//super.doPost(req, resp);
		req.setAttribute("favPlace",req.getParameter("favPlace"));
		req.setAttribute("favFood", req.getParameter("favFood"));
		req.setAttribute("favPerson",req.getParameter("favPerson"));
		
		String[] brands= {"HP","Lenovo","Dell"};
		req.setAttribute("brand1", brands[0]);
		req.setAttribute("brand2", brands[1]);
		req.setAttribute("brand3", brands[2]);
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("/Show.jsp");
		requestDispatcher.forward(req, resp);
	}
}
