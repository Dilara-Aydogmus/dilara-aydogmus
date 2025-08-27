package com.university.management;

public class Person { 
	private String name;
	private int startingYear;

	public Person(String name, int startingYear) {
		this.name = name;
		this.startingYear = startingYear;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setStartingYear(int startingYear) {
		this.startingYear = startingYear;
	}

	public int getStartingYear() {
		return startingYear;
	}

}