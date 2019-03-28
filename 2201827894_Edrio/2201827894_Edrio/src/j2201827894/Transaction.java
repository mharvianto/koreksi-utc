package j2201827894;

public class Transaction {
	protected String Seller;
	protected String Customer;
	protected Integer Categories;

	public Transaction() {

	}

	public String getSeller() {
		return Seller;
	}

	public void setSeller(String seller) {
		Seller = seller;
	}

	public String getCustomer() {
		return Customer;
	}

	public void setCustomer(String customer) {
		Customer = customer;
	}

	public Integer getCategories() {
		return Categories;
	}

	public void setCategories(Integer categories) {
		Categories = categories;
	}

}
