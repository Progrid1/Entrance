
public class BaseCustomerManager implements ICustomer {

	@Override
	public void add(Customer customer) {
		CustomerCheckService checkService = new CustomerCheckService();
		if (checkService.check(customer)) {
			System.out.println("Added: " + customer.firstName);
		}

	}

	@Override
	public void edit(Customer customer) {
		System.out.println("Edited :" + customer.firstName);

	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Deleted :" + customer.firstName);

	}

}
