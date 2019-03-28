package j2201828000;

import java.util.ArrayList;

public class Transaction {
	private Date date;
	private ArrayList<Product> arrProduct = new ArrayList<Product>();
	private ArrayList<Integer> arrQuantity = new ArrayList<Integer>();
	private int totalPrice;
	private int totalProfit;

	public Transaction(Date date, ArrayList<Product> arrProduct, ArrayList<Integer> arrQuantity) {
		this.date = date;
		this.arrProduct = arrProduct;
		this.arrQuantity = arrQuantity;
		this.totalPrice = calculateTotalPrice();
		this.totalProfit = calculateTotalProfit();
	}

	public int calculateTotalPrice() {
		int res = 0;
		for (int i = 0; i < arrProduct.size(); i++) {
			Product p = arrProduct.get(i);
			res += arrQuantity.get(i) * p.getCustomerPrice();
		}
		return res;
	}

	public int calculateTotalProfit() {
		int res = 0;
		for (int i = 0; i < arrProduct.size(); i++) {
			Product p = arrProduct.get(i);
			res += arrQuantity.get(i) * (p.getCustomerPrice() - p.getSalesmanPrice());
		}
		return res;
	}

	public void view() {
		System.out.printf("%-15s  %-6s  %-3s  %-8s\n", "Product Name", "Price", "Qty", "Total Price");
		for (int i = 0; i < arrProduct.size(); i++) {
			Product p = arrProduct.get(i);
			System.out.printf("%-15s  %6d  %3d  %8d\n", p.getName(), p.getCustomerPrice(), arrQuantity.get(i),
					p.getCustomerPrice() * arrQuantity.get(i));
		}
		System.out.printf("========================================\n");
		System.out.printf("Grand Total  : \t\t\t%d\n", totalPrice);
		System.out.printf("Total Profit : \t\t\t%d\n\n", totalProfit);
	}

	public Date getDate() {
		return date;
	}

	public ArrayList<Product> getArrProduct() {
		return arrProduct;
	}

	public ArrayList<Integer> getArrQuantity() {
		return arrQuantity;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public int getTotalProfit() {
		return totalProfit;
	}
}
