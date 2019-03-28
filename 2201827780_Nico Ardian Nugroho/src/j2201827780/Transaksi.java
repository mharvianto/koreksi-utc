/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2201827780;

import java.util.Scanner;
import java.util.Vector;
//import sembuhcompany.Sales;

/**
 *
 * @author prk
 */
public class Transaksi {

	Scanner input = new Scanner(System.in);
	Vector<Product> productList = new Vector();
	Vector<Sales> salesList = new Vector();
	Vector<Staff> staffList = new Vector();

	Product product = new Product();
//    Employee account = new (Sales)Employee();
	Sales sales;
	Staff staff;

	Integer totalStok;
	Integer totalHarga;
	String namaProduct;
	Integer harga;
	String nama;
	String alamat;
	String jenis;
	Integer base_salary;
	Integer profit;
	int pilih = 0;

	public Transaksi() {

	}

	public void sell() {
		do {
			System.out.print("Enter Product Name [3..20]:");
			namaProduct = input.nextLine();
			product.setNamaProduct(namaProduct);
		} while (namaProduct.length() < 3 || namaProduct.length() > 20);
		do {
			System.out.print("Enter Total Product [1..1000]:");
			totalStok = input.nextInt();
		} while (totalStok < 1 || totalStok > 1000);
		do {
			System.out.print("Enter Harga Product [15000..100000]:");
			harga = input.nextInt();
			product.setHarga(harga);
		} while (harga < 15000 || harga > 100000);
		totalHarga = harga * totalStok;
		System.out.print("Total Harga: " + totalHarga);
		input.nextInt();
		sales.setTotalTransaksi(totalHarga);
		sales.setProfit(sales.getBase_salary() - harga);

		productList.add(product);
		salesList.add(sales);
		System.out.print("Transaksi Berhasil!");
		new SembuhCompany();

	}

	public void viewSalarySales(String jenis) {
		System.out.println("-------------");
		System.out.println("View Salary: " + jenis);
		System.out.println("-------------");
		System.out.println("");
		System.out.println("");
		for (int i = 0; i < salesList.size(); i++) {
			sales.setJenis(jenis);
			System.out.println("Nama         : " + salesList.get(i).getNama() + " is " + salesList.get(i).getJenis());
			System.out.println("-------------");
			System.out.println("Alamat       : " + salesList.get(i).getAlamat());
			System.out.println("Basic Salary : " + salesList.get(i).getBase_salary());
			System.out.println("Profit       : " + salesList.get(i).getProfit());
			System.out.println("-------------");
			System.out.println("Press Any Key to Exit");
			break;

		}
	}

	public void viewSalaryStaff(String jenis) {
		System.out.println("-------------");
		System.out.println("View Salary: " + jenis);
		System.out.println("-------------");
		System.out.println("");
		System.out.println("");
		for (int i = 0; i < staffList.size(); i++) {
			staff.setJenis(jenis);
			System.out.println("Nama         : " + staffList.get(i).getNama() + " is " + staffList.get(i).getJenis());
			System.out.println("-------------");
			System.out.println("Alamat       : " + staffList.get(i).getAlamat());
			System.out.println("Basic Salary : " + staffList.get(i).getBase_salary());
			System.out.println("-------------");
			System.out.println("Press Any Key to Exit");
			break;

		}
	}

}
