package j2201827931;

import java.util.ArrayList;

public class Salesman extends Employee {
	private int salesSalary;
	private int soldProducts = 0;
	ArrayList<Transaction> listTransaction = new ArrayList<>();

	public Salesman(String name, String address, ArrayList<Transaction> listTransaction) {
		super(name, address);
		Transaction ts = new Transaction("Lipstick", "Revlon", listTransaction);
		this.soldProducts += ts.getQuantity();
		this.salesSalary += ts.getProfit();
		ts = new Transaction("Blush", "MakeOver", listTransaction);
		this.soldProducts += ts.getQuantity();
		this.salesSalary += ts.getProfit();
		ts = new Transaction("Mascara", "Maybelline", listTransaction);
		this.soldProducts += ts.getQuantity();
		this.salesSalary += ts.getProfit();
		ts.toString();
	}

	public int getSalesSalary() {
		return salesSalary;
	}

	public void setSalesSalary(int salesSalary) {
		this.salesSalary = salesSalary;
	}

	public int getTotalSalary() {
		return salesSalary;
	}

	public int getSoldProducts() {
		return soldProducts;
	}

	public void setSoldProducts(int soldProducts) {
		this.soldProducts = soldProducts;
	}

	public ArrayList<Transaction> getListTransaction() {
		return listTransaction;
	}

	public void setListTransaction(ArrayList<Transaction> listTransaction) {
		this.listTransaction = listTransaction;
	}

	@Override
	public String toString() {
		return name + " ( " + address + " ) | Salesman\n" + "Total Salary: " + getTotalSalary() + " from "
				+ getSoldProducts() + " sold product<s>";
	}

}
