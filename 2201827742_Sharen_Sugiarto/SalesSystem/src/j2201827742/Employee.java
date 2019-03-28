package j2201827742;

import java.util.Vector;

public class Employee {
	protected String name, address, jobName;
	protected int salary;

	Vector<Transaction> vTransaction = new Vector<Transaction>();

	public Employee(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public Employee() {

	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

//
//	public String getJobName() {
//		return jobName;
//	}

	public void view() {
//		for (Product product : vProduct) {
//			System.out.println(Product);
//		}
	}

}
