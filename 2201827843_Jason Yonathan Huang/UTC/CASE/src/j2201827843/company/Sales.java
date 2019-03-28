package j2201827843.company;

import java.util.ArrayList;

import j2201827843.helper.Helper;
import j2201827843.storage.Data;

public class Sales extends Employee {
	ArrayList<Transaction> transactions = new ArrayList<>();
	Data data;
	Helper helper;

	public Sales(String name, String address, String jobTitle, Integer sallary) {
		super(name, address, jobTitle, sallary);
	}

	public void Sell() {
		transactions.add(new Transaction());
	}

	public void PrintDetail() {
		int i = 1;
		int total = 0;
		for (Transaction transaction : transactions) {
			System.out.println("Transaction " + i++);
			total += transaction.PrintDetails();
		}
		System.out.println("TOTAL PROFIT : " + total);
	}

	@Override
	public Integer getSallary() {
		int total = 0;
		for (Transaction transaction : transactions) {
			total += transaction.getProfit();
		}
		return total;
	}
}
