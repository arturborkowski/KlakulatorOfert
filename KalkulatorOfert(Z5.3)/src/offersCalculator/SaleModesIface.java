package offersCalculator;

public interface SaleModesIface {

	// metoda, która sprawdzi, czy produkt jest objêty dan¹ promocj¹
	boolean isOnSale(Product product); 

	// metoda, która wykona operacje w momencie, kiedy produkt zosta³ objêty promocj¹
	void doSale(Product product);
}
