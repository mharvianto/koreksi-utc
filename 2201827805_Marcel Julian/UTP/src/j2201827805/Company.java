package j2201827805;

import java.util.Scanner;
import java.util.ArrayList;

public class Company {

	Scanner in = new Scanner(System.in);
	ArrayList<Product> productList = new ArrayList<>();
	ArrayList<Employee> employees = new ArrayList<>();

	public Company() {
		productList.add(new Product("Cream", "Facial", 75000, 50000));
		productList.add(new Product("Bedak", "Facial", 50000, 35000));
		productList.add(new Product("Eyeliner", "Eye Product", 100000, 60000));
		productList.add(new Product("Lipstick", "Lip Product", 125000, 70000));
		productList.add(new Product("Nail Polish", "Nail Product", 80000, 45000));

		employees.add(new Staff("Marcel", "Jl. Udayana 3 No. 18", "Staff"));
		employees.add(new Salesman("Budi", "Jl. Sales 4 No. 4", "Salesman Trainee"));
		employees.add(new Salesman("Dinda", "Jl. Sukses 7 No. 21", "Salesman Pro"));

		System.out.println("Product List: ");
		for (Product temp : productList) {
			System.out.println(temp.getData());
			System.out.println();
		}
		System.out.println("");
		System.out.println("Employee List: ");
		for (Employee temp : employees) {
			System.out.println(temp.getData());
		}

		System.out.println("\nMenambahkan transaksi baru dari Budi ...");
		((Salesman) (employees.get(1))).addTransaction();
		int idx = ((Salesman) (employees.get(1))).getTransCount();
		((Salesman) (employees.get(1))).addProduct(idx, productList.get(0), 13);
		((Salesman) (employees.get(1))).addProduct(idx, productList.get(2), 7);
		((Salesman) (employees.get(1))).addProduct(idx, productList.get(4), 8);
		((Salesman) (employees.get(1))).printTransaction(idx);

		System.out.println("\nMenambahkan transaksi baru dari Dinda ...");
		((Salesman) (employees.get(2))).addTransaction();
		idx = ((Salesman) (employees.get(2))).getTransCount();
		((Salesman) (employees.get(2))).addProduct(idx, productList.get(1), 6);
		((Salesman) (employees.get(2))).addProduct(idx, productList.get(2), 12);
		((Salesman) (employees.get(2))).addProduct(idx, productList.get(0), 7);
		((Salesman) (employees.get(2))).addProduct(idx, productList.get(4), 14);
		((Salesman) (employees.get(2))).printTransaction(idx);

		System.out.println("\nMenambahkan transaksi baru dari Dinda ...");
		((Salesman) (employees.get(2))).addTransaction();
		idx = ((Salesman) (employees.get(2))).getTransCount();
		((Salesman) (employees.get(2))).addProduct(idx, productList.get(3), 8);
		((Salesman) (employees.get(2))).addProduct(idx, productList.get(1), 15);
		((Salesman) (employees.get(2))).printTransaction(idx);

		System.out.println("\nMenghitung semua gaji karyawan: ");
		for (Employee temp : employees) {
			System.out.println("Salary: " + temp.countSalary());
		}

		System.out.println("\nPrint semua gaji karyawan: ");
		for (Employee temp : employees) {
			System.out.println(temp.toString());
		}

	}

	public static void main(String[] args) {
		new Company();

	}

}
