package j2201827654;

public class Product {

	protected String namaProduk;
	protected int hargaProduk;

	public Product(String namaProduk, int hargaProduk) {
		super();
		this.namaProduk = namaProduk;
		this.hargaProduk = hargaProduk;
	}

	public Product() {

	}

	public String getNamaProduk() {
		return namaProduk;
	}

	public void setNamaProduk(String namaProduk) {
		this.namaProduk = namaProduk;
	}

	public int getHargaProduk() {
		return hargaProduk;
	}

	public void setHargaProduk(int hargaProduk) {
		this.hargaProduk = hargaProduk;
	}

}
