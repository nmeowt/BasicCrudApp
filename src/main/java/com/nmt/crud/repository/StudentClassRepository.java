package com.nmt.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nmt.crud.model.StudentClass;

@Repository
public interface StudentClassRepository extends JpaRepository<StudentClass, Integer> {

	StudentClass findByIdClass(int idClass);

}
