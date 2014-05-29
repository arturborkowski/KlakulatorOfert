package offersCalculator;


public class Product {

	private double price;	//cena
	private double discountMod;  //ogólny modyfikator promocji
	private double priceAfterDiscount;	//cena po obni¿kach
	private boolean isProductOnSale;	// czy produkt dostêpny jest w promocji
	private boolean isCustomerDiscountAvailable;	//czy klient ma rabat na dany produkt
	private boolean isSpecialOfferProduct;	// czy produkt widnieje w ofercie specjalnej
	

	//konstruktor domyœlny
	public Product() {  
		isProductOnSale = false;
		isCustomerDiscountAvailable = false;
		isSpecialOfferProduct = false;
	}
	
	
	//w konstruktorze ustalamy cenê oraz wybieramy któr¹ promocj¹ zostanie on objêty
	public Product(double price, boolean onSale, boolean CustomerDiscount, boolean SpecialOffer) {
		this.price = price;
		this.isProductOnSale = onSale;
		this.isCustomerDiscountAvailable = CustomerDiscount;
		this.isSpecialOfferProduct = SpecialOffer;
	}

	
	/************* GETTERY I SETTERY **************/
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getDiscountMod() {
		return discountMod;
	}
	
	public void setDiscountMod(double discount) {
		discountMod += discount;
	}
	
	public double getPriceAfterDiscount() {
		return priceAfterDiscount;
	}
	
	public void setPriceAfterDiscount() {
		priceAfterDiscount =  price-(price*discountMod);
	}

	public boolean isProductOnSale() {
		return isProductOnSale;
	}

	public void setProductOnSale(boolean isProductOnSale) {
		this.isProductOnSale = isProductOnSale;
	}

	public boolean isCustomerDiscountAvailable() {
		return isCustomerDiscountAvailable;
	}

	public void setCustomerDiscountAvailable(boolean isCustomerDiscountAvailable) {
		this.isCustomerDiscountAvailable = isCustomerDiscountAvailable;
	}

	public boolean isSpecialOfferProduct() {
		return isSpecialOfferProduct;
	}

	public void setSpecialOfferProduct(boolean isSpecialOfferProduct) {
		this.isSpecialOfferProduct = isSpecialOfferProduct;
	}

	
	// to string
	@Override
	public String toString() {
		return "Product [price=" + price + "]";
	}

	
	 
	
	
	

}
