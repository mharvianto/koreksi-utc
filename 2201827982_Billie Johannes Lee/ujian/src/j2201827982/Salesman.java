package j2201827982;

import java.util.ArrayList;

public class Salesman extends Employee {

	int cnt = 1;
	private int stock;
	ArrayList<Product> productList = new ArrayList<Product>();
	ArrayList<Transaction> transactionList = new ArrayList<Transaction>();

	public Salesman() {
		this.money = 300;
		this.stock = 0;
	}

	public Salesman(String name, String address) {
		super(name, address, "Salesman");
		this.money = 300;
		this.stock = 0;
		System.out.println(name + " is a Salesman");
	}

//	public long getProfit() {
//		return profit;
//	}
//
//	public void setProfit(long profit) {
//		this.profit = profit;
//	}

	public ArrayList<Product> getProductList() {
		return productList;
	}

	public ArrayList<Transaction> getTransactionList() {
		return transactionList;
	}

	@Override
	public void buy() {
		super.buy();
		stock += 1;
		Product product = new Product();
		product.setStock(product.getStock() - cnt);
		cnt++;
		System.out.println(this.name + "'s stock: " + this.stock + " | Company's stock: " + product.getStock());

	}

	@Override
	public void sell() {
		stock -= 1;
		super.sell();
		System.out.println(this.name + "'s stock: " + this.stock);
	}

}
