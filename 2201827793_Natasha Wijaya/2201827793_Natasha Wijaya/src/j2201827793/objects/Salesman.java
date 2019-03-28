package j2201827793.objects;

import j2201827793.objects.Company;

public class Salesman extends Employee {

	private int salary;

	public Salesman() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param address
	 * @param jobTitle
	 */
	public Salesman(String name, String address, String jobTitle) {
		super(name, address, "Salesman");
		// TODO Auto-generated constructor stub
		this.salary = hitungProfit(); // TODO bikin function
	}

	public int hitungProfit() {
		int sales = Company.totalPrice();
		int modal = 0;

		for (Product prod : Company.productList) {
			for (Transaction trans : Company.transactionList) {
				if (trans.getItem().equals(prod.getName()))
					modal += prod.getPrice();
			}
		}

		return sales - modal;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
