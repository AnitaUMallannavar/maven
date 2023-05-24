package com.xworkz.song;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/singer")
public class SongInfo extends HttpServlet {
	public SongInfo() {
		System.out.println("creating no args constr in SongInfo.");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//super.doPost(req, resp);
		System.out.println("Running doPost method in SongInfo...");
		// resp.setContentType("text/jsp");
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/Display.jsp");
		requestDispatcher.forward(req, resp);
	}

}

