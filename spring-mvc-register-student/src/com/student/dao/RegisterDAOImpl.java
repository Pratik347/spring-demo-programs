package com.student.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Repository;

import com.student.model.Student;

@Repository
public class RegisterDAOImpl implements RegisterDAO{

	public int registerStudent(Student student) {
		int rowAffected = 0;
		Connection connection=null;
		
			connection = DBUtil.makeConnection();
			Statement statement;
			try {
				statement = connection.createStatement();            
			
			rowAffected = statement.executeUpdate("insert into register_student values('" + student.getUsername() + "','" + student.getPassword() + "','" + student.getFirstName() + "','" + student.getLastName() + "','" + student.getEmailId() +"')",statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.getGeneratedKeys();
			          
			statement.close();
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		return rowAffected;
	}

}
