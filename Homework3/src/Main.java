
public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor("Engin", "Demiroğ", "instructor@gmail.com", "i123456", "20000");
		Student student = new Student("Fatih", "Kaplama", "student@gmail.com", "s123456", "Bilgisayar Mühendisliği");
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.display(instructor);
		instructorManager.delete(instructor);
		instructorManager.createCourse("Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.display(student);
		studentManager.delete(student);
		studentManager.registerCourse("Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)");
		

	}

}
