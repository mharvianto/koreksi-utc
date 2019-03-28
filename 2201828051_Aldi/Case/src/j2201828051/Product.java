package j2201828051;

public class Product {

	private String name;
	private String category;
	private double priceForCustomer;
	private double priceForSalesman;
	private double balance;

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

	public double getPriceForCustomer() {
		return priceForCustomer;
	}

	public void setPriceForCustomer(double priceForCustomer) {
		this.priceForCustomer = priceForCustomer;
	}

	public double getPriceForSalesman() {
		return priceForSalesman;
	}

	public void setPriceForSalesman(double priceForSalesman) {
		this.priceForSalesman = priceForSalesman;
	}

	public double getBalance() {
		return this.balance = this.priceForCustomer - this.priceForSalesman;
	}

	public Product() {

	}

	public Product(String name, String category, double priceForCustomer, double priceForSalesman) {
		super();
		this.name = name;
		this.category = category;
		this.priceForCustomer = priceForCustomer;
		this.priceForSalesman = priceForSalesman;
	}

}
