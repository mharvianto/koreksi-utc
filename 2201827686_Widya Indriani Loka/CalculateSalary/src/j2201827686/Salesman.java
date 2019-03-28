package j2201827686;

import java.util.ArrayList;

public class Salesman extends Karyawan {

	ArrayList<Produk> listProduk = new ArrayList<>();
	Produk produk = new Produk("Lipbalm", "Lip", 80000, 50000);

	public Salesman(String nama, String alamat) {
		this.nama = nama;
		this.alamat = alamat;
	}

	@Override
	public void lihatGaji() {
		System.out.printf("Gaji Salesman: %d", produk.getTotalProfit());
	}

//	@Override
//	public String toString() {
//		return String.format("Gaji Salesman: %d", gaji);
//	}

//	public void lihatGaji

}
