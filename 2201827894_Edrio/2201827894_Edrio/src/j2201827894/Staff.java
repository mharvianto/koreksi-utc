package j2201827894;

import java.util.ArrayList;
import java.util.Scanner;

public class Staff extends Employee {

	Scanner input = new Scanner(System.in);

	public Staff() {

	}

	public void add(ArrayList<Employee> eList, String name, String address) {
		Employee a = new Staff();
		a.name = name;
		a.address = address;
		a.jobTitle = "Staff";
		a.salary = standardSalary;
		eList.add(a);
	}

	public void calculateSalary(Employee a) {
		salary += standardSalary;
		a.setSalary(salary);
	}

}
