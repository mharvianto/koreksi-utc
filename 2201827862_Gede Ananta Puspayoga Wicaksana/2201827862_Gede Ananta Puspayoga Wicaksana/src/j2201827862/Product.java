package j2201827862;

public class Product {
	String category;
	String name;

	long priceCustomer;
	long priceSalesman;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String category, String name, long priceCustomer, long priceSalesman) {
		this.category = category;
		this.name = name;
		this.priceCustomer = priceCustomer;
		this.priceSalesman = priceSalesman;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPriceCustomer() {
		return priceCustomer;
	}

	public void setPriceCustomer(long priceCustomer) {
		this.priceCustomer = priceCustomer;
	}

	public long getPriceSalesman() {
		return priceSalesman;
	}

	public void setPriceSalesman(long priceSalesman) {
		this.priceSalesman = priceSalesman;
	}

}
