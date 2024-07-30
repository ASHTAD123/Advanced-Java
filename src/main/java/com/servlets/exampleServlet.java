package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class exampleServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private ServletConfig config;

	public exampleServlet() {
		super();
	}

	/* ------------ Life cycle methods ------------------- */
	public void init(ServletConfig config) {
		this.config = config;
		System.out.println("Init() called");
	}

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Example Servlet , Service() called");
		PrintWriter pw = response.getWriter();
		pw.write("<h1>Service() called<h1>");
		pw.write("<h1> Hii From Example Servlet </h1>");
		pw.write("<br>");

	}

	public void destroy() {
		System.out.println("Destroy method");
	}

	/* ------------ Non-Lifecycle methods ------------------- */
	public ServletConfig getServletConfig() {
		return this.config;
	}

	public String getServletInfo() {
		return "Servlet information";
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
