package j2201827830;

public class Product {
	private String name;
	private String category;
	private int priceForCustomer;
	private int priceForSalesman;
	private int profit;

	public Product() {
		name = "";
		category = "";
		priceForCustomer = 0;
		priceForSalesman = 0;
		profit = 0;
	}

	public Product(String name, String category, int priceForCustomer, int priceForSalesman) {
		super();
		this.name = name;
		this.category = category;
		this.priceForCustomer = priceForCustomer;
		this.priceForSalesman = priceForSalesman;
		this.profit = priceForCustomer - priceForSalesman;
	}

	// tidak ada setter profit karena profit harus dihitung di dalam class
	// profit

	public int getProfit() {
		return profit;
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

	public int getPriceForCustomer() {
		return priceForCustomer;
	}

	public void setPriceForCustomer(int priceForCustomer) {
		this.priceForCustomer = priceForCustomer;
	}

	public int getPriceForSalesman() {
		return priceForSalesman;
	}

	public void setPriceForSalesman(int priceForSalesman) {
		this.priceForSalesman = priceForSalesman;
	}

}
