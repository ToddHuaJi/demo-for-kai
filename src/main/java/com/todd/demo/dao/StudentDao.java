package com.todd.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todd.demo.models.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {

}
