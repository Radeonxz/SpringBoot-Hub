package com.SpringApp.StudentCtr;

//import com.SpringApp.StudentCtr.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.time.LocalDate;
//import java.time.Month;
//import java.util.List;

@SpringBootApplication
//@RestController
public class StudentCtrApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentCtrApplication.class, args);
	}

//	@GetMapping
//	public List<String> indexRoute() {
//		return List.of("Index", "Route");
//	}

//	@GetMapping
//	public List<Student> indexRoute() {
//		return List.of(
//				new Student(1L, "foo", "foo@foo.com", LocalDate.of(1000, Month.JANUARY, 1), 10)
//		);
//	}

}
