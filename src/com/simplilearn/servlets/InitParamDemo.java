package com.simplilearn.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InitParamDemo
 */
@WebServlet(name = "InitParam", urlPatterns = {
		"/intParam" }, initParams = @WebInitParam(name = "location", value = "D:Lockers"))

public class InitParamDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private String location = null;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InitParamDemo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void init(ServletConfig config) throws ServletException {
		System.out.println("Servlet iniitializing in init method -");
		location = config.getInitParameter("location");

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("Servicing Servlet - GET method");
		out.println("<br/>Location configured as init param is :" + location);
		out.print("</body></html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
