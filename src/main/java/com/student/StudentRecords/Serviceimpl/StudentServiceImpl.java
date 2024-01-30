package com.student.StudentRecords.Serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.student.StudentRecords.Entity.Student;
import com.student.StudentRecords.Repository.StudentRepository;
import com.student.StudentRecords.Service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository srepo;
	
	
	public StudentServiceImpl(StudentRepository srepo) {
		super();
		this.srepo = srepo;
	}


	@Override
	public List<Student> getAllStudents() {
				return srepo.findAll();
	}


	@Override
	public Student saveStudent(Student student) {
		
		return srepo.save(student);
	}

}
