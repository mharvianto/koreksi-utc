package j2201827742;

public class Product {
	private String prodName, category;
	private int priceEmp, priceCust, profit;

	public Product(String prodName, String category, int priceEmp, int priceCust) {
		super();
		this.prodName = prodName;
		this.category = category;
		this.priceEmp = priceEmp;
		this.priceCust = priceCust;
		this.profit = getProfit();
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPriceEmp() {
		return priceEmp;
	}

	public void setPriceEmp(int priceEmp) {
		this.priceEmp = priceEmp;
	}

	public int getPriceCust() {
		return priceCust;
	}

	public void setPriceCust(int priceCust) {
		this.priceCust = priceCust;
	}

	public int getProfit() {
		return (priceCust - priceEmp);
	}

}
