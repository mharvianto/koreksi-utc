package j2201827830;

import java.util.Vector;

public class Database {
	public static Vector<Staff> staffList = new Vector<>();
	public static Vector<Salesman> salesmanList = new Vector<>();
	public static Vector<Product> productList = new Vector<>();

	static {
		// staff list
		staffList.add(new Staff("Budi", "Jalan Anggrek no 5", 1000000));
		staffList.add(new Staff("Indro", "Jalan Mawar no 10", 1100000));
		staffList.add(new Staff("Bambang", "Jalan Batu no 11", 900000));

		// salesman list
		salesmanList.add(new Salesman("Marco", "Jalan Amerika no 9", 12000000));
		salesmanList.add(new Salesman("Simon", "Jalan Eropa no 19", 12000000));

		productList.add(new Product("Eye Shadow Raisha", "Eye Shadow", 50000, 45000));
		productList.add(new Product("Eye Shadow Syahrini", "Eye Shadow", 200000, 180000));
		productList.add(new Product("Maskara madu", "Maskara", 55000, 40000));
		productList.add(new Product("Maskara Lemon", "Maskara", 57000, 40000));
		productList.add(new Product("Masker bunga matahari", "Masker", 100000, 75000));
		productList.add(new Product("Masker bunga bangkai", "Masker", 150000, 90000));
	}
}
