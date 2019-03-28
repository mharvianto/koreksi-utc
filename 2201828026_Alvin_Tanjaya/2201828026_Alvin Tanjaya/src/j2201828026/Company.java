package j2201828026;

import java.util.Vector;

public class Company {
	Vector<Employee> listEmploy = new Vector<>();
	Vector<Product> listProduk = new Vector<>();
	Vector<Transaction> listTransaction = new Vector<>();
	Vector<Staff> listStaff = new Vector<>();
	Vector<Salesman> listSalesman = new Vector<>();

	public Company() {
		Staff alvin = new Staff("Alvin", "Pontianak", "Staff", 20000);
		listStaff.add(alvin);
		Staff budi = new Staff("Budi", "Jakarta", "Staff", 50000);
		listStaff.add(budi);
		Salesman deka = new Salesman("Deka", "Bangka", "Salesman");
		listSalesman.add(deka);

		for (Staff s : listStaff) {
			System.out.println(s);
		}
		System.out.println();
		for (Salesman sales : listSalesman) {
			System.out.println(sales);
		}

		Product produk1 = new Product("Sabun", "Mandi", 100, 2000, 1500);
		listProduk.add(produk1);
		Product produk2 = new Product("Shampo", "Mandi", 150, 3000, 2000);
		listProduk.add(produk2);

		System.out.println();
		for (Product produk : listProduk) {
			System.out.println(produk);
		}
		produk2.keJual(2);

		alvin.setBasicSalary(100000);
		for (Staff s : listStaff) {
			System.out.println(s);
		}
//		deka.totalProfit(2);

		System.out.println();
		for (Product produk : listProduk) {
			System.out.println(produk);
		}

	}

	public static void main(String[] args) {
		new Company();

	}

}
