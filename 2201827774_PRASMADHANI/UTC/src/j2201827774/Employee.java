package j2201827774;

import java.util.Scanner;
import java.util.Vector;

public class Employee {
	protected String nama;
	protected String alamat;
	protected String jabatan;
	protected double totalGaji;

	public double getTotalGaji() {
		return totalGaji;
	}

	public void setTotalGaji(double totalGaji) {
		this.totalGaji = totalGaji;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getJabatan() {
		return jabatan;
	}

	public void setJabatan(String jabatan) {
		this.jabatan = jabatan;
	}

	public Employee employeMenu(Scanner sc, Vector<Employee> listEmploye) {
		sc.nextLine();
		String namatemp;
		String alamattemp;
		double gajitemp;
		int jabatanPilihan;
		System.out.println("masukkan nama");
		namatemp = sc.nextLine();
		System.out.println("masukkan alamat");
		alamattemp = sc.nextLine();
		System.out.println("1. Staff\n2. Salesman");
		jabatanPilihan = sc.nextInt();
		if (jabatanPilihan == 1) {
			Staff staf = new Staff();
			staf.setAlamat(alamattemp);
			staf.setJabatan("Staf");
			staf.setNama(namatemp);
			System.out.println("masukkan gaji");
			gajitemp = sc.nextDouble();
			staf.setTotalGaji(gajitemp);
			return staf;
		} else {
			Salesman sales = new Salesman();
			sales.setAlamat(alamattemp);
			sales.setJabatan("Salesman");
			sales.setNama(namatemp);
			return sales;
		}

	}

	@Override
	public String toString() {
		return "Employee [nama=" + nama + ", alamat=" + alamat + ", jabatan=" + jabatan + "]";
	}

}
