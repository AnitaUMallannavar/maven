package com.xworkz.servlet.luck;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/Hd")
public class Honda extends HttpServlet{
     public Honda() {
		System.out.println("Creating no args constr in Honda");
	 }
     
     @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
    		throws ServletException, IOException {
    	System.out.println("Overriding doGet method in Honda....");
    }
}
