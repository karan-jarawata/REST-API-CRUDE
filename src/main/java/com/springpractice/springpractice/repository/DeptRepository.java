package com.springpractice.springpractice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springpractice.springpractice.entities.Department;


public interface DeptRepository extends JpaRepository<Department, Integer> {

	
	
}
