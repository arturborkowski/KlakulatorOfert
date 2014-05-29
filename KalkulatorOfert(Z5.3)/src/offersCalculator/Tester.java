package offersCalculator;


public class Tester {

	public static void main(String[] args) {

		Product[] products = new Product[3];
		products[0] = new Product(150.0, true, true, false);
		products[1] = new Product(25000.0, true, false, true);
		products[2] = new Product(320.0, false, false, false);
		Calculator cal = new Calculator();
		
		cal.addSale(new OnSale());
		cal.addSale(new SpecialOfferProduct());
		cal.addSale(new CustomerDiscount());
		
		for(Product x: products) {
			cal.sale(x);
		}
	}
}
