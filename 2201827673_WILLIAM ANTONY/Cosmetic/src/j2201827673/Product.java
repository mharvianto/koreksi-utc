package j2201827673;

public class Product {
	private String name;
	private String category;
	private Integer custPrice;
	private Integer salesPrice;

	public Product(String name, String category, Integer custPrice, Integer salesPrice) {
		this.name = name;
		this.category = category;
		this.custPrice = custPrice;
		this.salesPrice = salesPrice;
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

	public Integer getCustPrice() {
		return custPrice;
	}

	public void setCustPrice(Integer custPrice) {
		this.custPrice = custPrice;
	}

	public Integer getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(Integer salesPrice) {
		this.salesPrice = salesPrice;
	}

	@Override
	public String toString() {
		return String.format("%s - %s - %d", name, category, custPrice);
	}
}
