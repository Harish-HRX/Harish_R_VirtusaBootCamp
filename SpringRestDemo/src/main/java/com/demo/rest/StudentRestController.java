package com.demo.rest;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	@GetMapping("/students")
	public List<Student> getStudents() {

		List<Student> theStudents = new ArrayList<>();
		
		theStudents.add(new Student("Harish", "H"));
		theStudents.add(new Student("Deepak", "D"));
		theStudents.add(new Student("Mukesh", "M"));		
			
		return theStudents;
	}
	
}
