package j2201827881;

public class Product {
	private String productName;
	private int hargaModal;
	private int hargaJual;

	public Product(String productName, int hargaModal, int hargaJual) {
		this.productName = productName;
		this.hargaModal = hargaModal;
		this.hargaJual = hargaJual;
	}

	public String getProductName() {
		return productName;
	}

	public int getHargaModal() {
		return hargaModal;
	}

	public int getHargaJual() {
		return hargaJual;
	}

}
