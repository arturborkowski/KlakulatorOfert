package offersCalculator;

public class SpecialOfferProduct implements SaleModesIface {

	double discount = 0.20; // modyfikator promocji

	
// sprawdzamy, czy promocja dostêpna jest dla danego produktu
	@Override
	public boolean isOnSale(Product product) {
		return product.isSpecialOfferProduct();
	}

	
// metoda wykonuje operacje dla produktu objêtego promocj¹. Ustawia promocjê na niedostêpn¹,
// aby mo¿na by³o z niej skorzystaæ tylko raz (lnia 20), aktualizuje ogólny mod. promocji (linia 21)
// oraz wyœwietla informacje o promocji
	@Override
	public void doSale(Product product) {
		product.setSpecialOfferProduct(false);
		System.out.println("SpecialOffer: -" + product.getPrice() * discount);
		product.setDiscountMod(discount);
	}

}
