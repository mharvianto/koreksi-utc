package j2201827654;

import java.util.Scanner;
import java.util.Vector;

public class Company {

	Scanner in = new Scanner(System.in);
	Vector<Product> daftarProduk = new Vector<Product>();
	Vector<Transaction> daftarTransaksi = new Vector<Transaction>();
	Vector<Employee> daftarEmployee = new Vector<Employee>();
	Vector<Staff> daftarStaf = new Vector<Staff>();
	Vector<Salesman> daftarSalesman = new Vector<Salesman>();
	String name, namProduk, pilihEmployee;
	int salary, hargaProduk;

	void cls() {
		for (int i = 0; i < 25; i++) {
			System.out.println();
		}
	}

	void menu() {
		int pilih;

		do {
			do {
				System.out.print("Company\n" + "1. Masuk sebagai company\n" + "2. Masuk sebagai pelanggan\n"
						+ "3. Exit\n" + ">> ");
				pilih = Helper.inputAnggka();

				switch (pilih) {
				case 1:
					menuCompany();
					break;
				case 2:
					menuPelanggan();
					break;
				}
			} while (pilih < 1 || pilih > 3);
		} while (pilih != 3);
	}

	void menuCompany() {
		int stat = 0;
		do {
			System.out.println("Masukan data [Staff | Salesman] : ");
			pilihEmployee = in.nextLine();

			if (pilihEmployee.equals("Staff"))
				stat = 0;
			else if (pilihEmployee.equals("Salesman"))
				stat = 1;

		} while (!pilihEmployee.equals("Staff") && !pilihEmployee.equals("Salesman"));

		if (stat == 0) {
			int pilih;
			do {
				do {
					System.out.print("\n1. Masukan Gaji\n" + "2. Lihat Data Staff\n" + ">> ");
					pilih = Helper.inputAnggka();

					switch (pilih) {
					case 1:
						addSalaryStaff();
						break;
					case 2:
						viewStaff();
						break;
					}
				} while (pilih < 1 || pilih > 2);
			} while (pilih != 2);

		} else if (stat == 1) {
			int pilih;
			do {
				do {
					System.out.print("1. Masukan Gaji\n" + "2. Lihat Data Salesman\n" + ">> ");
					pilih = Helper.inputAnggka();

					switch (pilih) {
					case 1:
						addSalarySalesman();
						break;
					case 2:
						viewSalesman();
						break;
					}
				} while (pilih < 1 || pilih > 2);
			} while (pilih != 2);
		}
	}

	void addSalaryStaff() {
		Employee em = new Employee();
		Staff st = new Staff();
		do {
			System.out.println("Masukan nama [3-25]: ");
			name = in.nextLine();
		} while (name.length() < 3 || name.length() > 25);

		do {
			System.out.println("Masukan gaji [1000000-3000000] : ");
			salary = in.nextInt();
		} while (salary < 1000000 || salary > 3000000);
		in.nextLine();

		st.setName(name);
		st.setSalary(salary);

//		daftarEmployee.add(em);
		daftarStaf.add(st);
		System.out.println("Success added staff salary");
	}

	void addSalarySalesman() {
		Employee em = new Employee();
		Salesman sa = new Salesman();
		do {
			System.out.println("Masukan nama [3-25]: ");
			name = in.nextLine();
		} while (name.length() < 3 || name.length() > 25);

		do {
			System.out.println("Masukan gaji [2000000-5000000] : ");
			salary = in.nextInt();
		} while (salary < 1000000 || salary > 3000000);
		in.nextLine();

		sa.setName(name);
		sa.setSalary(salary);

//		daftarEmployee.add(em);
		daftarSalesman.add(sa);
		System.out.println("Success added salesman salary");
	}

	void viewStaff() {
		if (daftarStaf.isEmpty()) {
			System.out.println("gada data staff");
		} else {
			for (int i = 0; i < daftarStaf.size(); i++) {
				System.out.println("Nama staff : " + daftarStaf.get(i).getName());
				System.out.println("Gaji : " + daftarStaf.get(i).getSalary());
			}
		}
	}

	void viewSalesman() {
		if (daftarSalesman.isEmpty()) {
			System.out.println("gada data salesman");
		} else {
			for (int i = 0; i < daftarSalesman.size(); i++) {
				System.out.println("Nama staff : " + daftarSalesman.get(i).getName());
				System.out.println("Gaji : " + daftarSalesman.get(i).getSalary());
			}
		}
	}

	void menuPelanggan() {
		int pilih = 0;
		do {
			do {
				System.out.println("\n1. Beli\n" + ">>");
				pilih = Helper.inputAnggka();
			} while (pilih < 1 || pilih > 2);

			switch (pilih) {
			case 1:
				addPelanggan();
				break;
			case 2:
				viewPelanggan();
				break;
			}
		} while (pilih != 2);
	}

	void addPelanggan() {
		System.out.println();
		System.out.println("Daftar Produk");
		daftarProduk.add(new Product("Eyeliner", 70000));
		daftarProduk.add(new Product("Brush", 20000));
		daftarProduk.add(new Product("Consilser", 35000));
		daftarProduk.add(new Product("Pondation", 90000));

		for (int i = 0; i < daftarProduk.size(); i++) {
			System.out.print(daftarProduk.get(i).getNamaProduk() + "Rp." + daftarProduk.get(i).getHargaProduk() + "\n");
		}

		int beli = 0;
//		do{
		do {
			System.out.print("Produk yg ingin dibeli : ");
			beli = in.nextInt();
		} while (beli < 1 || beli > 4);
		in.nextLine();

		if (daftarProduk.isEmpty()) {
			System.out.println("gada transaksi");
		} else {
			System.out.print("Nama barang : " + daftarProduk.get(beli - 1).getNamaProduk() + "\nTotal Harga : "
					+ daftarProduk.get(beli - 1).getHargaProduk() + "\n");
		}

//		}while(beli!=4);
	}

	void viewPelanggan() {
	}

//		Transaction tr = new Transaction();
//		
//		tr.setNamaProduk(namProduk);
//		tr.setHargaProduk(hargaProduk);
//		
//		daftarTransaksi.add(tr);

	public Company() {
		menu();
	}

	public static void main(String[] args) {
		new Company();

	}

}
