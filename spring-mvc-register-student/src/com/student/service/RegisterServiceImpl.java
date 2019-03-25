package com.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dao.RegisterDAO;
import com.student.model.Student;

@Service
public class RegisterServiceImpl implements RegisterService{
	
	@Autowired
	public RegisterDAO registerDAO;

	public int registerStudent(Student student) {
		int rowAffected=registerDAO.registerStudent(student);
		return rowAffected;
	}
	
	

}
