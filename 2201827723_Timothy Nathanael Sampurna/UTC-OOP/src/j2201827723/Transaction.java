package j2201827723;

import java.util.ArrayList;

public class Transaction {
	private ArrayList<Product> products = new ArrayList<Product>();
	private int total_price = 0;

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	public int getTotal_price() {
		return total_price;
	}

	public void add_product(Product temp, int total_sales) {
		Product input = new Product();
		input.setAll(temp.getName(), temp.getCategory(), temp.getSalesman_price(), temp.getCustomer_price());
		temp.setTotal_sales(total_sales);
		products.add(temp);
		total_price += temp.getCustomer_price() * total_sales;
	}

	public void view_transaction() {
		for (Product temp2 : products) {
			System.out.println(
					temp2.toString1() + "\nproduct total: " + (temp2.getCustomer_price() * temp2.getTotal_sales()));
			System.out.println();
		}
		System.out.println("Total Price: " + getTotal_price());
	}

	public void staff_view_transaction() {
		for (Product temp2 : products) {
			System.out.println(temp2.toString() + "\nproduct profit total: "
					+ ((temp2.getCustomer_price() - temp2.getSalesman_price()) * temp2.getTotal_sales()));
			System.out.println();
		}
		System.out.println("Total profit: " + count_salary());
	}

	public int count_salary() {
		int returned = 0;
		for (Product temp2 : products) {
			returned += (temp2.getCustomer_price() - temp2.getSalesman_price()) * temp2.getTotal_sales();
		}
		return returned;
	}
}
