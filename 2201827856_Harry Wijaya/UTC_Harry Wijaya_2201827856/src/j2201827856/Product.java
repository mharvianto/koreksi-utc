package j2201827856;

import java.util.Vector;

import j2201827710.Transaction;

public class Product {

	protected String productName;
	protected String category;
	protected int price;
	protected int salesmanPrice;
	protected int profit;

	protected Vector<Transaction> vTransaction = new Vector<>();

	public Product(String productName, String category, int price, int salesmanPrice) {
		super();
		this.productName = productName;
		this.category = category;
		this.price = price;
		this.salesmanPrice = salesmanPrice;
	}

	public Vector<Transaction> getvTransaction() {
		return vTransaction;
	}

	public void setvTransaction(Vector<Transaction> vTransaction) {
		this.vTransaction = vTransaction;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public long getSalesmanPrice() {
		return salesmanPrice;
	}

	public void setSalesmanPrice(int salesmanPrice) {
		this.salesmanPrice = salesmanPrice;
	}

	public Integer totalProfit() {
		return profit = salesmanPrice - price;
	}

	public int getProfit() {
		return profit;
	}

	public void setProfit() {
		this.profit = totalProfit();
	}

}
