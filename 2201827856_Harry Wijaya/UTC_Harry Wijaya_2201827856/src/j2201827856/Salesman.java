package j2201827856;

import java.util.Vector;

public class Salesman extends Employee {

	Vector<Product> vProduct = new Vector<>();

	Transaction a;

	public Salesman(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
		this.jobTitle = "Salesman";
	}

	@Override
	public Integer calculateSalary() {
		int totalSalary = 0;
		// TODO Auto-generated method stub
		for (Product product : vProduct) {
			totalSalary += product.getProfit();
		}
		return totalSalary;
	}

}
