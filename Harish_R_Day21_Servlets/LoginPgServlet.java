package com.harish;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginPgServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException{
		
		String uname=req.getParameter("uname");
		String pwd=req.getParameter("pwd");
		
		req.setAttribute("uname",uname);
		
		RequestDispatcher rd=req.getRequestDispatcher("welcome");
		rd.forward(req, res);
		
	//	PrintWriter out=res.getWriter();
	//	out.println("Successfully Logged in "+uname+" !!");
		
	}
	
}
