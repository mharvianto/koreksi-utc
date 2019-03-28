package j2201827950;

public class Transaction {
	private long price;
	private int sum;

	public Transaction(long price, int sum) {
		super();
		this.price = price;
		this.sum = sum;
	}

	public long getPrice() {
		return price * sum;
	}

	public int getSum() {
		return sum;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

}
