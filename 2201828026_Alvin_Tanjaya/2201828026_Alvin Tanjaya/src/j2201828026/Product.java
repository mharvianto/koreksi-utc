package j2201828026;

public class Product {
	protected String name;
	protected String category;
	protected int stock;
	protected int priceCustomer;
	protected int priceSalesman;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String name, String category, int stock, int priceCustomer, int priceSalesman) {
		this.name = name;
		this.category = category;
		this.stock = stock;
		this.priceCustomer = priceCustomer;
		this.priceSalesman = priceSalesman;
	}

	// customer beli berapa
	public void keJual(int jual) {
		this.stock -= jual;
		System.out.printf("Produk terjual %d\n", jual);
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", category=" + category + ", stock=" + stock + ", priceCustomer="
				+ priceCustomer + ", priceSalesman=" + priceSalesman + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPriceCustomer() {
		return priceCustomer;
	}

	public void setPriceCustomer(int priceCustomer) {
		this.priceCustomer = priceCustomer;
	}

	public int getPriceSalesman() {
		return priceSalesman;
	}

	public void setPriceSalesman(int priceSalesman) {
		this.priceSalesman = priceSalesman;
	}

}
