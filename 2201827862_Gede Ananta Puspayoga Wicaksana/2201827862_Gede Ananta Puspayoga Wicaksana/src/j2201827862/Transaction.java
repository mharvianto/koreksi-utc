package j2201827862;

public class Transaction {

	private int quantity;
	private Product product;

	private Salesman salesman;

	private long totalPrice;

	public Transaction(int quantity, Product product, Salesman salesman) {
		this.quantity = quantity;
		this.product = product;
		this.salesman = salesman;
		salesman.setSalesProfit(salesman.getSalesProfit()
				+ this.quantity * (this.product.getPriceCustomer() - this.product.getPriceSalesman()));
		System.out.println("New Transaction has been created");
	}

	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Salesman getSalesman() {
		return salesman;
	}

	public void setSalesman(Salesman salesman) {
		this.salesman = salesman;
	}

	public long getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(long totalPrice) {
		this.totalPrice = totalPrice;
	}

	public void showData() {
		this.totalPrice = product.getPriceCustomer() * quantity;
		System.out.println("Salesman : " + salesman.getName());
		System.out.println("Product name : " + product.getName());
		System.out.println("Product price : " + product.getPriceCustomer());
		System.out.println("Quantity : " + quantity);
		System.out.println("==================");
		System.out.println("Total Price : " + totalPrice);
	}

}
