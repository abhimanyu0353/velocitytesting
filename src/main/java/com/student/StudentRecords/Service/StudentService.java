package com.student.StudentRecords.Service;

import java.util.List;

import com.student.StudentRecords.Entity.Student;

public interface StudentService {
	
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);

}
