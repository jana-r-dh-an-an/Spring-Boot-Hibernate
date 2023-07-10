package com.janacode.demo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.janacode.demo.Entity.Student;

@RestController
@RequestMapping("/api")
public class DemoRestController {

    private List<Student> theStudent;

    @GetMapping("/student")
    public List<Student> getStudent(){
         theStudent= new ArrayList<>();
        theStudent.add(new Student("janan","sathish"));
        theStudent.add(new Student("kiran","sathish"));
        theStudent.add(new Student("kumar","sathish"));
        theStudent.add(new Student("sar","sathish"));
        return theStudent;
        
    }
    
}
