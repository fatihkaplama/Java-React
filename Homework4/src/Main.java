import java.util.Date;

import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new NeroCustomerManager();
		Customer customer = new Customer();
		customer.Id = 1;
		customer.firstNameString = "Fatih";
		customer.lastNameString = "Kaplama";
		customer.dateOfBirthDate = new Date(2000);
		customer.nationalityIdString = "123456789";
		customerManager.Save(customer);

	}

}
