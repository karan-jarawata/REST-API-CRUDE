package com.springpractice.springpractice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


//emploee entity with id, username, email.

@Entity
public class Emploee {
	
	@Id
	private long id;
	private String username;
	private String email;
	
	public Emploee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emploee(long id, String username, String email) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Emploee [id=" + id + ", username=" + username + ", email=" + email + "]";
	}
	
	
	
	
	
	
}
