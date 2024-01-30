package com.student.StudentRecords.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.student.StudentRecords.Entity.Student;
import com.student.StudentRecords.Service.StudentService;

@Controller
public class StudentController {
	private StudentService service;

	public StudentController(StudentService service) {
		super();
		this.service = service;
	}

	@GetMapping("/students")
	public String liststudents(Model model) {
		model.addAttribute("students", service.getAllStudents());
		return "students";// this will call students view whihc is html as thymleaf is used it does
							// automatically
	}

	@GetMapping("students/new")
	public String createStudent(Model model) {
		Student s = new Student();
		model.addAttribute("student", s);
		return "created";

	}

	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {

		service.saveStudent(student);
		return "redirect:/students";
	}

}
