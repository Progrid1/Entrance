
public class NeroCustomerManager extends BaseCustomerManager {
	ICustomerCheckService checkService;

	
	public NeroCustomerManager(ICustomerCheckService checkService) {
		
		this.checkService = checkService;
	}

	

	@Override
	public void save(Customer customer) throws Exception {
		if (checkService.CheckIfRealPerson(customer)) {
			super.save(customer);
		} else {
			System.out.println("Not a valid person");
		}
	}

}
