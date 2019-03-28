package j2201827944;

public class Produk {

	private String namaProduk;
	private String category;
	private int c_price;
	private int s_price;

	public Produk() {

	}

	public Produk(String namaProduk, String category, int c_price, int s_price) {
		this.namaProduk = namaProduk;
		this.category = category;
		this.c_price = c_price;
		this.s_price = s_price;
	}

	public String getNamaProduk() {
		return namaProduk;
	}

	public void setNamaProduk(String namaProduk) {
		this.namaProduk = namaProduk;
	}

	public int getC_price() {
		return c_price;
	}

	public void setC_price(int c_price) {
		this.c_price = c_price;
	}

	public int getS_price() {
		return s_price;
	}

	public void setS_price(int s_price) {
		this.s_price = s_price;
	}

	@Override
	public String toString() {
		return "Produk [namaProduk=" + namaProduk + ", category=" + category + ", Harga customer=" + c_price + "]";
	}

}
