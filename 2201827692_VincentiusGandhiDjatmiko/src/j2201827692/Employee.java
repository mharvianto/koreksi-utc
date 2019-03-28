package j2201827692;

public class Employee {
	protected String nama;
	protected String alamat;
	protected String pekerjaan;
	protected double gaji;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String nama, String alamat, String pekerjaan, double gaji) {
		super();
		this.nama = nama;
		this.alamat = alamat;
		this.pekerjaan = pekerjaan;
		this.gaji = gaji;
	}

	public void totalGaji(int indikator) {

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

	public String getPekerjaan() {
		return pekerjaan;
	}

	public void setPekerjaan(String pekerjaan) {
		this.pekerjaan = pekerjaan;
	}

	public double getGaji() {
		return gaji;
	}

	public void setGaji(double gaji) {
		this.gaji = gaji;
	}

}
