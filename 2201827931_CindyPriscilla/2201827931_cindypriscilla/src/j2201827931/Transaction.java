package j2201827931;

import java.util.ArrayList;

public class Transaction extends Product {
	private int total;
	private int profit;
	private int quantity;
	private boolean isCust;

	public Transaction(String name, String category, String customer) {
		super(name, category);
		this.quantity = 4;
		this.total = quantity * custPrice;
		this.isCust = true;
	}

	public Transaction(String name, String category, ArrayList<Transaction> listTransaction) {
		super(name, category);
		this.quantity = 4;
		this.total = quantity * custPrice;
		this.profit = total - (quantity * salesPrice);
		this.isCust = false;
		listTransaction.add(new Transaction(name, category, total, quantity));
	}

	public Transaction(String name, String category, int total, int quantity) {
		super(name, category);
		this.total = total;
		this.quantity = quantity;
		this.profit = total - (quantity * salesPrice);
	}

	public boolean isCust() {
		return isCust;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getTotal() {
		return total;
	}

	public int getProfit() {
		return profit;
	}

	@Override
	public String toString() {
		if (isCust) {
			return "On Counter --> Product : " + name + " ( " + super.category + " | " + getQuantity()
					+ "pcs ) ----- Rp " + total;
		} else {
			return "Product : " + name + " ( " + super.category + " | " + getQuantity() + "pcs ) ----- Rp " + total
					+ " (profit: " + getProfit() + " )";
		}

	}

}
