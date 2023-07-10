package com.janacode.CrudOperation.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.janacode.CrudOperation.dao.EmployeeDAO;
import com.janacode.CrudOperation.entity.Employee;

@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeDAO employeeDAO;
    // Quick and dirty :inject Employee DAO

    public EmployeeRestController(EmployeeDAO theEmployeeDAO) {
        employeeDAO = theEmployeeDAO;

    }

    // expose "/employee" and return a list of employees

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeDAO.findAll();

    }

}