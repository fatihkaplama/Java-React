
public class Instructor extends User {
	private String salary;
	
	public Instructor() {}
	
	public Instructor(String name, String surname, String email, String password, String salary) {
		super(name, surname, email, password);
		this.salary = salary;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	
}
