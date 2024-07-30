package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class myGenericServlet extends GenericServlet implements Servlet {

	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {

	}

	public void destroy() {

	}

	public ServletConfig getServletConfig() {
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		System.out.println("Generic Servlet");

		pw.write("<h1>Service() called<h1>");
		pw.write("<h1> Hii From Generic Servlet </h1>");
		pw.write("<br>");
		System.out.println("Service() called");
	}

}
