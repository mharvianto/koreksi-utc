package j2201827761;

import java.util.Scanner;
import java.util.Vector;

public class Salesman extends Employee {

	private Scanner in = new Scanner(System.in);
	private Integer salary;
	private Integer profit;
	private Vector<Transaction> transactions = new Vector<Transaction>();

	public Salesman() {
		// TODO Auto-generated constructor stub
	}

	public Salesman(String name, String address, String job, Integer salary, Integer profit) {
		super(name, address, job);
		this.salary = salary;
		this.profit = profit;
	}

	public Integer totalProfit() {
		Integer total = 0;
		for (Transaction transaction : transactions) {
			total += transaction.totalPrice() - transaction.totalSalesprice();
		}
		return total;
	}

	@Override
	public Integer totalSalary() {

		return this.salary + this.totalProfit();
	}

	// setter and getter

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Integer getProfit() {
		return profit;
	}

	public void setProfit(Integer profit) {
		this.profit = profit;
	}

	public Vector<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(Vector<Transaction> transactions) {
		this.transactions = transactions;
	}

}
