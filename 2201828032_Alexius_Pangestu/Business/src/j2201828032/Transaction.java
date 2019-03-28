package j2201828032;

public class Transaction {
	private int quantity;

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int customerProfit() {
		return customerProfit() * quantity;
	}

	public int salesManProfit() {
		return salesManProfit() * quantity;
	}

	@Override
	public String toString() {
		return "Transaction [quantity=" + quantity + "]";
	}

}
