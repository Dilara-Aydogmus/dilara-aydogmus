package .com.university.management;
java.util.ArrayList;
java.util.List;

public class Course implements Printable {
	String title;
	Professor professor;
	List<String> students = new ArrayList<>();

	public Course(String title, Professor professor) {
		this.title = title;
		this.professor = professor;
	}

	public String setTitle(String title) {
		this.title = title;
	}
	
	public void getTitle() {
		return title;
	}

	public Professor setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public void getProfessor() {
		return professor;
	}

	public void addStudent(Student student){
		students.add(student);
	}

	public int studentCount() {
		students.size();
	}

	@Override
	public String print() {
		return "Course title: " + title +
               " ,professor:" + professor.getName() +
               ", amount of students" + students.size() 
	 }
	
}