package j2201827755;

import java.util.ArrayList;

public class Transaction {
	public String date;
	public Cust custName;
	private ArrayList<Product> prodList = new ArrayList<>();

	public Transaction(Cust cust) {
		this.custName = cust;
	}

	public Transaction() {

	}

	public int view() {
		int total = 0;
		for (int i = 0; i < prodList.size(); i++) {
			System.out.println(prodList.get(i).getName() + " = Rp" + prodList.get(i).getPriceForCust());
			total += prodList.get(i).getPriceForCust();
		}
//		System.out.println("Total Price = Rp" + total);
		return total;
	}

	public ArrayList<Product> getProdList() {
		return prodList;
	}

}
