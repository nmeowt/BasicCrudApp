package com.nmt.crud.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.nmt.crud.dto.StudentDTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Student")
@NoArgsConstructor
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "Id_Student")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idStudent;

	@Column(name = "Name_Student")
	private String nameStudent;

	@Column(name = "Id_Class")
	private int idClass;

	public Student(StudentDTO studentDTO) {
		this.idStudent = studentDTO.getIdStudent();
		this.nameStudent = studentDTO.getNameStudent();
		this.idClass = studentDTO.getStudentClass().getIdClass();
	}
}
