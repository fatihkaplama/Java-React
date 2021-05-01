
public class StudentManager extends UserManager{
	public void display(Student student) {
		System.out.println("��renci: ");
		super.display(student);
		System.out.println("Department: " + student.getDepartment());
		System.out.println();
	}
	
	public void registerCourse(String courseName) {
		System.out.println(courseName + " adl� kursa ba�ar�yla kaydoldunuz\n");
	}
}
