package offersCalculator;

public class CustomerDiscount implements SaleModesIface {
	
	double discount = 0.10;  // modyfikator promocji

	
// sprawdzamy, czy promocja dost�pna jest dla danego produktu
	@Override
	public boolean isOnSale(Product product) {
		return product.isCustomerDiscountAvailable();
		
	}

// metoda wykonuje operacje dla produktu obj�tego promocj�. Ustawia promocj� na niedost�pn�,
// aby mo�na by�o z niej skorzysta� tylko raz (lnia 20), aktualizuje og�lny mod. promocji (linia 21)
// oraz wy�wietla informacje o promocji
	@Override
	public void doSale(Product product)	{
		product.setCustomerDiscountAvailable(false);
		product.setDiscountMod(discount);
		System.out.println("CustomerSale: -" + product.getPrice() * discount);
	}

}
