package com.nmt.crud.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.nmt.crud.model.StudentClass;

@Component
public interface StudentClassService {
	void save(StudentClass studentClass);

	List<StudentClass> getAll();

	StudentClass findByIdClass(int idClass);

	void deleteById(int idClass);;
}
