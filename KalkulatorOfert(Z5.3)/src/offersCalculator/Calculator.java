package offersCalculator;

import java.util.ArrayList;
import java.util.List;



public class Calculator {
	
// deklaracja listy zawieraj¹cej dostêpne zni¿ki
	private List<SaleModesIface> saleModes;
	
//konstruktor tworz¹cy now¹ Array-listê (zawieraj¹c¹ zni¿ki)
	public Calculator() {	
		saleModes = new ArrayList<SaleModesIface>();
	}
	

// mtoda dodaj¹ca kolejn¹ zni¿kê do listy zni¿ek	
	public void addSale(SaleModesIface saleService) {
		saleModes.add(saleService);
	}
	

// g³ówna metoda, która zastosowuje dostêpne zni¿ki, po czym wyœwietla informacje
// o wykonanych operacjach i dane produktu
	public void sale(Product product) {

		if (product != null) {
			
			// poruszamy siê po liœcie dostêpnych promocji, które wykonujemy,
			// o ile dany produkt jest objêty promocj¹
			if(saleModes.size()!=0) {
				for (SaleModesIface x : saleModes) {	
					if (x.isOnSale(product)) {
						x.doSale(product);
					}
				}
				
				// obliczamy cenê po zsumowaniu modyfikatorów promocji (linia 35)
				product.setPriceAfterDiscount();
				
				// nastêpnie wyœwietlamy informacje
				if(product.getDiscountMod() == 0) {
					System.out.println("Discounts not available for this product.");
				}
				System.out.println("Product input price = "+product.getPrice());
				System.out.println("Total discount = "+product.getDiscountMod());
				System.out.println("Product discount price = "+product.getPriceAfterDiscount());
			}
			else System.out.println("No sales avaible!");
		}
		else System.out.println("Product not found");

		System.out.println();
	}

}
