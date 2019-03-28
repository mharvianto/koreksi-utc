package j2201827912;

public class Salesman extends Employee {
	private int profit;

	public Salesman(String name, String address) {
		this.name = name;
		this.address = address;
		this.job = "Salesman";
		this.profit = 0;
		this.salary = 1500000;
	}

	@Override
	public void calculateSalary(int profit) {
		this.salary += profit;
	}

	public int getProfit() {
		return profit;
	}

	public void setProfit(int profit) {
		this.profit = profit;
	}

}
