package j2201828064;

import java.util.Vector;

public class Company {

	Vector<Staff> listStaff = new Vector<>();
	Vector<Salesman> listSalesman = new Vector<>();
	Vector<Product> listProduct = new Vector<>();

	public Company() {
		Staff bocah = new Staff("Bocah", "Jalan Sungai Batanghari", "Staff", 100000);
		listStaff.add(bocah);
		System.out.println(bocah);
		bocah.gajian();
		System.out.println(bocah);
		bocah.gajian();
		System.out.println(bocah);

		System.out.println();
		Product mahal = new Product("Bedak", "Exclusive", 50000, 30000);
		Product murah = new Product("Lipstik", "Original", 20000, 10000);
		listProduct.add(mahal);
		listProduct.add(murah);
		for (Product product : listProduct) {
			System.out.println(product);
		}

		System.out.println();
		Salesman botak = new Salesman("Botak", "Jalan Sungai Kapuas", "Salesman");
		listSalesman.add(botak);
		System.out.println(botak);
		botak.profit(10, mahal);
		botak.profit(5, murah);
		System.out.println(botak);
		botak.profit(1, mahal);
		botak.profit(1, murah);
		System.out.println(botak);

		System.out.println();
		Transaction lunas = new Transaction();
		System.out.println(lunas);
		lunas.totalPrice(mahal, 11);
		System.out.println(lunas);
		lunas.totalPrice(murah, 6);
		System.out.println(lunas);
	}

	public static void main(String[] args) {
		new Company();
	}

}
