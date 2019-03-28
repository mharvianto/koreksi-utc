package j2201828045;

public class Product {

	private String nama;
	private String kategori;
	private Integer hargaPembeli;
	private Integer hargaSlaes;

	public Product() {
		// TODO Auto-generated constructor stub
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

	public Integer getHargaPembeli() {
		return hargaPembeli;
	}

	public void setHargaPembeli(Integer hargaPembeli) {
		this.hargaPembeli = hargaPembeli;
	}

	public Integer getHargaSlaes() {
		return hargaSlaes;
	}

	public void setHargaSlaes(Integer hargaSlaes) {
		this.hargaSlaes = hargaSlaes;
	}

	public Product(String nama, String kategori, Integer hargaPembeli, Integer hargaSlaes) {
		super();
		this.nama = nama;
		this.kategori = kategori;
		this.hargaPembeli = hargaPembeli;
		this.hargaSlaes = hargaSlaes;
	}

}
