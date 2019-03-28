package j2201827824;

public class Transaction extends Product {
	private int qty;

	public Transaction(String namaProduk, String kategori, int priceCust, int priceSalesman) {
		super(namaProduk, kategori, priceCust, priceSalesman);
		// TODO Auto-generated constructor stub
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public int dibeli() {
		return super.getStok() - qty;
	}

	@Override
	public String toString() {
		return String.format("Nama Barang : %s\nKategori : %s\nQuantity : %d", getNamaProduk(), getKategori(), qty);
	}

	public int total() {
		return dibeli() * qty;
	}

}
