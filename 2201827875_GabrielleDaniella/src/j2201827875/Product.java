package j2201827875;

public class Product {
	private String name;
	private String category;
	private Integer priceCust;
	private Integer priceSales;
	private Integer quantity;
	private Integer totalCust;

	public Product(String name, String category, Integer priceCust, Integer priceSales, Integer quantity) {
		super();
		this.name = name;
		this.category = category;
		this.priceCust = priceCust;
		this.priceSales = priceSales;
		this.quantity = quantity;
	}

	public Product(String name, String category, Integer priceCust, Integer quantity) {
		this.name = name;
		this.category = category;
		this.priceCust = priceCust;
		this.quantity = quantity;
	}

	public void showData() {
		System.out.println("Name: " + getName());
		System.out.println("Category: " + getCategory());
		System.out.println("Price Customer: " + getPriceCust());
		System.out.println("Price Salesman: " + getPriceSales());
		System.out.println("Quantity: " + getQuantity());
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
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

	public Integer getPriceCust() {
		return priceCust;
	}

	public void setPriceCust(Integer priceCust) {
		this.priceCust = priceCust;
	}

	public Integer getPriceSales() {
		return priceSales;
	}

	public void setPriceSales(Integer priceSales) {
		this.priceSales = priceSales;
	}

}
