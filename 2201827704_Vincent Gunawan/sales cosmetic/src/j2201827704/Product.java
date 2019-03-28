package j2201827704;

/**
 * @author prk
 *
 */
public class Product {
	private String name = "";
	private String category = "";
	private int priceCostumer = 0;
	private int priceSalesman = 0;
	private int profitProduct = 0;
	private int quantity = 0;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String name, String category, int priceCostumer, int priceSalesman, int quantity) {
		this.name = name;
		this.category = category;
		this.priceCostumer = priceCostumer;
		this.priceSalesman = priceSalesman;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}
	public String getCategory() {
		return category;
	}

//	public void setCategory(String category) {
//		this.category = category;
//	}
	public int getPriceCostumer() {
		return priceCostumer;
	}

//	public void setPriceCostumer(int priceCostumer) {
//		this.priceCostumer = priceCostumer;
//	}
	public int getPriceSalesman() {
		return priceSalesman;
	}

//	public void setPriceSalesman(int priceSalesman) {
//		this.priceSalesman = priceSalesman;
//	}
	public int getProfitProduct() {
		return profitProduct;
	}

	public int calculateProfit(int soldOut) {
		int profit = priceCostumer - priceSalesman;
		System.out.printf(
				"Product Name : %s Total sold(s): %d Item\nCostumer Price : Rp. %6d,00 Sales Price : Rp. %6d,00 Profit = Rp. %6d,00-Rp. %6d,00 = Rp.%7d,00 Total Profit = %d*Rp.%d,00=Rp%d,00\n",
				this.name, soldOut, this.priceCostumer, this.priceSalesman, this.priceCostumer, this.priceSalesman,
				profit, soldOut, profit, soldOut * profit);
		this.profitProduct = profit;
		return profit;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity -= quantity;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", category=" + category + ", priceCostumer=" + priceCostumer
				+ ", priceSalesman=" + priceSalesman + ", profitProduct=" + profitProduct + ", quantity=" + quantity
				+ "]";
	}

}
