
public class GameManager implements IOffer, IGame {

	@Override
	public void sell(Customer customer) {
		System.out.println("Game sold: " + customer.firstName);

	}

	@Override
	public void sellWithOffer(Customer customer, Offer offer) {
		System.out.println("Sold to: " + customer.firstName +" with " +offer.name );

	}

	@Override
	public void addOffer(Offer offer) {
		System.out.println("Added offer :" + offer.name);

	}

	@Override
	public void deleteOffer(Offer offer) {
		System.out.println("Deleted offer :" + offer.name);

	}

	@Override
	public void editOffer(Offer offer) {
		System.out.println("Edited offer :" + offer.name);

	}

}
