package j2201827723;

import java.util.ArrayList;

public class Salesman extends Employee {
	private ArrayList<Transaction> transactions = new ArrayList<Transaction>();

	void add_transaction(Transaction temp) {
		transactions.add(temp);
	}

	void view_transaction() {
		for (Transaction transaction : transactions) {
			transaction.staff_view_transaction();
		}
	}

	public void count_salary() {
		for (Transaction transaction : transactions) {
			for (Product product : transaction.getProducts()) {
				salary += product.getTotal_sales() * (product.getCustomer_price() - product.getSalesman_price());
			}
		}
	}
}
