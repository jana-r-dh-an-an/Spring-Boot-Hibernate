package com.janacode.demo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
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

        //check the student id again list size

        if((studentId >=theStudent.size()) || (studentId<0)){
            throw new StudentNotFoundException("student Id is not found"+studentId);
        }
        return theStudent.get(studentId);
        
        

    }

        //Add an Exception handler using @Exceptionhandler
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException (StudentNotFoundException exc){
        
        //create a studnetErrorResponse

        StudentErrorResponse error= new StudentErrorResponse();
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMeassage(exc.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        //return ResponseEntity
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }


    // add another Exception Handler .. to catch any exception(catch all)
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException (Exception exc){

        //create a studnetErrorResponse

        StudentErrorResponse error= new StudentErrorResponse();
        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setMeassage(exc.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        //return ResponseEntity
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);

    }



   
    
}




