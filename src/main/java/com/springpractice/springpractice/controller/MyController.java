package com.springpractice.springpractice.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.springpractice.springpractice.dto.Request;
import com.springpractice.springpractice.entities.Department;
import com.springpractice.springpractice.entities.Emploee;
import com.springpractice.springpractice.repository.DeptRepository;
import com.springpractice.springpractice.repository.EmpRepository;


@RestController
public class MyController {
	
	private static final Logger
	logg = LogManager.getLogger(MyController.class);
	
	// This is a Spring MVC RestController class that defines various endpoints for performing CRUD operations
	// on Department and Employee entities.
	
	
	@Autowired
	private DeptRepository deptrepository;
	
	@Autowired
	private EmpRepository emprepository;
	
	
	// This endpoint returns a List of all the Department entities present in the database.
	@GetMapping("/show/departments")
	public List<Department> showdep(){
		try {
		return deptrepository.findAll();}
		catch(Exception e) {
			logg.error(e);
			return null;
		}
	}
	
	// This endpoint returns a List of all the Employee entities present in the database.
	@GetMapping("/show/emploee")
	public List<Emploee> showemp(){
		try {
		return emprepository.findAll();
		}catch(Exception e) {
			logg.error(e);
			return null;}
	}
	
	// This endpoint is used to add a new Department entity to the database.
	@PostMapping("/add/department")
	public Department adddep(@RequestBody Request request) {
		try {
		return deptrepository.save(request.getDepartment());
		}catch(Exception e) {
			logg.error(e);
			return null;}
	}
	
	
	// This endpoint is used to update an existing Department entity in the database.
	@PutMapping("/update/department")
	public Department updatedep(@RequestBody Request request) {
		try {
		return deptrepository.save(request.getDepartment());
		}catch(Exception e) {
			logg.error(e);
			return null;}
	}
	
	
	// This endpoint is used to delete an existing Department entity from the database.
	@DeleteMapping("/department/delete/{departmentId}")
	public ResponseEntity<HttpStatus> deleteData(@PathVariable String departmentId){
	try {
		deptrepository.deleteById(Integer.parseInt(departmentId));
	return (ResponseEntity<HttpStatus>) ResponseEntity.status(HttpStatus.OK);
	} catch (NumberFormatException e) {
		logg.error(e);
	return (ResponseEntity<HttpStatus>) ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE);
	}
	}
	
	
	// This endpoint is used to delete an existing Employee entity from the database.
	@DeleteMapping("/employee/delete/{employeeId}")
	public ResponseEntity<String> deleteEmployeeData(@PathVariable String employeeId){
	try {
	emprepository.deleteById(Long.parseLong(employeeId));
	return ResponseEntity.ok("Employee Data Deleted Successfull");
	} catch (NumberFormatException e) {
		logg.error(e);
	}
	return null;

	}
	
	
}
