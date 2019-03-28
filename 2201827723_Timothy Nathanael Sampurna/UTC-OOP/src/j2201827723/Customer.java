package j2201827723;

public class Customer {
	private String name;
	private Transaction transaction;

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public void view_transaction() {
		transaction.view_transaction();
	}

	Customer(String name) {
		transaction = new Transaction();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
