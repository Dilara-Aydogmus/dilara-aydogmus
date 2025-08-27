package .com.university.management

public class Professor extends Person {
	
	private Department department;
	
	public Person(String name, int startingYear, Department department){
	super(name, startingYear);
	this.department = department;
	}
	
	public Department setDepartment(Department department) {
		this.department = department;
	}
	
	public Department getDepartment() { 
		return department;
	}

	@Override
	public String print(){
	"Professor's name: " + getName() + " ,year of start: " 
		+ getStartingYear() + " ,department: " + department();
	}

}