package j2201827805;

public class Product {
	private String name;
	private String category;
	private int priceCust;
	private int priceSales;
	private int qty = 1;

	public Product(String name, String category, int priceCust, int priceSales) {
		this.name = name;
		this.category = category;
		this.priceCust = priceCust;
		this.priceSales = priceSales;
	}

	public String toString() {
		return name + " - " + category + "\n" + "Quantity: " + qty + "\n" + "Customer's price: " + priceCust;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getData() {
		return name + " - " + category + "\n" + "Customer's price: " + priceCust + "\n" + "Sales' price: " + priceSales;
	}

	public int getProfit() {
		return (priceCust - priceSales) * qty;
	}

	public int getPriceCust() {
		return priceCust * qty;
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

	public int getPriceSales() {
		return priceSales;
	}

	public void setPriceSales(int priceSales) {
		this.priceSales = priceSales;
	}

	public void setPriceCust(int priceCust) {
		this.priceCust = priceCust;
	}

}
