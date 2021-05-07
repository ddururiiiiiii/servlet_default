package com.servlet.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

public class HTMLView {
	
	public static void html(HttpServletResponse response, String title, String body) throws IOException, ServletException {
		html(response, title, null, null, body);
	}
	
	public static void html(HttpServletResponse response, String script) throws IOException, ServletException {
		html(response, null, null, script, null);
		
	}
	public static void html(HttpServletResponse response, 
			String title, String css, String script, String body) 
				throws IOException, ServletException {
		
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>" + title + "</title>");
		out.println("</head>");
		out.println("<style>" + css + "</style>");
		out.println("<script>" + script +"</script>");
		out.println("</head>");
		out.println("<body>"+ body + "</body>");
		out.println("</html>");
	}
	
	public static void loginView(HttpServletResponse response)
			throws IOException, ServletException {
		
		String body = null;
		
		/**
		 * '/>' (닫는 태그) : 마크업언어는 닫는태그가 없어도 상관없지만
		 * xml에서는 닫는 태그를 사용해줘야 한다. 
		 */
		body = "<form action='' method='post'>"
		+"<input type='text' name='id'/></br/>"
		+"<input type='password' name='pwd'/><br/>"
		+"<input type='submit' name='memId' value='로그인'/>"
		+"</form>";
		
		html(response, "로그인", null, null, body);
		
	}
	
	
}
