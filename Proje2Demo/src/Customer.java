
public class Customer {
	int id;
	long nationalityId;
	String firstName;
	String lastName;
	int dateOfBirth;

	public Customer(int id, long nationalityId, String firstName, String lastName, int dateOfBirth) {
		this.id = id;
		this.nationalityId = nationalityId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}
}
