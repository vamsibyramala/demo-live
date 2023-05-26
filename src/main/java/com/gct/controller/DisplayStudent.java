package com.gct.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gct.dto.Student;
import com.gct.service.StudentServices;
@WebServlet("/display")
public class DisplayStudent extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StudentServices studentServices = new StudentServices();
		List<Student> list = studentServices.displayStudentService();

		if (list.size() > 0) {
			req.setAttribute("students", list);
			RequestDispatcher dispatcher = req.getRequestDispatcher("display.jsp");
			dispatcher.forward(req, resp);
		} else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/display");
			dispatcher.forward(req, resp);
		}
	}

}
