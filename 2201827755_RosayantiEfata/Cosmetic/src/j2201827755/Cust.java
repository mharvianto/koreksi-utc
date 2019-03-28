package j2201827755;

import java.util.ArrayList;

public class Cust {
	private String name;
	private ArrayList<Transaction> transactionList = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Transaction> getTransactionList() {
		return transactionList;
	}

}
