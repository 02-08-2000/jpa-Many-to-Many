package com.example.jpaManytoMany.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpaManytoMany.entity.Student;

public interface studentrepository extends JpaRepository<Student,Long>{

	List<Student> findByNameContaing(String name);

}
