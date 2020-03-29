package com.nmt.crud.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nmt.crud.dto.StudentDTO;
import com.nmt.crud.model.Student;
import com.nmt.crud.model.StudentClass;
import com.nmt.crud.service.StudentClassService;
import com.nmt.crud.service.StudentService;

@Controller
public class HomeController {
	@Autowired
	private StudentService studentService;

	@Autowired
	private StudentClassService studentClassService;

	@RequestMapping(value = "/addOrUpdateStudent", method = RequestMethod.POST, produces = { "application/json" })
	@ResponseBody
	public String addOrUpdateStudent(@RequestBody StudentDTO studentDTO) {
		Student student = new Student(studentDTO);
		studentService.save(student);
		return "Success";
	}

	@RequestMapping(value = "/getAllStudent")
	@ResponseBody
	public List<StudentDTO> getAllStudent() {
		List<Student> listStudent = studentService.getAll();
		List<StudentDTO> listStudentDTO = new ArrayList<>();
		for (Student student : listStudent) {
			StudentClass studentClass = studentClassService.findByIdClass(student.getIdClass());
			StudentDTO studentDTO = new StudentDTO(student, studentClass);
			listStudentDTO.add(studentDTO);
		}
		return listStudentDTO;
	}

	@RequestMapping(value = "/deleteStudent")
	@ResponseBody
	public String deleteStudent(@RequestBody StudentDTO studentDTO) {
		studentService.deleteById(studentDTO.getIdStudent());
		return "Success";
	}

	@RequestMapping(value = "/addOrUpdateClass", method = RequestMethod.POST, produces = { "application/json" })
	@ResponseBody
	public String addOrUpdateClass(@RequestBody StudentClass studentClass) {
		studentClassService.save(studentClass);
		return "Success";
	}

	@RequestMapping(value = "/getAllClass")
	@ResponseBody
	public List<StudentClass> getAllClass() {
		return studentClassService.getAll();
	}

	@RequestMapping(value = "/deleteClass")
	@ResponseBody
	public String deleteClass(@RequestBody StudentClass studentClass) {
		studentClassService.deleteById(studentClass.getIdClass());
		return "Success";
	}
}
