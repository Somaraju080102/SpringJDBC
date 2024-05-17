package com.example.SpringJDBC;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.SpringJDBC.model.Student;
import com.example.SpringJDBC.service.StudnetService;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {

	 ApplicationContext context=SpringApplication.run(SpringJdbcApplication.class, args);

		Student sc=context.getBean(Student.class);
		sc.setId(100);
		sc.setName("Soma");
		sc.setMarks(22);
		StudnetService scService=context.getBean(StudnetService.class);


		scService.addStudent(sc);

		List<Student> students = scService.getStudentList();

		for(Student student : students){
			System.out.println(student.getName()+" "+student.getId()+" "+student.getMarks());
		}
	
	}

}
