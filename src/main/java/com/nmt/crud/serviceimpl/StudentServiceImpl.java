package com.nmt.crud.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nmt.crud.model.Student;
import com.nmt.crud.repository.StudentRepository;
import com.nmt.crud.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void save(Student student) {
		studentRepository.save(student);
	}

	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public void deleteById(int idStudent) {
		studentRepository.deleteById(idStudent);
	}

}
