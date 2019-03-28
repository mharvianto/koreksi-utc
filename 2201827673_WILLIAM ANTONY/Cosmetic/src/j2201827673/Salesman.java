package j2201827673;

import java.util.ArrayList;

public class Salesman extends Employee {
	private Integer profit;
	private ArrayList<Transaction> listTransaction = new ArrayList<>();

	public ArrayList<Transaction> getListTransaction() {
		return listTransaction;
	}

	public Salesman(String name, String address) {
		super(name, address, "Salesman");
		this.salary = 4000000;
		this.profit = 0;
	}

	public void sell(Product product) {
		Transaction t = new Transaction(product, this);
		listTransaction.add(t);
		this.profit += Math.abs(product.getCustPrice() - product.getSalesPrice());
	}

	public void showPriceToCust() {
		Integer total = 0;
		System.out.println("Total Biaya Customer");
		for (Transaction transaction : listTransaction) {
			System.out.println(transaction.getProduct());
			total += transaction.getProduct().getCustPrice();
		}
		System.out.printf("Total %d", total);
	}

	@Override
	public void calculateSalary() {
		System.out.printf("Gaji %s - %s\n", name, jobTitle);
		System.out.printf("Gaji pokok %d\n", salary);
		System.out.printf("Profit %d\n", profit);
		System.out.printf("Total %d", salary + profit);
	}

}
