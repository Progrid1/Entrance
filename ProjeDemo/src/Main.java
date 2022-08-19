
public class Main {

	public static void main(String[] args) throws Exception {
		BaseCustomerManager customerManager=new NeroCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"Engin","Demiroğ",1985,28861499108L));
		
		
		
		
	}

}
