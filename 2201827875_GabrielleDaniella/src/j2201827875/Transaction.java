package j2201827875;

import java.util.ArrayList;

public class Transaction extends Product {

	public Transaction(String name, String category, Integer priceCust, Integer priceSales, Integer quantity) {
		super(name, category, priceCust, priceSales, quantity);
	}

	public Integer getTotal() {
		return getPriceCust() * getQuantity();
	}

	@Override
	public void showData() {
		System.out.println("Name: " + getName());
		System.out.println("Category: " + getCategory());
		System.out.println("Price: " + getPriceCust());
		System.out.println("Quantity: " + getQuantity());
		System.out.println("Total: " + getTotal());
	}

}
