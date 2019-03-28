package j2201827692;

public class Product {
	private String nama;
	private String kategori;
	private double hargaCustomer;
	private double hargaSalesman;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String nama, String kategori, double hargaCustomer, double hargaSalesman) {
		super();
		this.nama = nama;
		this.kategori = kategori;
		this.hargaCustomer = hargaCustomer;
		this.hargaSalesman = hargaSalesman;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getKategori() {
		return kategori;
	}

	public void setKategori(String kategori) {
		this.kategori = kategori;
	}

	public double getHargaCustomer() {
		return hargaCustomer;
	}

	public void setHargaCustomer(double hargaCustomer) {
		this.hargaCustomer = hargaCustomer;
	}

	public double getHargaSalesman() {
		return hargaSalesman;
	}

	public void setHargaSalesman(double hargaSalesman) {
		this.hargaSalesman = hargaSalesman;
	}

}
