
public class Main {

	public static void main(String[] args) {

		BaseCustomerManager baseCustomerManager = new BaseCustomerManager();
		Customer customer1 = new Customer(2, 11465424162L, "James", "Copper", 1977);
		Offer offer1 = new Offer(3, "Spring Offer", 90, 20);
		baseCustomerManager.add(new Customer(1, 28465424162L, "Mertkan", "AKISKA", 1994));

		GameManager gameManager = new GameManager();
		gameManager.sell(new Customer(1, 28465424162L, "Mertkan", "AKISKA", 1994));
		gameManager.sellWithOffer(customer1, new Offer(1, "Student Offer", 365, 25));
		gameManager.addOffer(new Offer(2, "Retired Offer", 180, 15));
		gameManager.sellWithOffer(customer1, offer1);
	}

}
