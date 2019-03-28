package j2201827755;

import java.util.ArrayList;

public class Salesman extends Employee {
	private int totalProfit;
	private ArrayList<Transaction> transactionList = new ArrayList<>();

	public Transaction saleProduct(Product prod, Cust custName) {
		Transaction t = new Transaction(custName);
		t.getProdList().add(prod);
		transactionList.add(t);
		custName.getTransactionList().add(t);
		System.out.println(name + " sales product to " + custName.getName());
		for (int i = 0; i < t.getProdList().size(); i++) {
			totalProfit += (t.getProdList().get(i).getPriceForCust() - t.getProdList().get(i).getPriceForSales());
		}
		return t;
	}

	@Override
	public int getSalary() {
		// TODO Auto-generated method stub
		return this.totalProfit;
	}

	@Override
	public void viewSalary() {

		System.out.println(name + " your salary is Rp" + totalProfit);

	}

	public int getTotalProfit() {
		return totalProfit;
	}

	public ArrayList<Transaction> getTransactionList() {
		return transactionList;
	}
}
