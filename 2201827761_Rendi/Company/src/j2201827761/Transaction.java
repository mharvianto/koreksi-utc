package j2201827761;

import java.util.Vector;

public class Transaction {

	public Vector<Product> products = new Vector<Product>();

	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	public Integer totalPrice() {
		Integer total = 0;
		for (Product product : products) {
			total += product.getCustprice();
		}
		return total;
	}

	public Integer totalSalesprice() {
		Integer total = 0;
		for (Product product : products) {
			total += product.getSalesprice();
		}
		return total;
	}

	// setter and getter

	public Vector<Product> getProducts() {
		return products;
	}

	public void setProducts(Vector<Product> products) {
		this.products = products;
	}

}
