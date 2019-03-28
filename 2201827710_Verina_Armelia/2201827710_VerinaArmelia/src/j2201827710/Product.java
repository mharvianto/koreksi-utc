package j2201827710;

public class Product {
	protected String nameProduct;
	// priceforsalesman = profit for sales' salary
	protected int priceForCustomer, priceForSalesman;

	public Product(String nameProduct, int priceForCustomer, int priceForSalesman) {
		super();
		this.nameProduct = nameProduct;
		this.priceForCustomer = priceForCustomer;
		this.priceForSalesman = priceForSalesman;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public int getPriceForCustomer() {
		return priceForCustomer;
	}

	public void setPriceForCustomer(int priceForCustomer) {
		this.priceForCustomer = priceForCustomer;
	}

	public int getPriceForSalesman() {
		return priceForSalesman;
	}

	public void setPriceForSalesman(int priceForSalesman) {
		this.priceForSalesman = priceForSalesman;
	}

	public Product() {

	}

}
