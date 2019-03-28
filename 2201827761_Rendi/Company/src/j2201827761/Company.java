package j2201827761;

import java.util.Scanner;
import java.util.Vector;

public class Company {

	int incre = 0;
	Scanner in = new Scanner(System.in);

	Vector<Product> listProducts = new Vector<Product>();
	Vector<Employee> listEmployee = new Vector<Employee>();
	boolean valid;

	public void populateEmployee() {

		addStaff("Agus", "Jakarta Barat", "supir", 3000);
		addSalesman("Dodi", "Jakarta Pusat", "Sales Sabun", 2500);
		addStaff("Andin", "Jakarta Selatan", "Cleaning Service", 2000);
	}

	public void populateProduct() {
		addProduct("Luxe", "Sabun", 10000, 8000);
		addProduct("Dope", "Sabun", 12000, 9000);
		addProduct("Pienna", "Sabun", 15000, 10000);
	}

	public void addStaff(String name, String address, String job, Integer salary) {
		Staff temp = new Staff();
		temp.setName(name);
		temp.setAddress(address);
		temp.setJob(job);
		temp.setSalary(salary);
		listEmployee.add(temp);
	}

	public void addSalesman(String name, String address, String job, Integer salary) {
		Salesman temp = new Salesman();
		temp.setName(name);
		temp.setAddress(address);
		temp.setJob(job);
		temp.setSalary(salary);
		listEmployee.add(temp);
	}

	public void addProduct(String name, String category, Integer custprice, Integer salesprice) {
		Product temp = new Product();
		temp.setName(name);
		temp.setCategory(category);
		temp.setCustprice(custprice);
		temp.setSalesprice(salesprice);
		listProducts.add(temp);
	}

	public Product getProduct(Integer i) {
		return listProducts.get(i);
	}

	public void sell(Salesman man) {
		int choose = -1;
		for (Employee employee : listEmployee) {

		}

		int i = 1;
		for (Product product : listProducts) {
			System.out.println(i++ + product.toString());
		}
		System.out.println(i + " Exit");

		do {
			do {

				try {
					valid = true;
					System.out.println("What do you want to buy?");
				} catch (Exception e) {
					// TODO: handle exception
					valid = false;
				}
				in.nextLine();

			} while (!valid || choose < 1 || choose > i);

			if (choose != i) {
				Product temp = listProducts.get(choose - 1);
				man.getTransactions().get(incre++).getProducts().add(temp);
			}

		} while (choose != i);

		System.out.println(man.getTransactions().get(incre).getProducts().toString());

	}

	public Company() {
		// TODO Auto-generated constructor stub

		populateEmployee();
		populateProduct();

		for (Employee employee : listEmployee) {
			if (employee instanceof Staff) {
				System.out.println(employee.totalSalary());
			} else if (employee instanceof Salesman) {
				System.out.println(employee.totalSalary());
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Company();
	}

}
