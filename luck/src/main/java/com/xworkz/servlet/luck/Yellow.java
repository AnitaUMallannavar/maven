package com.xworkz.servlet.luck;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/provide")
public class Yellow extends HttpServlet{
     public Yellow() {
		System.out.println("creating no args const in Yellow");
	}
     
     @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
    		throws ServletException, IOException {
    	System.out.println("Overriding doGet method in Yellow.......");
    }
}
