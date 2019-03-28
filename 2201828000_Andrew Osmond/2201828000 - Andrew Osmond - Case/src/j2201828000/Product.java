package j2201828000;

public class Product {
	private String name;
	private String category;
	private int customerPrice;
	private int salesmanPrice;

	public Product(String name, String category, int customerPrice, int salesmanPrice) {
		this.name = name;
		this.category = category;
		this.customerPrice = customerPrice;
		this.salesmanPrice = salesmanPrice;
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

	public int getCustomerPrice() {
		return customerPrice;
	}

	public void setCustomerPrice(int customerPrice) {
		this.customerPrice = customerPrice;
	}

	public int getSalesmanPrice() {
		return salesmanPrice;
	}

	public void setSalesmanPrice(int salesmanPrice) {
		this.salesmanPrice = salesmanPrice;
	}

	@Override
	public String toString() {
		return String.format("%15s %8s %-6d %-6d", name, category, customerPrice, salesmanPrice);
	}
}
