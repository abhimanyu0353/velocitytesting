package com.student.StudentRecords.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.StudentRecords.Entity.Student;

//jpa repository has simple annotation class of repositoryt so no need to add @Repository and it provides transaction 
//for all its methods so no need to sadd transaction annotation in service layer
public interface StudentRepository extends JpaRepository<Student,Long> {

}
