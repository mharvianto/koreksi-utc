package j2201827774;

import java.util.Scanner;

public class Produk {
	private String nama;
	private String katagory;
	private double hargaPelanggan;
	private double hargaSales;

	public String getNama() {
		return nama;
	}

	public String getKatagory() {
		return katagory;
	}

	public double getHargaPelanggan() {
		return hargaPelanggan;
	}

	public double getHargaSales() {
		return hargaSales;
	}

	public Produk(String nama, String katagory, double hargaPelanggan, double hargaSales) {
		super();
		this.nama = nama;
		this.katagory = katagory;
		this.hargaPelanggan = hargaPelanggan;
		this.hargaSales = hargaSales;
	}

	public Produk tambahProduk(Scanner sc) {
		sc.nextLine();
		String namaTemp;
		String katagorytemp;
		double hargaPelanggantemp;
		double hargaSalesTemp;
		System.out.println("nama produk");
		namaTemp = sc.nextLine();
		System.out.println("katagory");
		katagorytemp = sc.nextLine();
		System.out.println("harga pelanggan");
		hargaPelanggantemp = sc.nextDouble();
		System.out.println("harga sales");
		hargaSalesTemp = sc.nextDouble();
		Produk baru = new Produk(namaTemp, katagorytemp, hargaPelanggantemp, hargaSalesTemp);
		return baru;
	}

	public Produk() {

	}

}
