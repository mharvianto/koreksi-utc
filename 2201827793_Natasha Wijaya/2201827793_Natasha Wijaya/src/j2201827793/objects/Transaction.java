package j2201827793.objects;

public class Transaction {

	private String custName;
	private String item;
	private int price;

	/**
	 * @param custName
	 * @param item
	 * @param price
	 */
	public Transaction(String custName, String item, int price) {
		super();
		this.custName = custName;
		this.item = item;
		this.price = price;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
