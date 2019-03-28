package j2201827660;

public class Transaction extends Product {
	private String Salesman;
	Customer customer;
	private int total;

	public Transaction(String prodName, String prodCategory, int priceCust, int priceSales, String Salesman,
			Customer customer) {
		super(prodName, prodCategory, priceCust, priceSales);
		this.Salesman = Salesman;
		this.customer = customer;
	}

	public String getSalesman() {
		return Salesman;
	}

	public Customer getCustomer() {
		return customer;
	}

	public int getTotal() {
		return total;
	}

	public static void setTotal(int total) {
		// this.total = total;
	}

}
