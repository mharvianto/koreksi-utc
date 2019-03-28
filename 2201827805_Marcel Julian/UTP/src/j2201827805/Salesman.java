package j2201827805;

import java.util.ArrayList;

public class Salesman extends Employee {
	int transCount = -1;
	private ArrayList<Transaction> transactions = new ArrayList<>();

	public Salesman(String name, String address, String jobTitle) {
		super(name, address, jobTitle);
	}

	public int countSalary() {
		salary = 0;
		int idx = 0;
		for (Transaction temp : transactions) {
			idx++;
			System.out.printf("Profit dari transaksi %d: \n", idx);
			System.out.println(temp.getTotalProfit());
			salary += temp.getTotalProfit();
		}
		return salary;
	}

	public void addTransaction() {
		transactions.add(new Transaction());
		transCount++;
	}

	public void addProduct(int idx, Product product, int qty) {
		transactions.get(idx).addProduct(product, qty);
	}

	public void printTransaction(int idx) {
		transactions.get(idx).printTransaction();
	}

	public int getTransCount() {
		return transCount;
	}
}
