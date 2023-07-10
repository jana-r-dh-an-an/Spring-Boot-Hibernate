package com.janacode.CrudOperation.dao;

import java.util.List;

import com.janacode.CrudOperation.entity.Employee;

public interface EmployeeDAO {

    List<Employee> findAll();

}
