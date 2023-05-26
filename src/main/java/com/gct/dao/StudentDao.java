package com.gct.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.gct.dto.Student;

public class StudentDao {
	public Student saveStudentDao(Student student) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sandhya");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		if (student != null) {
			entityTransaction.begin();
			entityManager.persist(student);
			entityTransaction.commit();
		}
		return student;
	}

	public List<Student> displayStudentDao() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sandhya");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createQuery("select a from Student a");
		return query.getResultList();
	}

}
