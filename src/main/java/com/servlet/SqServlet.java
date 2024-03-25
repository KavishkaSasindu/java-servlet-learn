package com.servlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
		HttpSession session = request.getSession();
				
				int sum = (int)session.getAttribute("sum");
		
		sum = sum*sum;
		
;		
		PrintWriter out = response.getWriter();
		out.println("multiply is "+sum);
	}
}
