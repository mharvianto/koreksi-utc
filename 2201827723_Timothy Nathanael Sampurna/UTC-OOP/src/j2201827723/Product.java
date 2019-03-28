package j2201827723;

public class Product {
	private String name;
	private String category;
	private int salesman_price;
	private int customer_price;
	private int total_sales;

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

	public int getSalesman_price() {
		return salesman_price;
	}

	public void setSalesman_price(int salesman_price) {
		this.salesman_price = salesman_price;
	}

	public int getCustomer_price() {
		return customer_price;
	}

	public void setCustomer_price(int customer_price) {
		this.customer_price = customer_price;
	}

	// @Override
	public String toString1() {
		return "Product :\nname=" + name + "\ncategory=" + category + "\ncustomer_price=" + customer_price
				+ "\ntotal_sales=" + total_sales;
	}

	@Override
	public String toString() {
		return "Product :\nname=" + name + "\ncategory=" + category + "\nsalesman_price=" + salesman_price
				+ "\ncustomer_price=" + customer_price + "\ntotal_sales=" + total_sales + "\n";
	}

	public int getTotal_sales() {
		return total_sales;
	}

	public void setTotal_sales(int total_sales) {
		this.total_sales = total_sales;
	}

	public void setAll(String name, String category, int salesman_price, int customer_price) {
		this.name = name;
		this.category = category;
		this.salesman_price = salesman_price;
		this.customer_price = customer_price;
	}

	Product(String name, String category, int salesman_price, int customer_price) {
		setAll(name, category, salesman_price, customer_price);
	}

	Product() {

	}
}
