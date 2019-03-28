package j2201827686;

public class Transaksi {

	private int hargaProduk;
	private int jumlahProduk;

	public Transaksi(int hargaProduk, int jumlahProduk) {
		super();
		this.hargaProduk = hargaProduk;
		this.jumlahProduk = jumlahProduk;
	}

	public int getHargaProduk() {
		return hargaProduk;
	}

	public void setHargaProduk(int hargaProduk) {
		this.hargaProduk = hargaProduk;
	}

	public int getJumlahProduk() {
		return jumlahProduk;
	}

	public void setJumlahProduk(int jumlahProduk) {
		this.jumlahProduk = jumlahProduk;
	}

	public int totalHarga() {
		return getJumlahProduk() * getHargaProduk();
	}

	public void lihatTotalHarga() {
		System.out.println("Total Harga = " + totalHarga());
	}
}
