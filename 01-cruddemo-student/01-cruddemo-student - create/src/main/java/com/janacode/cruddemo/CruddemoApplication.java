package com.janacode.cruddemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.janacode.cruddemo.dao.StudentDAO;
import com.janacode.cruddemo.entity.Student;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner ->{
			// createStudent(studentDAO);
			createMutipleStudent(studentDAO);
		};
		
	}
	private void createMutipleStudent(StudentDAO studentDAO){
			//create ths student object
		System.out.println("Creating new student object");
		Student tempStudent1 = new Student("kokila", "rangineni", "kokila305@gmail.com");
		Student tempStudent2 = new Student("jothi", "rangineni", "jothi305@gmail.com");
		Student tempStudent3 = new Student("srinivasulu", "rangineni", "srinivasan305@gmail.com");


		//save the student object
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
	

	}

	}

	

	// private void createStudent(StudentDAO studentDAO){

	// 	//create ths student object
	// 	System.out.println("Creating new student object");
	// 	Student tempStudent = new Student("janardhanan", "sathish", "rsjana305@gmail.com");


	// 	//save the student object
	// 	System.out.println("Saving the student...");
	// 	studentDAO.save(tempStudent);
	// 	//display id of the saved student
	// 	System.out.println("Saved the student. Generated id: "+ tempStudent.getId());

	// }


		



