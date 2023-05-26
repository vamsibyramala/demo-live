package com.gct.service;

import java.util.List;

import com.gct.dao.StudentDao;
import com.gct.dto.Student;

public class StudentServices {
	StudentDao dao = new StudentDao();

	public Student saveStudentService(Student student) {
		if (student.getName() != null && student.getEmail() != null && student.getAge() != 0
				&& student.getPhone() != 0) {
			return dao.saveStudentDao(student);
		}
		return null;
	}

	public List<Student> displayStudentService() {
		return dao.displayStudentDao();
	}

}
