package j2201827881;

import java.util.Vector;

public class Company {
	static Vector<Product> vProd = new Vector<>();

	public static void main(String[] args) {
		Employee Amir = new Staff("Amir", "Jalan Merdeka 2", "Staff");
		Employee Juki = new Salesman("Juki", "Jalan Kirana 7", "Salesman");
		Employee Rina = new Salesman("Rina", "Jalan Sutera 8", "Salesman");

		System.out.println("Employee Data");
		System.out.println(Amir.toString());
		System.out.println(Juki.toString());
		System.out.println(Rina.toString());
		System.out.println();
		Product Susu = new Product("Susu", 4000, 6000);
		Product Sereal = new Product("Sereal", 12000, 18000);
		Product Selai = new Product("Selai", 9000, 15000);

		((Staff) Amir).setJamKerja(5);
		((Staff) Amir).setJamKerja(3);
		((Staff) Amir).setGaji(30000);
		((Salesman) Juki).jual(Selai, 8);
		((Salesman) Rina).jual(Selai, 13);
		((Salesman) Juki).jual(Sereal, 20);
		((Salesman) Rina).jual(Susu, 32);

		// gaji staff /jam = IDR 30000
		System.out.println("Employee's Salary Data");
		System.out.println(Amir.getName() + ": IDR" + Amir.getGaji());
		System.out.println(Juki.getName() + ": IDR" + Juki.getGaji());
		System.out.println(Rina.getName() + ": IDR" + Rina.getGaji());
	}

}
