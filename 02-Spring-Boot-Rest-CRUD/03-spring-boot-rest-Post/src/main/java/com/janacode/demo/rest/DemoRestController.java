package com.janacode.demo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.janacode.demo.Entity.Student;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/api")
public class DemoRestController {

    private List<Student> theStudent;
    
    @PostConstruct
    public void loadData(){
      theStudent= new ArrayList<>();
        theStudent.add(new Student("janan","sathish"));
        theStudent.add(new Student("kiran","sathish"));
        theStudent.add(new Student("kumar","sathish"));
        theStudent.add(new Student("sar","sathish"));
    }

    @GetMapping("/student")
    public List<Student> getStudent(){
       
        return theStudent;
        
    }

    @GetMapping("/student/{studentId}")
    public Student getStudent(@PathVariable int studentId){
        return theStudent.get(studentId);
        
        

    }
    
}
