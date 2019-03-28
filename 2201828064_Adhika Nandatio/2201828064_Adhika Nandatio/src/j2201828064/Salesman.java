package j2201828064;

public class Salesman extends Employee {

	private int soldProduct;
	private int uang;

	public Salesman(String name, String address, String jobTitle) {
		super(name, address, jobTitle);
		this.soldProduct = 0;
		this.uang = 0;
	}

	public int getSoldProduct() {
		return soldProduct;
	}

	public void setSoldProduct(int soldProduct) {
		this.soldProduct = soldProduct;
	}

	public int getUang() {
		return uang;
	}

	public void profit(int terjual, Product produk) {
		soldProduct += terjual;
		uang += terjual * (produk.getPriceCust() - produk.getPriceSales());
	}

	@Override
	public String toString() {
		return "Salesman [soldProduct=" + soldProduct + ", uang=" + uang + ", name=" + name + ", address=" + address
				+ ", jobTitle=" + jobTitle + "]";
	}

}
