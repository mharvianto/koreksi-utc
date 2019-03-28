package j2201827793.objects;

public class Product {

	private String name;
	private int sellPrice;
	private int price;

	public Product(String name, int sellPrice, int price) {
		super();
		this.name = name;
		this.sellPrice = sellPrice;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(int sellPrice) {
		this.sellPrice = sellPrice;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", sellPrice=" + sellPrice + ", price=" + price + "]";
	}

}
