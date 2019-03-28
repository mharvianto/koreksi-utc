package j2201827976;

public class Product {
	private String product_name;
	private String cust_name;
	private int cust_price;
	private int sales_price;
	private int qty;
	private int total_cust_price;

	public Product(String product_name, int cust_price, int sales_price, int qty) {
		this.product_name = product_name;
		this.cust_price = cust_price;
		this.sales_price = sales_price;
		this.qty = qty;
	}

	public Product(String cust_name, String product_name, int cust_price, int qty, int total_cust_price) {
		this.cust_name = cust_name;
		this.product_name = product_name;
		this.cust_price = cust_price;
		this.qty = qty;
		this.total_cust_price = qty * cust_price;
	}

	public Product() {

	}

	@Override
	public String toString() {
		return "Product [product_name=" + product_name + ", cust_name=" + cust_name + ", cust_price=" + cust_price
				+ ", qty=" + qty + ", total_cust_price=" + total_cust_price + "]";
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public int getCust_price() {
		return cust_price;
	}

	public void setCust_price(int cust_price) {
		this.cust_price = cust_price;
	}

	public int getSales_price() {
		return sales_price;
	}

	public void setSales_price(int sales_price) {
		this.sales_price = sales_price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

}
