import java.util.ArrayList;
public class CourseManager {
	ArrayList<Courses> courseList = new ArrayList<Courses>();
	int courseCount = 0;
	public void addCourse(Courses course) {
		courseList.add(course);
		System.out.println(course.coursName + " kursu sisteme ba�ar�yla eklendi\n");
		courseCount++;
	}
	
	public void displayCourses() {
		if (courseCount == 0) {
			System.out.println("Sistemde kurs bulunmamaktad�r.\n");
		}
		else {
			System.out.println("Sistemde " + courseCount + " tane kurs bulunmaktad�r.");
			for (int i = 0; i < courseCount; i++) {
				System.out.println(courseList.get(i).courseId + ". " + courseList.get(i).coursName + "\nE�itmen: " + courseList.get(i).instructor + "\n");
			}	
		}
		
	}
}
