package com.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.EmployeeDAO;
import com.demo.pojo.EmployeeDTO;

@Service ("employeeService")
public class EmployeeServiceImpl implements EmployeeService
{
    @Autowired
    EmployeeDAO dao;
     
    public EmployeeDTO createNewEmployee()
    {
        return dao.createNewEmployee();
    }
}