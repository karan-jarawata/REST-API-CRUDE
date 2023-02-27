package com.springpractice.springpractice.dto;

import com.springpractice.springpractice.entities.Department;




public class Request {
	
	
	private Department department;

	public Request(Department department) {
		super();
		this.department = department;
	}

	public Request() {
		super();
		
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Request [department=" + department + "]";
	}
	
	
	

	
	
	

}
