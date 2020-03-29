package com.nmt.crud.dto;

import com.nmt.crud.model.Student;
import com.nmt.crud.model.StudentClass;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class StudentDTO {
	private int idStudent;

	private String nameStudent;

	private StudentClass studentClass;

	public StudentDTO(Student student, StudentClass studentClass) {
		this.idStudent = student.getIdStudent();
		this.nameStudent = student.getNameStudent();
		this.studentClass = studentClass;
	}
}
