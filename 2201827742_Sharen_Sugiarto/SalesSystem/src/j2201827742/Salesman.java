package j2201827742;

import java.util.Vector;

public class Salesman extends Employee {
	private Vector<Product> vProduct = new Vector<Product>();
	private String jobName;

	public Salesman() {
		this.address = address;
		this.jobName = "Salesman";
		this.vProduct = new Vector<Product>();
		this.name = name;

	}

	public Salesman(String name, String address) {
		super();
	}

	public Vector<Product> getvProduct() {
		return vProduct;
	}

	public void setvProduct(Vector<Product> vProduct) {
		this.vProduct = vProduct;
	}

	@Override
	public String toString() {
		return "Salesman [vProduct=" + vProduct + ", jobName=" + jobName + ", name=" + name + ", address=" + address
				+ ", salary=" + salary + ", vTransaction=" + vTransaction + "]";
	}

}
