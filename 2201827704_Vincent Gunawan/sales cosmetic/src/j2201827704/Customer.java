package j2201827704;

import java.util.ArrayList;

public class Customer {
	private String name = "";
	private ArrayList<Product> listProductBuy = new ArrayList<>();
	private int total = 0;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getTotal() {
		return total;
	}

}
