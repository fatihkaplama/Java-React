
public class Main {

	public static void main(String[] args) {
		Courses course1 = new Courses(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)", "Engin Demiro�", 0);
		Courses course2 = new Courses(2,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)", "Engin Demiro�", 0);
		Courses course3 = new Courses(3,"Programlamaya Giri� ��in Temel Kurs", "Engin Demiro�", 0);
		
		CourseManager manager = new CourseManager();
		manager.displayCourses();
		
		manager.addCourse(course1);
		
		manager.displayCourses();
		
		manager.addCourse(course2);
		manager.addCourse(course3);
		
		manager.displayCourses();

	}

}
