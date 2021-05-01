
public class StudentManager extends UserManager{
	public void display(Student student) {
		System.out.println("Öğrenci: ");
		super.display(student);
		System.out.println("Department: " + student.getDepartment());
		System.out.println();
	}
	
	public void registerCourse(String courseName) {
		System.out.println(courseName + " adlı kursa başarıyla kaydoldunuz\n");
	}
}
