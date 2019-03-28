package j2201827660;

public class Product {

	protected String prodName;
	protected String prodCategory;
	protected int priceCust;
	protected int priceSales;

	public Product() {

	}

	public Product(String prodName, String prodCategory, int priceCust) {
		this.prodName = prodName;
		this.prodCategory = prodCategory;
		this.priceCust = priceCust;
	}

	public Product(String prodName, String prodCategory, int priceCust, int priceSales) {
		this.prodName = prodName;
		this.prodCategory = prodCategory;
		this.priceCust = priceCust;
		this.priceSales = priceSales;
	}

	public String getProdName() {
		return prodName;
	}

	public String getProdCategory() {
		return prodCategory;
	}

	public int getPriceCust() {
		return priceCust;
	}

	public int getPriceSales() {
		return priceSales;
	}

}
