package com.gct.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gct.dto.Student;
import com.gct.service.StudentServices;
@WebServlet("/savestudent")
public class SaveStudentJsp extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("sname");
		String email = req.getParameter("semail");
		String ageimp = req.getParameter("sage");
		String phoneimp = req.getParameter("sphone");

		Student student = new Student();
		if (name != "" && email != "" && ageimp != "" && phoneimp != "") {
			int age = Integer.parseInt(ageimp);
			long phone = Long.parseLong(phoneimp);

			student.setName(name);
			student.setEmail(email);
			student.setAge(age);
			student.setPhone(phone);
		}
		StudentServices studentService = new StudentServices();
		Student student2 = studentService.saveStudentService(student);

		if (student2 != null) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
			dispatcher.forward(req, resp);
		} else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("register.jsp");
			dispatcher.forward(req, resp);
		}
	}

}
