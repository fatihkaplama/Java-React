
public class InstructorManager extends UserManager{
	public void display(Instructor instructor) {
		System.out.println("Instructor:");
		super.display(instructor);
		System.out.println("Salary: " + instructor.getSalary() + "\n");
	}
	
	public void createCourse(String courseName) {
		System.out.println(courseName + " adl� kursu ba�ar�yla olu�turdunuz.\n");
	}
}
