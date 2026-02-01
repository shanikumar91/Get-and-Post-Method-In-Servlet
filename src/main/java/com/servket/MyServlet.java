package com.servket;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/submitForm")
public class MyServlet extends HttpServlet{
	
//	@Override
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String myName = request.getParameter("name1");
//		String myEmail = request.getParameter("email1");
//		
////		Print Console
//		System.out.println("Welcome :" +myName);
//		System.out.println("Email :"+myEmail);
//		
////		Print Browser
//		PrintWriter out = response.getWriter();
//		out.print("Welcome :" +myName);
//		out.print("Email :"+myEmail);
//	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String myName = request.getParameter("name1");
		String myEmail = request.getParameter("email1");
		
//		Print Console
		System.out.println("Welcome :" +myName);
		System.out.println("Email :"+myEmail);
		
//		Print Browser
		PrintWriter out = response.getWriter();
		out.print("Welcome :" +myName);
		out.print("Email :"+myEmail);
	}
}
