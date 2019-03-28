package j2201828070;

public class Employee {
	protected String nama;
	protected String alamat;
	protected String jabatan;

	public Employee() {
		this.nama = "";
		this.alamat = "";
		this.jabatan = "";
	}

	public Employee(String nama, String alamat, String jabatan) {
		this.nama = nama;
		this.alamat = alamat;
		this.jabatan = jabatan;
	}

	public int hitung_gaji() {
		return Company.basic_salarry;
	}

}
