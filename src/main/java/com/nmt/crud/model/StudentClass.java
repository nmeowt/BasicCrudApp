package com.nmt.crud.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Student_Class")
@NoArgsConstructor
public class StudentClass implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "Id_Class")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idClass;
	
	@Column(name="Name_Class")
	private String nameClass;
}
