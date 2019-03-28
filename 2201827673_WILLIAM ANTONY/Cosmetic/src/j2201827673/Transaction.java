package j2201827673;

public class Transaction {
	private Product product;
	private Salesman salesman;

	public Transaction(Product product, Salesman salesman) {
		super();
		this.product = product;
		this.salesman = salesman;
	}

	public Product getProduct() {
		return product;
	}

	public Salesman getSalesman() {
		return salesman;
	}

}
