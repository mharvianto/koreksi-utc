package j2201827843.company;

public class Product {
	private String name;
	private String category;
	private Integer priceForCustomer;
	private Integer priceForSales;

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

	public Integer getPriceForCustomer() {
		return priceForCustomer;
	}

	public void setPriceForCustomer(Integer priceForCustomer) {
		this.priceForCustomer = priceForCustomer;
	}

	public Integer getPriceForSales() {
		return priceForSales;
	}

	public void setPriceForSales(Integer priceForSales) {
		this.priceForSales = priceForSales;
	}

	public Product(String name, String category, Integer priceForCustomer, Integer priceForSales) {
		super();
		this.name = name;
		this.category = category;
		this.priceForCustomer = priceForCustomer;
		this.priceForSales = priceForSales;
	}

	public Integer CalculateProfit() {
		return this.priceForCustomer - this.priceForSales;
	}
}
