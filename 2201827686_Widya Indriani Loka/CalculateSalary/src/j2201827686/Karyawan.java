package j2201827686;

public class Karyawan {

	protected String nama;
	protected String alamat;
	protected String jobTitle;
	protected long gaji;

	public Karyawan() {
		super();
		this.nama = "";
		this.alamat = "";
		this.gaji = 3000000;
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

	public void lihatGaji(long gaji) {
		this.gaji = gaji;
	}

	public long getGaji() {
		return gaji;
	}

	public void lihatGaji() {
		// TODO Auto-generated method stub

	}
}
