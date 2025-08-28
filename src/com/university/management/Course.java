package com.university.management;
import java.util.ArrayList;
import java.util.List;

public class Course implements Printable {
	String title;
	Professor professor;
	List<Student> students = new ArrayList<>();

	public Course(String title, Professor professor) {
		this.title = title;
		this.professor = professor;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public Professor getProfessor() {
		return professor;
	}

	public void addStudent(Student student){
		students.add(student);
	}

	public int studentCount() {
		return students.size();
	}

	@Override
	public String print() {
		return "Course title: " + title +
               " ,professor:" + professor.getName() +
               ", amount of students" + students.size();
	 }
	
}