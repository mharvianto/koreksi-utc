package j2201828026;

import java.util.Vector;

public class Salesman extends Employee {
//	private Vector<Product> listProduk = new Vector<>();
	private int untung;
	private Product produk;

	public Salesman() {

	}

	public Salesman(String name, String address, String jobTitle) {
		super(name, address, jobTitle);
	}

	public int totalProfit(int keJual) {
		untung = (produk.priceSalesman + 100) * keJual;
		return untung;
	}

	@Override
	public void calculateSalesman(int salary) {
		this.salary += 1000;
	}

}
