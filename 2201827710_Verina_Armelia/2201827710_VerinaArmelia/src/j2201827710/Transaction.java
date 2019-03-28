package j2201827710;

public class Transaction {
	protected Salesman salesman;
	protected Product product;
	static int money;

	public Transaction(Salesman salesman, Product product) {
		super();
		this.salesman = salesman;
		this.product = product;
		this.money = money;
	}

	public Salesman getSalesman() {
		return salesman;
	}

	public void setSalesman(Salesman salesman) {
		this.salesman = salesman;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	void soldToCustomer() {

		System.out.printf("[TR]%s sold(Rp.%d), adding profit to %s.\n", getProduct().getNameProduct(),
				getProduct().getPriceForCustomer(), getSalesman().getName());
		getSalesman().setSalary(getProduct().priceForSalesman += getSalesman().getSalary());
		System.out.println(salesman);
		Transaction.money += getProduct().getPriceForCustomer();
		System.out.println("Total Customer payment :Rp" + Transaction.money);
		System.out.println();

	}

	public Transaction() {
		// TODO Auto-generated constructor stub
	}

}
