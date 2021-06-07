package com.harish;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomePgServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{
		
		
		String name=(String) req.getAttribute("uname");
		PrintWriter out=res.getWriter();
		out.println("Welcome to Home Page "+name+" !!");
		
	}
	
}