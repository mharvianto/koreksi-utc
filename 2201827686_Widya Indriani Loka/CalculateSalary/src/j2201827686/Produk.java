package j2201827686;

public class Produk {

	private String namaProduk;
	private String category;
	private int priceCust;
	private int priceSalesman;
	private long totalUntung;

	public Produk(String namaProduk, String category, int priceCust, int priceSalesman) {
		super();
		this.namaProduk = namaProduk;
		this.category = category;
		this.priceCust = priceCust;
		this.priceSalesman = priceSalesman;
	}

	public String getNamaProduk() {
		return namaProduk;
	}

	public void setNamaProduk(String namaProduk) {
		this.namaProduk = namaProduk;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPriceCust() {
		return priceCust;
	}

	public void setPriceCust(int priceCust) {
		this.priceCust = priceCust;
	}

	public int getPriceSalesman() {
		return priceSalesman;
	}

	public void setPriceSalesman(int priceSalesman) {
		this.priceSalesman = priceSalesman;
	}

	public int getProfit() {
		return getPriceCust() - getPriceSalesman();
	}

	public long getTotalProfit() {
		return totalUntung += getProfit();
	}

}
