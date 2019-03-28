package j2201828045;

public class Salesman extends Employee {

	private String nama;
	private String alamat;
	private String job;
	private Integer gaji;
	private Integer jual;

	public Salesman() {
		// TODO Auto-generated constructor stub
	}

	public Integer getJual() {
		return jual;
	}

	public void setJual(Integer jual) {
		this.jual = jual;
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

	public Salesman(String nama, String alamat, String job) {
		super();
		this.nama = nama;
		this.alamat = alamat;
		this.job = job;
	}

}
