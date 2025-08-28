package com.university.management;

public class Professor extends Person {
	
	private Department department;
	
	public Professor(String name, int startingYear, Department department){
	super(name, startingYear);
	this.department = department;
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public Department getDepartment() { 
		return department;
	}

	@Override
	public String print(){
	    return "Professor's name: " + getName() + " ,year of start: " 
		+ getStartingYear() + " ,department: " + department;
	}

}