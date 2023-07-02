package com.janacode.cruddemo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.janacode.cruddemo.entity.Student;

import jakarta.persistence.EntityManager;




@Repository
public class StudentDAOImpl implements StudentDAO {

   //define field for entity manager
   private EntityManager entityManager;

   //inject entity manager using costructor injection
  
   public StudentDAOImpl(EntityManager entityManager) {
    this.entityManager = entityManager;
}

   //implement save method


@Override
@Transactional
public void save(Student theStudent){
    entityManager.persist(theStudent);

}


  

    
}
