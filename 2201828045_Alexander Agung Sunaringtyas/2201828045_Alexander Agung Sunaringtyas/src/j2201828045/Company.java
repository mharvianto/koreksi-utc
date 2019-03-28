package j2201828045;

import java.util.Scanner;
import java.util.Vector;

public class Company {

	Vector<Employee> vEmployee = new Vector<>();
	Vector<Product> vProduct = new Vector<>();
	Scanner scan = new Scanner(System.in);

	void tambahStaff(String nama, String alamat, String job) {
		Employee temp = new Staff(nama, alamat, job);
		vEmployee.add(temp);
	}

	void tambahStaff() {
		String nama;
		String alamat;
		String job;
		System.out.print("Masukkan nama: ");
		nama = scan.nextLine();
		scan.nextLine();
		System.out.print("Masukkan alamat: ");
		alamat = scan.nextLine();
		scan.nextLine();
		System.out.print("Masukkan job: ");
		job = scan.nextLine();
		scan.nextLine();
		Employee temp = new Staff(nama, alamat, job);
	}

	void tambahSalesman(String nama, String alamat, String job) {
		Employee temp = new Salesman(nama, alamat, job);
		vEmployee.add(temp);
	}

	void tambahSalesman() {
		String nama;
		String alamat;
		String job;
		System.out.print("Masukkan nama: ");
		nama = scan.nextLine();
		scan.nextLine();
		System.out.print("Masukkan alamat: ");
		alamat = scan.nextLine();
		scan.nextLine();
		System.out.print("Masukkan job: ");
		job = scan.nextLine();
		scan.nextLine();
		Employee temp = new Salesman(nama, alamat, job);
	}

	void printEmployee() {
		for (int i = 0; i < vEmployee.size(); i++) {
			System.out.printf("Nama: %s\nAlamat: %s\nJob: %s\nGaji: %d\n", vEmployee.elementAt(i).getNama(),
					vEmployee.elementAt(i).getAlamat(), vEmployee.elementAt(i).getJob(),
					vEmployee.elementAt(i).getGaji());
		}
	}

	void tambahProduct(String nama, String kategori, Integer hargaPembeli, Integer hargaSlaes) {
		Product temp = new Product(nama, kategori, hargaPembeli, hargaSlaes);
		vProduct.add(temp);
	}

	void tambahProduct() {
		String nama;
		String kategori;
		Integer hargaPembeli;
		Integer hargaSlaes;
		System.out.print("Masukkan nama: ");
		nama = scan.nextLine();
		scan.nextLine();
		System.out.print("Masukkan kategori: ");
		kategori = scan.nextLine();
		scan.nextLine();
		System.out.print("Masukkan Harga untuk Pembeli: ");
		hargaPembeli = scan.nextInt();
		scan.nextLine();
		do {
			System.out.print("Masukkan Harga untuk Sales: ");
			hargaSlaes = scan.nextInt();
			scan.nextLine();
		} while (hargaPembeli < hargaSlaes);
		Product temp = new Product(nama, kategori, hargaPembeli, hargaSlaes);
		vProduct.add(temp);
	}

	void printProduct() {
		for (int i = 0; i < vProduct.size(); i++) {
			System.out.printf("%d. Nama: %s\n Kategori: %s\n Harga: %s\n", i + 1, vProduct.elementAt(i).getNama(),
					vProduct.elementAt(i).getKategori(), vProduct.elementAt(i).getHargaPembeli());
		}
	}

	void transaksi() {
		String Sales;
		String nama;
		int pilih;
		Integer total;
		Transaction A = new Transaction();
		Vector<Product> vTransaksi = new Vector<>();
		System.out.print("Masukkan nama Sales: ");
		Sales = scan.nextLine();
		scan.nextLine();
		System.out.print("Masukkan nama pembeli: ");
		nama = scan.nextLine();
		scan.nextLine();
		printProduct();
		do {
			System.out.print("Pilih Product[0 selesai]: ");
			pilih = scan.nextInt();
			scan.nextLine();
			Product pilihan = vProduct.elementAt(pilih - 1);
			vTransaksi.add(pilihan);
			A.setvTransaksi(vTransaksi);
		} while (pilih != 0);
		total = A.getTotal();
		System.out.println("Total Transaksi: " + total);
		for (int i = 0; i < vEmployee.size(); i++) {
			if (vEmployee.elementAt(i).getNama().equals(Sales)) {
//				Salesman sem = new vEmployee.elementAt(i);
//				sem = vEmployee.elementAt(i);
//				sem=vEmployee.elementAt(i).get
//				vEmployee.elementAt(i).set
			}
		}
	}

	public Company() {

	}

	public static void main(String[] args) {
		new Company();

	}

}
