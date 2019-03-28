package j2201827862;

import java.util.Vector;

/**
 * @author prk
 *
 */
public class Salesman extends Employee {

	private Vector<Product> productList = new Vector<Product>();
	private long salesProfit;

	@Override
	public long getSalary() {
		long finalSalary = super.salary + salesProfit;
		return finalSalary;
	}

	public Salesman() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Salesman(String name, String address, String jobTitle, long salary, Vector<Product> productList) {
		super(name, address, jobTitle, salary);

		this.productList = productList;
		this.salesProfit = 0;
		// TODO Auto-generated constructor stub
	}

	public Vector<Product> getProductList() {
		return productList;
	}

	public void setProductList(Vector<Product> productList) {
		this.productList = productList;
	}

	public long getSalesProfit() {
		return salesProfit;
	}

	public void setSalesProfit(long salesProfit) {
		this.salesProfit = salesProfit;
	}

	@Override
	public void showData() {
		// TODO Auto-generated method stub
		super.showData();
		System.out.println("Salary : " + super.getSalary());
		System.out.println("Sales Profit : " + salesProfit);
		System.out.println("Total Salary : " + this.getSalary());
	}

}
