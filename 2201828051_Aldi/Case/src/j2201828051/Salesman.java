package j2201828051;

import java.util.ArrayList;

public class Salesman extends Employee {

	private double totalSalary;

	private Product product = new Product();
	private Transaction transaction = new Transaction();
	private ArrayList<Transaction> listTransaction = new ArrayList<>();

	public double getTotalSalary() {
		return totalSalary;
	}

	public void setTotalSalary(double totalSalary) {
		this.totalSalary = totalSalary;
	}

	@Override
	public double calculateSalary() {
		return product.getBalance() * super.getTotalSold();
	}

	public Salesman() {
		setJobTitle("Salesman");
	}

	@Override
	public void soldProduct() {
		super.soldProduct();
		transaction.info();
	}

	@Override
	public String toString() {
		return String.format("%s - %s - %s", this.name, this.address, this.jobTitle);
	}

	public Salesman(String address, String name) {
		super(address, "Salesman", name);
	}

}
