package j2201827641;

import java.util.Vector;

public class Salesman extends Employee {

	private Integer profit;
	private Integer custPrice = 0;
	private Vector<Transaction> listTransaction = new Vector<>();
	private static Transaction transaction = new Transaction();

	@Override
	public Integer countSalary() {

		return this.profit;
	}

	public void sell(Product product) {
		transaction.getSoldProduct().add(product);
		custPrice += product.getCustPrice();
		transaction.setTotalCustPrice(custPrice);

		profit += product.getCustPrice() - product.getSalesPrice();
	}

	public void closeTransaction() {
		listTransaction.add(transaction);
		transaction.getSoldProduct().clear();
		custPrice = 0;
	}

	public void viewSoldPricePerTransaction() {
		for (Transaction transaction : listTransaction) {
			int soldPrice = transaction.getTotalCustPrice();
			System.out.println(soldPrice);
		}
	}

	public Integer getCustPrice() {
		return custPrice;
	}

	public Integer getProfit() {
		return profit;
	}

	public Vector<Transaction> getListTransaction() {
		return listTransaction;
	}

	public Salesman() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Salesman(String name, String address, String title) {
		super(name, address, title);
		this.profit = 0;
	}

}
