package j2201827944;

import java.util.ArrayList;

public class Transaksi {

	private ArrayList<Produk> listProduk = new ArrayList<Produk>();
	private Salesman salesman;
	private int totalHargaProduk = 0;
	private int totalHargaSalesman = 0;

	public Transaksi(ArrayList<Produk> listProduk, Salesman salesman) {
		for (int i = 0; i < listProduk.size(); i++) {
			totalHargaProduk += listProduk.get(i).getC_price();
			totalHargaSalesman += listProduk.get(i).getS_price();
		}
		System.out.println("Total price for customer to pay : " + totalHargaProduk);
	}

	public ArrayList<Produk> getListProduk() {
		return listProduk;
	}

	public void setListProduk(ArrayList<Produk> listProduk) {
		this.listProduk = listProduk;
	}

	public Salesman getSalesman() {
		return salesman;
	}

	public void setSalesman(Salesman salesman) {
		this.salesman = salesman;
	}

	public int getTotalHargaProduk() {
		return totalHargaProduk;
	}

	public int getTotalHargaSalesman() {
		return totalHargaSalesman;
	}

}
