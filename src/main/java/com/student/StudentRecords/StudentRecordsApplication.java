package com.student.StudentRecords;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.student.StudentRecords.Entity.Student;
import com.student.StudentRecords.Repository.StudentRepository;

@SpringBootApplication
public class StudentRecordsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentRecordsApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * Student s1=new Student("abhi", "dawane", "as@gmail.com");
		 * studentRepository.save(s1);
		 * 
		 * Student s2=new Student("bhushan", "dawane", "as@gmail.com");
		 * studentRepository.save(s2);
		 * 
		 * Student s3=new Student("rahul", "dawane", "as@gmail.com");
		 * studentRepository.save(s3);
		 */

	}

}
