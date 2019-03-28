package j2201828070;

import java.util.Vector;

public class Salesman extends Employee {
	Vector<Transaction> list_transaksi = new Vector<Transaction>();

	public Salesman() {
		super();

	}

	public Salesman(String nama, String alamat, String jabatan) {
		super(nama, alamat, jabatan);

	}

	@Override
	public int hitung_gaji() {

		int sum = 0;
		for (int i = 0; i < this.list_transaksi.size(); i++) {
			sum += this.list_transaksi.get(i).getTotal_profit();
		}
		return sum;
	}

}
