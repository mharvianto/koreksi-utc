package j2201827906;

public class Product {
	private String name;
	private String category;
	private Integer priceCust;
	private Integer priceSale;

	public Product(String name, String category, Integer priceCust, Integer priceSale) {
		super();
		this.name = name;
		this.category = category;
		this.priceCust = priceCust;
		this.priceSale = priceSale;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getPriceCust() {
		return priceCust;
	}

	public void setPriceCust(Integer priceCust) {
		this.priceCust = priceCust;
	}

	public Integer getPriceSale() {
		return priceSale;
	}

	public void setPriceSale(Integer priceSale) {
		this.priceSale = priceSale;
	}

}
