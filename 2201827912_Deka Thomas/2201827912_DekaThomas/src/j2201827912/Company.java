package j2201827912;

import java.util.Scanner;
import java.util.Vector;

public class Company {

	Scanner scan = new Scanner(System.in);

	Vector<Transaction> transaction = new Vector<>();
	Vector<Product> products = new Vector<>();

	public Company() {
		Product sabun = new Product("Sabun X", "Mandi", 12000, 10000);
		Product shampo = new Product("Shampo X", "Mandi", 20000, 15000);
		Product lipstik = new Product("Lisptik X", "Kecantikan", 25000, 20000);
		Product sikat = new Product("Sikat Gigi", "Mandi", 5000, 2000);
		Product bedak = new Product("Bedak", "Kecantikan", 50000, 40000);
		Staff staff = new Staff("Shun", "Jalan Alam Sentosa", 1500000);
		Staff staff1 = new Staff("Jian", "Jalan B", 1300000);
		Salesman sales1 = new Salesman("Jaka", "Jalan A");
		Salesman sales = new Salesman("Joko", "Jalan Alam Jelita");

		transaction.add(new Transaction(sales, sabun, "Deka", 10));
		transaction.add(new Transaction(sales, lipstik, "Ani", 23));
		sales.calculateSalary(sabun.getSalesPrice() * 10);
		sales.calculateSalary(lipstik.getSalesPrice() * 23);
		transaction.get(0).display();
		transaction.get(1).display();
		sales.showSalary();
		sales1.showSalary();
		staff.showSalary();
		staff1.showSalary();
	}

	public static void main(String[] args) {
		new Company();
	}

}
