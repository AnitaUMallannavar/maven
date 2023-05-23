package com.xworkz.servlet.luck;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/me")
public class Pizza extends HttpServlet {

	public Pizza() {
		System.out.println("creating no args constr in Pizza...");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doGet method in Pizza..");
		System.out.println(req.getRequestURI());
		System.out.println("IP Address:" + req.getRemoteAddr());
		Enumeration<String> enumaration = req.getHeaderNames();
		while (enumaration.hasMoreElements()) {
			String headerName = enumaration.nextElement();
			System.out.println(headerName + "" + req.getHeader(headerName));

		}
		System.out.println("----------------");
		// resp.setContentType("text/plain");
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String mobile = req.getParameter("mobileno");
		String email = req.getParameter("email");

		System.out.println(fname + ":" + lname + ":" + mobile + ":" + email);
		resp.setContentType("text/html");
		PrintWriter print = resp.getWriter();
		print.print("<html><body bgcolor='pink'><h1>Pizza is too hot..</h1></body></html>");
	}
}
