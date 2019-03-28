package j2201827963;

public class Salesman extends Employee {

	private Transaction transaction;
	private Product product;
	private int salary;

	public Salesman(String name, String address, String jobTitle) {
		super(name, address, jobTitle);
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int calculateSalary() {
		setSalary(transaction.getTotalQuantity() * (product.priceCostumer - product.priceSalesman));
		return getSalary();
	}

}
