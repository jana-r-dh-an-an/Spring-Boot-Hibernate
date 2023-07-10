package com.janacode.crudoperation.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.janacode.crudoperation.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {

    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOJpaImpl(EntityManager theentityManager) {
        entityManager = theentityManager;
    }

    @Override
    public List<Employee> findAll() {

        TypedQuery<Employee> theEmp = entityManager.createNamedQuery("From Employee", Employee.class);

        List<Employee> employees = theEmp.getResultList();
        return employees;

    }

}
