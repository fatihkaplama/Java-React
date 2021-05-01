
public class Student extends User {
	private String department;
	
	public Student() {}
	
	public Student(String name, String surname, String email, String password, String department) {
		super(name, surname, email, password);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
