package j2201827830;

import java.util.Vector;

public class Salesman extends Employee {
	private Vector<Product> productList = new Vector<>();
	private int totalProfit;

	public Salesman() {
		super();
		totalProfit = 0;
	}

	public Salesman(String name, String address, int basicSalary) {
		super(name, address, "Salesman", basicSalary);
		totalProfit = 0;
	}

	public void sell(Product product) {
		productList.add(product);
	}

	public void printProfit() {
		for (Product product : productList) {
			System.out.println(product.getName() + " profit : Rp" + product.getProfit());
		}
	}

	public Vector<Product> getProductList() {
		return productList;
	}

	@Override
	public int calculateSalary() {
		for (Product product : productList) {
			totalProfit += product.getProfit();
		}

		return totalProfit + basicSalary;
	}
}
