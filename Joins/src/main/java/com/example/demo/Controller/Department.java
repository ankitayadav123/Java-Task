package com.example.demo.Controller;

import java.util.Set;

//import org.hibernate.annotations.Fetch;
//import org.hibernate.annotations.FetchMode;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="department")

public class Department {
	@Id
	@Column(name = "id")
	private long id;
	
	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;
	
	@OneToMany(targetEntity = Employee.class, mappedBy = "id", orphanRemoval = false,fetch =  FetchType.LAZY)
	private Set<Employee> employee;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Employee> getEmployees() {
		return employee;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employee = employees;
	}

}