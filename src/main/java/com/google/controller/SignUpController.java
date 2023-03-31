package com.google.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignUpController extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) {
//		System.out.println("SignUpController!!");
//		String first_name = request.getParameter("fname");
//		String last_name = request.getParameter("lname");
//		String email = request.getParameter("email");
//		String password = request.getParameter("pass");
//		
//		System.out.println("First name is: " + first_name);
//		System.out.println("Last name is: " + last_name);
//		System.out.println("Email is: " + email);
//		System.out.println("Password is: " + password);
		
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		String choice = request.getParameter("sum");
//		System.out.println(choice);
		if(choice.equals("Addition"))
		{
			System.out.println("Addition of " + num1 + " and " + num2 + " is: " + (num1+num2));
		}
		else if(choice.equals("Subtration"))
		{
			System.out.println("Subtration of " + num1 + " and " + num2 + " is: " + (num1-num2));
		}
		else if(choice.equals("Multiplication"))
		{
			System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " + (num1*num2));
		}
		else
		{
			System.out.println("Divition of " + num1 + " and " + num2 + " is: " + (num1/num2));
		}
	}
}
