package offersCalculator;

public class OnSale implements SaleModesIface {

	double discount = 0.15; // modyfikator promocji
	
	
// sprawdzamy, czy promocja dostêpna jest dla danego produktu
	@Override
	public boolean isOnSale(Product product) {
		return product.isProductOnSale();
	}

	
// metoda wykonuje operacje dla produktu objêtego promocj¹. Ustawia promocjê na niedostêpn¹,
// aby mo¿na by³o z niej skorzystaæ tylko raz (lnia 20), aktualizuje ogólny mod. promocji (linia 21)
// oraz wyœwietla informacje o promocji
	@Override
	public void doSale(Product product) {
		product.setProductOnSale(false);
		System.out.println("Product on sale: -"+product.getPrice() * discount);
		product.setDiscountMod(discount);
		
	}






}
