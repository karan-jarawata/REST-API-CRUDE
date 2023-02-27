package com.springpractice.springpractice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springpractice.springpractice.entities.Emploee;

public interface EmpRepository extends JpaRepository<Emploee, Long> {

	
	
}
