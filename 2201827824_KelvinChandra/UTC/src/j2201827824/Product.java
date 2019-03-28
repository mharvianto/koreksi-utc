package j2201827824;

public class Product {
	private String namaProduk;
	private String kategori;
	private int priceCust;
	private int priceSalesman;
	private int stok;

	public int getStok() {
		return stok;
	}

	public void setStok(int stok) {
		this.stok = stok;
	}

	private int duitSales;

	public int getDuitSales() {
		return untung();
	}

	public Product(String namaProduk, String kategori, int priceCust, int priceSalesman) {
		super();
		this.namaProduk = namaProduk;
		this.kategori = kategori;
		this.priceCust = priceCust;
		this.priceSalesman = priceSalesman;
	}

	public String getNamaProduk() {
		return namaProduk;
	}

	public void setNamaProduk(String namaProduk) {
		this.namaProduk = namaProduk;
	}

	public String getKategori() {
		return kategori;
	}

	public void setKategori(String kategori) {
		this.kategori = kategori;
	}

	public int getPriceCust() {
		return priceCust;
	}

	public int getPriceSalesman() {
		return priceSalesman;
	}

	public int untung() {
		int keuntungan = this.priceCust - this.priceSalesman;
//		this.stok -= index;
		return keuntungan;
	}

	public int dibeli() {
		return this.stok;
	}

}
