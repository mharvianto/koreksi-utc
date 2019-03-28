package j2201827710;

import java.util.ArrayList;

public class CompanyMain {
	ArrayList<Salesman> salesmanList = new ArrayList<>();
	ArrayList<Staff> staffList = new ArrayList<>();
	ArrayList<Transaction> transactionList = new ArrayList<>();
	ArrayList<Employee> employeeList = new ArrayList<>();
	ArrayList<Product> productList = new ArrayList<>();

	public CompanyMain() {
		// add product
		Product p1 = new Product("100 Bags", 5000000, 1350000);
		Product p2 = new Product("100 Clothes", 2500000, 1780000);
		Product p3 = new Product("100 Kitchen's Tools", 4750000, 2050000);
		Product p4 = new Product("20 Bathing's Tools", 9875000, 2300000);
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		productList.add(p4);
		// add staff
		Staff s1 = new Staff("Andy", "Jalan kebun jeruk No23, Jakarta.");
		Staff s2 = new Staff("Bucky", "Taman Venesia Nomor 55, Jakarta ");
		employeeList.add(s1);
		employeeList.add(s2);
		staffList.add(s1);
		staffList.add(s2);
		// add salesman
		Salesman m1 = new Salesman("John", "Alam Sentosa No 23, Bogor.");
		Salesman m2 = new Salesman("Bachdin", "Bantar Kemang, No 25, Bogor");
		employeeList.add(m1);
		employeeList.add(m2);
		salesmanList.add(m1);
		salesmanList.add(m2);
		// transaction
		Transaction t1 = new Transaction(m1, p3);
		t1.soldToCustomer();
		Transaction t2 = new Transaction(m1, p4);
		t2.soldToCustomer();
		Transaction t3 = new Transaction(m2, p1);
		t3.soldToCustomer();
		Transaction t4 = new Transaction(m2, p2);
		t4.soldToCustomer();
		transactionList.add(t1);
		transactionList.add(t2);
		transactionList.add(t3);
		transactionList.add(t4);
		System.out.println("[PAYMENT]Total Customer payment :Rp" + Transaction.money);
		System.out.println();
		// view
		viewEmployee();
		System.out.println();
		viewTransaction();
	}

	void viewEmployee() {
		System.out.printf("%-3s.||%-10s||%-15s||%-10s||\n", "No", "Name", "Title", "Salary");
		for (int i = 0; i < employeeList.size(); i++) {
			Employee e = employeeList.get(i);
			System.out.printf("%-3d.||%10s||%15s||%-10d||\n", i + 1, e.getName(), e.getJobTitle(), e.getSalary());
		}
	}

	void viewTransaction() {
		for (int i = 0; i < transactionList.size(); i++) {
			Transaction t = transactionList.get(i);
			System.out.printf("%3d||%25s||%10d||%10s||%13d||\n", i + 1, t.getProduct().getNameProduct(),
					t.getProduct().getPriceForCustomer(), t.getSalesman().getName(), t.getMoney());
		}
	}

	public static void main(String[] args) {
		new CompanyMain();

	}

}
