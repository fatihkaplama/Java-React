
public class UserManager {
	public void add(User user) {
		System.out.println(user.getName() + " " + user.getSurname() + " sisteme ba�ar�yla eklendi\n");
	}
	
	public void delete(User user) {
		System.out.println(user.getName() + " " + user.getSurname() + " sistemden ba�ar�yla silindi\n");
	}
	
	public void display(User user) {
		System.out.println("Name: " + user.getName() + "\nUsername: " + user.getSurname() + "\nEmail: " + user.getEmail());
	}
}
