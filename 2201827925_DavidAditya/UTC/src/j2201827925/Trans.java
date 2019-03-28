package j2201827925;

public class Trans {

	int number = 0;
	String product;
	int price;
	int qty;

	public Integer getProfit(int custPrice, int salesPrice) {

		return custPrice - salesPrice;
	}

	public Trans() {
		// TODO Auto-generated constructor stub
	}

	public Trans(String product, int price, int qty) {
		super();
		this.product = product;
		this.price = price;
		this.qty = qty;

	}

	@Override
	public String toString() {
		number++;
		return "Transaction " + number + "\nProduct = " + product + "\nPrice = Rp" + price + "\nQuantity = " + qty
				+ "\nTOTAL = Rp" + price * qty;
	}

}
