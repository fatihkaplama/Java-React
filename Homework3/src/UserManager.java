
public class UserManager {
	public void add(User user) {
		System.out.println(user.getName() + " " + user.getSurname() + " sisteme baþarýyla eklendi\n");
	}
	
	public void delete(User user) {
		System.out.println(user.getName() + " " + user.getSurname() + " sistemden baþarýyla silindi\n");
	}
	
	public void display(User user) {
		System.out.println("Name: " + user.getName() + "\nUsername: " + user.getSurname() + "\nEmail: " + user.getEmail());
	}
}
