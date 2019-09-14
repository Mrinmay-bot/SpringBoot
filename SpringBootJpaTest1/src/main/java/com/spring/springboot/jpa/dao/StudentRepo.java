package com.spring.springboot.jpa.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.springboot.jpa.model.Student;

public interface StudentRepo extends CrudRepository<Student, Integer>{

}
