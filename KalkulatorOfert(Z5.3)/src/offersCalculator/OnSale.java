package offersCalculator;

public class OnSale implements SaleModesIface {

	double discount = 0.15; // modyfikator promocji
	
	
// sprawdzamy, czy promocja dost�pna jest dla danego produktu
	@Override
	public boolean isOnSale(Product product) {
		return product.isProductOnSale();
	}

	
// metoda wykonuje operacje dla produktu obj�tego promocj�. Ustawia promocj� na niedost�pn�,
// aby mo�na by�o z niej skorzysta� tylko raz (lnia 20), aktualizuje og�lny mod. promocji (linia 21)
// oraz wy�wietla informacje o promocji
	@Override
	public void doSale(Product product) {
		product.setProductOnSale(false);
		System.out.println("Product on sale: -"+product.getPrice() * discount);
		product.setDiscountMod(discount);
		
	}






}
