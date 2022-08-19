
public interface IOffer {
	void sellWithOffer(Customer customer, Offer offer);

	void addOffer(Offer offer);

	void deleteOffer(Offer offer);

	void editOffer(Offer offer);
}
