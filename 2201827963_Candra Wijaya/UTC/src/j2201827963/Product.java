package j2201827963;

public class Product {

	protected String name;
	protected String category;
	protected int priceSalesman;
	protected int priceCostumer;
	protected int quantity;

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
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

	public int getPriceSalesman() {
		return priceSalesman;
	}

	public void setPriceSalesman(int priceSalesman) {
		this.priceSalesman = priceSalesman;
	}

	public int getPriceCostumer() {
		return priceCostumer;
	}

	public void setPriceCostumer(int priceCostumer) {
		this.priceCostumer = priceCostumer;
	}

	public Product(String name, String category, int priceSalesman, int priceCostumer, int quantity) {
		super();
		this.name = name;
		this.category = category;
		this.priceSalesman = priceSalesman;
		this.priceCostumer = priceCostumer;
		this.quantity = quantity;
	}
}
