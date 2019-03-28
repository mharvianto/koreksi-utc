package j2201827805;

import java.util.ArrayList;

public class Transaction {
	private ArrayList<Product> products = new ArrayList<>();
	private int totalProfit = 0;

	public Transaction() {

	}

	public void addProduct(Product product, int qty) {
		product.setQty(qty);
		products.add(product);
	}

	public void printTransaction() {
		totalProfit = 0;
		int total = 0;
		for (Product temp : products) {
			System.out.println(temp.toString());
			System.out.println("Total: " + temp.getPriceCust());
			totalProfit += temp.getProfit();
			total += temp.getPriceCust();
			System.out.println("");
		}
		System.out.println("Total Price: " + total);
	}

	public int getTotalProfit() {
		return totalProfit;
	}

}
