package j2201827641;

import java.util.Vector;

public class Transaction {

	private Integer totalCustPrice;
	private Vector<Product> soldProduct = new Vector<>();

	public void setTotalCustPrice(Integer totalCustPrice) {
		this.totalCustPrice = totalCustPrice;
	}

	public Integer getTotalCustPrice() {
		return totalCustPrice;
	}

	public Vector<Product> getSoldProduct() {
		return soldProduct;
	}

	public Transaction() {
		this.totalCustPrice = 0;
	}

}
