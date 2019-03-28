package j2201827723;

import java.util.ArrayList;

public class Company {
	private ArrayList<Employee> employees = new ArrayList<>();
	private ArrayList<Product> products = new ArrayList<>();
	private ArrayList<Customer> customers = new ArrayList<>();

	public Company() {
		Employee temp = new Staff("Staff1", "Rumah Staff1", "Staff", 500000);
		// ((Staff)temp).setAll("Staff1", "Rumah Staff1", "Staff",500000);
		employees.add(temp);
		temp = new Salesman();
		((Salesman) temp).setAll("salesman1", "rumah salesman1", "salesman");
		employees.add(temp);
		Product temp_product = new Product();
		temp_product.setAll("produk1", "produk", 500000, 750000);
		products.add(temp_product);
		temp_product = new Product();
		temp_product.setAll("produk2", "produk", 400000, 850000);
		products.add(temp_product);
		Customer temp_customer = new Customer("cust1");
		Transaction temp_transaction = new Transaction();
		temp_transaction.add_product(products.get(0), 10);
		temp_transaction.add_product(products.get(1), 15);
		temp_customer.setTransaction(temp_transaction);
		((Salesman) employees.get(1)).add_transaction(temp_transaction);
		customers.add(temp_customer);
		temp_customer = new Customer("Abu");
		temp_transaction = new Transaction();
		temp_transaction.add_product(products.get(0), 13);
		temp_transaction.add_product(products.get(1), 12);
		((Salesman) employees.get(1)).add_transaction(temp_transaction);
		temp_customer.setTransaction(temp_transaction);
		customers.add(temp_customer);

		System.out.println(employees.get(0).toString() + "\n");
		((Salesman) employees.get(1)).count_salary();
		System.out.println(employees.get(1).toString() + "\n");
		((Salesman) employees.get(1)).view_transaction();
		System.out.println("\nName:" + customers.get(0).getName());
		customers.get(0).view_transaction();
		System.out.println("\nName:" + customers.get(1).getName());
		customers.get(1).view_transaction();
	}

	public static void main(String args[]) {
		new Company();
	}
}
