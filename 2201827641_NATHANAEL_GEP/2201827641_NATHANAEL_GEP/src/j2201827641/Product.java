package j2201827641;

public class Product {

	private String name;
	private String category;
	private Integer custPrice;
	private Integer salesPrice;

	public String getName() {
		return name;
	}

	public String getCategory() {
		return category;
	}

	public Integer getCustPrice() {
		return custPrice;
	}

	public Integer getSalesPrice() {
		return salesPrice;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setCustPrice(Integer custPrice) {
		this.custPrice = custPrice;
	}

	public void setSalesPrice(Integer salesPrice) {
		this.salesPrice = salesPrice;
	}

	public Product(String name, String category, Integer custPrice, Integer salesPrice) {
		super();
		this.name = name;
		this.category = category;
		this.custPrice = custPrice;
		this.salesPrice = salesPrice;
	}

}
