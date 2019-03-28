package j2201827894;

import java.util.ArrayList;
import java.util.Scanner;

public class Salesman extends Employee {
	private int profit = 0;
	Scanner input = new Scanner(System.in);

	public int getProfit() {
		return profit;
	}

	public void setProfit(int profit) {
		this.profit = profit;
	}

	public Salesman() {

	}

	@Override
	public void add(ArrayList<Employee> eList, String name, String address) {
		Employee a = new Salesman();
		a.name = name;
		a.address = address;
		a.jobTitle = "Salesman";
		eList.add(a);
	}
}
