package j2201827912;

public class Product {
	private String name;
	private String category;
	private int customerPrice;
	private int salesPrice;

	public Product(String name, String category, int customerPrice, int salesPrice) {
		this.setName(name);
		this.setCategory(category);
		this.setCustomerPrice(customerPrice);
		this.setSalesPrice(salesPrice);
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

	public int getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(int salesPrice) {
		this.salesPrice = salesPrice;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format(this.name);
	}
}
