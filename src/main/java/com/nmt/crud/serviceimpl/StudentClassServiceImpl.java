package com.nmt.crud.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nmt.crud.model.StudentClass;
import com.nmt.crud.repository.StudentClassRepository;
import com.nmt.crud.service.StudentClassService;

@Service
public class StudentClassServiceImpl implements StudentClassService {
	@Autowired
	private StudentClassRepository studentClassRepository;

	@Override
	public void save(StudentClass studentClass) {
		studentClassRepository.save(studentClass);
	}

	@Override
	public List<StudentClass> getAll() {
		return studentClassRepository.findAll();
	}

	@Override
	public StudentClass findByIdClass(int idClass) {
		return studentClassRepository.findByIdClass(idClass);
	}

	@Override
	public void deleteById(int idClass) {
		studentClassRepository.deleteById(idClass);
	}

}
