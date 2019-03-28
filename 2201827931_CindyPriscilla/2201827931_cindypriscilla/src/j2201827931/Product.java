package j2201827931;

public class Product {
	protected String name;
	protected String category;
	protected int custPrice;
	protected int salesPrice;

	public Product(String name, String category) {
		this.name = name;
		this.category = category;
		this.custPrice = 200000;
		this.salesPrice = 155000;

	}

	public String getName() {
		return name;
	}

	public String getCategory() {
		return category;
	}

	public int getCustPrice() {
		return custPrice;
	}

	public int getSalesPrice() {
		return salesPrice;
	}

}
