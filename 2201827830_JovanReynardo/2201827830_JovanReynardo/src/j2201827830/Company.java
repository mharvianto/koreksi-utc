package j2201827830;

public class Company {

	/*
	 * //Business Logic Suatu perusahaan kosmetik memiliki 2 jenis pegawai. yaitu
	 * staff dan salesman. (inheritance). lalu didalam database terdapat daftar
	 * staff dan salesman yang dimiliki perusahaan, serta terdapat daftar produk
	 * yang dijual perusahaan.
	 * 
	 * seorang staff hanya mendapat gaji sesuai basic salary nya sementara seorang
	 * salesman mendapat gaji dari basic salary dan bisa mendapat tambahan dari
	 * keuntungan barang-barang yang telah dijualnya.
	 * 
	 * salesman dapat memilih barang apa saja yang dijual sesuai dengan barang yang
	 * ada di database product list. setiap produk memiliki harga jual untuk
	 * customer dan harga untuk salesman. profit penjualan setiap produk dihitung
	 * dengan rumus profit = harga jual ke customer - harga beli salesman;
	 * 
	 * kemudian ada class transaksi untuk menghitung dan menampilkan harga tiap
	 * barang dan total harga yang harus dibayarkan oleh customer si salesman
	 * disimulasikan bahwa setiap salesman memiliki 1 customer
	 */

	public Company() {
		// salesman marco menjual produk
		Database.salesmanList.get(0).sell(Database.productList.get(0));
		System.out.println(
				Database.salesmanList.get(0).getName() + " Menjual Produk " + Database.productList.get(0).getName());
		System.out.println();

		Database.salesmanList.get(0).sell(Database.productList.get(2));
		System.out.println(
				Database.salesmanList.get(0).getName() + " Menjual Produk " + Database.productList.get(2).getName());
		System.out.println();

		Database.salesmanList.get(0).sell(Database.productList.get(5));
		System.out.println(
				Database.salesmanList.get(0).getName() + " Menjual Produk " + Database.productList.get(5).getName());
		System.out.println();

		// salesman simon menjual produk
		Database.salesmanList.get(1).sell(Database.productList.get(1));
		System.out.println(
				Database.salesmanList.get(1).getName() + " Menjual Produk " + Database.productList.get(1).getName());
		System.out.println();
		Database.salesmanList.get(1).sell(Database.productList.get(2));
		System.out.println(
				Database.salesmanList.get(1).getName() + " Menjual Produk " + Database.productList.get(2).getName());
		System.out.println();
		Database.salesmanList.get(1).sell(Database.productList.get(4));
		System.out.println(
				Database.salesmanList.get(1).getName() + " Menjual Produk " + Database.productList.get(4).getName());
		System.out.println();

		// tampilkan perhitungan salary staff
		for (Staff staff : Database.staffList) {
			printSalary(staff);
			System.out.println();
		}

		// tampilkan perhitungan salary salesman
		for (Salesman salesman : Database.salesmanList) {
			printSalary(salesman);
			System.out.println();
		}

		// Tampilkan transaksi dan total harga yang harus dibayar customer
		for (Salesman salesman : Database.salesmanList) {
			Transaction.printTransaction(salesman);
			System.out.println();
		}

	}

	void printSalary(Employee employee) {
		System.out.println("Gaji " + employee.getJobTitle() + " " + employee.getName());
		System.out.println("=====================");
		if (employee instanceof Staff) {
			System.out.println("Basic Salary : Rp " + employee.getBasicSalary());
			System.out.println("Total Salary : Rp " + employee.calculateSalary());
		} else if (employee instanceof Salesman) {
			System.out.println("Basic Salary : Rp " + employee.getBasicSalary());
			// downcasting
			((Salesman) employee).printProfit();
			System.out.println("Total : Rp" + employee.calculateSalary());
		}

	}

	public static void main(String[] args) {
		new Company();
	}
}
