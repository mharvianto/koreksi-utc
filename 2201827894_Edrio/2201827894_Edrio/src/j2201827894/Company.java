package j2201827894;

import java.util.ArrayList;
import java.util.Scanner;

public class Company {
	Scanner input = new Scanner(System.in);
	private static ArrayList<Employee> employeeList = new ArrayList<>();
	private static ArrayList<Transaction> tList = new ArrayList<>();

	public static ArrayList<Employee> getEmployeeList() {
		return employeeList;
	}

	public Company() {

	}

	public static void main(String args[]) {
		Company cosmetic = new Company();
		Employee a = new Staff();
		a.add(employeeList, "Andy", "Jalan Pancar no 36");
		a.calculateSalary(a);
		Employee b = new Salesman();
		b.add(employeeList, "Yudy", "Jalan asem no 37");
		for (int i = 0; i < employeeList.size(); i++) {
			if (employeeList.get(i) instanceof Staff) {
				System.out.println(employeeList.get(i).getName() + " salary is " + employeeList.get(i).getSalary());
			} else {
				System.out.printf(employeeList.get(i).getName() + "salary is " + ((Salesman) b).getProfit() + "\n");
			}
		}
		Product c = new Product();
		c.sell((Salesman) b, 3, tList);

		a.calculateSalary(a);
		for (int i = 0; i < employeeList.size(); i++) {
			if (employeeList.get(i) instanceof Staff) {
				System.out.println(employeeList.get(i).getName() + " salary is " + employeeList.get(i).getSalary());
			} else {
				System.out.printf(employeeList.get(i).getName() + "salary is " + ((Salesman) b).getProfit() + "\n");
			}
		}

		for (int i = 0; i < tList.size(); i++) {
			System.out.printf("%-15s selled Categories %d \n", tList.get(i).Seller, tList.get(i).getCategories());
		}

	}

}
