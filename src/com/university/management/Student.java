package com.university.management;

import java.util.Arrays;

public class Student extends Person {
	private final int id;
	private Department department;
	

	public Student(String name, int startingYear, int id, Department department){
	super(name, startingYear);
	this.id = id;
	this.department = department;
	}

	@Override
	public String print() {
	return "Student's id: " + id + " , name: " + getName() + " ,year of start: " 
		+ getStartingYear() + " ,department: " + department();
	}
	
	
}