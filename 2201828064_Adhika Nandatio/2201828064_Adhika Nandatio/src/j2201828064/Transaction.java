package j2201828064;

public class Transaction {

	private int productSold;
	private int totalPriceCust;

	public Transaction() {
		super();
		this.productSold = 0;
		this.totalPriceCust = 0;
	}

	public int getProductSold() {
		return productSold;
	}

	public void setProductSold(int productSold) {
		this.productSold = productSold;
	}

	public int getTotalPriceCust() {
		return totalPriceCust;
	}

	public void totalPrice(Product product, int terjual) {
		productSold += terjual;
		totalPriceCust += terjual * (product.getPriceCust());
	}

	@Override
	public String toString() {
		return "Transaction [productSold=" + productSold + ", totalPriceCust=" + totalPriceCust + "]";
	}

}
