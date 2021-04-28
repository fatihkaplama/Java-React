
public class Main {

	public static void main(String[] args) {
		Courses course1 = new Courses(1,"Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)", "Engin Demiroð", 0);
		Courses course2 = new Courses(2,"Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)", "Engin Demiroð", 0);
		Courses course3 = new Courses(3,"Programlamaya Giriþ Ýçin Temel Kurs", "Engin Demiroð", 0);
		
		CourseManager manager = new CourseManager();
		manager.displayCourses();
		
		manager.addCourse(course1);
		
		manager.displayCourses();
		
		manager.addCourse(course2);
		manager.addCourse(course3);
		
		manager.displayCourses();

	}

}
