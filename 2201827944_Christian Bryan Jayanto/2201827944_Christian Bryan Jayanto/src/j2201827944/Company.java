package j2201827944;

import java.util.ArrayList;

public class Company {

	private ArrayList<Pekerja> pekerjaList = new ArrayList<Pekerja>();
	private ArrayList<Produk> produkList = new ArrayList<Produk>();
	private ArrayList<Produk> boughtProduk = new ArrayList<Produk>();

	public Company() {
		// menambahkan salesman dan staff (belum punya gaji dong awal-awal)
		Staff edward = new Staff("Edward", "Jalan Taman Budaya");
		Salesman gading = new Salesman("Gading", "Jalan Alam Elok");
		System.out.println(gading.toString());
		System.out.println(edward.toString());

		System.out.println("");
		// List semua produk di suatu company cosmetic hypebeast...
		Produk makeup = new Produk("MakeUp Women", "Makeup", 1000000, 800000);
		Produk lipstik = new Produk("Lipstick", "Makeup", 1500000, 1200000);
		Produk kaca = new Produk("Mirror LZH", "Aksesoris", 2000000, 1000000);
		Produk pensilAlis = new Produk("Pensil Alis Merona", "Makeup", 5000000, 4900000);
		produkList.add(makeup);
		produkList.add(lipstik);
		produkList.add(kaca);
		produkList.add(pensilAlis);

		System.out.println("");
		// Lihat semua produk yang dijual
		System.out.println("Semua barang yang tersedia : ");
		for (int i = 0; i < produkList.size(); i++) {
			System.out.println(produkList.get(i).toString());
		}

		System.out.println("");
		// Produk yang ditawarkan Salesman dan dibeli customer
		boughtProduk.add(makeup);
		boughtProduk.add(pensilAlis);

		// lihat total barang yang dibeli dan harga
		System.out.println("Barang-barang yang dibeli : ");
		for (int i = 0; i < boughtProduk.size(); i++) {
			System.out.println(boughtProduk.get(i).toString());
		}
		Transaksi t_pertama = new Transaksi(boughtProduk, gading);

		System.out.println("");
		// kosongin lagi boughtList supaya di transaksi berikutnya mulai dari 0 barang
		// lagi
		for (int i = boughtProduk.size() - 1; i >= 0; i--) {
			Produk a = boughtProduk.get(i);
			boughtProduk.remove(a);
		}

		System.out.println("");
		// lihat gaji salesman
		gading.sales_salary(t_pertama.getTotalHargaProduk(), t_pertama.getTotalHargaSalesman());

		System.out.println("");
		// lihat gaji staff
		edward.staff_salary();

		// tambah pekerja(salesman)
		Salesman beni = new Salesman("Beni Januardi", "Jalan Ketapang Hehe");

		// tambah barang lagi di company
		Produk sabunKecantikan = new Produk("Sabun Pewangi Super Lembut", "Pewangi", 2000000, 1800000);

		// ada yang mau beli lagi
		boughtProduk.add(sabunKecantikan);

		System.out.println("Barang-barang yang dibeli : ");
		for (int i = 0; i < boughtProduk.size(); i++) {
			System.out.println(boughtProduk.get(i).toString());
		}
		Transaksi t_kedua = new Transaksi(boughtProduk, beni);

		System.out.println("");
		// Cek gaji salesman baru ( si Beni )
		beni.sales_salary(t_kedua.getTotalHargaProduk(), t_kedua.getTotalHargaSalesman());

		// ini Optional, boleh masukkin ke list pekerja atau nanti akses satu per satu
		pekerjaList.add(edward);
		pekerjaList.add(gading);
		pekerjaList.add(beni);

		// lihat semua pekerja dan gajinya
		for (int i = 0; i < pekerjaList.size(); i++) {
			System.out.println(pekerjaList.get(i).toString());
		}

	}

	public static void main(String[] args) {
		new Company();
	}

}
