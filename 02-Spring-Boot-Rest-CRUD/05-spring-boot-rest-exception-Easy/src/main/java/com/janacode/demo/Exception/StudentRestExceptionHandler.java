package com.janacode.demo.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.janacode.demo.rest.StudentErrorResponse;
import com.janacode.demo.rest.StudentNotFoundException;
@ControllerAdvice
public class StudentRestExceptionHandler {
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
