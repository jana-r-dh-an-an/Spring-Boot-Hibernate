package com.janacode.crudoperation.rest;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.janacode.crudoperation.dao.EmployeeDAO;
import com.janacode.crudoperation.entity.Employee;

import java.util.*;

@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeDAO employeeDAO;
    //Quick and dirty :inject Employee DAO

    public EmployeeRestController(EmployeeDAO theEmployeeDAO){
        employeeDAO=theEmployeeDAO;

    }

    //expose "/employee" and return a list of employees

    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeDAO.findAll();
        
    }
   
    
}
