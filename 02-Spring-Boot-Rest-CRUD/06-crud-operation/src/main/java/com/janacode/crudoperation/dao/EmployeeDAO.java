package com.janacode.crudoperation.dao;

import java.util.List;

import com.janacode.crudoperation.entity.Employee;

public interface EmployeeDAO {

    List<Employee> findAll();
    
}
