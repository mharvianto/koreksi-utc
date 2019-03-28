package j2201828000;

import java.util.ArrayList;

public class Salesman extends Employee {
	private ArrayList<Transaction> arrTransaction = new ArrayList<Transaction>();

	public Salesman(String name, String address, String jobTitle) {
		super(name, address, jobTitle);
	}

	public void addTransaction(Transaction t) {
		arrTransaction.add(t);
	}

	public void viewTransaction() {
		int i = 0;
		for (Transaction transaction : arrTransaction) {
			System.out.printf("Transaksi %d - %s - %s\n", ++i, transaction.getDate(), name);
			transaction.view();
		}
	}

	@Override
	public int getSalary() {
		int totalProfit = 0;
		for (Transaction transaction : arrTransaction) {
			totalProfit += transaction.getTotalProfit();
		}
		return basicSalary + totalProfit;
	}

	@Override
	public String toString() {
		return "Salesman Data\n" + super.toString() + String.format("Salary : %d\n", getSalary());
	}
}
