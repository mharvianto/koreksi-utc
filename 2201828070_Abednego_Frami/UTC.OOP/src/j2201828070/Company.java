package j2201828070;

import java.util.Vector;

public class Company {
	public static Vector<Employee> employee_list = new Vector<Employee>();
	public static int basic_salarry = 4000000;

	public Company() {

	}

	public static void main(String[] args) {
		new Company();
		// recrut employee baru
		Employee abed = new Staff("abed", "jl sungai lamandau no 87", "Staff");
		Salesman wanda = new Salesman("wanda", "haha", "Salesman");
		Company.employee_list.add(wanda);
		Company.employee_list.add(abed);
		// produk baru
		Product a = new Product("baby lips", "lipstik", 6000, 5000);
		// transaksi baru
		Transaction perusahaan_a = new Transaction("perusahaan a");
		perusahaan_a.setList_produk(a);
		wanda.list_transaksi.add(perusahaan_a);

		System.out.println("gaji wanda adalah " + "Rp " + wanda.hitung_gaji());
		System.out.println("gaji abed adalah " + "Rp " + abed.hitung_gaji());
		System.out.println("biaya yang harus dikeluarkan perusahaan a adalah " + perusahaan_a.hitung_total_price());
	}
}
