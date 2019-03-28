package j2201827736;

import java.util.Vector;

public class Company {

	Vector<Salesman> sales = new Vector<Salesman>();
	Vector<Staff> staf = new Vector<Staff>();
	Vector<Product> prod = new Vector<Product>();
	Vector<Integer> qty = new Vector<Integer>();

	public void init() {
		Salesman a = new Salesman("Sukijan", "Jl. Kemanggisan no 9");
		Staff b = new Staff("Paijo", "Jl. K.H. Syahdan no 18");

		a.addProduct("Propolis Biyang", 25000, 10000, "Produk MLM");
		a.addProduct("BioGlass", 2000000, 1000000, "Produk MLM");

		a.sold("Propolis Biyang", 20);
		a.sold("BioGlass", 1);
		a.sold("Propolis Biyang", 5);
		a.sold("BioGlass", 1);
		Vector<Transaction> siA = a.getTransaksi();
		for (Transaction temp : siA) {
			System.out.println(temp.getTrxID() + " " + temp.getProduct().get(0).getNama() + " "
					+ temp.getProduct().get(0).getHarga_customer());
		}

		System.out.println(a.getName() + " " + a.getSalary() + " " + a.getTitle() + " " + a.getAddress());
		System.out.println(b.getName() + " " + b.getSalary() + " " + b.getTitle() + " " + b.getAddress());
	}

	public Company() {
		init();
	}

	public static void main(String[] args) {
		new Company();

	}

}
