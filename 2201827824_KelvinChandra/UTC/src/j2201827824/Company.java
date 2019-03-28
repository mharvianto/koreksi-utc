package j2201827824;

import java.util.Vector;

public class Company {

	static Vector<Employee> pekerja = new Vector<>();
	static Vector<Product> lProduk = new Vector<>();
	static Vector<Transaction> ltransaksi = new Vector<>();

	public void view() {
		for (Employee print : pekerja) {
			if (print instanceof Staff) {
				System.out.println(print);
				System.out.println();
			}
		}
	}

	public void viewSales() {
		for (Employee yes : pekerja) {
			if (yes instanceof Salesman) {
				System.out.println(yes);
				System.out.println(((Salesman) yes).getGajiSales());
			}
		}
	}

	public void viewTransaksi() {
		for (Transaction trans : ltransaksi) {
			System.out.println(trans);
		}
	}

	public Company() {
		view();
		System.out.println();
		viewSales();
		System.out.println();
		viewTransaksi();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staff staf = new Staff();
		staf.setName("Kelvin");
		staf.setAddress("Jalan Kodok");
		pekerja.add(staf);

		Staff staf1 = new Staff();
		staf1.setName("Johan");
		staf1.setAddress("Jalan jalan ");
		pekerja.add(staf1);

		Product produk = new Product("Penggaris", "Alat Tulis", 5000, 2000);
		lProduk.add(produk);
		Product produk1 = new Product("Lipstik", "Make up", 100000, 150000);
		lProduk.add(produk1);

		Salesman sales = new Salesman("Abi", "Jalan Menara");
		pekerja.add(sales);

		new Company();

	}

}
