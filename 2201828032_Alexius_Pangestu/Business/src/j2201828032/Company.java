package j2201828032;

import java.util.Scanner;
import java.util.Vector;

public class Company {
	Vector<Employee> employeeList = new Vector<Employee>();
	Vector<Staff> staffList = new Vector<Staff>();
	Vector<Salesman> salesmanList = new Vector<Salesman>();
	Scanner scan = new Scanner(System.in);
	String name, type, address;

	public Company() {
		Employee employee = new Employee();

		do {
			System.out.print("Input name [min. 3 chars]: ");
			name = scan.nextLine();
		} while (name.length() < 3);
		do {
			System.out.print("Input address [min. 5 chars]: ");
			address = scan.nextLine();
		} while (address.length() < 5);
		do {
			System.out.print("Input sales || staff: ");
			type = scan.nextLine();
		} while (!(type.equals("sales") || type.equals("staff")));
		employee.setName(name);
		employee.setJobTitle(type);
		employee.setAddress(address);
		// for (int i = 0; i < employeeList.size(); i++) {
		System.out.printf("%s\n" + employee.getName());
		// }
		// kendala di print

	}

	public static void main(String[] args) {
		new Company();
	}

}
