package j2201828026;

public class Transaction extends Product {
	private int totalPrice;
	private Product produk;
	private int jumlahBeli;

	public Transaction() {
	}

	public Transaction(Product produk, int jumlahBeli) {
		this.produk = produk;
		this.jumlahBeli = jumlahBeli;
	}

	@Override
	public void keJual(int jumlahBeli) {
		super.stock -= jumlahBeli;
	}

}
