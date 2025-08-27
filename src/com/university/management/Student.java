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
}