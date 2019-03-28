package j2201827774;

import java.util.Scanner;
import java.util.Vector;

public class Salesman extends Employee {
	private Vector<Transaksi> listTransaksi = new Vector<>();

	public Vector<Transaksi> getListTransaksi() {
		return listTransaksi;
	}

	public void setListTransaksi(Vector<Transaksi> listTransaksi) {
		this.listTransaksi = listTransaksi;
	}

	@Override
	public double getTotalGaji() {
		// TODO Auto-generated method stub
		double tempGaji = 0;
		for (Transaksi a : listTransaksi) {
			tempGaji += a.totalHargaPelanggan();
		}

		return tempGaji;
	}

	@Override
	public Employee employeMenu(Scanner sc, Vector<Employee> listEmploye) {
		// TODO Auto-generated method stub
		String namaTemp;
		int menu;
		sc.nextLine();
		System.out.println("Masukkan nama");
		namaTemp = sc.nextLine();

		for (Employee a : listEmploye) {
			if (a.getNama().equalsIgnoreCase(namaTemp)) {
				do {
					System.out.println("1.jual produk");
					System.out.println("2.Lihat gaji");
					System.out.println("3.kembali");
					menu = sc.nextInt();
					switch (menu) {
					case 1:
						int banyak = 0;
						System.out.println("masukkan jumlah produk");
						banyak = sc.nextInt();
						sc.nextLine();
						Transaksi baru2 = new Transaksi();
						for (int i = 0; i < banyak; i++) {
							Produk baru = new Produk();
							baru = baru.tambahProduk(sc);

							baru2.getListProduk().add(baru);

						}
						listTransaksi.add(baru2);

						break;
					case 2:
						System.out.println("Total Gaji: " + getTotalGaji());
						break;
					}
				} while (menu != 3);

			}
		}
		Employee d = new Employee();
		return d;
	}

}
