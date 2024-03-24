package com.servlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AddServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
		int number1 = Integer.parseInt(request.getParameter("number-1"));
		int number2 = Integer.parseInt(request.getParameter("number-2"));
		
		int sum = number1+number2;
		
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		
		out.println("Sum is "+sum);
		System.out.println(sum);
		
	}

}
