package j2201827950;

public class Products {
	private String name;
	private String category;
	private long custPrice;
	private long salePrice;

	public Products(String name, String category, long custPrice, long salePrice) {
		super();
		this.name = name;
		this.category = category;
		this.custPrice = custPrice;
		this.salePrice = salePrice;
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

	public long getCustPrice() {
		return custPrice;
	}

	public void setCustPrice(long custPrice) {
		this.custPrice = custPrice;
	}

	public long getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(long salePrice) {
		this.salePrice = salePrice;
	}

}
