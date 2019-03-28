package j2201828045;

public class Staff extends Employee {

	private String nama;
	private String alamat;
	private String job;
	private Integer gaji;

	public Staff() {
		// TODO Auto-generated constructor stub
	}

	public Integer getGaji() {
		return gaji;
	}

	public void setGaji(Integer gaji) {
		this.gaji = gaji;
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

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Staff(String nama, String alamat, String job) {
		super();
		this.nama = nama;
		this.alamat = alamat;
		this.job = job;
		this.gaji = 3000000;
	}

}
