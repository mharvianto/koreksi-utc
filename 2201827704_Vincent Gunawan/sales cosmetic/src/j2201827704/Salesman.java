package j2201827704;

import java.util.ArrayList;

public class Salesman extends Employee {
	private ArrayList<Product> listProduct = new ArrayList<Product>();
	int[] soldOut = new int[100];

	public Salesman() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Product> getListProduct() {
		return listProduct;
	}

	public Salesman(String name, String address, String jobTitle) {
		super(name, address, jobTitle);
	}

	public void soldOut(int quantity, String name) {
		int found = -1;
		System.out.println(listProduct.size());
		for (int i = 0; i < listProduct.size(); i++) {
			System.out.println(listProduct.get(i).getName());
			if (listProduct.get(i).getName().compareTo(name) == 0) {
				System.out.println(listProduct.get(i).getName());
				listProduct.get(i).setQuantity(quantity);
				found = i;
			}
		}
		System.out.println("Found " + found);
		if (found != -1) {
			soldOut[found] = quantity;
			System.out.println(listProduct.get(found).getName() + soldOut[found]);
		}

	}

	@Override
	public int calculateSalary() {
		int totalProfit = 0;
		System.out.printf("%s Salary computation\n", this.name);
		for (int i = 0; i < listProduct.size(); i++) {
			totalProfit += listProduct.get(i).calculateProfit(soldOut[i]);
		}
		return totalProfit;
	}
}
