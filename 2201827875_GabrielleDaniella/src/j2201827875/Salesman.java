package j2201827875;

import java.util.*;

public class Salesman extends Employee {
	private Integer profit;
	private Vector<Product> vProduct = new Vector<>();
	private Transaction transaction;

	public Salesman(String name, String address, String jobTitle) {
		super(name, address, jobTitle);
	}

	public Salesman() {

	}

	@Override
	public void showData() {
		System.out.println("Name: " + getName());
		System.out.println("Address: " + getAddress());
		System.out.println("Job: " + getJobTitle());
		System.out.println("Salary: " + getProfit());
	}

	// ?
	public Integer getProfit() {
		return (transaction.getPriceSales() - transaction.getPriceCust()) * transaction.getQuantity();
	}

	public void setProfit(Integer profit) {
		this.profit = profit;
	}
}
