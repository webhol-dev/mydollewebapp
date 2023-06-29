package de.kfw.renovierungsbeispiel.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/simple")
public class BeispielServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		try {
			response.setContentType("text/html");
			out.write("<html><head><title>Hello World</title></head><body><h1>Hello World</h1><h1>mydollewebapp</h1><h3>" 
			+ new SimpleDateFormat("dd.MM.YYYY - HH:mm:ss").format(new Date()) + "</h3></body></html>");
			out.flush();
			
			
		} catch (Exception e) {
			throw new ServletException(e);
		}
		finally {
			out.close();
		}
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
}
