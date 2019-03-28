package j2201827692;

import java.util.Vector;

public class Company {
	Vector<Employee> daftarEmployee = new Vector<Employee>();
	Vector<Product> daftarProduk = new Vector<Product>();
	Vector<Transaction> daftarTransaksi = new Vector<Transaction>();

	public Company() {
		simulasi();
	}

	public void simulasi() {
		Company sariayu = new Company();

		// tambah karyawan
		Employee staff1 = new Staff("Joko", "Bogor", "akuntan", 100000.0);
		staff1.totalGaji(20);// masa aktif kerja sebanyak 20 hari
		sariayu.daftarEmployee.add(staff1);
		System.out.println(staff1.toString());

		// tambah karyawan
		Employee salesman1 = new Salesman("Lola", "Jakarta", "salesgirl", 0.0);
		sariayu.daftarEmployee.add(salesman1);
		System.out.println(salesman1.toString());

		// tambah produk
		Product lipstick = new Product("lipstik super", "kosmetik wajah", 80000.0, 20000.0);
		sariayu.daftarProduk.add(lipstick);

		// tambah transaksi
		Transaction transaksi1 = new Transaction("LP123", "Dinni", 0, 0.0, lipstick, salesman1);
		transaksi1.setTotalItem(5);
		transaksi1.setTotalHarga(5 * lipstick.getHargaCustomer()); // harga sesuai list harga lipstick sebagai pembeli
																	// si customer

		sariayu.daftarTransaksi.add(transaksi1);

		// karena dinni berhasil membeli 5 buah lipstik dari lola
		salesman1.setGaji(5 * lipstick.getHargaSalesman()); // gaji si lola sebagai sales1 diupdate
		daftarEmployee.set(0, salesman1);

	}

	public static void main(String[] args) {
		new Company();

	}

}
