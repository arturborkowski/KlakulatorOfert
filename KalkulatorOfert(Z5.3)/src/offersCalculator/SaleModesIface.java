package offersCalculator;

public interface SaleModesIface {

	// metoda, kt�ra sprawdzi, czy produkt jest obj�ty dan� promocj�
	boolean isOnSale(Product product); 

	// metoda, kt�ra wykona operacje w momencie, kiedy produkt zosta� obj�ty promocj�
	void doSale(Product product);
}
