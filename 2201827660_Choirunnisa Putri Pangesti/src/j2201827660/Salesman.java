package j2201827660;

import java.util.ArrayList;

public class Salesman extends Employee {
	private ArrayList<Transaction> transactionList = new ArrayList<>();
	Transaction transaction;

	public Salesman() {
		super();
	}

	public Salesman(String name, String address, String jobTitle) {
		super(name, address, jobTitle);
	}

	public ArrayList<Transaction> getTransactionList() {
		return transactionList;
	}

	@Override
	public int getSalary() {
		salary = 5000000 + transaction.getTotal();
		return super.getSalary();
	}

}
