package com.springpractice.springpractice.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;


//department entity with depid,depname,dephead.

@Entity
public class Department {
	
	@Id
	private long depid;
	private String depname;
	private String dephead;
	
	 @OneToMany(cascade = CascadeType.ALL, targetEntity = Emploee.class)
	 @JoinColumn(name ="DE_FK",referencedColumnName = "depid")
	private List<Emploee> emploee;

	public Department(long depid, String depname, String dephead, List<Emploee> emploee) {
		super();
		this.depid = depid;
		this.depname = depname;
		this.dephead = dephead;
		this.emploee = emploee;
	}

	public Department() {
		super();
	}

	public long getDepid() {
		return depid;
	}

	public void setDepid(long depid) {
		this.depid = depid;
	}

	public String getDepname() {
		return depname;
	}

	public void setDepname(String depname) {
		this.depname = depname;
	}

	public String getDephead() {
		return dephead;
	}

	public void setDephead(String dephead) {
		this.dephead = dephead;
	}

	public List<Emploee> getEmploee() {
		return emploee;
	}

	public void setEmploee(List<Emploee> emploee) {
		this.emploee = emploee;
	}

	@Override
	public String toString() {
		return "Department [depid=" + depid + ", depname=" + depname + ", dephead=" + dephead + ", emploee=" + emploee
				+ "]";
	}

	

}
