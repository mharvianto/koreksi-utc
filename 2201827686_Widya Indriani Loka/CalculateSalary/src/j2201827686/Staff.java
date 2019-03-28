package j2201827686;

public class Staff extends Karyawan {

	public Staff(String nama, String alamat) {
		this.nama = nama;
		this.alamat = alamat;
	}

	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void lihatGaji() {
		System.out.printf("Gaji Staff: 3000000");
	}
}
