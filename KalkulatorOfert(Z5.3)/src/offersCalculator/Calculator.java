package offersCalculator;

import java.util.ArrayList;
import java.util.List;



public class Calculator {
	
// deklaracja listy zawieraj�cej dost�pne zni�ki
	private List<SaleModesIface> saleModes;
	
//konstruktor tworz�cy now� Array-list� (zawieraj�c� zni�ki)
	public Calculator() {	
		saleModes = new ArrayList<SaleModesIface>();
	}
	

// mtoda dodaj�ca kolejn� zni�k� do listy zni�ek	
	public void addSale(SaleModesIface saleService) {
		saleModes.add(saleService);
	}
	

// g��wna metoda, kt�ra zastosowuje dost�pne zni�ki, po czym wy�wietla informacje
// o wykonanych operacjach i dane produktu
	public void sale(Product product) {

		if (product != null) {
			
			// poruszamy si� po li�cie dost�pnych promocji, kt�re wykonujemy,
			// o ile dany produkt jest obj�ty promocj�
			if(saleModes.size()!=0) {
				for (SaleModesIface x : saleModes) {	
					if (x.isOnSale(product)) {
						x.doSale(product);
					}
				}
				
				// obliczamy cen� po zsumowaniu modyfikator�w promocji (linia 35)
				product.setPriceAfterDiscount();
				
				// nast�pnie wy�wietlamy informacje
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
