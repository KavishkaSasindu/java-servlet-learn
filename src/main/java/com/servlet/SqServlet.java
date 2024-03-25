package com.servlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Cookie;

import java.io.IOException;
import java.io.PrintWriter;

public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
//		HttpSession session = request.getSession();
//				
//				int sum = (int)session.getAttribute("sum");
		
		int sum = 1;
		
		Cookie cookie[] = request.getCookies();
		
		for(Cookie cook :cookie) {
			if(cook.getName().equals("sum")) {
				 sum = Integer.parseInt(cook.getValue());
			}
		}
		
		sum = sum*sum;
		
;		
		PrintWriter out = response.getWriter();
		out.println("multiply is "+sum);
	}
}
