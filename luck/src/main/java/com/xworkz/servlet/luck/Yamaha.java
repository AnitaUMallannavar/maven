package com.xworkz.servlet.luck;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/Yama")
public class Yamaha extends HttpServlet{
       public Yamaha() {
		System.out.println("Creating no args constr in Yamaha");
	   }
       
       @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
    		throws ServletException, IOException {
    	System.out.println("Overriding doGet method in Yamaha...");
    }
}
