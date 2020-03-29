package com.nmt.crud.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.nmt.crud.model.Student;

@Component
public interface StudentService {
	void save(Student student);

	List<Student> getAll();

	void deleteById(int idStudent);
}
