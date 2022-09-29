package com.xworkz.web.servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 2, urlPatterns = "/getprime")
public class PrimeMinister extends HttpServlet {
	public PrimeMinister() {
System.out.println("server turnerd on");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("responce");
	resp.setContentType("text/html");
	String name=req.getParameter("name");
	String countrye=req.getParameter("country");
	req.setAttribute("name", name);
	req.setAttribute("country", countrye);
	RequestDispatcher dispatcher= req.getRequestDispatcher("/success.jsp");
	dispatcher.forward(req, resp);
	}

}
