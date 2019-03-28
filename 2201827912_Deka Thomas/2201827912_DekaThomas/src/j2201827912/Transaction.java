package j2201827912;

public class Transaction {

	private Salesman salesman;
	private Product product;
	private String customer;
	private int amount; // same as price
	private int price;

	public Transaction(Salesman salesman, Product product, String customer, int amount) {
		super();
		this.salesman = salesman;
		this.product = product;
//		this.products = products;
		this.customer = customer;
		this.amount = amount;
		this.price = product.getCustomerPrice() * this.amount;
	}

	public void display() {
		System.out.println("Customer: " + this.customer);
		System.out.println("Product: " + this.product);
		System.out.println("Price : " + this.price);
	}

	public Salesman getSalesman() {
		return salesman;
	}

	public void setSalesman(Salesman salesman) {
		this.salesman = salesman;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Product getProduct() {
		return product;
	}

}
