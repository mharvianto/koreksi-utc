package j2201827995.model;

public class Product {

	private String pname, category;
	private int priceCust, priceSales;

	public Product(String pname, String category, int priceCust, int priceSales) {
		this.pname = pname;
		this.category = category;
		this.priceCust = priceCust;
		this.priceSales = priceSales;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
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

	public int getPriceSales() {
		return priceSales;
	}

	public void setPriceSales(int priceSales) {
		this.priceSales = priceSales;
	}
}
