package j2201827950;

public class Salesman extends Employee {
	private long profit;

	public Salesman() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Salesman(String name, String address, String jobTitle, long salary) {
		super(name, address, jobTitle, salary);
		// TODO Auto-generated constructor stub
	}

	public long getProfit() {
		return profit;
	}

	public void setProfit(long profit) {
		this.profit = profit;
	}

	@Override
	public long calculateSalary() {
		return salary + profit;
	}

	public void sellProduct(Products temp, long sum) {
		System.out.printf("Sold %s x %d\n", temp.getName(), sum);
		profit += (temp.getCustPrice() - temp.getSalePrice()) * sum;
	}
//	public void setSalary(long salary) {
//		this.salary = salary;
//	}

	@Override
	public String toString() {
		return "Name=" + name + "\nAddress=" + address + "\nJob Title=" + jobTitle + "\nSalary=" + salary;
	}

}
