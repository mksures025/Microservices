package com.te.studentservice.repository;

import com.te.studentservice.enity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,String> {
}
