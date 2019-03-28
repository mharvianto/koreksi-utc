package j2201828045;

import java.util.Vector;

public class Transaction {

//	private String nama;
	private Vector<Product> vTransaksi = new Vector<>();
	private Integer total;

	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	public Vector<Product> getvTransaksi() {
		return vTransaksi;
	}

	public void setvTransaksi(Vector<Product> vTransaksi) {
		this.vTransaksi = vTransaksi;
	}

	public Integer getTotal() {
		for (int i = 0; i < vTransaksi.size(); i++) {
			total += vTransaksi.elementAt(i).getHargaPembeli();
		}
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Transaction(Vector<Product> vTransaksi, Integer total) {
		super();
		this.vTransaksi = vTransaksi;
		this.total = total;
	}

}
