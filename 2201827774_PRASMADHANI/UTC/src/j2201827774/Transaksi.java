package j2201827774;

import java.util.Vector;

public class Transaksi {
	private Vector<Produk> listProduk = new Vector<>();

	public double totalHargaSales() {
		double temp = 0;
		for (Produk a : listProduk) {
			temp += a.getHargaSales();
		}
		return temp;
	}

	public double totalHargaPelanggan() {
		double temp = 0;
		for (Produk a : listProduk) {
			temp += a.getHargaPelanggan();
		}
		return temp;
	}

	public void setListProduk(Vector<Produk> listProduk) {
		this.listProduk = listProduk;
	}

	public Vector<Produk> getListProduk() {
		return listProduk;
	}
}
