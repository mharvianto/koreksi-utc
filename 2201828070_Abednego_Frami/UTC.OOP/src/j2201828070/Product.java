package j2201828070;

public class Product {
	private String nama;
	private String kategori;
	private int harga_kostumer;
	private int harga_sales;
	private int keuntungan;

	public Product(String nama, String kategori, int harga_kostumer, int harga_sales) {
		super();
		this.nama = nama;
		this.kategori = kategori;
		this.harga_kostumer = harga_kostumer;
		this.harga_sales = harga_sales;
		this.keuntungan = harga_kostumer - harga_sales;
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

	public int getHarga_kostumer() {
		return harga_kostumer;
	}

	public void setHarga_kostumer(int harga_kostumer) {
		this.harga_kostumer = harga_kostumer;
	}

	public int getHarga_sales() {
		return harga_sales;
	}

	public void setHarga_sales(int harga_sales) {
		this.harga_sales = harga_sales;
	}

	public int getKeuntungan() {
		return keuntungan;
	}

	public void setKeuntungan(int keuntungan) {
		this.keuntungan = keuntungan;
	}

}
