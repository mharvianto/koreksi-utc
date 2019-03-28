package j2201827843.storage;

import java.util.ArrayList;

import j2201827843.company.*;

public class Data {
	public static ArrayList<Product> products = new ArrayList<>();
	public static ArrayList<Employee> employees = new ArrayList<>();

	public static void addProduct(Product product) {
		products.add(product);
	}

	public static void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public static void showProducts() {
		int i = 1;
		for (Product product : products) {
			System.out.printf("%d | %-10s category : %s price : %d | %d \n", i++, product.getName(),
					product.getCategory(), product.getPriceForCustomer(), product.getPriceForSales());
		}
	}

	public static void showEmployees() {
		int i = 1;
		for (Employee employee : employees) {
			String type = "unknown";
			if (employee instanceof Staff)
				type = "Staff";
			else if (employee instanceof Sales)
				type = "Salesman";
			System.out.printf("%d | [%s] %s\nAddress : %s\nJobTitle : %s\n", i++, type, employee.getName(),
					employee.getAddress(), employee.getJobTitle());
		}
	}
}
