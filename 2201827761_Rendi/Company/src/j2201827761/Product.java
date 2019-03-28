package j2201827761;

public class Product {

	private String name;
	private String category;
	private Integer custprice;
	private Integer salesprice;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String name, String category, Integer custprice, Integer salesprice) {
		this.name = name;
		this.category = category;
		this.custprice = custprice;
		this.salesprice = salesprice;
	}

	// setter and getter
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

	public Integer getCustprice() {
		return custprice;
	}

	public void setCustprice(Integer custprice) {
		this.custprice = custprice;
	}

	public Integer getSalesprice() {
		return salesprice;
	}

	public void setSalesprice(Integer salesprice) {
		this.salesprice = salesprice;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", category=" + category + ", price=" + custprice + "]";
	}

}
