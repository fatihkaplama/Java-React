package Concrete;
import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	ICustomerCheckService customerCheckService;
	public void Save(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		}
			
	}
}
