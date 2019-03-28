package j2201828064;

public class Product {

	private String name;
	private String category;
	private int priceCust;
	private int priceSales;

	public Product(String name, String category, int priceCust, int priceSales) {
		super();
		this.name = name;
		this.category = category;
		this.priceCust = priceCust;
		this.priceSales = priceSales;
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

	public int getPriceCust() {
		return priceCust;
	}

	public void setPriceCust(int priceCust) {
		this.priceCust = priceCust;
	}

	public int getPriceSales() {
		return priceSales;
	}

	public void setPriceSales(int priceSales) {
		this.priceSales = priceSales;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", category=" + category + ", priceCust=" + priceCust + ", priceSales="
				+ priceSales + "]";
	}

}
