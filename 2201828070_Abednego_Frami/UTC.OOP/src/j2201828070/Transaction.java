package j2201828070;

import java.util.Vector;

public class Transaction {
	private String nama_kostumer;
	private Vector<Product> list_produk = new Vector<Product>();

	// constructor
	public Transaction(String nama_kostumer) {
		super();
		this.nama_kostumer = nama_kostumer;
	}

	// method
	public int getTotal_profit() {
		int sum = 0;
		for (int i = 0; i < this.list_produk.size(); i++) {
			sum += this.list_produk.get(i).getKeuntungan();
		}
		return sum;
	}

	public int hitung_total_price() {
		int sum = 0;
		for (int i = 0; i < this.list_produk.size(); i++) {
			sum += this.list_produk.get(i).getHarga_kostumer();
		}
		return sum;
	}

	// setter getter
	public String getNama_kostumer() {
		return nama_kostumer;
	}

	public void setNama_kostumer(String nama_kostumer) {
		this.nama_kostumer = nama_kostumer;
	}

	public Vector<Product> getList_produk() {
		return list_produk;
	}

	public void setList_produk(Product produk) {
		this.list_produk.add(produk);
	}

}
