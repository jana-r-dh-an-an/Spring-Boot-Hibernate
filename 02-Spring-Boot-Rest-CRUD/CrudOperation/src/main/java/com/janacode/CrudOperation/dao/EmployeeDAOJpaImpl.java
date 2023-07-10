package com.janacode.CrudOperation.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.janacode.CrudOperation.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {

    private EntityManager Manager;

    @Autowired
    public EmployeeDAOJpaImpl(EntityManager theEntityManager) {
        Manager = theEntityManager;
    }

    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> theQuery = Manager.createQuery("From Employee", Employee.class);

        List<Employee> theData = theQuery.getResultList();

        return theData;

    }

}
