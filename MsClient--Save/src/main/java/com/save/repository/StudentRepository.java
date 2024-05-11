package com.save.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.save.model.Student;

@Repository
public interface StudentRepository  extends JpaRepository<Student, Integer>{

}
