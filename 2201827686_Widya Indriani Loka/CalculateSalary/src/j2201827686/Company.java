package j2201827686;

import java.util.ArrayList;

public class Company {

	private ArrayList<Produk> listProduk = new ArrayList<>();

	public ArrayList<Produk> getListProduk() {
		return listProduk;
	}

	public Company() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Company comp = new Company();

		Produk produk = new Produk("Lipbalm", "Lip", 80000, 50000);
		comp.listProduk.add(produk);

		Staff staff = new Staff("Abi", "Jl. Raya");
		staff.lihatGaji();
		Salesman sales = new Salesman("Zani", "Jl. an");
		sales.lihatGaji();

		Transaksi t = new Transaksi(10000, 5);
		t.lihatTotalHarga();
	}

}
