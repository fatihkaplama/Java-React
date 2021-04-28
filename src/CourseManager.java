import java.util.ArrayList;
public class CourseManager {
	ArrayList<Courses> courseList = new ArrayList<Courses>();
	int courseCount = 0;
	public void addCourse(Courses course) {
		courseList.add(course);
		System.out.println(course.coursName + " kursu sisteme başarıyla eklendi\n");
		courseCount++;
	}
	
	public void displayCourses() {
		if (courseCount == 0) {
			System.out.println("Sistemde kurs bulunmamaktadır.\n");
		}
		else {
			System.out.println("Sistemde " + courseCount + " tane kurs bulunmaktadır.");
			for (int i = 0; i < courseCount; i++) {
				System.out.println(courseList.get(i).courseId + ". " + courseList.get(i).coursName + "\nEğitmen: " + courseList.get(i).instructor + "\n");
			}	
		}
		
	}
}
