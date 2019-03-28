package j2201828032;

public class Salesman extends Employee {
	@Override
	public String toString() {
		return "Salesman [totalProfit=" + totalProfit + "]";
	}

	private int totalProfit;

	public Salesman(String jobTitle) {
		this.name = name;
		this.address = address;
		this.jobTitle = jobTitle;
		this.totalProfit = totalProfit;
	}

	public int getTotalProfit() {
		return totalProfit;
	}

	public void setTotalProfit(int totalProfit) {
		this.totalProfit = totalProfit;
	}

	public int calcuSalesmanSalary() {
		return 0;
	}
}
