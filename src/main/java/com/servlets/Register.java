package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Register extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		pw.println(" <h2> Welcome to Register Servlet </h2> ");

		String name = request.getParameter("user_name");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String gender = request.getParameter("user_gender");
		String course = request.getParameter("user_course");
		String terms = request.getParameter("condition");

		if (terms != null) {

			if (terms.equals("checked")) {
				pw.print("<h2> Name : " + name + "</h2>");
				pw.print("<h2> Email : " + email + "</h2>");
				pw.print("<h2> Password : " + password + "</h2>");
				pw.print("<h2> Gender : " + gender + "</h2>");
				pw.print("<h2> Course : " + course + "</h2> ");

				// success
				// forwarding the request to another page
				RequestDispatcher rd = request.getRequestDispatcher("/userHome");
				rd.forward(request, response);

			} else {

				pw.write("Please accept terms & conditions");

				// including output of form.html
				RequestDispatcher rd = request.getRequestDispatcher("form.html");
				rd.include(request, response);
			}
		} else {
			pw.write("Please accept terms & conditions");
			// including output of form.html
			RequestDispatcher rd = request.getRequestDispatcher("form.html");
			rd.include(request, response);
		}

	}

}
