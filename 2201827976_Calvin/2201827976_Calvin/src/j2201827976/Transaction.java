package j2201827976;

public class Transaction {
	private int total_cust_price;
	private int total_sales_price;
	static private int profit;

	public Transaction() {
		Product food = new Product("Cake", 15000, 10000, 5);
		this.total_cust_price = food.getQty() * food.getCust_price();
		this.total_sales_price = food.getQty() * food.getSales_price();
		profit = total_cust_price - total_sales_price;
	}

	public int getTotal_cust_price() {
		return total_cust_price;
	}

	public void setTotal_cust_price(int total_cust_price) {
		this.total_cust_price = total_cust_price;
	}

	public int getTotal_sales_price() {
		return total_sales_price;
	}

	public void setTotal_sales_price(int total_sales_price) {
		this.total_sales_price = total_sales_price;
	}

	public int getProfit() {
		return profit;
	}

}
