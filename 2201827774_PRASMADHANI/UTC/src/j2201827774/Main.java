package j2201827774;

import java.util.Scanner;
import java.util.Vector;

public class Main {
	Scanner sc = new Scanner(System.in);
	private Vector<Employee> listEmployee = new Vector<>();

	public Main() {
		int menu = 0;
		do {
			System.out.println("1.tambah Employee");
			System.out.println("2.Salesman Menu");
			System.out.println("3.Staff Menu");
			System.out.println("4.Daftar employe");
			menu = sc.nextInt();

			switch (menu) {

			case 1:
				Employee baru = new Employee();
				baru = baru.employeMenu(sc, listEmployee);
				listEmployee.add(baru);
				break;
			case 2:
				Employee menu2 = new Salesman();
				menu2.employeMenu(sc, listEmployee);
				break;
			case 3: {
				String namaTemp;
				int menu3;
				sc.nextLine();
				System.out.println("Masukkan nama");
				namaTemp = sc.nextLine();

				for (Employee a : listEmployee) {
					if (a.getNama().equalsIgnoreCase(namaTemp)) {
//					Salesman t = (Salesman) a;
						a = (Salesman) a;
						do {
							System.out.println("1.jual produk");
							System.out.println("2.Lihat gaji");
							System.out.println("3.Total harga pelanggan");
							System.out.println("4.kembali");
							menu3 = sc.nextInt();
							switch (menu3) {
							case 1:
								int banyak = 0;
								System.out.println("masukkan jumlah produk");
								banyak = sc.nextInt();
								sc.nextLine();
								Transaksi baru2 = new Transaksi();
								for (int i = 0; i < banyak; i++) {
									Produk produk = new Produk();
									produk = produk.tambahProduk(sc);

									baru2.getListProduk().add(produk);

								}
								((Salesman) a).getListTransaksi().add(baru2);

								break;
							case 2:
								System.out.println("Total Gaji: " + a.getTotalGaji());
								break;
							case 3:
//							System.out.println("total harga pelanggan: " + ((Salesman)a).pelanggan());
								break;
							}

						} while (menu != 4);

					}
				}

			}

				break;
			case 4:
				for (Employee a : listEmployee) {
					System.out.println(a.toString());
				}
				break;
			}

		} while (true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
