package j2201827736;

public class Product {

	protected String nama;
	protected String category;
	protected Integer harga_sales;
	protected Integer harga_customer;

	public Product(String nama, String category, Integer harga_sales, Integer harga_customer) {
		super();
		this.nama = nama;
		this.category = category;
		this.harga_sales = harga_sales;
		this.harga_customer = harga_customer;
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getHarga_sales() {
		return harga_sales;
	}

	public void setHarga_sales(Integer harga_sales) {
		this.harga_sales = harga_sales;
	}

	public Integer getHarga_customer() {
		return harga_customer;
	}

	public void setHarga_customer(Integer harga_customer) {
		this.harga_customer = harga_customer;
	}

}
